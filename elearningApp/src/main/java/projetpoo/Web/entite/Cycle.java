package projetpoo.Web.entite;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cycle")
public class Cycle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom")
    private String nom;

    // Relationship with SystemeEducatif entity
    @ManyToOne
    @JoinColumn(name = "systeme_educatif_id")
    private SystemeEducatif systemeEducatif;

    // Getters and Setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public SystemeEducatif getSystemeEducatif() {
        return systemeEducatif;
    }

    public void setSystemeEducatif(SystemeEducatif systemeEducatif) {
        this.systemeEducatif = systemeEducatif;
    }
}
