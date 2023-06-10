package projetpoo.Web.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projetpoo.Web.entite.SystemeEducatif;

@Repository
public interface SystemeEducatifRepository extends JpaRepository<SystemeEducatif, Long> {
    // Ajoutez ici des méthodes spécifiques si nécessaire
}
