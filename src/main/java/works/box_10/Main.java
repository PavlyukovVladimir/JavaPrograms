package works.box_10;

class Box{
    private double dLength; // Длина
    private double dWidth; // Ширина
    private double dHeight; // Высота
    private double dWeight; // Вес

    public Box(double dLength, double dWidth, double dHeight, double dWeight) {
        this.dLength = dLength;
        this.dWidth = dWidth;
        this.dHeight = dHeight;
        this.dWeight = dWeight;
    }

    public double getdLength() {
        return dLength;
    }

    public double getdWidth() {
        return dWidth;
    }

    public double getdHeight() {
        return dHeight;
    }

    public double getdWeight() {
        return dWeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;
        return Double.compare(box.dLength, dLength) == 0 &&
                Double.compare(box.dWidth, dWidth) == 0 &&
                Double.compare(box.dHeight, dHeight) == 0 &&
                Double.compare(box.dWeight, dWeight) == 0;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(dLength, dWidth, dHeight, dWeight);
    }
};

final public class Main {
    private final static String sTask = """
         Task 10.
         Создать класс Box, содержащий следующие характеристики коробки:
         длина,ширина, высота, вес.
         Создать коллекцию, содержащую объекты класса Box, и выполнить над её элементами следующие операции:
            а. вычислить суммарный объём и суммарный вес всех коробок;
            б. вывести на экран размеры самой лёгкой и самой тяжёлой коробок;
            в. удалить из коллекции все коробки, объём которых превышает 100 литров;
            г. распределить коробки по двум другим коллекциям в зависимости от их веса:
                если вес коробки меньше или равен среднему весу всех коробок,
                считать коробку лёгкой, иначе – тяжёлой.""";

    @Override
    public String toString() {
        return sTask;
    }

    public static void main() {
        System.out.println(sTask);
        return;
    }
}
