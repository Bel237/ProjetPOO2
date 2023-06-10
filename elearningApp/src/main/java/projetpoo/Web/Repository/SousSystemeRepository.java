package projetpoo.Web.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projetpoo.Web.entite.SousSysteme;

@Repository
public interface SousSystemeRepository extends JpaRepository<SousSysteme, Long> {
    // Ajoutez ici des méthodes spécifiques si nécessaire
}
