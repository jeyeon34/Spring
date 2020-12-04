package com.jeyeon.demorestapi.events;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.RepresentationModel;
import static org.springframework.hateoas.server.mvc.ControllerLinkBuilder.linkTo;

/*public class EventResource extends RepresentationModel {    //ResourceSupport deprecated

    @JsonUnwrapped  //JsonSerialize할 때 event 객체로 묶지 않음
    private Event event;

    public EventResource(Event event) {
        this.event = event;
    }

    public Event getEvent() {
        return event;
    }
}*/

//Automatically JsonUnwrapped used.
public class EventResource extends EntityModel<Event> {    //Resource deprecated

    public EventResource(Event event, Link... links) {
        super(event, links);
        add(linkTo(EventController.class).slash(event.getId()).withSelfRel());
    }
}