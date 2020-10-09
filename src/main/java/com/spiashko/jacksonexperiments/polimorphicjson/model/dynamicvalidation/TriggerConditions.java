package com.spiashko.jacksonexperiments.polimorphicjson.model.dynamicvalidation;

import java.util.List;

public interface TriggerConditions<T> {

    List<TriggerConditionListItem<T>> getList();

}
