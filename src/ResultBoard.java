import java.util.*;

public class ResultBoard {
     Board board = new Board();
     TreeSet<Board> strs = new TreeSet<>();

    public static void main(String[]args){
        ResultBoard rb = new ResultBoard();

        rb.addStudent("Sasha", 4.2f);
        rb.addStudent("Masha", 4.8f);
        rb.addStudent("Dasha", 3.9f);
        rb.addStudent("Ira", 2.4f);
        rb.addStudent("Alla", 1.5f);
        rb.addStudent("Danila", 5.0f);

    }

//    public ResultBoard(String name, Float score) {
//        this.name = name;
//        this.score = score;
//    }

    void addStudent(String name, Float score) {

        board.name = name;
        board.score = score;

        strs.add(board);

        System.out.println(strs);
    }

    List<String> top3 () {
        return null;

    }

}
class Board implements Comparable<Board> {
    String name;
    Float score;

//    @Override
//    public int compare(Board o1, Board o2) {
//        if(o1.score == o2.score) {
//            return 0;
//        } if (o1.score > o2.score) {
//            return 1;
//        } else return -1;
//    }

    @Override
    public String toString() {
        return name + " has average mark: " + score;
    }

    @Override
    public int compareTo(Board o) {
        float o1 = o.score;
        if (o.score == o1) {
            return 0;
        } else if (o.score > o1) {
            return 1;
        } else return -1;
    }
}
