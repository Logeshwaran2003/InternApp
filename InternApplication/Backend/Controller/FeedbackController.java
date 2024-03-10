package MRC.InternApp.Controller;

import MRC.InternApp.Entity.Feedback;
import MRC.InternApp.Service.feedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/feedback")

public class feedbackController {

    @Autowired
    private feedbackService feedbackService;


    @PostMapping("/post/{userId}")
    public ResponseEntity<Feedback> postFeedback(@RequestParam Long userId, @RequestParam String content) {
        Feedback feedback = feedbackService.postFeedback(userId, content);
        return ResponseEntity.ok(feedback);
    }

    @GetMapping("/getAllFeedbacks")
    public ResponseEntity<List<Feedback>> getAllFeedbacks() {
        List<Feedback> feedbacks = feedbackService.getAllFeedbacks();
        return ResponseEntity.ok(feedbacks);     }

    @DeleteMapping("/DeleteFeedback/{id}")
    public ResponseEntity<Void> deleteFeedback(@PathVariable Long id) {
        feedbackService.deleteFeedback(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }

}
