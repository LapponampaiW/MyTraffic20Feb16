package com.su.lapponampai_w.mytraffic;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by apple on 2/21/16.
 */

    // ต้องมีการ extends เอา class มาใช้ชื่อ BaseAdapter
public class MyAdapter extends BaseAdapter{
    @Override
    public int getCount() {
        return titleStrings.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.my_listview, viewGroup, false);

        //About Icon
        ImageView iconImageView = (ImageView) view.findViewById(R.id.imageView);
        iconImageView.setImageResource(iconInts[i]);
                    //ต้องมีค่า i เป็นการ loop ค่าตลอดเวลา เป็น Array ต้องใส่ []

        //About Title
        TextView titleTextView = (TextView) view.findViewById(R.id.textView2);
        titleTextView.setText(titleStrings[i]);


        //About Detail
        TextView detailTextView = (TextView) view.findViewById(R.id.textView3);
        detailTextView.setText(detailStrings[i]);


        return view;

    }
//Explicit ==> ต้องกำหนด Data type เอง

    private Context context;
    private int[] iconInts;
    private String[] titleStrings, detailStrings;

    /** Conductor เป็น method หลัก ที่จะทำหน้าที่ Drive ตัวแปรเข้าไปในต่ำแหน่งต่างๆ
        เลือกทุกตัว ที่จะทำการโยนค่า
     **/

    public MyAdapter(Context context, int[] iconInts, String[] titleStrings, String[] detailStrings) {
        this.context = context;
        this.iconInts = iconInts;
        this.titleStrings = titleStrings;
        this.detailStrings = detailStrings;
    }
    //adapter  โยนข้อเข้าไปเป็น loop



}  //Main Class
