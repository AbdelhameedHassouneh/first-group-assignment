package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recycler=(RecyclerView) findViewById(R.id.players_recycler);
        Player players[]=Player.getPlayers();
        recycler.setLayoutManager(new LinearLayoutManager(this));
        CaptionImagesAdapter adapter=new CaptionImagesAdapter(players,this);
        recycler.setAdapter(adapter);


    }
}