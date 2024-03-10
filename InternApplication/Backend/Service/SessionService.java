package MRC.InternApp.Service;

import MRC.InternApp.Entity.Session;

import java.util.List;

public interface sessionService {

    List<Session> getAllSessions();
    Session createSession(Session session);
    void deleteSession(Long id);
}
