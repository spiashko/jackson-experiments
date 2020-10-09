package com.spiashko.jacksonexperiments.polimorphicjson.model.dynamicvalidation;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ValidationConditions {

    private InputType inputType;

    @JsonTypeInfo(
            use = JsonTypeInfo.Id.NAME,
            include = JsonTypeInfo.As.EXTERNAL_PROPERTY,
            property = "inputType"
    )
    @JsonSubTypes({
            @JsonSubTypes.Type(value = NumericTriggerConditions.class, name = "NUMERIC")
    })
    private TriggerConditions<?> conditions;

}