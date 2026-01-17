package com.rumeysa.ilk_spring_projem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rumeysa.ilk_spring_projem.model.Muhendis;
import com.rumeysa.ilk_spring_projem.service.MuhendisService;

import jakarta.validation.Valid;

@RestController
public class MerhabaController {
	
	@Autowired 
    private MuhendisService muhendisService;

	@GetMapping("/selam")
    public String selamVer() {
        return "Merhaba Havelsan Yolcusu! İlk API çalışıyor! 🚀";
    }
	
	@GetMapping("/muhendis/{isim}")
    public Muhendis DinamikmuhendisGetir(@PathVariable String isim) {
        
        Muhendis m1 = new Muhendis(isim, "Yazılım Geliştirme", "Junior Engineer");
        
        
        return m1;
    }
	@GetMapping("/muhendis/{isim}/{rutbe}")
	public Muhendis rutbeliMugendisGetir(
			@PathVariable String isim,
			@PathVariable String rutbe) {
		return new Muhendis(isim, "Siber Güvenlik",rutbe);
	}
	
	
	@GetMapping("/muhendis-arama")
    public Muhendis aramaYap(
            @RequestParam String isim, 
            @RequestParam String alan) {
        
        
        return new Muhendis(isim, alan, "Aday Mühendis");
    }
	@PostMapping("/muhendis-ekle")
	public Muhendis muhendisEkle(@Valid @RequestBody Muhendis yeniMuhendis) {
		return muhendisService.muhendisKaydet(yeniMuhendis);
	}
	@GetMapping("muhendis-listesi")
	public List<Muhendis> listeyiGetir(){
		return muhendisService.tumunuGetir();
	}
	
	@PutMapping("/muhendis-guncelle/{id}")
    public Muhendis guncelle(@Valid @PathVariable Long id, @RequestBody Muhendis yeniMuhendis) {
        return muhendisService.muhendisGuncelle(id, yeniMuhendis);
    }
	
	@DeleteMapping("/muhendis-sil/{id}")
    public String sil(@PathVariable Long id) {
        muhendisService.muhendisSil(id);
        return id + " numaralı mühendis başarıyla silindi.";
    }	
	
}
