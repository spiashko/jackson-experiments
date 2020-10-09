package com.spiashko.jacksonexperiments.polimorphicjson.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Asset {

    private AssetType type;

    @JsonTypeInfo(
            use = JsonTypeInfo.Id.NAME,
            include = JsonTypeInfo.As.EXTERNAL_PROPERTY,
            property = "type"
    )
    @JsonSubTypes({
            @JsonSubTypes.Type(value = ImageAssetProperties.class, name = "IMAGE"),
            @JsonSubTypes.Type(value = DocumentAssetProperties.class, name = "DOCUMENT")
    })
    private AssetProperties properties;

}
