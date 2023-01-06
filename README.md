# Data Structures & Algorithms

- ## Linear Data Structures
     - Arrays
     - [Linked List](https://github.com/goodluck3301/data-structures-and-algorithms#linked-list)
     - Stack
     - Queue
- ## Non Linear Data Structures
     - Trees
     - Graphs
     - [Map](https://github.com/goodluck3301/data-structures-and-algorithms#map-implementations)
___

- ## [Map Implementations](https://docs.oracle.com/javase/tutorial/collections/implementations/map.html)
- [HashMap](https://github.com/goodluck3301/data-structures-and-algorithms#hashtablehashmap)
- [HashTable](https://github.com/goodluck3301/data-structures-and-algorithms#hashtablehashmap)
- [LinkedHashMap](https://github.com/goodluck3301/data-structures-and-algorithms#linkedhashmap)
- SortedMap
  - [TreeHashMap](https://github.com/goodluck3301/data-structures-and-algorithms#treemap)
 ___
 - ## HashTable/HashMap
 ___
![HashTable](https://www.databricks.com/wp-content/uploads/2018/12/hash-buckets.jpg)

### [HashTable & Big O Notation](https://lukabaramishvili.medium.com/data-structure-hash-table-big-o-notation-a2ee869be861)

| Operations 	| Average 	| Worst Case 	|
|------------	|---------	|------------	|
| Space      	| O(n)    	| O(n)       	|
| Insert     	| O(1)    	| O(n)       	|
| Lookup     	| O(1)    	| O(n)       	|
| Delete     	| O(1)    	| O(n)       	|


- [HashTable code(C)](https://github.com/goodluck3301/data-structures-and-algorithms/blob/main/DataStructureInternalWorking/hashtable.c)<br/>
- [HashTable code(Pyhon)](https://github.com/goodluck3301/data-structures-and-algorithms/blob/main/DataStructureInternalWorking/hashTable.py)


Useful Sites
- [Справочник по Java Collections Framework](https://habr.com/ru/post/237043/)
- [Differences between HashMap, HashTable, LinkedHashMap and TreeMap in java](https://www.javamadesoeasy.com/2015/04/hashmap-vs-hashtable-vs-linkedhashmap.html)
- [How HashTable works Internally? HashTable vs HashMap in Java - By Naveen AutomationLabs (VIDEO-EN)](https://www.youtube.com/watch?v=7fby_jzPAbg)
- [How HashMap works internally || Popular java interview question on collection (VIDEO-EN)](https://www.youtube.com/watch?v=SXfsBDTodpY)

___
- ## [LinkedHashMap](https://www.javatpoint.com/java-linkedhashmap)
___
![Map Implementations](https://static.javatpoint.com/images/linkedhashmap.png)

```java
  public class LinkedHashMap<K,V> extends HashMap<K,V> implements Map<K,V>  
```
```java
  import java.util.*;  
  
  class LinkedHashMap1{  
    public static void main(String args[]){  
   
      LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();  
  
      hm.put(100,"Amit");  
      hm.put(101,"Vijay");  
      hm.put(102,"Rahul");  
  
      for(Map.Entry m:hm.entrySet()){  
        System.out.println(m.getKey()+" "+m.getValue());  
      }  
    }    
  }  
```
```
Output:100 Amit
       101 Vijay
       102 Rahul
```
___
- ## TreeMap
___

### [Big O notation for TreeMap in Java](https://www.javapedia.net/module/Java/Map-and-its-implementations/2609)<br/>
TreeMap guarantees ```log(n)``` time cost for operatons like containsKey, get, put and remove.

![TreeMap](https://i0.wp.com/www.dineshonjava.com/wp-content/uploads/2018/10/FourthObjecctInserted.png?resize=768%2C385&ssl=1)

Useful Sites
- [TreeMap](https://www.dineshonjava.com/internal-working-of-treemap-in-java/)

___
- ## [Linked List](https://www.javatpoint.com/singly-linked-list)
___

![LinkedList](https://1.bp.blogspot.com/-9eEC1iDZvW4/YBBXrFW7MtI/AAAAAAAABpg/sF_Ud7QsvxEBBN8NdAsIrj2zOjY0tKKfACLcBGAsYHQ/w640-h152/LinkedList%2Binternal%2Bimplementation.png)

- [Linked List (java)](https://github.com/goodluck3301/data-structures-and-algorithms/blob/main/DataStructureInternalWorking/LinkedLits.java)<br/>

### [Big O notation for Linked List](https://medium.com/@mckenziefiege/arrays-linked-lists-and-big-o-notation-486727b6259b)<br/>

![Big(o) Linked List](https://miro.medium.com/max/720/1*3IlTLK_S0HmATuYQGxcbUA.webp)

### When to use a linked list over an array/array list?

- Linked lists are preferable over arrays when:
  - you need constant-time insertions/deletions from the list (such as in real-time computing where time predictability is absolutely critical)
  - you don't know how many items will be in the list. With arrays, you may need to re-declare and copy memory if the array grows too big
  - you don't need random access to any elements
  - you want to be able to insert items in the middle of the list (such as a priority queue)
-  Arrays are preferable when:
   - you need indexed/random access to elements
   - you know the number of elements in the array ahead of time so that you can allocate the correct amount of memory for the array
   - you need speed when iterating through all the elements in sequence. You can use pointer math on the array to access each element, whereas you need to lookup the node based on the pointer for each element in linked list, which may result in page faults which may result in performance hits.
   - memory is a concern. Filled arrays take up less memory than linked lists. Each element in the array is just the data. Each linked list node requires the data as well as one (or more) pointers to the other elements in the linked list.

Array Lists (like those in .Net) give you the benefits of arrays, but dynamically allocate resources for you so that you don't need to worry too much about list size and you can delete items at any index without any effort or re-shuffling elements around. Performance-wise, arraylists are slower than raw arrays.
