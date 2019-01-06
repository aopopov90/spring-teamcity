package com.popov.teamcity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * MainController
 */

@RestController
public class MainController {

    @RequestMapping("/bottles")
    public Bottle main(@RequestParam(value="type", defaultValue="Sistema") String type, @RequestParam(value="quantity", defaultValue="1" ) Integer quantity){
        double price;
        switch (type) {
            case "sistema":
                price = 10;
                break;
            default:
                price = 5;
                break;
        }
        Bottle bottle = new Bottle(type, quantity);
        bottle.setCost(price * quantity);
        return bottle;
    }

}