/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamodel.controller;

import datamodel.model.Actor;
import datamodel.service.ActorService;
import datamodel.service.impl.ActorServiceImpl;

/**
 *
 * @author KAI
 */
public class ActorController {

    private ActorService service = new ActorServiceImpl();
    
    public void getAllActor() {
        service.getAllActor();
    }

    public void update(Actor actor) {
        service.update(actor);
    }

    public void delete(Actor actor) {
        service.delete(actor);
    }

    public Actor createActor(Actor actor) {
        return service.createActor(actor);
    }

    public Actor getActorByFirstName(String firstName) {
        return service.findByFirstName(firstName);
    }
    
}
