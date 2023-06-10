package projetpoo.Web.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projetpoo.Web.entite.Cycle;

@Repository
public interface CycleRepository extends JpaRepository<Cycle, Long> {
    // Ajoutez ici des méthodes spécifiques si nécessaire
}
