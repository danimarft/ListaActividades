package com.example.alumnot.listaactividades;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class Intents_Act_03 extends ActionBarActivity {

    public final int DEV2 = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intents__act_03);


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
       // super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==DEV2)
        {
            if(resultCode == RESULT_OK)
            {

                Toast.makeText(this,data.getData().toString(),Toast.LENGTH_LONG).show();
                Toast.makeText(this,Integer.toString(data.getIntExtra("num3",999)),Toast.LENGTH_LONG).show();

            }
        }

    }

    public void click5(View v)
    {

        Intent intent2 = new Intent(this,Intents_Act_03_b.class);//llama a la actividad

        intent2.putExtra("str1","Esto es un String");
        intent2.putExtra("num1",25);

        /*otro metodo*/
        Bundle bundle2= new Bundle();

        bundle2.putString("str2","Esto es otro String");
        bundle2.putInt("num2",35);

        intent2.putExtras(bundle2);

        startActivityForResult(intent2,DEV2);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_intents__act_03, menu);
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
