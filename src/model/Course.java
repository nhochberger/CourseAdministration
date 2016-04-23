package model;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private final String name;
    private final List<Member> members;

    public Course(final String name) {
        super();
        this.name = name;
        this.members = new ArrayList<>();
    }

}
