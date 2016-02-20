package com.su.lapponampai_w.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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

        //Button Controller
        buttonController();



    }    //Main Method

    private void buttonController() {

        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //การทำ Sound effect

                MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.dog);
                mediaPlayer.start();

                //Web View
                Intent intent = new Intent(Intent.ACTION_VIEW); //actionview ให้โวยวายไปที่มือถือ เพื่อดู browser หลัก
                intent.setData(Uri.parse("https://youtu.be/fmAEiuuoc_0"));
                startActivity(intent);


                 //getbasecontext ใช้แหล่งกำเนิดเสียงใน internal


                // event ต้องทำไปเรื่อยๆ ถึงจะออกจาก event
            }
        });


    }

    private void bindWidget() {

        trafficListView = (ListView) findViewById(R.id.listView);
        aboutButton = (Button) findViewById(R.id.button);



    }  //bindWidget


}   //Main Class
