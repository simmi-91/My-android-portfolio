package com.elinsimenstad.showcaseapp;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;




public class Homepage extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

    }
    /*
    @Override   // adds settings menu
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_homepage, menu);
        return true;
    }
    */

    // Display message on click
    public void display_toast(View view){
        Context context = getApplicationContext();
        String text;
        CharSequence app_name = "";
        int duration = Toast.LENGTH_SHORT;

        Intent launchIntent = null;

        switch (view.getId()){
            case R.id.btn_spotify:
                app_name = getText(R.string.spotify_streamer);
                launchIntent = getPackageManager().getLaunchIntentForPackage("com.elinsimenstad.spotify_streamer");
                break;
            case R.id.btn_score:
                app_name = getText(R.string.score_app);
                launchIntent = getPackageManager().getLaunchIntentForPackage("com.elinsimenstad.score_app");
                break;
            case R.id.btn_library:
                app_name = getText(R.string.library_app);
                launchIntent = getPackageManager().getLaunchIntentForPackage("com.elinsimenstad.library_app");
                break;
            case R.id.btn_bigger:
                app_name = getText(R.string.build_it_bigger);
                launchIntent = getPackageManager().getLaunchIntentForPackage("com.elinsimenstad.build_it_bigger");
                break;
            case R.id.btn_bacon:
                app_name = getText(R.string.bacon_reader);
                launchIntent = getPackageManager().getLaunchIntentForPackage("com.elinsimenstad.bacon_reader");
                break;
            case R.id.btn_capstone:
                app_name = getText(R.string.capstone);
                launchIntent = getPackageManager().getLaunchIntentForPackage("com.elinsimenstad.capstone");
                break;
        }

        if ( launchIntent != null ){
            startActivity(launchIntent);
        }else{
            text = "Could not open ";
            Toast toast = Toast.makeText(context,text+app_name,duration);
            toast.show();
        }


    }


}















