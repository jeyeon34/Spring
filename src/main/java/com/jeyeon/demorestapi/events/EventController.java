package com.jeyeon.demorestapi.events;

import org.springframework.hateoas.MediaTypes;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.URI;

import static org.springframework.hateoas.MediaTypes.*;
import static org.springframework.hateoas.server.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.ControllerLinkBuilder.methodOn;

@Controller
@RequestMapping(value = "/api/events", produces = HAL_JSON_VALUE)
public class EventController {

    @PostMapping//("/api/events")
    public ResponseEntity createEvent(@RequestBody Event event){
        //URI createdUri = linkTo(methodOn(EventController.class).createEvent(null)).slash("{id}").toUri();
        URI createdUri = linkTo(EventController.class).slash("{id}").toUri();
        event.setId(10);
        //return ResponseEntity.created(createdUri).build();
        return ResponseEntity.created(createdUri).body(event);
    }
}
