package com.example.finalwork.northamerica;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalwork.Entity;
import com.example.finalwork.GeneralAdapter;
import com.example.finalwork.R;

import com.example.finalwork.europe.EuropeActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class NorthAttractionsActivity extends AppCompatActivity {

    List<Entity> entities = new ArrayList<Entity>();

    FloatingActionButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_north_attractions);

        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(getApplicationContext(), NamericaActivity.class);
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
        entities.add(new Entity("Статуя Свободы", "Страна: США", R.drawable.lions1));
        entities.add(new Entity("Мост Капилано", "Страна: Канада", R.drawable.lions2));
        entities.add(new Entity("Ниагарский водопад", "Страна: границе США и Канады", R.drawable.lions3));
        entities.add(new Entity("Большой каньон", "Страна: США", R.drawable.lions4));
        entities.add(new Entity("Скрытый пляж", "Страна: Мексика", R.drawable.lions5));
        entities.add(new Entity("Диснейленд", "Страна: США", R.drawable.lions6));
        entities.add(new Entity("Каньон Антилопы", "Страна: США", R.drawable.lions7));

    }

    // переопределение onBackPressed
    @Override
    public void onBackPressed() {
        Intent intent  = new Intent(getApplicationContext(), NamericaActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }
}