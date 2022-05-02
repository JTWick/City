package org.vashonsd;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
	    City c = new City("Metroagjgpsois Today", 78000);
        c.setYrsOfExist(LocalDate.of(1965, 12, 8));
        System.out.println(c.getName());
        System.out.println(c.getPop());
        System.out.println(c.getYrsOfExist());
    }
}
