package com.spiashko.jacksonexperiments.polimorphicjson.model.dynamicvalidation;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class NumericTriggerConditions implements
        TriggerConditions<BigDecimal> {

    private NumericTriggerConditionList list;

    public List<TriggerConditionListItem<BigDecimal>> getList() {
        return (List) list;
    }

    public static class NumericTriggerConditionList extends ArrayList<NumericTriggerConditionListItem> {

    }

    @Getter
    @Setter
    public static class NumericTriggerConditionListItem implements TriggerConditionListItem<BigDecimal> {

        private PolicyEnum severity;
        private NumericTriggerCondition condition;

    }

    @Getter
    @Setter
    public static class NumericTriggerCondition implements TriggerCondition<BigDecimal> {
        private BigDecimal lessThan;
        private BigDecimal greaterThan;
    }
}