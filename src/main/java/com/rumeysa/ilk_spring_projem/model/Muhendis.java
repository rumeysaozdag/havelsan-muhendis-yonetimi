package com.rumeysa.ilk_spring_projem.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
@Entity
public class Muhendis {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	@NotBlank(message = "İsim boş geçilemez!")
	@Size(min=2, message = "İsim en az 2 karakter olmalı.")
	private String isim;
	
	@NotBlank(message = "Alan bilgisi zorunludur!")
    private String alan;
	
    private String rutbe;
	
    public void setIsim(String isim) {
		this.isim = isim;
	}

	public void setAlan(String alan) {
		this.alan = alan;
	}

	public void setRutbe(String rutbe) {
		this.rutbe = rutbe;
	}

	public Muhendis() {
    }
    
    public Muhendis(String isim, String alan, String rutbe) {
        this.isim = isim;
        this.alan = alan;
        this.rutbe = rutbe;
    }
    
    
    public String getIsim() { return isim; }
    public String getAlan() { return alan; }
    public String getRutbe() { return rutbe; }
}
