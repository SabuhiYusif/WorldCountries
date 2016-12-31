package com.myfirstapp.sabuh.worldcountries;

import java.util.UUID;

/**
 * Created by Sabuh on 10/30/2016.
 */

public class Countries {
    //Test Comment
    private UUID mId;
    private String mNameOlke;
    private String Paytaxt;
    private String Ehali;
    private int iconId;
    private int imageId;
    private String mErazi;
    private String mValyuta;
    private String mDil;
    private String mUDM;
    private String mQite;
    private String mTelKod;

    public Countries(int iconId){
        this.iconId = iconId;
        this.mId=UUID.randomUUID();
    }

    public Countries(String nameOlke,String namePaytaxt, int iconId){
       this.mNameOlke=nameOlke;
        this.iconId=iconId;
        this.Paytaxt = namePaytaxt;
      //  mId=UUID.randomUUID();
    }





    public String getTelKod() {
        return mTelKod;
    }

    public void setTelKod(String telkod) {
        mTelKod = telkod;
    }

    public String getQite() {
        return mQite;
    }

    public void setQite(String qite) {
        mQite = qite;
    }

    public String getUDM() {
        return mUDM;
    }

    public void setUDM(String UDM) {
        mUDM = UDM;
    }

    public String getErazi() {
        return mErazi;
    }

    public void setErazi(String erazi) {
        mErazi = erazi;
    }

    public String getValyuta() {
        return mValyuta;
    }

    public void setValyuta(String valyuta) {
        mValyuta = valyuta;
    }

    public String getDil() {
        return mDil;
    }

    public void setDil(String dil) {
        mDil = dil;
    }



    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }



    public int getIconId() {
        return iconId;
    }

    public void setIconId(int iconId) {
        this.iconId = iconId;
    }


    public String getEhali() {
        return Ehali;
    }

    public void setEhali(String ehali) {
        Ehali = ehali;
    }

    public String getPaytaxt() {
        return Paytaxt;
    }

    public void setPaytaxt(String paytaxt) {
        Paytaxt = paytaxt;
    }


    @Override
    public String toString(){
        return mNameOlke;
    }





    public UUID getId() {
        return mId;
    }

    public String getNameOlke() {
        return mNameOlke;
    }

    public void setNameOlke(String NameOlke) {
        this.mNameOlke = NameOlke;
    }
}
