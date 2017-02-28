package com.volly.player;

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
    @RequestMapping(path = "/getPlayer/firstname/{firstname}/lastname/{lastname}", method = GET)
    public Player getPlayer(@PathVariable String firstname, @PathVariable String lastname) {
        return new Player();
    }

    @RequestMapping(path = "/createPlayer", method = POST)
    public Player createPlayer(@RequestBody Player player) {
        return player;
    }

}
