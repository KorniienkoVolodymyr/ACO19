package ua.artcode.week1.candidates.service;

import ua.artcode.utils.DynamicArray;
import ua.artcode.week1.candidates.model.Candidate;

/**
 * @author Serhii Bilobrov
 * @since 1.7
 */
public class CandidateService {

    private DynamicArray array;

    public CandidateService(int size) {
        array = new DynamicArray();
    }

    public boolean add(Candidate candidate) {
        if(candidate == null){
            return false;
        }

        if(contains(candidate)){
           return false;
        }

        array.add(candidate);

        return true;
    }

    private boolean contains(Candidate candidate) {
        return find(candidate.getId()) != null;
    }

    private Candidate find(int id) {
        for (int i = 0; i < array.size(); i++) {
            Object o = array.get(i);
            Candidate candidate = (Candidate) o;

            if(candidate.getId() == id){
                return candidate;
            }
        }

        return null;
    }

    public Candidate getById(int id) {
        return find(id);
    }

    public Candidate[] findByName(String name) {

        DynamicArray result = new DynamicArray();

        for (int i = 0; i < array.size(); i++) {
            Object o = array.get(i);
            Candidate candidate = (Candidate) o;
            if(candidate.getName().contains(name)){
                result.add(candidate);
            }
        }

        return convertToCandidateArr(result.toArr());
    }

    private Candidate[] convertToCandidateArr(Object[] objects) {
        Candidate[] resCan = new Candidate[objects.length];
        for (int i = 0; i < objects.length; i++) {
            resCan[i] = (Candidate) objects[i];
        }
        return resCan;
    }
}
