package com.spiashko.jacksonexperiments.polimorphicjson.model.dynamicvalidation;

public interface TriggerConditionListItem {

    PolicyEnum getSeverity();

    TriggerCondition getCondition();

}
