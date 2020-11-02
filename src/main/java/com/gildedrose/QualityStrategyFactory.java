package com.gildedrose;

public class QualityStrategyFactory {

    private IUpdate[] strategyList;

    public QualityStrategyFactory() {
        this.strategyList = new IUpdate[]{
            new BrieStrategy(),

        };

    }

    public IUpdate ApplyStrategy(Item item){
        for (IUpdate update: strategyList) {
            if(update.Apply(item)==true)
                    return update;
        }
        return new RegularStrategy();
    }
}
