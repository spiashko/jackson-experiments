package com.spiashko.jacksonexperiments.polimorphicjson.model.dynamicvalidation;

import java.util.List;

public interface TriggerConditions<T> {

    List<? extends TriggerConditionListItem<T>> getList();

}
