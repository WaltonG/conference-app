package com.walton.conferenceapp.controllers;

import com.walton.conferenceapp.models.Session;
import com.walton.conferenceapp.repositories.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/sessions")
public class SessionsController {
    @Autowired
    private SessionRepository sessionRepository;

    @GetMapping
    public List<Session> list () {
        return sessionRepository.findAll();
    }


    @GetMapping
    @RequestMapping("{id}")
    public Session get(@PathVariable Long id) {
        return  sessionRepository.getOne(id);
    }

    /**
    @PostMapping
    public Session create(@RequestBody final Session session){
        return sessionRepository.saveAndFlush(session);
    }
    */
}
