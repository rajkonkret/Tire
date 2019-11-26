class TireStorage {
    //    Stwórz klasę TireStorage która będzie służyła do przechowywania opon z poprzedniego zadania.
//    a.Dodaj pola : tire, x, y, z(gdzie x,y,zsą współrzędnymi półek na magazynie)
//    b.Zabezpiecz program aby dwóch opon nie było na jednej półce. Do 1 opony jedna półka.
//    c.Dodaj metodę, która po podaniu współrzędnych poda obiekt klasy Tire.
//    d.Stwórz przykładowy obiekt przechowalni opon i sprawdź jej działanie.
    Tire tire;
    private int x;
    private int y;
    private int z;
    private Tire[][][] storage = new Tire[9][9][9];

    TireStorage() {

    }

    void setaddTire(Tire tire, int x, int y, int z) {

        if (storage[x][y][z] == null) {
            storage[x][y][z] = tire;
        } else {
            System.out.println("Na tej półce jest już opona");
        }
    }

    Tire getTire(int x, int y, int z) {
        return storage[x][y][z];
    }
}
