package com.spiashko.jacksonexperiments.polimorphicjson.model.dynamicvalidation;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.ArrayList;

@NoArgsConstructor
@Getter
@Setter
public class NumericTriggerConditions implements TriggerConditions {

    private NumericTriggerConditionList list;

    public static class NumericTriggerConditionList extends ArrayList<NumericTriggerConditionListItem> {

    }

    @Getter
    @Setter
    public static class NumericTriggerConditionListItem implements TriggerConditionListItem {

        private PolicyEnum severity;
        private NumericTriggerCondition condition;

    }

    @Getter
    @Setter
    public static class NumericTriggerCondition implements TriggerCondition {
        private BigDecimal lessThan;
        private BigDecimal greaterThan;
    }
}