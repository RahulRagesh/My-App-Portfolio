package com.udacity.rahul.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }


    public void Spotify_Steamer(View view) {
        Toast.makeText(MainActivity.this, "Here Comes My SPOTIFY STEAMER APP!! Buckle Up!!",
                Toast.LENGTH_SHORT).show();
    }

    public void Scores_App(View view) {
        Toast.makeText(MainActivity.this, "Here Comes My SCORES APP!! Buckle Up!!",
                Toast.LENGTH_SHORT).show();
    }

    public void Library_App(View view) {
        Toast.makeText(MainActivity.this, "Here Comes My LIBRARY APP!! Buckle Up!!",
                Toast.LENGTH_SHORT).show();
    }

    public void Build_It_Bigger(View view) {
        Toast.makeText(MainActivity.this, "Here Comes My BUILD IT BIGGER APP!! Buckle Up!!",
                Toast.LENGTH_SHORT).show();
    }

    public void XYZ_Reader(View view) {
        Toast.makeText(MainActivity.this, "Here Comes My XYZ READER APP!! Buckle Up!!",
                Toast.LENGTH_SHORT).show();
    }

    public void Capstone(View view) {
        Toast.makeText(MainActivity.this, "Here Comes My CAPSTONE APP!! Buckle Up!!",
                Toast.LENGTH_SHORT).show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
