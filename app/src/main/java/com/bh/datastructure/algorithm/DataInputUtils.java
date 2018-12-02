package com.bh.datastructure.algorithm;

public class DataInputUtils {
    public static final double INF = 10000.0;
    public static Data inputData(String name, int index) {
        Data data = new Data.Builder()
                .setName(name)
                .setIndex(index)
                .setDistance(INF)
                .build();
        return data;
    }
}
