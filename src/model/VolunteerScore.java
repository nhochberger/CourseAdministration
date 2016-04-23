package model;

public class VolunteerScore extends Score {

    public VolunteerScore(final String description, final int value) {
        super(description, value);
    }

    @Override
    public int getValue() {
        return 2;
    }

}
