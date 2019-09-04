package com.example.listviewseccion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.listviewseccion.adapters.MyAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    List<String> names;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);

        // datos a mostrar
        names = new ArrayList<String>();
        names.add("Pedro");
        names.add("carlos");
        names.add("Andres");
        names.add("Pedro");
        names.add("carlos");
        names.add("Andres");
        names.add("Pedro");
        names.add("carlos");
        names.add("Andres");
        names.add("Pedro");
        names.add("carlos");
        names.add("Andres");
        names.add("Pedro");
        names.add("carlos");
        names.add("Andres");
        names.add("Pedro");
        names.add("carlos");
        names.add("Andres");
        names.add("Pedro");
        names.add("carlos");
        names.add("Andres");
        names.add("Pedro");
        names.add("carlos");
        names.add("Andres");
        names.add("Pedro");
        names.add("carlos");
        names.add("Andres");
        names.add("Pedro");
        names.add("carlos");
        names.add("Andres");
        names.add("Pedro");
        names.add("carlos");
        names.add("Andres");
        names.add("Pedro");
        names.add("carlos");
        names.add("Andres");
        names.add("Pedro");
        names.add("carlos");
        names.add("Andres");

        //adaptador forma visual en que se muestran los datos
        // ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);

        // Enlazamos el adaptador con nuestro listView
        // listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Clicked: " + names.get(position), Toast.LENGTH_SHORT).show();
            }
        });

        // enlazamon con nuestro adaptador perzonalizado
        MyAdapter myAdapter = new MyAdapter(this, R.layout.list_item, names);
        listView.setAdapter(myAdapter);
    }
}
