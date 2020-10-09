package com.spiashko.jacksonexperiments.polimorphicjson.model.asset;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Getter
@Setter
public class ImageAssetProperties implements AssetProperties {

    private String source;
    private String proxy;
    private Integer height;
    private Integer width;

}
