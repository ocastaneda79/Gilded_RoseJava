package com.gildedrose;


import java.util.*;


public class QualityStrategyFactory {
    private IUpdate[] StrategyList;

    public QualityStrategyFactory() {
        this.StrategyList = new IUpdate[]{
                new BrieStrategy(),
                new RegularStrategy(),

        };
    }

}
