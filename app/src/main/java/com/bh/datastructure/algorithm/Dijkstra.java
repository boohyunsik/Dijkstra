package com.bh.datastructure.algorithm;

import com.bh.datastructure.Logger;

import java.util.PriorityQueue;

public class Dijkstra {
    private static final String TAG = "Dijkstra";
    private PriorityQueue<Data> mQueue = new PriorityQueue<>();
    private double[] mDistance;
    private int[] mPrev;
    private double[][] mMap;
    private Data[] mDatas;
    private final int MAX = 100;

    public Dijkstra() {
        mDistance = new double[MAX];
        mPrev = new int[MAX];
        mMap = new double[MAX][MAX];
        mDatas = new Data[MAX];
        for (int r=0; r<MAX;r++) {
            for (int c=0; c<MAX; c++) {
                mMap[r][c] = DataInputUtils.INF;
            }
        }
        makeData();
    }

    public void process() {

        while(!mQueue.isEmpty()) {
            Data data = mQueue.poll();
            for (int i=0;i<MAX;i++) {
                if (mMap[data.getIndex()][i] != DataInputUtils.INF) {
                    if (mDistance[i] > mDistance[data.getIndex()] + mMap[data.getIndex()][i]) {
                        Logger.d(TAG, "..");
                        mDistance[i] = mDistance[data.getIndex()] + mMap[data.getIndex()][i];
                        mPrev[i] = data.getIndex();
                        mDatas[i].setDistance(mDistance[i]);
                    }
                }
            }
        }

        for (int i=0; i<7; i++) {
            Logger.d(TAG, i + " > " + mPrev[i]);
        }
    }

    public void makeData() {
        Data data1 = DataInputUtils.inputData("A", 0);
        Data data2 = DataInputUtils.inputData("B601대형강의실-1", 1);
        Data data3 = DataInputUtils.inputData("B602대형강의실-2", 2);
        Data data4 = DataInputUtils.inputData("B603대형강의실-3", 3);
        Data data5 = DataInputUtils.inputData("B604남자화장실", 4);
        Data data6 = DataInputUtils.inputData("B605여자화장실", 5);
        Data data7 = DataInputUtils.inputData("G", 6);
        data1.setDistance(0.0);
        mMap[data1.getIndex()][data5.getIndex()] = 5;
        mMap[data1.getIndex()][data6.getIndex()] = 5;
        mMap[data1.getIndex()][data4.getIndex()] = 6;
        mMap[data1.getIndex()][data3.getIndex()] = 7;
        mMap[data1.getIndex()][data2.getIndex()] = 8;
        mMap[data1.getIndex()][data7.getIndex()] = 4;

        mMap[data2.getIndex()][data1.getIndex()] = 8;
        mMap[data3.getIndex()][data1.getIndex()] = 7;
        mMap[data4.getIndex()][data1.getIndex()] = 6;
        mMap[data5.getIndex()][data1.getIndex()] = 5;
        mMap[data6.getIndex()][data1.getIndex()] = 5;

        mMap[data7.getIndex()][data1.getIndex()] = 4;
        data2.setDistance(8);
        data3.setDistance(7);
        data4.setDistance(6);
        data5.setDistance(5);
        data6.setDistance(5);
        data7.setDistance(4);
        mDistance[data2.getIndex()] = 8;
        mDistance[data3.getIndex()] = 7;
        mDistance[data4.getIndex()] = 6;
        mDistance[data5.getIndex()] = 5;
        mDistance[data6.getIndex()] = 5;
        mDistance[data7.getIndex()] = 4;

        mDatas[data1.getIndex()] = data1;
        mDatas[data2.getIndex()] = data2;
        mDatas[data3.getIndex()] = data3;
        mDatas[data4.getIndex()] = data4;
        mDatas[data5.getIndex()] = data5;
        mDatas[data6.getIndex()] = data6;
        mDatas[data7.getIndex()] = data7;

        mQueue.offer(data1);
        mQueue.offer(data2);
        mQueue.offer(data3);
        mQueue.offer(data4);
        mQueue.offer(data5);
        mQueue.offer(data6);
        mQueue.offer(data7);
    }
}
