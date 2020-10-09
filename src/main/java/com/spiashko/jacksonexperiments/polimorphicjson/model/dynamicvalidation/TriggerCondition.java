package com.spiashko.jacksonexperiments.polimorphicjson.model.dynamicvalidation;

public interface TriggerCondition<T> {

    Comparable<T> getLessThan();

    Comparable<T> getGreaterThan();

}
