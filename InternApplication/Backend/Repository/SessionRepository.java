package MRC.InternApp.repositories;

import MRC.InternApp.Entity.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionRepository extends JpaRepository <Session,Long> {
}
