package MRC.InternApp.Service;

import MRC.InternApp.Entity.Feedback;
import MRC.InternApp.Entity.Users;
import MRC.InternApp.repositories.FeedbackRepository;
import MRC.InternApp.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class feedbackServiceImp implements feedbackService {

    @Autowired
    private FeedbackRepository feedbackRepository;

    @Autowired
    private UsersRepository userRepository;

    @Override
    public Feedback postFeedback(Long userId, String content) {
        Users user = userRepository.findById(userId)
                .orElseThrow(() -> new IllegalArgumentException("User with ID " + userId + " not found"));
        if (user != null) {
            Feedback feedback = new Feedback();
            feedback.setUser(user);
            feedback.setContent(content);
            return feedbackRepository.save(feedback);
        }
        return null;
    }




    @Override
    public List<Feedback> getAllFeedbacks() {

        return feedbackRepository.findAll();
    }

    @Override
    public void deleteFeedback(Long id) {

        feedbackRepository.deleteById(id);
    }
}
