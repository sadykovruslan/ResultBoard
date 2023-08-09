import java.util.List;
import java.util.TreeSet;

public class ResultBoard {
    TreeSet<Record> students = new TreeSet<>();
    public ResultBoard() {
    }

    void addStudent(String name, Float score) {
        Record record = new Record();
        record.name = name;
        record.score = score;

        students.add(record);
    }
    List<String> top3 () {
        return null;

    }

    public static void main(String[] args) {
        ResultBoard rb = new ResultBoard();
        rb.addStudent("Sasha", 4.5f);
        rb.addStudent("Dasha", 3.5f);
        rb.addStudent("Misha", 2.8f);
        rb.addStudent("Polina", 5.0f);
        rb.addStudent("Ruslan", 3.3f);
        rb.addStudent("Alisa", 4.1f);
        rb.addStudent("Adel", 2.3f);
        rb.addStudent("Mustafa", 4.9f);
        rb.addStudent("Givi", 3.1f);
        rb.addStudent("Danila", 4.6f);
        rb.addStudent("Alla", 3.6f);






    }

    class Record {
        String name;
        float score;
    }

}
