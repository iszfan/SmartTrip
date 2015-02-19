package com.example.tripplanner;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class InfoInput extends Activity {

	Button btn1;
	TextView text1;
	TextView text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_input);
        
        btn1 = (Button) findViewById(R.id.button1);
        btn1.setOnClickListener(next);
        text1 = (TextView) findViewById(R.id.txt1);
        text2 = (TextView) findViewById(R.id.txt2);
        btn1 = (Button) findViewById(R.id.button1);
        btn1.setOnClickListener(next);
        Typeface font = Typeface.createFromAsset(getAssets(), "mindblue.regular.otf");
      
        text1.setTypeface(font);
        text2.setTypeface(font);
    }

    OnClickListener next = new OnClickListener() {
        @Override
        public void onClick(View v) {
        	Intent i=new Intent(
                    InfoInput.this,
                    TodoList.class);
             startActivity(i);
        }
      };


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
