/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamodel.repository;

import datamodel.model.Actor;
import java.util.List;

/**
 *
 * @author KAI
 */
public interface ActorRepository {
    /** find all list actor  */
    public List<Actor> findAllActor();
    
    public Actor findById(String id);
    
    public void deleteActor(Actor actor);
    
    public void saveAndUpdate(Actor actor);

    public Actor createActor(Actor actor);

    public Actor findByFirstName(String firstName);

    public void update(Actor actor);

    public void delete(Actor actor);
}
