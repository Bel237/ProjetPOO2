package projetpoo.Web.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projetpoo.Web.entite.Lecon;

@Repository
public interface LeconRepository extends JpaRepository<Lecon, Long> {
    // Ajoutez ici des méthodes spécifiques si nécessaire
}
