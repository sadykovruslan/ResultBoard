import java.util.*;

public class ResultBoard {
          TreeSet<Board> strs = new TreeSet<>();

    public static void main(String[]args){
        ResultBoard rb = new ResultBoard();

        rb.addStudent("Sasha", 4.2f);
        rb.addStudent("Masha", 4.8f);
        rb.addStudent("Dasha", 3.9f);
        rb.addStudent("Ira", 2.4f);
        rb.addStudent("Alla", 1.5f);
        rb.addStudent("Danila", 5.0f);

        rb.top3();
    }
    void addStudent(String name, Float score) {
        Board board = new Board();
        board.name = name;
        board.score = score;

        strs.add(board);
        System.out.println(strs);
    }

    List<String> top3 () {
        Board board = new Board();
        String name = board.name;
        NavigableSet <Board> strs1 = strs.descendingSet();
        List <String> result = new ArrayList<>(3);
        for (int i = 0; i < 3; i++ ) {
            result.add(strs1.pollFirst().name);


            System.out.println(result);
        }
        return result;
    }

}
class Board implements Comparable<Board> {
    String name;
    Float score;

    @Override
    public String toString() {
        return name + " has average mark: " + score;
    }

    @Override
    public int compareTo(Board o) {
        if (o.score == this.score) {
            return 0;
        } else if (o.score < this.score) {
            return 1;
        } else return -1;
    }
}
