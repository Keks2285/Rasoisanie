package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList<Model> movies = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setData();

        RecyclerView recyclerView = findViewById(R.id.recycler);

        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        StateAdapter adapter = new StateAdapter(this, movies);
        recyclerView.setAdapter(adapter);
    }
    private  void setData()
    {
        movies.add(new Model(":05.02.2021 \n 5:20 - подъем  | 6:00 - выход из дома | 8:30 - начало пар \n15:40 - окончание пар  19:00 - работа над практическими | 23:00 - сон"));
        movies.add(new Model("06.02.2021:\n Производственная практика"));
        movies.add(new Model("07.02.2021:\n Производственная практика"));
        movies.add(new Model("08.02.2021: \n 5:20 - подъем  | 6:00 - выход из дома | 8:30 - начало пар \n17:10 - окончание пар  21:00 - работа над практическими | 23:00 - сон"));
        movies.add(new Model("09.02.2021\n 5:20 - подъем  | 6:00 - выход из дома | 8:30 - начало пар \n 15:40 - окончание пар  19:00 - работа над практическими | 23:00 - сон"));
        movies.add(new Model("10.02.2021:\n 11:00 - подъем | 12:00 - работа над практическими | 17:00 - отдых \n 23:00 - сон"));
        movies.add(new Model("11.02.2021:\n 11:00 - подъем | 12:00 - работа над практическими|15:00 - парикмахерская | 17:00 - отдых \n 23:00 - сон"));

        movies.add(new Model("\n"));
        movies.add(new Model("12.02.2021:\n Производственная практика"));
        movies.add(new Model("13.02.2021:\n Производственная практика"));
        movies.add(new Model("14.02.2021: \n 5:20 - подъем  | 6:00 - выход из дома | 8:30 - начало пар \n17:10 - окончание пар  21:00 - работа над практическими | 23:00 - сон"));
        movies.add(new Model("15.02.2021\n 5:20 - подъем  | 6:00 - выход из дома | 8:30 - начало пар \n 15:40 - окончание пар  19:00 - работа над практическими | 23:00 - сон"));
        movies.add(new Model("16.02.2021:\n 11:00 - подъем | 12:00 - работа над практическими | 17:00 - отдых \n 23:00 - сон"));
        movies.add(new Model("17.02.2021:\n 11:00 - подъем | 12:00 - работа над практическими|15:00 - парикмахерская | 17:00 - отдых \n 23:00 - сон"));
        movies.add(new Model("18.02.2021:\n 11:00 - подъем | 12:00 - работа над практическими|15:00 - парикмахерская | 17:00 - отдых \n 23:00 - сон"));


    }
}