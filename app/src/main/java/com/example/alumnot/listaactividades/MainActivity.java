package com.example.alumnot.listaactividades;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends ListActivity{

    private  String practicas [] = {"HechosCuriosos1","HazteUnaFoto","Intents_Act_01","Intents_Act_02","Intents_Act_03","CicloDeVida","Pulsame","ImplicitIntents","BroadcastReceiver"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,practicas);
        setListAdapter(adaptador);
    }
    @Override
    protected void onListItemClick(ListView lista,View vista,int posicion,long id)
    {
        //Toast.makeText(this, "Entra", Toast.LENGTH_LONG).show();

        super.onListItemClick(lista, vista, posicion, id);
        String nompractica=practicas[posicion];


        try
        {
            Class<?> clase= Class.forName("com.example.alumnot.listaactividades."+nompractica);
            Intent intent = new Intent(this,clase);
            startActivity(intent);
        } catch (ClassNotFoundException e) {

            Log.d("Fallo", e.getMessage());
        }
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
