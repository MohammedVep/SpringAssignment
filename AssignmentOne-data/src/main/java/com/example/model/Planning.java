package com.example.model;

import java.util.Date;
import java.util.Timer;

public class Planning {
    private Date mealDate;

    private Timer minutes;

    private String mealType;

    public Date getMealDate() {
        return mealDate;
    }

    public void setMealDate(Date mealDate) {
        this.mealDate = mealDate;
    }

    public Timer getMinutes() {
        return minutes;
    }

    public void setMinutes(Timer minutes) {
        this.minutes = minutes;
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }
}
