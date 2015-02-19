package com.example.tripplanner;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;


public class MainPage extends Activity {

//	Button btn1;
	ImageView add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);
        
        add = (ImageView) findViewById(R.id.add);
        add.setOnClickListener(next);
        TextView txt = (TextView) findViewById(R.id.textView1);
        TextView txt2 = (TextView) findViewById(R.id.saved_trip);
        TextView txt3 = (TextView) findViewById(R.id.new_trip);
//        img1 = (ImageView) findViewById(R.id.airplane);
        Typeface font = Typeface.createFromAsset(getAssets(), "gasalt.regular.ttf");
        Typeface font2 = Typeface.createFromAsset(getAssets(), "gasalt.black.ttf");
        txt.setTypeface(font);
        txt2.setTypeface(font2);
        txt3.setTypeface(font2);
    }

    OnClickListener next = new OnClickListener() {
        @Override
        public void onClick(View v) {
        	Intent i=new Intent(
                    MainPage.this,
                    Destination.class);
             startActivity(i);
        }
      };

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//        if (id == R.id.action_settings) {
//            return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }
}
