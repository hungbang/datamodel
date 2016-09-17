/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamodel.service.impl;

import datamodel.model.Actor;
import datamodel.repository.ActorRepository;
import datamodel.repository.impl.ActorRepositoryImpl;
import datamodel.service.ActorService;
import datamodel.vo.ActorVO;
import java.util.List;

/**
 *
 * @author KAI
 */
public class ActorServiceImpl implements ActorService{

    private ActorRepository repository = new ActorRepositoryImpl();
    
    @Override
    public List<ActorVO> findAllActor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ActorVO findById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteActorVO(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saveAndUpdate(ActorVO actorVO) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getAllActor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Actor createActor(Actor actor) {
        return repository.createActor(actor);
    }
    
}
