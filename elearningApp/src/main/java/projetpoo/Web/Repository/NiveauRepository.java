package projetpoo.Web.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projetpoo.Web.entite.Niveau;

@Repository
public interface NiveauRepository extends JpaRepository<Niveau, Long> {
    // Ajoutez ici des méthodes spécifiques si nécessaire
}
