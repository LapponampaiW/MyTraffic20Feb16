package com.su.lapponampai_w.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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

        //ListView Controller
        listViewController();



    }    //Main Method

    private void listViewController() {

        //Create ListView มี 3 วิธี
        //Type 1.


         final int[] iconInts = {R.drawable.traffic_01,R.drawable.traffic_02,R.drawable.traffic_03,
         R.drawable.traffic_04,R.drawable.traffic_05,R.drawable.traffic_06,
         R.drawable.traffic_07,R.drawable.traffic_08,R.drawable.traffic_09,
         R.drawable.traffic_10,R.drawable.traffic_11,R.drawable.traffic_12,
         R.drawable.traffic_13,R.drawable.traffic_14,R.drawable.traffic_15,
         R.drawable.traffic_16,R.drawable.traffic_17,R.drawable.traffic_18,
         R.drawable.traffic_19,R.drawable.traffic_20};



        //type 2.

        final String[] titleStrings = new String[20];  // การเขียน Array ตัวเต็ม กำหนดค่าไปเลย 20 ค่า
        titleStrings[0] = "หัวข้อหลักที่ 1";
        titleStrings[1] = "หัวข้อหลักที่ 2";
        titleStrings[2] = "หัวข้อหลักที่ 3";
        titleStrings[3] = "หัวข้อหลักที่ 4";
        titleStrings[4] = "หัวข้อหลักที่ 5";
        titleStrings[5] = "หัวข้อหลักที่ 6";
        titleStrings[6] = "หัวข้อหลักที่ 7";
        titleStrings[7] = "หัวข้อหลักที่ 8";
        titleStrings[8] = "หัวข้อหลักที่ 9";
        titleStrings[9] = "หัวข้อหลักที่ 10";
        titleStrings[10] = "หัวข้อหลักที่ 11";
        titleStrings[11] = "หัวข้อหลักที่ 12";
        titleStrings[12] = "หัวข้อหลักที่ 13";
        titleStrings[13] = "หัวข้อหลักที่ 14";
        titleStrings[14] = "หัวข้อหลักที่ 15";
        titleStrings[15] = "หัวข้อหลักที่ 16";
        titleStrings[16] = "หัวข้อหลักที่ 17";
        titleStrings[17] = "หัวข้อหลักที่ 18";
        titleStrings[18] = "หัวข้อหลักที่ 19";
        titleStrings[19] = "หัวข้อหลักที่ 20";

        //type 3. ดึงมาจากต่าง file อื่น (my_data.xml)
        String[] detailshortStrings = getResources().getStringArray(R.array.detail_short);



        //Sent Value to Adapter
        MyAdapter myAdapter = new MyAdapter(MainActivity.this,iconInts,titleStrings,detailshortStrings);
        trafficListView.setAdapter(myAdapter);



        //ListView Active When Click ให้คลิกได้(เมื่อกด)

        //คลิกให้มีความซับซ้อนมากขึ้น มันจะกำหนดค่าให้กับตัวที่เรากดคลิกด้วย
        trafficListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);


                intent.putExtra("title", titleStrings); //"title" เป็นค่า key putextra data type program จะจัดการให้เอง
                intent.putExtra("Image",iconInts);
                intent.putExtra("Index", i);




                startActivity(intent); // ต้องมีคำสั่ง ให้เริ่มที่ start ด้วย



            } // even
        });


    }   //ListViewController



    private void buttonController() {

        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //การทำ Sound effect

                MediaPlayer mediaPlayer = new MediaPlayer();
                mediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.dog);
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
