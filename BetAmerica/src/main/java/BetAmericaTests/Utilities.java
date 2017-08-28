package BetAmericaTests;

import java.util.Random;

/**
 * Created by keith.wilson on 6/9/17.
 */
public class Utilities {

    public String getRandomUsername() {
        Random rand = new Random();
        int randomNumber = rand.nextInt((99999999 - 10000000) + 1) + 10000000;
        return "wilson" + Integer.toString(randomNumber);
    }

    public String getRandomPhoneNumber() {
        Random rand = new Random();
        int firstDigit = rand.nextInt((9 - 1) + 1) + 1;
        int randomNumber = rand.nextInt((999999999 - 100000000) + 1) + 100000000;
        return firstDigit + Integer.toString(randomNumber);
    }

    public String getRandomDOB() {
        Random rand = new Random();
        int m = rand.nextInt((12 - 1) + 1) + 1;
        String month;
        if (m < 10) {
            month = "0" + Integer.toString(m);
        } else {
            month = Integer.toString(m);
        }
        String day;
        int d = rand.nextInt((29 - 1) + 1) + 1;
        if (d < 10) {
            day = "0" + Integer.toString(d);
        } else {
            day = Integer.toString(d);
        }
        int y = rand.nextInt((1990 - 1930) + 1) + 1930;
        String year = Integer.toString(y);
        return month + "/" + day + "/" + year;
    }
}
