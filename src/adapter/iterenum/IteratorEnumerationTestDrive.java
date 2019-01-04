package adapter.iterenum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;

/**
 * @author Ruoyu Chen
 * Created on 1/4/2019
 */
public class IteratorEnumerationTestDrive {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(args));
        Enumeration<?> enumeration = new IteratorEnumeration(list.iterator());
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
