package com.example.randomcalling.activities;

public class User {

    private String uid , name , profile , city ;
    private long coins ;
    public User(){}

    public User(String uId, String name, String profile, String city, long coins) {
        this.uid = uId;
        this.name = name;
        this.profile = profile;
        this.city = city;
        this.coins = coins;
    }

    public long getCoins() {
        return coins;
    }

    public void setCoins(long coins) {
        this.coins = coins;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
