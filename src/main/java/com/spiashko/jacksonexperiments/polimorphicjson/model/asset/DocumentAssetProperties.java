package com.spiashko.jacksonexperiments.polimorphicjson.model.asset;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Getter
@Setter
public class DocumentAssetProperties implements AssetProperties {

    private String source;
    private String proxy;

}
