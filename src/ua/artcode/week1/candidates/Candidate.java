package ua.artcode.week1.candidates;

/**
 * @author Serhii Bilobrov
 * @since 1.7
 */
public class Candidate {
    private final int id;
    private final String name;
    private final String phone;

    public Candidate(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
