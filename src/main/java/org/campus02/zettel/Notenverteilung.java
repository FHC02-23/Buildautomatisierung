package org.campus02.zettel;

import java.util.ArrayList;
import java.util.HashMap;

public class Notenverteilung {

    HashMap<String, ArrayList<Integer>> notenProStudent = new HashMap<>();

    public Notenverteilung() {
    }

    public boolean addStudent(String name) {
        if (notenProStudent.containsKey(name)) {
            return false;
        }
        notenProStudent.put(name, new ArrayList<>());
        return true;
    }
}
