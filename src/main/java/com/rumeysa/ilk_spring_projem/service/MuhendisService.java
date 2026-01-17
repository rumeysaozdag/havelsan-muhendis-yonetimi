package com.rumeysa.ilk_spring_projem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rumeysa.ilk_spring_projem.model.Muhendis;
import com.rumeysa.ilk_spring_projem.repository.MuhendisRepository;

@Service
public class MuhendisService {
	
	@Autowired
    private MuhendisRepository muhendisRepository;
	

	public Muhendis muhendisKaydet(Muhendis muhendis) {
        // .save() metodu JpaRepository'den hazır geliyor!
        return muhendisRepository.save(muhendis);
	}
	public List<Muhendis> tumunuGetir() {
        // .findAll() metodu da hazır! Select * From yapar.
        return muhendisRepository.findAll();
    }
	
	public void muhendisSil(Long id) {
		muhendisRepository.deleteById(id);
	}
	
	public Muhendis muhendisGuncelle(Long id, Muhendis yeniBilgiler) {
		
		yeniBilgiler.setId(id);
		
		return muhendisRepository.save(yeniBilgiler);
	}
}
