package com.DhivyaRenuka;

import java.util.Objects;

public class custome_set {
    String name;
    int roll;
    public custome_set(String name,int roll){
        this.name= name;
        this.roll=roll;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        custome_set that = (custome_set) o;
        return roll == that.roll;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll);
    }

    @Override
    public String toString() {
        return "custome_set{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                '}';
    }



}
