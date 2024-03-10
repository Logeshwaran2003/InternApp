package MRC.InternApp.repositories;

import MRC.InternApp.Entity.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FeedbackRepository extends JpaRepository <Feedback,Long> {
    List<Feedback> findByUserId(Long userId);

}
