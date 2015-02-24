package com.example.alumnot.listaactividades;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class Intents_Act_03_b extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intents__act_03_b);

        Toast.makeText(this, getIntent().getStringExtra("str1"), Toast.LENGTH_LONG).show();

        Toast.makeText(this,Integer.toString(getIntent().getIntExtra("num1",999)), Toast.LENGTH_LONG).show();


        /*mediante un bundle*/

        Bundle bundle = getIntent().getExtras();


        Toast.makeText(this,bundle.getString("str2") , Toast.LENGTH_LONG).show();

        Toast.makeText(this,Integer.toString(bundle.getInt("num2",999)) , Toast.LENGTH_LONG).show();
    }




    public void click4(View v)
    {

        Intent intent = new Intent();//llama a la actividad

        intent.setData(Uri.parse("Esto es el tercer string"));
        intent.putExtra("num3",45);
        setResult(Activity.RESULT_OK,intent);
        finish();



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_intents__act_03_b, menu);
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
