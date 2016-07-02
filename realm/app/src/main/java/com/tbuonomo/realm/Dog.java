package com.tbuonomo.realm;

import android.util.Log;

import io.realm.RealmObject;
import io.realm.annotations.Ignore;
import io.realm.annotations.PrimaryKey;

/**
 * Created by tommy on 02/07/16.
 */
public class Dog extends RealmObject implements Animal {

    @PrimaryKey
    private String mName;

    @Ignore
    private int mAge;

    public Dog(){

    }

    public Dog(String name, int age) {
        this.mName = name;
        this.mAge = age;
    }

    @Override
    public void eat() {
        Log.i(Dog.class.getSimpleName(), mName + " eating !");
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public int getAge() {
        return mAge;
    }

    public void setAge(int age) {
        mAge = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "mName='" + mName + '\'' +
                ", mAge=" + mAge +
                '}';
    }
}
