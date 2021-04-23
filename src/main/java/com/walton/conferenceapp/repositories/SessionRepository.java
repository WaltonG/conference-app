package com.walton.conferenceapp.repositories;

import com.walton.conferenceapp.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session,Long> {
}
