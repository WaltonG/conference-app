package com.walton.conferenceapp.repositories;

import com.walton.conferenceapp.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
