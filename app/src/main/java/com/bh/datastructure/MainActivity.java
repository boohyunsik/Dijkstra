package com.bh.datastructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bh.datastructure.algorithm.Dijkstra;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Dijkstra dijkstra = new Dijkstra();
        dijkstra.process();
    }
}
