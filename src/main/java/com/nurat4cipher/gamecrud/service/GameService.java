package com.nurat4cipher.gamecrud.service;

import com.nurat4cipher.gamecrud.entity.Game;

import java.util.List;

public interface GameService {
    List<Game> getAll();

    Game getOneById(Integer id);

    Game save(Game game);

    void deleteById(Integer id);
}
