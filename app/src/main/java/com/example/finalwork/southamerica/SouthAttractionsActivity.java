package com.example.finalwork.southamerica;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalwork.Entity;

import com.example.finalwork.GeneralAdapter;
import com.example.finalwork.R;
import com.example.finalwork.northamerica.NamericaActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class SouthAttractionsActivity extends AppCompatActivity {

    List<Entity> entities = new ArrayList<Entity>();

    FloatingActionButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_south_attractions);

        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SamActivity.class);
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
        entities.add(new Entity("Мачу-Пикчу", "Страна: Перу", R.drawable.lions_1));
        entities.add(new Entity("Водопад Анхель", "Страна: Венесуэла", R.drawable.lions_2));
        entities.add(new Entity("Водопады Игуасу", "Страна: граница между Бразилией и Аргентиной", R.drawable.lions_3));
        entities.add(new Entity("Пустыня Атакама", "Страна: Чили", R.drawable.lions_4));
        entities.add(new Entity("Статуя Христа-Искупителя", "Страна: Бразилия", R.drawable.lions_5));
        entities.add(new Entity("Озеро Титикака", "Страна: граница между Боливией и Перу", R.drawable.lions_6));
        entities.add(new Entity("Солончак Уюни", "Страна: Боливия", R.drawable.lions_7));
    }

    // переопределение onBackPressed
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), SamActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }
}