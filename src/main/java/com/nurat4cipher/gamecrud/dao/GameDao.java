package com.nurat4cipher.gamecrud.dao;

import com.nurat4cipher.gamecrud.entity.Game;

import java.util.List;

public interface GameDao {
    List<Game> getAll();

    Game getOneById(Integer id);

    Game save(Game game);

    void deleteById(Integer id);
}
