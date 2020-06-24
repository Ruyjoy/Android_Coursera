package com.byron.week_three;

public class Pets {

    private String namePet;
    private String petQuantity;
    private int imagePet;
    private int imageBonesRaiting;
    private int imageBonesCheckg;

    public Pets(String namePet, String petQuantity, int imagePet, int imageBonesRaiting, int imageBonesCheckg) {
        this.namePet = namePet;
        this.petQuantity = petQuantity;
        this.imagePet = imagePet;
        this.imageBonesRaiting = imageBonesRaiting;
        this.imageBonesCheckg = imageBonesCheckg;
    }

    public String getNamePet() {
        return namePet;
    }

    public void setNamePet(String namePet) {
        this.namePet = namePet;
    }

    public String getPetQuantity() {
        return petQuantity;
    }

    public void setPetQuantity(String petQuantity) {
        this.petQuantity = petQuantity;
    }

    public int getImagePet() {
        return imagePet;
    }

    public void setImagePet(int imagePet) {
        this.imagePet = imagePet;
    }

    public int getImageBonesRaiting() {
        return imageBonesRaiting;
    }

    public void setImageBonesRaiting(int imageBonesRaiting) {
        this.imageBonesRaiting = imageBonesRaiting;
    }

    public int getImageBonesCheckg() {
        return imageBonesCheckg;
    }

    public void setImageBonesCheckg(int imageBonesCheckg) {
        this.imageBonesCheckg = imageBonesCheckg;
    }
}
