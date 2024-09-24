package com.example.myyolov8app.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class HistoryData {
    private  Boolean auth;
    private ArrayList<String[]> datas;
    private int total;

    private int fire;

    private int smoke;

    private int sumImgs;

    public HistoryData(Boolean auth) {
        this.auth = auth;
    }

    public HistoryData(ArrayList<String[]> datas, int total, int fire, int smoke, int sumImgs) {
        this.datas = datas;
        this.total = total;
        this.fire = fire;
        this.smoke = smoke;
        this.sumImgs = sumImgs;
    }

    public HistoryData(int total, int fire, int smoke, int sumImgs) {
        this.total = total;
        this.fire = fire;
        this.smoke = smoke;
        this.sumImgs = sumImgs;
    }

    public Boolean getAuth() {
        return auth;
    }

    public void setAuth(Boolean auth) {
        this.auth = auth;
    }

    public ArrayList<String[]> getDatas() {
        return datas;
    }

    public void setDatas(ArrayList<String[]> datas) {
        this.datas = datas;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getFire() {
        return fire;
    }

    public void setFire(int fire) {
        this.fire = fire;
    }

    public int getSmoke() {
        return smoke;
    }

    public void setSmoke(int smoke) {
        this.smoke = smoke;
    }

    public int getSumImgs() {
        return sumImgs;
    }

    public void setSumImgs(int sumImgs) {
        this.sumImgs = sumImgs;
    }

    @Override
    public String toString() {
        return "HistoryData{" +
                "auth=" + auth +
                ", datas=" + datas +
                ", total=" + total +
                ", fire=" + fire +
                ", smoke=" + smoke +
                ", sumImgs=" + sumImgs +
                '}';
    }
}
