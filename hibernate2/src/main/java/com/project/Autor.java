package com.project;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "Autor", 
	uniqueConstraints = {@UniqueConstraint(columnNames = "id")})
public class Autor implements Serializable{

    @Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private long autorId;

    @Column(name = "nom")
    private String nom;

    @OneToMany
    @JoinColumn(name = "autorId")
    private Set<Llibre> llibres;

    public Autor() {}
    
    public Autor(String nom) {
        this.nom = nom;
    }

    public long getAutorId() {
        return autorId;
    }
    public void setAutorId(long autorId) {
        this.autorId = autorId;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public Set<Llibre> getLlibres() {
        return llibres;
    }
    public void setLlibres(Set<Llibre> llibres) {
        this.llibres = llibres;
    }

    public List<Object[]> queryLlibres () {
		long id = this.getAutorId();
        return Manager.queryTable("SELECT DISTINCT l.* FROM Llibre l WHERE l.autorId = " + id);
	}

    @Override
    public String toString() {
        String str = Manager.tableToString(queryLlibres()).replaceAll("\n", " | ");
        return this.getAutorId() + ": " + this.getNom() + ", Items: [" + str + "]";
    }

}
