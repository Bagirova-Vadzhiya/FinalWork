package com.example.finalwork.africa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalwork.Entity;

import com.example.finalwork.GeneralAdapter;
import com.example.finalwork.R;
import com.example.finalwork.SecondActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class AttractionsActivity extends AppCompatActivity {

    List<Entity> entities = new ArrayList<Entity>();

    FloatingActionButton back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attractions);
        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(getApplicationContext(), AfricaActivity.class);
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
        entities.add(new Entity("Пирамиды Гизы", "Страна: Египет", R.drawable.attractions1));
        entities.add(new Entity("Сфинкс", "Страна: Египет", R.drawable.attractions2));
        entities.add(new Entity("Древний город Карфаген", "Страна: Тунис", R.drawable.attractions3));
        entities.add(new Entity("Водопад Виктория", "Страна: на границе Зимбабве и Замбии", R.drawable.attractions4));
        entities.add(new Entity("Вулкан Даллол", "Страна: Эфиопия", R.drawable.attractions5));
        entities.add(new Entity("пустыня Данакиль", "Страна: Эфиопия", R.drawable.attractions6));
        entities.add(new Entity("Бандиагара", "Страна: Мали", R.drawable.attractions7));
        entities.add(new Entity("Сад Кирстенбош", "Страна: ЮАР", R.drawable.attractions8));
    }

    // переопределение onBackPressed
    @Override
    public void onBackPressed() {
        Intent intent  = new Intent(getApplicationContext(), AfricaActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }
}