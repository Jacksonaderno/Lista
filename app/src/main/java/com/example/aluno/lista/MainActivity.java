package com.example.aluno.lista;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String [] lista = {"Tela A", "Tela B", "Tela C"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, lista);

        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 0){
                    Intent intent = new Intent(MainActivity.this, TelaA.class);
                    startActivity(intent);
                    Toast.makeText(getBaseContext(),"Bem Vindo a Tela A", Toast.LENGTH_LONG).show();
                }else if (position == 1){
                    Intent intent = new Intent(MainActivity.this, TelaB.class);
                    startActivity(intent);
                    Toast.makeText(getBaseContext(),"Bem Vindo a Tela B", Toast.LENGTH_LONG).show();
                }else if (position == 2){
                    Intent intent = new Intent(MainActivity.this, TelaC.class);
                    startActivity(intent);
                    Toast.makeText(getBaseContext(),"Bem Vindo a Tela C", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
