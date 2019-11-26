public class Run {
    //    Stwórz klasę Opona.
//    a.Stwórz w niej 3 pola:width, aspectRatio, dimeter oraz konstruktor 3 parametrowy.
//    b.Stwórz metodę która zwraca String skrót opony:[175/70 R15]
//    legenda:["width"/"aspectRatio"R”dimeter"]
//    c.Stwórz przykładowe obiekty
    public static void main(String[] args) {
        TireStorage storage = new TireStorage();
        Tire tire = new Tire(175, 70, 15);
        Tire tire2 = new Tire(185, 70, 15);

        System.out.println(tire.getTire());

        storage.setaddTire(tire, 1, 1, 1);
        storage.setaddTire(tire2, 1, 2, 1);
        storage.setaddTire(tire, 1, 3, 1);
        storage.setaddTire(tire, 1, 4, 1);

        tire = storage.getTire(1, 2, 1);
        System.out.println(tire.getTire());
    }
}
