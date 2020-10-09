package com.spiashko.jacksonexperiments.polimorphicjson;

import com.spiashko.jacksonexperiments.polimorphicjson.model.Asset;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/polymorphic-json")
public class PolymorphicJsonController {

    @PostMapping
    public Asset processPolymorphicJson(@RequestBody Asset asset) {
        return asset;
    }

}
