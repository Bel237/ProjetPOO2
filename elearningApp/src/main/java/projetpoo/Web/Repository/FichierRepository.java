package projetpoo.Web.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projetpoo.Web.entite.Fichier;

@Repository
public interface FichierRepository extends JpaRepository<Fichier, Long> {
    // Ajoutez ici des méthodes spécifiques si nécessaire
}
