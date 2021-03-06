package com.spiashko.jacksonexperiments.polimorphicjson;

import com.spiashko.jacksonexperiments.polimorphicjson.model.asset.Asset;
import com.spiashko.jacksonexperiments.polimorphicjson.model.dynamicvalidation.ValidationConditions;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/polymorphic-json")
public class PolymorphicJsonController {

    @PostMapping("/asset")
    public Asset processPolymorphicJson(@RequestBody Asset asset) {
        return asset;
    }

    @PostMapping("/validation-conditions")
    public ValidationConditions processPolymorphicJson(
            @RequestBody ValidationConditions request) {
        return request;
    }

}
