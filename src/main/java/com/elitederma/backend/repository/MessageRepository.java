package com.elitederma.backend.repository;

import com.elitederma.backend.model.Message;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
    Page<Message> findByClientNameContaining(String clientName, Pageable pageable);
}
