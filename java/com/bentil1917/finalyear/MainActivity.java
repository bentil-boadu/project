package com.bentil1917.finalyear;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;



import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Toast;

import static android.view.View.GONE;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ScrollView economics;
    ScrollView entertainment;
    ScrollView governance;
    ScrollView security;
    ScrollView education;
    ScrollView content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        economics = (ScrollView) findViewById(R.id.eco);
        entertainment = (ScrollView) findViewById(R.id.ent);
        governance = (ScrollView) findViewById(R.id.gov);
        security = (ScrollView) findViewById(R.id.sec);
        education = (ScrollView) findViewById(R.id.edu);
        content = (ScrollView) findViewById(R.id.home);

     /*   FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });  */
 
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
       // newsTitles = getResources().getStringArray(R.id.),
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
            this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        //set up the drawer's list view with items and click listener

        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

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

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
           // Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show();
            Intent settings = new Intent(getApplicationContext(),SettingsActivity.class);
            startActivity(settings);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        if (id == R.id.home){

            content.setVisibility(View.VISIBLE);
            //disable all other layouts leaving only the home
            economics.setVisibility(View.GONE);
            education.setVisibility(View.GONE);
            governance.setVisibility(View.GONE);
            security.setVisibility(View.GONE);
            entertainment.setVisibility(View.GONE);
            //Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show();

        }

            if (id == R.id.economics){

                education.setVisibility(View.GONE);
                governance.setVisibility(View.GONE);
                security.setVisibility(View.GONE);
                entertainment.setVisibility(View.GONE);

                //display economics layout when economics is clicked;
                economics.setVisibility(View.VISIBLE);

             //Toast.makeText(this, "Economics", Toast.LENGTH_SHORT).show();

            }

        if (id == R.id.education){
            economics.setVisibility(View.GONE);
            governance.setVisibility(View.GONE);
            security.setVisibility(View.GONE);
            entertainment.setVisibility(View.GONE);

            //display education layout when economics is clicked;
            education.setVisibility(View.VISIBLE);

          //  Toast.makeText(this, "Economics", Toast.LENGTH_SHORT).show();

        }

        if (id == R.id.security){
            economics.setVisibility(View.GONE);
            education.setVisibility(View.GONE);
            governance.setVisibility(View.GONE);
            entertainment.setVisibility(View.GONE);

            //display economics layout when economics is clicked;
            security.setVisibility(View.VISIBLE);

          //  Toast.makeText(this, "Economics", Toast.LENGTH_SHORT).show();

        }

        if (id == R.id.governance){
            economics.setVisibility(View.GONE);
            education.setVisibility(View.GONE);
            security.setVisibility(View.GONE);
            entertainment.setVisibility(View.GONE);

            //display economics layout when economics is clicked;
            governance.setVisibility(View.VISIBLE);

            //Toast.makeText(this, "Economics", Toast.LENGTH_SHORT).show();

        }

        if (id == R.id.entertainment){
            economics.setVisibility(View.GONE);
            education.setVisibility(View.GONE);
            governance.setVisibility(View.GONE);
            security.setVisibility(View.GONE);

            //display economics layout when economics is clicked;
            entertainment.setVisibility(View.VISIBLE);

            //Toast.makeText(this, "Economics", Toast.LENGTH_SHORT).show();

        }





        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
