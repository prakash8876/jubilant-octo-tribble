package io.matoshri.security.repo;

import io.matoshri.security.model.Message;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SecurityMessageRepository extends MessageRepository {

    @Query("SELECT m FROM Message m WHERE m.to.id = ?#{ principal?.id }")
    @Override
    List<Message> findAll();
}
