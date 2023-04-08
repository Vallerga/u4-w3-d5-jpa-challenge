package catalogo_bibliotecario;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Lettura {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Long Codice_ISBN;
	private String titolo;
	private LocalDate anno_pubblicazione;
	private Integer numero_pagine;

	// getter & setter
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getCodice_ISBN() {
		return Codice_ISBN;
	}

	public void setCodice_ISBN(Long codice_ISBN) {
		Codice_ISBN = codice_ISBN;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public LocalDate getAnno_pubblicazione() {
		return anno_pubblicazione;
	}

	public void setAnno_pubblicazione(LocalDate anno_pubblicazione) {
		this.anno_pubblicazione = anno_pubblicazione;
	}

	public Integer getNumero_pagine() {
		return numero_pagine;
	}

	public void setNumero_pagine(Integer numero_pagine) {
		this.numero_pagine = numero_pagine;
	}

	@Override
	public String toString() {
		return "Lettura [id=" + id + ", Codice_ISBN=" + Codice_ISBN + ", titolo=" + titolo + ", anno_pubblicazione="
				+ anno_pubblicazione + ", numero_pagine=" + numero_pagine + "]";
	}
}
