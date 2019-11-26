class Tire {
    //    a.Stwórz w niej 3 pola:width, aspectRatio, dimeter oraz konstruktor 3 parametrowy.
////    b.Stwórz metodę która zwraca String skrót opony:[175/70 R15]
////    legenda:["width"/"aspectRatio"R”dimeter"]
    private int width;
    private int aspectRatio;
    private int diameter;

    Tire(int width, int aspectRatio, int diameter) {
        this.width = width;
        this.aspectRatio = aspectRatio;
        this.diameter = diameter;
    }

    String getTire() {
        return "[" + this.width + "/" + aspectRatio + " R" + diameter + "]";
    }
}
