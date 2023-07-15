package com.nurat4cipher.gamecrud.control;

import com.nurat4cipher.gamecrud.entity.Game;
import com.nurat4cipher.gamecrud.service.GameServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/games")
public class FunController {

    private GameServiceImpl gameServiceImpl;

    @Autowired
    public FunController(GameServiceImpl gameServiceImpl){
        this.gameServiceImpl = gameServiceImpl;
    }

    @GetMapping("/list")
    public String listGames(Model theModel) {

        List<Game> gameList = gameServiceImpl.getAll();

        // add to the spring model
        theModel.addAttribute("games", gameList);

        return "list-games";
    }

    @GetMapping("/formForAdd")
    public String formForAdd(Model theModel) {

        Game game = new Game();

        // add to the spring model
        theModel.addAttribute("game", game);

        return "game-form";
    }

    @GetMapping("/formForUpdate")
    public String formForUpdate(@RequestParam("gameId") int gameId, Model theModel) {
        Game game = gameServiceImpl.getOneById(gameId);
        theModel.addAttribute("game",game);
        return "game-form";
    }

    @PostMapping("/save")
    public String saveGame(@ModelAttribute("game") Game game) {
        gameServiceImpl.save(game);
        return "redirect:/games/list";
    }

    @GetMapping("/deleteById")
    public String feleteById(@RequestParam("gameId") int gameId, Model theModel) {
        gameServiceImpl.deleteById(gameId);
        return "redirect:/games/list";
    }

}
