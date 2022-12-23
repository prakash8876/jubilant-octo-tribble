package io.matoshri.security.repo;

import io.matoshri.security.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface MessageRepository extends JpaRepository<Message, Long> {
}
