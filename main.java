public class main {

    public static void main(String[] args) {
        Punt p1 = new Punt(1, 4,4);
        Punt p2 = new Punt(2, 1,3);
        Punt p3 = new Punt(3, 7,2);
        Punt p4 = new Punt(4, 2,6);

        Linia l1 = new Linia(1, p1, p3);
        Linia l2 = new Linia(2, p3, p2);

        Area a1 = new Area(1, p2, p4, p1);
    }
}
