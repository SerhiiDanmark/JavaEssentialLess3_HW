package task2;

public class Main {

    public static void main(String[] args) {

        ClassRoom pupils = new ClassRoom(new BadPupil(), new ExcelentPupil());
        pupils.bust();
    }
}
