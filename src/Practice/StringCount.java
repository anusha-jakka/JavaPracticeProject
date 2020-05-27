package Practice;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class StringCount {

    public static void stringCount(List<String> lights)
    {
        int lightCount=0,totalLight=0;
        List<String> finalCount=new LinkedList<>();

            for (String light : lights) {
                if(!finalCount.contains(light)) {
                    for (int i = 0; i < lights.size(); i++) {
                        if (light.equalsIgnoreCase(lights.get(i))) {
                            lightCount++;
                            finalCount.add(light);

                        }
                    }
                    System.out.println(light +":"+lightCount);
                    totalLight+=lightCount;
                    lightCount=0;
                }


            }

         System.out.println("Total lights : "+totalLight);
    }

    public static void main(String args[])
    {
        List<String> light=new LinkedList<>();
        light.add("L6(LEM3)");
        light.add("L3(BA-1)");
        light.add("L3(BE-3)");
        light.add("L3(BE-3)");
        light.add("L3(LEM-1)");
        light.add("L3(LEM-1)");
        light.add("L6A(BA-1)");
        light.add("L6A(BA-1)");
        light.add("L6A(BA-1)");
        light.add("L6A(BA-1)");
        light.add("L6B(BE-3)");
        light.add("L6B(BE-3)");
        light.add("L6(LEM-1)");
        light.add("L6(LEM-1)");
        light.add("L4(BE-1)");
        light.add("L4(BE-1)");
        light.add("L4(BE-1)");
        light.add("L4(BE-1)");
        light.add("L4(BE-1)");
        light.add("L4(BE-1)");
        light.add("L4(BE-1)");
        light.add("L4(BE-1)");
        light.add("L4(BE-1)");
        light.add("L4(BE-1)");
        light.add("L4(BE-1)");
        light.add("L4(BE-1)");
        light.add("L3(BE-1)");
        light.add("L3(BE-1)");
        light.add("L2(LEM-1)");
        light.add("L2(LEM-1)");
        light.add("L2(LEM-1)");
        light.add("L2(LEM-1)");
        light.add("L4(LEM-1)");
        light.add("L4(LEM-1)");
        light.add("L2(BE-1)");
        light.add("L5(LEM-9)");
        light.add("L5(LEM-11)");
        light.add("L(BE-1)");
        light.add("L(BE-1)");
        light.add("L3(EM-1)");
        light.add("L3(EM-1)");
        light.add("L3(BE-3)");
        light.add("L3(BE-3)");
        light.add("L6A(BA-1)");
        light.add("L3(LEM-1)");
        light.add("L3(LEM-1)");
        light.add("L3(BE-3)");
        light.add("L3(BE-3)");
        light.add("L3(BE-3)");
        light.add("L3(BE-3)");
        light.add("L3(BE-3)");
        light.add("L6(LEM-1)");
        light.add("L6A(BE-3)");
        light.add("L6A(BA-1)");
        light.add("L3(LEM-1)");
        light.add("L3(BE-3)");
        light.add("L3(BE-3)");
        light.add("L6B(BE-3)");
        light.add("L6A(BE-3)");
        light.add("L6(LEM-1)");
        light.add("L6A(BA-1)");

        stringCount(light);
    }
}
