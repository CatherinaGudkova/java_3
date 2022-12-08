import java.util.List;
import java.util.Set;
import java.util.*;
public class TimeTest {

    private static LinkedList<Integer>linkedlist = new LinkedList<Integer>();
    private static ArrayList<Integer> arraylist=new ArrayList<Integer>();

    public static void testAdd(int count){
        long startTime = System.currentTimeMillis();

        for ( int i=0; i<count; i++){
            linkedlist.add(i);
        }
        long endTime = System.currentTimeMillis();
        long linkedtime = endTime - startTime;


        startTime = System.currentTimeMillis();
        for ( int i=0; i<count; i++){
            arraylist.add(i);
        }
        endTime = System.currentTimeMillis();
        long arraytime = endTime - startTime;


        System.out.println("Add:    " + linkedtime + "          " + arraytime);
    }

    public static void testGet(int count){
        long startTime = System.currentTimeMillis();

        for ( int i=0; i<count; i++){
            linkedlist.get(i);
        }
        long endTime = System.currentTimeMillis();
        long linkedtime = endTime - startTime;


        startTime = System.currentTimeMillis();
        for ( int i=0; i<count; i++){
            arraylist.get(i);
        }
        endTime = System.currentTimeMillis();
        long arraytime = endTime - startTime;


        System.out.println("Get:    " + linkedtime + "          " + arraytime);

    }

    public static void testDelete(int count){


        long startTime = System.currentTimeMillis();

        for ( int i=count-1; i>0; i--){
            linkedlist.remove(i);
        }
        long endTime = System.currentTimeMillis();
        long linkedtime = endTime - startTime;


        startTime = System.currentTimeMillis();
        for ( int i=count-1; i>0; i--){
            arraylist.remove(i);
        }
        endTime = System.currentTimeMillis();
        long arraytime = endTime - startTime;


        System.out.println("Delete: " + linkedtime + "          " + arraytime);

    }

    public static void printTable(int count)
    {
        System.out.println(count +" repeats");
        System.out.println("    LinkedList  ArrayList");
        testAdd(count);
        testGet(count);
        testDelete(count);
    }
}
