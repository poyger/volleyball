package com.volly.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * User: Poyan Gerami
 * Email: poyan.gerami@eniro.com
 * Date: 2017-02-25
 */
@RestController
public class PlayerController {

    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerController(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @RequestMapping(path = "/getPlayer/firstname/{firstName}/lastname/{lastName}", method = GET)
    public Player getPlayer(@PathVariable String firstName, @PathVariable String lastName) {
        return new Player(firstName, lastName);
    }

    @RequestMapping(path = "/createPlayer", method = POST)
    public Player createPlayer(@RequestBody Player player) {
        playerRepository.savePlayer(player);
        return player;
    }

}
