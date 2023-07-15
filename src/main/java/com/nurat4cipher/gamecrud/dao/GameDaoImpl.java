package com.nurat4cipher.gamecrud.dao;

import com.nurat4cipher.gamecrud.entity.Game;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GameDaoImpl implements GameDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Game> getAll(){
        TypedQuery<Game> theQuery = entityManager.createQuery("FROM Game ORDER BY rating desc",Game.class);

        List<Game> game = theQuery.getResultList();

        return game;
    }

    @Override
    public Game getOneById(Integer id){
        Game game = entityManager.find(Game.class,id);
        return game;
    }

    @Override
    public Game save(Game game){
        Game dgame = entityManager.merge(game);
        return dgame;
    }

    @Override
    public void deleteById(Integer id){
        Game game = entityManager.find(Game.class,id);
        entityManager.remove(game);
    }
}
