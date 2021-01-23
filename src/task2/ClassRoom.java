package task2;

public class ClassRoom {

    Pupil[] pupils = new Pupil[4];

        public ClassRoom(Pupil pupil1, Pupil pupil2) {
        this.pupils[0] = pupil1;
        this.pupils[1] = pupil2;
        this.pupils[2] = new GoodPupil();
        this.pupils[3] = new BadPupil();
        }

    void bust() {
        for (Pupil pupil: pupils) {
            pupil.study();
            pupil.read();
            pupil.write();
            pupil.relax();
            System.out.println("------------------");
        }
    }
}
