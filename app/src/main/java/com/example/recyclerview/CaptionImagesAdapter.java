package com.example.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.*;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;


public class CaptionImagesAdapter extends RecyclerView.Adapter<CaptionImagesAdapter.ViewHolder> {
    Player[]players;
    Context context;

    public CaptionImagesAdapter(Player[] players,Context context)
    {
        this.context=context;

        this.players = players;
    }


    @NonNull
    @Override
    public CaptionImagesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardView v=(CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview,parent,false);
        return new ViewHolder(v);


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        CardView cardView=holder.cardView;
        ImageView imageView=(ImageView)cardView.findViewById(R.id.card_view_image);
        Drawable dr= ContextCompat.getDrawable(cardView.getContext(),players[position].imageId);
        imageView.setImageDrawable(dr);
        TextView txt=(TextView)cardView.findViewById(R.id.card_view_textView);
        txt.setText(players[position].getName());
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(context,MainActivity2.class);
                intent.putExtra("playerName",players[position].name);
                intent.putExtra("playerAge",players[position].age);
                intent.putExtra("playerDOfBirth",players[position].dateOfBirth);
                intent.putExtra("playerCurrentClub",players[position].currentClub);
                intent.putExtra("playerGoalsScored",players[position].getNumberOfGoalsScored());
                intent.putExtra("playerAssists",players[position].getNumberOfAssists());
                intent.putExtra("PlayerImage",players[position].imageId);

                context.startActivity(intent);





            }
        });
    }

    @Override
    public int getItemCount() {
        return players.length;

    }


    public static class ViewHolder extends RecyclerView.ViewHolder{
        private CardView cardView;
        public ViewHolder (CardView cardView){
            super(cardView);
            this.cardView=cardView;
        }
    }
}
