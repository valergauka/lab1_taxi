package com.company.taxi;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class TaxiServis {
    private List<Routs> routs;
    public TaxiServis(){
        routs = new LinkedList<>();
    }
    public List<Routs> getRouts() {
        return routs;
    }
    public void setRouts(List<Routs> routs){
        this.routs = routs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaxiServis taxi = (TaxiServis) o;
        return Objects.equals(routs, taxi.routs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(routs);
    }


    @Override
    public String toString() {
        return "TaxiServis{" +
                "routs=" + routs +
                '}';
    }
}
