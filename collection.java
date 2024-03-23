/*
 * Collection Framework
 * List
 * LinkedList
 * ArrayList
 */

package collection;
import java.util.ArrayList;
import java.util.LinkedList;

public class collection {

    public static void main(String[] args){
        final ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Iswarya"); /* add method */
        arrayList.add("Ajay");
        arrayList.add("Nila");
        arrayList.add("Aswitha");
        System.out.println(arrayList);
        arrayList.add(1,"karpagavalli"); /* add method  in index */
        System.out.println(arrayList);
        System.out.println(arrayList.size()); /* size method */
        final ArrayList<String> arrayList1 = new ArrayList<>();

        arrayList1.add("Dhoni"); /* add method */
        arrayList1.add("hardik");
        arrayList.addAll(arrayList1);
        System.out.println(arrayList);
        arrayList1.clear(); /* clear method */
        System.out.println(arrayList1);
        System.out.println(arrayList.contains("Ajay")); /* contains method */
        System.out.println(arrayList.get(0)); /* get method */
        System.out.println(arrayList1.isEmpty()); /* empty method */
        System.out.println(arrayList.remove(2)); /* remove method */
        final ArrayList<String> arrayList3 = new ArrayList<>();

        arrayList3.add("Apple");  /* add method */
        arrayList3.add("grapes");
        arrayList3.add("banana");
        System.out.println(arrayList3.indexOf("Strawberry")); /* indexOf method */
        System.out.println(arrayList3.lastIndexOf("black berry")); /* lastIndexOf method */
        arrayList3.remove(1); /* remove method */
        System.out.println(arrayList3);
        arrayList3.clear(); /* clear method */
        System.out.println(arrayList3);
        final LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.offer(10); /* offer method */
        linkedList.offer(20);
        linkedList.offer(30);
        linkedList.offer(40);
        System.out.println(linkedList);
        linkedList.offerFirst(30); /* offerFirst method */
        System.out.println(linkedList);
        linkedList.offerLast(50); /* offerLast method */
        System.out.println(linkedList);
        linkedList.pollFirst(); /* pollFirst method */
        System.out.println(linkedList);
        linkedList.pollLast(); /* pollLast method */
        System.out.println(linkedList);
        linkedList.removeFirst(); /* removeFirst method */
        System.out.println(linkedList);
        linkedList.removeLast(); /* removeLast method */
        System.out.println(linkedList);
        final Integer getFirst = linkedList.getFirst(); /* getFirst method */

        System.out.println(getFirst);
        final Integer getLast = linkedList.getLast(); /* removeLast method */

        System.out.println(getLast);
        System.out.println(linkedList.size()); /* size method */
    }
}


