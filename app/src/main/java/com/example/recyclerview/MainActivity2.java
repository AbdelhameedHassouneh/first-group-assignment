package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView currentClubView,dateOfBirthView,goalsScoredView,assistsView,ageView,nameView;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent=getIntent();
        String playerName=intent.getStringExtra("playerName");
        int playerAge=intent.getIntExtra("playerAge",0);
        String dateOfBirth=intent.getStringExtra("playerDOfBirth");
        String currentClub=intent.getStringExtra("playerCurrentClub");
        int goalsScored=intent.getIntExtra("playerGoalsScored",0);
        int assists=intent.getIntExtra("playerAssists",0);
        int imageId=intent.getIntExtra("PlayerImage",0);





        currentClubView=findViewById(R.id.currentClubView);
        dateOfBirthView=findViewById(R.id.dateOfBirth);
        goalsScoredView=findViewById(R.id.goalsScored);
        assistsView=findViewById(R.id.assists);
        ageView=findViewById(R.id.Age);
        nameView=findViewById(R.id.playerName);
        imageView=findViewById(R.id.imageView);

        dateOfBirthView.setText("Date of birth:"+dateOfBirth);
        goalsScoredView.setText("Goals Scored:"+goalsScored);
        assistsView.setText("Assists: "+assists);
        ageView.setText("Age:"+playerAge);
        nameView.setText("Name:"+playerName);
        currentClubView.setText("Current Club:"+currentClub);
        Drawable dr= ContextCompat.getDrawable(this,imageId);
        imageView.setImageDrawable(dr);

    }

    public void backOnClick(View view) {


        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}