package com.example.alumnot.listaactividades;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class CicloDeVida extends ActionBarActivity {

    static final String TAG="Estado: ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ciclo_de_vida);
    }
    protected void onStart()
    {

        super.onStart();
        Toast.makeText(this, "OnStart", Toast.LENGTH_LONG).show();
        android.util.Log.i(TAG,"onStart");

    }

    protected void onRestart()
    {
        super.onRestart();
        Toast.makeText(this, "OnRestart", Toast.LENGTH_LONG).show();
        android.util.Log.i(TAG,"onRestart");


    }

    protected void onResume()
    {
        super.onResume();
        Toast.makeText(this, "OnResume", Toast.LENGTH_LONG).show();
        android.util.Log.i(TAG,"onResume");

    }

    protected void onPause()
    {

        super.onPause();
        Toast.makeText(this, "OnPause", Toast.LENGTH_LONG).show();
        android.util.Log.i(TAG,"onStop");


    }

    protected void onStop()

    {

        super.onStop();
        Toast.makeText(this, "OnStop", Toast.LENGTH_LONG).show();
        android.util.Log.i(TAG,"onStop");


    }

    protected void onDestroy()
    {

        super.onDestroy();
        Toast.makeText(this, "OnDestroy", Toast.LENGTH_LONG).show();
        android.util.Log.i(TAG,"onDestroy");


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_ciclo_de_vida, menu);
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
