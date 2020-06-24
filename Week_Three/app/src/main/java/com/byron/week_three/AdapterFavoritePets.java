package com.byron.week_three;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterFavoritePets extends RecyclerView.Adapter<AdapterFavoritePets.FavoritePetsViewHolder>{

    ArrayList<FavoritePetsList> favoritePetsList;
    //recibe la lista de mascotas favoritas

    public AdapterFavoritePets(ArrayList<FavoritePetsList> favoritePetsList) {
        this.favoritePetsList = favoritePetsList;
    }

    @NonNull
    @Override
    public FavoritePetsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_favorite_pets,parent,false);

        return new FavoritePetsViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull FavoritePetsViewHolder holder, int position) {
        FavoritePetsList favoritePets = favoritePetsList.get(position);
        holder.ivFavoritePet.setImageResource(favoritePets.getImageFavoritePet());
        holder.ivFavoriteBonesRaiting.setImageResource(favoritePets.getImageFavoriteBonesRaiting());
        holder.ivFavoriteBonesCheck.setImageResource(favoritePets.getImageFavoriteBonesCheckg());
        holder.tvFavoriteNameDog.setText(favoritePets.getNameFavoritePet());
        holder.tvFavoriteQuantity.setText(favoritePets.getPetFavoriteQuantity());

    }

    @Override
    public int getItemCount() {
        return favoritePetsList.size();
    }

    public class FavoritePetsViewHolder extends RecyclerView.ViewHolder {

        private ImageView ivFavoritePet;
        private ImageView ivFavoriteBonesRaiting;
        private ImageView ivFavoriteBonesCheck;
        private TextView  tvFavoriteNameDog;
        private TextView  tvFavoriteQuantity;

        public FavoritePetsViewHolder(@NonNull View itemView) {
            super(itemView);

            ivFavoritePet            =   itemView.findViewById(R.id.ivFavoritePet);
            ivFavoriteBonesRaiting   =   itemView.findViewById(R.id.ivFavoriteBonesRaiting);
            ivFavoriteBonesCheck     =   itemView.findViewById(R.id.ivFavoriteBonesCheck);
            tvFavoriteNameDog        =   itemView.findViewById(R.id.tvFavoriteNameDog);
            tvFavoriteQuantity       =   itemView.findViewById(R.id.tvFavoriteQuantity);
        }
    }
}
