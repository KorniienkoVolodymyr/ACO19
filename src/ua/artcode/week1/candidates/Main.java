package ua.artcode.week1.candidates;

/**
 * @author Serhii Bilobrov
 * @since 1.7
 */
public class Main {

    public static void main(String[] args) {
        CandidateDb db = new CandidateDb(10);

        db.add(new Candidate(1, "Kolia", "04434"));
        db.add(new Candidate(2, "Vasia", "04434"));

        Candidate candidate = db.getById(1);

        Candidate[] found = db.findByName("ia");

    }
}
