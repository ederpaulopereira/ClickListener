package com.example.ederpaulo.clicklistener;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = (Button) findViewById(R.id.botao1);
        Button b2 = (Button) findViewById(R.id.botao2);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.botao1:
                Toast.makeText(MainActivity.this, "Botão 1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.botao2:
                Toast.makeText(MainActivity.this, "Botão 2", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
