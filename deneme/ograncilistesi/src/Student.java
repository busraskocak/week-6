import java.util.ArrayList;
import java.util.Random;

public class Student {
    String name;
    int number;
    boolean dersteMi;

    Random random = new Random();


    private static ArrayList<Student>students = new ArrayList<>();

    public Student(String name, int number, boolean dersteMi) {
        this.name = name;
        this.number = number;
        this.dersteMi = dersteMi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
