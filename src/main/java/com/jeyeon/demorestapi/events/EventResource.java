package com.jeyeon.demorestapi.events;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import org.springframework.hateoas.RepresentationModel;

public class EventResource extends RepresentationModel {    //ResourceSupport deprecated

    @JsonUnwrapped  //JsonSerialize할 때 event 객체로 묶지 않음
    private Event event;

    public EventResource(Event event) {
        this.event = event;
    }

    public Event getEvent() {
        return event;
    }
}
