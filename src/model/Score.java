package model;

public abstract class Score {

    private final String description;
    private final int value;

    public Score(final String description, final int value) {
        super();
        this.description = description;
        this.value = value;
    }

    public abstract int getValue();

    public String getDescription() {
        return this.description;
    }
}
