package projetpoo.Web.entite;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "fichier")
public class Fichier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "chemin")
    private String chemin;

    @Column(name = "type")
    private String type;

    // Relationship with Lecon entity
    @ManyToOne
    @JoinColumn(name = "lecon_id")
    private Lecon lecon;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getChemin() {
        return chemin;
    }

    public void setChemin(String chemin) {
        this.chemin = chemin;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Lecon getLecon() {
        return lecon;
    }

    public void setLecon(Lecon lecon) {
        this.lecon = lecon;
    }
}
