package MRC.InternApp.Service;

import MRC.InternApp.Entity.Feedback;

import java.util.List;

public interface feedbackService {

    Feedback postFeedback(Long userId, String content);
    List<Feedback> getAllFeedbacks();
    void deleteFeedback(Long id);
}
