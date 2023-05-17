package entities;

import java.time.LocalDate;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "persona")
@Getter
@Setter

public class Persona {
	
	@Id
	@GeneratedValue
	private UUID id;
	private String nome;
	private String cognome;
	private String email;
	private LocalDate dataDiNascita;
	private Sesso genere;
	@OneToMany
	@JoinColumn(name = "partecipazione", referencedColumnName = "id")
	private Set<Partecipazione> listaPartecipazioni;
	
	
	public Persona(String nome, String cognome, String email, LocalDate dataDiNascita, Sesso genere, Set<Partecipazione> partecipazioni) {
		super();
		
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.dataDiNascita = dataDiNascita;
		this.genere = genere;
		this.listaPartecipazioni = partecipazioni;
	}
	
}
