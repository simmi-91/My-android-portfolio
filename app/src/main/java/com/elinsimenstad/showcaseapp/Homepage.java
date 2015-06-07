package com.elinsimenstad.showcaseapp;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


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

    // Display message on click
    public void display_toast(View view){
        Context context = getApplicationContext();
        String text = "This button will open the app ";
        CharSequence app_name = "";
        int duration = Toast.LENGTH_SHORT;

        switch (view.getId()){
            case R.id.btn_spotify:
                app_name = getText(R.string.spotify_streamer);
                break;
            case R.id.btn_score:
                app_name = getText(R.string.score_app);
                break;
            case R.id.btn_library:
                app_name = getText(R.string.library_app);
                break;
            case R.id.btn_bigger:
                app_name = getText(R.string.build_it_bigger);
                break;
            case R.id.btn_bacon:
                app_name = getText(R.string.bacon_reader);
                break;
            case R.id.btn_capstone:
                app_name = getText(R.string.capstone);
                break;
        }

        Toast toast = Toast.makeText(context,text+app_name,duration);
        toast.show();
    }

}















