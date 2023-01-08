# Data Structures & Algorithms

- ## Linear Data Structures
     - Arrays
     - [Linked List](https://github.com/goodluck3301/data-structures-and-algorithms#linked-list)
     - [Stack](https://github.com/goodluck3301/data-structures-and-algorithms#stack)
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
 
 ___
 - ## Stack
 ___
 Questions on stacks and queues will be much easier to handle if you are comfortable with the ins and
outs of the data structure. The problems can be quite tricky, though. While some problems may be
slight modifications on the original data structure, others have much more complex challenges. 
The stack data structure is precisely what it sounds like: a stack of data. In certain types of problems, it can
be favorable to store data in a stack rather than in an array.</br>
A stack uses LIFO (last-in first-out) ordering. That is, as in a stack of dinner plates, the most recent item
added to the stack is the first item to be removed.</br>
It uses the following operations:</br>
- pop(): Remove the top item from the stack.
- push( item) : Add an item to the top of the stack.
- peek ( ): Return the top of the stack.
- isEmpty() : Return true if and only if the stack is empty.
Unlike an array, a stack does not offer constant-time access to the it h item. However, it does allow constanttime adds and removes, as it doesn't require shifting elements around.
___
![Stack](https://miro.medium.com/max/399/1*uJlB-5Gi87NI9jsiQx2aBA.gif)
```java
class Stack
{
    private int arr[];
    private int top;
    private int capacity;
 
    // Constructor to initialize the stack
    Stack(int size)
    {
        arr = new int[size];
        capacity = size;
        top = -1;
    }
 
    // Utility function to add an element `x` to the stack
    public void push(int x)
    {
        if (isFull())
        {
            System.out.println("Overflow\nProgram Terminated\n");
            System.exit(-1);
        }
 
        System.out.println("Inserting " + x);
        arr[++top] = x;
    }
 
    // Utility function to pop a top element from the stack
    public int pop()
    {
        // check for stack underflow
        if (isEmpty())
        {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(-1);
        }
 
        System.out.println("Removing " + peek());
 
        // decrease stack size by 1 and (optionally) return the popped element
        return arr[top--];
    }
 
    // Utility function to return the top element of the stack
    public int peek()
    {
        if (!isEmpty()) {
            return arr[top];
        }
        else {
            System.exit(-1);
        }
 
        return -1;
    }
 
    // Utility function to return the size of the stack
    public int size() {
        return top + 1;
    }
 
    // Utility function to check if the stack is empty or not
    public boolean isEmpty() {
        return top == -1;               // or return size() == 0;
    }
 
    // Utility function to check if the stack is full or not
    public boolean isFull() {
        return top == capacity - 1;     // or return size() == capacity;
    }
}
 
class Main
{
    public static void main (String[] args)
    {
        Stack stack = new Stack(3);
 
        stack.push(1);      // inserting 1 in the stack
        stack.push(2);      // inserting 2 in the stack
 
        stack.pop();        // removing the top element (2)
        stack.pop();        // removing the top element (1)
 
        stack.push(3);      // inserting 3 in the stack
 
        System.out.println("The top element is " + stack.peek());
        System.out.println("The stack size is " + stack.size());
 
        stack.pop();        // removing the top element (3)
 
        // check if the stack is empty
        if (stack.isEmpty()) {
            System.out.println("The stack is empty");
        }
        else {
            System.out.println("The stack is not empty");
        }
    }
}
```
```
Output:
     Inserting 1
     Inserting 2
     Removing 2
     Removing 1
     Inserting 3
     The top element is 3
     The stack size is 1
     Removing 3
     The stack is empty
```

One case where stacks are often useful is in certain recursive algorithms. Sometimes you need to push
temporary data onto a stack as you recurse, but then remove them as you backtrack (for example, because
the recursive check failed). A stack offers an intuitive way to do this.
A stack can also be used to implement a recursive algorithm iteratively. (This is a good exercise! Take a
simple recursive algorithm and implement it iteratively.) 
