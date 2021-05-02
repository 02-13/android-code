package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setHasOptionsMenu(true);

        Button Mapbtn = (Button) findViewById(R.id.button1);
        Mapbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent = new Intent(getApplicationContext(),map.class);
               startActivity(intent);
            }
            });


    }

    private void setHasOptionsMenu(boolean b) {
    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){

            case R.id.login:
                Intent intent = new Intent(getApplicationContext(),login.class);
                startActivity(intent);
                return true;

            case R.id.register:
                Intent intent1 = new Intent(getApplicationContext(),register.class);
                startActivity(intent1);
                return true;

            case R.id.action_setting:
                Toast.makeText(this, "설정", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}