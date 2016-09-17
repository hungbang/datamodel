/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamodel.repository.impl;

import datamodel.model.Actor;
import datamodel.model.EntityManagerImpl;
import datamodel.repository.ActorRepository;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author KAI
 */
public class ActorRepositoryImpl implements ActorRepository{

    
    private EntityManager em;

    
    public EntityManager getEm() {
        return em;
    }
    public void setEm(EntityManager em) {
        EntityManagerImpl emi = new EntityManagerImpl();
        this.em = emi.getEntityManager();
    }
    private EntityTransaction transaction = em.getTransaction();
    
    
    @Override
    public List<Actor> findAllActor() {
        return em.createNamedQuery("Actor.findAll").getResultList();
        
    }

    @Override
    public Actor findById(String id) {
        Actor actor = null;
        try{
          List<Actor> actors =  em.createNamedQuery("Actor.findByActorId").getResultList();
          if(!actors.isEmpty()){
              actor = actors.get(0);
          }
        }catch(Exception ex){
        }
        return actor;
    }

    @Override
    public void deleteActor(Actor actor) {
        transaction.begin();
        try{
            em.remove(actor);
        }catch(Exception e){
            em.getTransaction().rollback();
        }
        transaction.commit();
        em.close();
    }

    @Override
    public void saveAndUpdate(Actor actor) {
        //work add new entity to Persistence Context, if entity exists , throws exception
        //entity can change then persist.
        EntityManagerImpl emi = new EntityManagerImpl();
        System.out.println("em. is not null" );
        EntityManager em = emi.getEntityManager();
        System.out.println("em. is not null"+ em );
        em.persist(actor);
        System.out.println("first name before persist: "+ actor.getFirstName());
        actor.setFirstName("firstName 1");
        List<Actor>  actors =  em.createNamedQuery("Actor.findByActorId").getResultList();
        
        if(!actors.isEmpty()){
            System.out.println("first name then persist: "+ actors.get(0).getFirstName());
        }


        //work with copy of entity, entity can not change after that merge operation.Update entity.
//        getEntity().entityManager().merge(actor);
//        commit();
    }
    
}
