/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamodel;

import datamodel.controller.ActorController;
import datamodel.model.Actor;
import datamodel.repository.ActorRepository;
import datamodel.repository.impl.ActorRepositoryImpl;
import java.util.Date;

/**
 *
 * @author KAI
 */
public class Datamodel {
    private ActorController controller = new ActorController();

    public ActorController getController() {
        return controller;
    }

    public void setController(ActorController controller) {
        this.controller = controller;
    }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Actor actor = new Actor();
        actor.setFirstName("Anh Nhat");
        actor.setLastName("Nhat Anh");
        actor.setLastUpdate(new Date());
        
        Datamodel d = new Datamodel();
        d.createActor(actor);
        
    }
    
    public Actor getAllActor(){
        controller.getAllActor();
        return null;
    }
    
    public void update(Actor actor){
        controller.update(actor);
    }
    
    public void delete(Actor actor){
        controller.delete(actor);
    }
    
    public Actor createActor(Actor actor){
        return controller.createActor(actor);
    }
}
