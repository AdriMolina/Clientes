package com.example.adi.clientes;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.adi.clientes.adapters.HistoriaAdapter;
import com.example.adi.clientes.adapters.SeccionesAdapter;
import com.example.adi.clientes.fragments.CarritokFragment;
import com.example.adi.clientes.fragments.Datos_Cliente;
import com.example.adi.clientes.fragments.PruebaFragment;

public class Principal extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ImageView datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
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

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        //definicion de elementos cuando no esta en el xml al que hace referencia
        LayoutInflater layoutInflater = LayoutInflater.from(this);
        View hola = layoutInflater.inflate(R.layout.nav_header_principal,null);

        datos= hola.findViewById(R.id.iconoUsuario);

        //eventos

        datos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Principal.this,Datos_Cliente.class);
                startActivity(intent);

            }
        });
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
        getMenuInflater().inflate(R.menu.principal, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.

        int id = item.getItemId();

        if (id == R.id.carrito) {

            SeccionesAdapter diaFragmentPagerAdapter = new SeccionesAdapter(getSupportFragmentManager());
            ViewPager viewPager = (ViewPager)findViewById(R.id.viewPager_app_bar_principal) ;
            viewPager.setAdapter(diaFragmentPagerAdapter);

            TabLayout tabLayout  = (TabLayout)findViewById(R.id.tabs_app_bar_principal);
            tabLayout.setupWithViewPager(viewPager);

            Toast.makeText(this, "Yaaaaaa", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.busqueda) {

        } else if (id == R.id.historial) {

            HistoriaAdapter HistrorialAdapter = new HistoriaAdapter(getSupportFragmentManager());
            ViewPager viewPager1 = (ViewPager)findViewById(R.id.viewPager_app_bar_principal) ;
            viewPager1.setAdapter(HistrorialAdapter);

            TabLayout tabLayout1  = (TabLayout)findViewById(R.id.tabs_app_bar_principal);
            tabLayout1.setupWithViewPager(viewPager1);

            Toast.makeText(this, "entroooo", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.ayuda) {

        } else if (id == R.id.buzon) {

        }




        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }




}
