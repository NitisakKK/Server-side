package sit.int202.simfri.repositories;

import sit.int202.simfri.entity.Subject;
import java.util.ArrayList;
import java.util.List;

public class SubjectRepository {
    private List<Subject> subjects;

    public List<Subject> findAll() {
        return subjects;
    }

    public SubjectRepository() {
        initialize();
    }

    private void initialize() {
        subjects = new ArrayList<>(20);
        subjects.add(new Subject("INT101", "Programming Fundamentals", 3));
        subjects.add(new Subject("INT102", "Discrete Mathematics", 3));
        subjects.add(new Subject("INT103", "Computer Organization", 3));
        subjects.add(new Subject("INT104", "Data Structure", 3));
        subjects.add(new Subject("INT105", "Database System", 3));
        subjects.add(new Subject("INT106", "Operating System", 3));
        subjects.add(new Subject("INT107", "Software Engineering", 3));
        subjects.add(new Subject("INT108", "Computer Network", 3));
        subjects.add(new Subject("INT109", "Computer Security", 3));
        subjects.add(new Subject("INT110", "Computer Graphics", 3));
        subjects.add(new Subject("INT111", "Artificial Intelligence", 3));
        subjects.add(new Subject("INT112", "Computer Vision", 3));
        subjects.add(new Subject("INT113", "Machine Learning", 3));
        subjects.add(new Subject("INT114", "Data Mining", 3));
        subjects.add(new Subject("INT115", "Big Data", 3));
        subjects.add(new Subject("INT116", "Cloud Computing", 3));
        subjects.add(new Subject("INT117", "Internet of Things", 3));
        subjects.add(new Subject("INT118", "Blockchain", 3));
        subjects.add(new Subject("INT119", "Quantum Computing", 3));
        subjects.add(new Subject("INT120", "Computer Ethics", 3));
    }
}
