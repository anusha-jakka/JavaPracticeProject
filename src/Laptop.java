import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

public class Laptop implements Comparable<Laptop> {

    private String laptopName;
    private int ram;

    public Laptop(String laptopName, int ram) {
        this.laptopName = laptopName;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "laptopName='" + laptopName + '\'' +
                ", ram=" + ram +
                '}';
    }

    public static void main(String args[])
    {
        Laptop l=new Laptop("acer",64);

        System.out.println(l);
    }

    @Override
    public int compareTo(@NotNull Laptop o) {
        return 0;
    }
}
