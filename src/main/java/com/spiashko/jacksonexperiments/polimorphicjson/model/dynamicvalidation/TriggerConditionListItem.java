package com.spiashko.jacksonexperiments.polimorphicjson.model.dynamicvalidation;

public interface TriggerConditionListItem<T> {

    PolicyEnum getSeverity();

    TriggerCondition<T> getCondition();

}
