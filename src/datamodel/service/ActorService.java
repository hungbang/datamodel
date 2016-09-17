/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamodel.service;

import datamodel.model.Actor;
import datamodel.vo.ActorVO;
import java.util.List;

/**
 *
 * @author KAI
 */
public interface ActorService {
    
    /** find all list actor  */
    public List<ActorVO> findAllActor();
    
    public ActorVO findById(String id);
    
    public void deleteActorVO(String id);
    
    public void saveAndUpdate(ActorVO actorVO);

    public void getAllActor();

    public Actor createActor(Actor actor);

    public Actor findByFirstName(String firstName);

    public void update(Actor actor);

    public void delete(Actor actor);
}
