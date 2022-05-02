package org.vashonsd;

import java.time.LocalDate;

public class City {
    String name;
    int pop;
    LocalDate yrsExist;
    boolean MegaCity;

    public City(String name, int pop) {
        this.name = name;
        this.pop = pop;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPop() {
        return pop;
    }

    public void setPop(int pop) {
        this.pop = pop;
    }

    public LocalDate getYrsExist() {
        return yrsExist;
    }

    public void setYrsOfExist(LocalDate yrsExist) {
        this.yrsExist = yrsExist;
    }

    public boolean isMegaCity() {
        return MegaCity;
    }

    public void setMegaCity(boolean megaCity) {
        MegaCity = megaCity;
    }
    public int getYrsOfExist() {
        LocalDate now = LocalDate.now();
        now.getYear();
        return now.getYear() - yrsExist.getYear();
    }
    public boolean MegaCity() {
        if(getPop() < 10000000) {
            return false;
        }
        return true;
    }
}
