package com.elinsimenstad.showcaseapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_homepage, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
/*
    Button button = (Button) findViewById(R.id.button);
    button.OnClickListener(new View.OnClickListener(){
        public void onClick(View btn){
            TextView popup_msg = (TextView) findViewById(R.id.popup_msg);
            popup_msg.setText("hello");
        }
    });
*/
    public void sendMsg_spotify(View view){
        Button button  = (Button) findViewById(R.id.button);
        TextView popup_msg = (TextView) findViewById(R.id.popup_msg);
        popup_msg.setText("button 1");
    }

    public void sendMsg_score(View view){
        Button button2 = (Button) findViewById(R.id.button2);
        TextView popup_msg = (TextView) findViewById(R.id.popup_msg);
        popup_msg.setText("button 2");
    }

    public void sendMsg_library(View view){
        Button button2 = (Button) findViewById(R.id.button3);
        TextView popup_msg = (TextView) findViewById(R.id.popup_msg);
        popup_msg.setText("button 3");
    }

    public void sendMsg_bigger(View view){
        Button button2 = (Button) findViewById(R.id.button4);
        TextView popup_msg = (TextView) findViewById(R.id.popup_msg);
        popup_msg.setText("button 4");
    }

    public void sendMsg_bacon(View view){
        Button button2 = (Button) findViewById(R.id.button5);
        TextView popup_msg = (TextView) findViewById(R.id.popup_msg);
        popup_msg.setText("button 5");
    }

    public void sendMsg_capstone(View view){
        Button button2 = (Button) findViewById(R.id.button6);
        TextView popup_msg = (TextView) findViewById(R.id.popup_msg);
        popup_msg.setText("button 6");
    }
}
