package org.netology;

public class CashbackHackService {
    private final int boundary = 1000;

    public int remain(int amount) {

        return boundary - amount % boundary;
    }

    public int thousand(int amount) {
        if (amount == 1000) {
            return 0;
        }
        return amount;
    }

    public int bonus (int amount) {
        if (amount < 1000) {
            return 0;
        }

        int bonus = amount - boundary / 100;

        if (amount > 1000) {
            return 100;
        }
        return bonus;
    }
}