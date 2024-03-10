package MRC.InternApp.Controller;

import MRC.InternApp.Entity.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/session")

public class sessionController {

    @Autowired
    private MRC.InternApp.Service.sessionService sessionService;


    @GetMapping("/getSessions")
    public ResponseEntity<List<Session>> getAllSessions() {
        List<Session> sessions = sessionService.getAllSessions();
        return new ResponseEntity<>(sessions, HttpStatus.OK);
    }


    @PostMapping("/createSession")
    public ResponseEntity<Session> createSession(@RequestBody Session session) {
        Session createdSession = sessionService.createSession(session);
        return new ResponseEntity<>(createdSession, HttpStatus.CREATED);
    }

    @DeleteMapping("/DeleteSession/{id}")
    public ResponseEntity<Void> deleteSession(@PathVariable Long id) {
        sessionService.deleteSession(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }

}
