package com.bh.datastructure.algorithm;

public class Data implements Comparable<Data> {
    private String name;
    private int index;
    private double distance;

    @Override
    public int compareTo(Data o1) {
        if (distance > o1.distance) {
            return 1;
        } else if (distance == o1.distance) {
            return 0;
        } else {
            return -1;
        }
    }

    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

    public double getDistance() {
        return distance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public static class Builder {
        private Data mData;

        public Builder() {
            mData = new Data();
        }

        public Builder setName(String name) {
            mData.setName(name);
            return this;
        }

        public Builder setIndex(int index) {
            mData.setIndex(index);
            return this;
        }

        public Builder setDistance(double distance) {
            mData.setDistance(distance);
            return this;
        }

        public Data build() {
            return mData;
        }
    }
}
