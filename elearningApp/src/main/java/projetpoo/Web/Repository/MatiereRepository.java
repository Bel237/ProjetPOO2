package projetpoo.Web.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projetpoo.Web.entite.Matiere;

@Repository
public interface MatiereRepository extends JpaRepository<Matiere, Long> {
    // Ajoutez ici des méthodes spécifiques si nécessaire
}
