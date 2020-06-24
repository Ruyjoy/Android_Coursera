package com.byron.week_three;

public class FavoritePetsList {
    private String nameFavoritePet;
    private String petFavoriteQuantity;
    private int imageFavoritePet;
    private int imageFavoriteBonesRaiting;
    private int imageFavoriteBonesCheckg;

    public FavoritePetsList(String namePet, String petQuantity, int imagePet, int imageBonesRaiting, int imageBonesCheckg) {
        this.nameFavoritePet = namePet;
        this.petFavoriteQuantity = petQuantity;
        this.imageFavoritePet = imagePet;
        this.imageFavoriteBonesRaiting = imageBonesRaiting;
        this.imageFavoriteBonesCheckg = imageBonesCheckg;
    }

    public String getNameFavoritePet() {
        return nameFavoritePet;
    }

    public void setNameFavoritePet(String nameFavoritePet) {
        this.nameFavoritePet = nameFavoritePet;
    }

    public String getPetFavoriteQuantity() {
        return petFavoriteQuantity;
    }

    public void setPetFavoriteQuantity(String petFavoriteQuantity) {
        this.petFavoriteQuantity = petFavoriteQuantity;
    }

    public int getImageFavoritePet() {
        return imageFavoritePet;
    }

    public void setImageFavoritePet(int imageFavoritePet) {
        this.imageFavoritePet = imageFavoritePet;
    }

    public int getImageFavoriteBonesRaiting() {
        return imageFavoriteBonesRaiting;
    }

    public void setImageFavoriteBonesRaiting(int imageFavoriteBonesRaiting) {
        this.imageFavoriteBonesRaiting = imageFavoriteBonesRaiting;
    }

    public int getImageFavoriteBonesCheckg() {
        return imageFavoriteBonesCheckg;
    }

    public void setImageFavoriteBonesCheckg(int imageFavoriteBonesCheckg) {
        this.imageFavoriteBonesCheckg = imageFavoriteBonesCheckg;
    }
}