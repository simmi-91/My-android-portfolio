package com.elinsimenstad.showcaseapp;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import kaaes.spotify.webapi.android.SpotifyApi;
import kaaes.spotify.webapi.android.SpotifyService;
import kaaes.spotify.webapi.android.models.Album;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;


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
        String text = "This button will open the app ";
        CharSequence app_name = "";
        int duration = Toast.LENGTH_SHORT;

        switch (view.getId()){
            case R.id.btn_spotify:
                app_name = getText(R.string.spotify_streamer);
                SpotifyApi api = new SpotifyApi();
                // Most (but not all) of the Spotify Web API endpoints require authorisation.
                // If you know you'll only use the ones that don't require authorisation you can skip this step
                api.setAccessToken("myAccessToken");

                SpotifyService spotify = api.getService();

                spotify.getAlbum("2dIGnmEIy1WZIcZCFSj6i8", new Callback<Album>() {
                    @Override
                    public void success(Album album, Response response) {
                        Log.d("Album success", album.name);
                    }
                    @Override
                    public void failure(RetrofitError error) {
                        Log.d("Album failure", error.toString());
                    }
                });
                setContentView(R.layout.activity_spotify_streamer);
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
    /*
    public static class PlaceholderFragment extends Fragment {
        public  PlaceholderFragment(){
        }

        public View onCreateView(LayoutInflater inflater, ViewGroup)
    }
    */

}















