package com.example.alumnot.listaactividades;

import android.content.res.Resources;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;


public class Pulsame extends ActionBarActivity {

    Button boton;
    int  cont=0;
    final String N_VECES = "numVeces";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pulsame);
        boton=(Button)findViewById(R.id.button8);

        if(savedInstanceState!=null)
        {
            savedInstanceState.getInt(N_VECES);
        }

    }
    public void onclickPulsame(View v){
        cont = cont +1;//cada vez que pulso guardo en un contador
        vecesEscribo();
    }
    private void vecesEscribo( )
    {
        Resources res = getResources();
        String numVec = res.getQuantityString(R.plurals.numeroVecesPulsado, cont, cont);

        boton.setText(numVec);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(N_VECES, cont);//atributo-valor


    }

        @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_pulsame, menu);
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
