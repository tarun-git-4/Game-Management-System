package com.nurat4cipher.gamecrud.service;

import com.nurat4cipher.gamecrud.dao.GameDaoImpl;
import com.nurat4cipher.gamecrud.entity.Game;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameServiceImpl implements GameService{

    private GameDaoImpl gamedaoimpl;

    @Autowired
    public GameServiceImpl(GameDaoImpl gamedaoimpl){
        this.gamedaoimpl = gamedaoimpl;
    }

    @Override
    public List<Game> getAll() {
        return gamedaoimpl.getAll();
    }

    @Override
    public Game getOneById(Integer id) {
        return gamedaoimpl.getOneById(id);
    }

    @Transactional
    @Override
    public Game save(Game game) {
        return gamedaoimpl.save(game);
    }

    @Transactional
    @Override
    public void deleteById(Integer id) {
        gamedaoimpl.deleteById(id);
    }
}
