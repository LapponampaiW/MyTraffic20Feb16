package com.su.lapponampai_w.mytraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    //ประกาศตัวแปร...... Explicit บอก Device ให้พร้อมทั้งเครื่องและ Ram
    private ListView trafficListView;
    private Button aboutButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //bind Widget
        bindWidget();


    }    //Main Method

    private void bindWidget() {

        trafficListView = (ListView) findViewById(R.id.listView);
        aboutButton = (Button) findViewById(R.id.button);



    }  //bindWidget


}   //Main Class
