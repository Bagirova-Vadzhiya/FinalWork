package com.example.finalwork.europe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalwork.Entity;
import com.example.finalwork.GeneralAdapter;
import com.example.finalwork.R;

import com.example.finalwork.australia.AustraliaActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class EuropeAttractionsActivity extends AppCompatActivity {

    List<Entity> entities = new ArrayList<Entity>();

    FloatingActionButton back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_europe_attractions);

        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(getApplicationContext(), EuropeActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(intent);
            }
        });

        setInitialData();

        RecyclerView recyclerView = findViewById(R.id.attractionsList);

        GeneralAdapter adapter = new GeneralAdapter(this, entities);

        recyclerView.setAdapter(adapter);
    }

    private void setInitialData() {
        entities.add(new Entity("Парфенон", "Страна: Греция", R.drawable.attractions_11));
        entities.add(new Entity("Колизей", "Страна: Италия", R.drawable.attractions_12));
        entities.add(new Entity("Эйфелева башня", "Страна: Франция", R.drawable.attractions_13));
        entities.add(new Entity("Собор Святого Петра", "Страна: Ватикан", R.drawable.attractions_14));
        entities.add(new Entity("Московский Кремль", "Страна: Россия", R.drawable.attractions_5));
        entities.add(new Entity("Пизанская башня", "Страна: Италия", R.drawable.attractions_15));
        entities.add(new Entity("Старый город Дубровника", "Страна: Хорватия", R.drawable.attractions_16));
        entities.add(new Entity("Храм Василия Блаженного", "Страна: Россия", R.drawable.attractions_17));
    }

    // переопределение onBackPressed
    @Override
    public void onBackPressed() {
        Intent intent  = new Intent(getApplicationContext(), EuropeActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }
}