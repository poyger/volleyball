package com.volly.player;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: Poyan Gerami
 * Email: poyan.gerami@eniro.com
 * Date: 2017-02-25
 */
@RestController
public class PlayerController {
    @RequestMapping(path = "/getPlayer", method = RequestMethod.GET)
    public String getPlayer() {
        return "Poyan Gerami";
    }
}
