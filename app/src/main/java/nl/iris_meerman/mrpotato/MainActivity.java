package nl.iris_meerman.mrpotato;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCheckBoxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.check_arms:
                View a = findViewById(R.id.arms);
                if (checked) {
                    a.setVisibility(View.VISIBLE);
                }
                else{
                    a.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.check_ears:
                View e = findViewById(R.id.ears);
                if (checked) {
                    e.setVisibility(View.VISIBLE);
                }
                else {
                    e.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.check_eyebrows:
                View eyebrows = findViewById(R.id.eyebrows);
                if (checked) {
                    eyebrows.setVisibility(View.VISIBLE);
                }
                else {
                    eyebrows.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.check_glasses:
                View g = findViewById(R.id.glasses);
                if (checked) {
                    g.setVisibility(View.VISIBLE);
                }
                else {
                    g.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.check_eyes:
                View eyes = findViewById(R.id.eyes);
                if (checked) {
                    eyes.setVisibility(View.VISIBLE);
                }
                else {
                    eyes.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.check_hat:
                View hat = findViewById(R.id.hat);
                if (checked) {
                    hat.setVisibility(View.VISIBLE);
                }
                else {
                    hat.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.check_mouth:
                View mouth = findViewById(R.id.mouth);
                if (checked) {
                    mouth.setVisibility(View.VISIBLE);
                }
                else {
                    mouth.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.check_mustache:
                View mustache = findViewById(R.id.mustache);
                if (checked) {
                    mustache.setVisibility(View.VISIBLE);
                }
                else {
                   mustache.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.check_nose:
                View n = findViewById(R.id.nose);
                if (checked) {
                    n.setVisibility(View.VISIBLE);
                }
                else {
                    n.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.check_shoes:
                View s = findViewById(R.id.shoes);
                if (checked) {
                    s.setVisibility(View.VISIBLE);
                }
                else {
                    s.setVisibility(View.INVISIBLE);
                }
                break;

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
