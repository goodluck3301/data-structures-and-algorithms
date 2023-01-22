/*

This example uses an array of linked lists to store the key-value pairs, 
and a basic hash function that takes the key modulo the size of the array 
to determine the index. The put, get, and remove methods are used to add, retrieve,
and delete key-value pairs, respectively.

Note that this is a very basic implementation, 
it doesn't handle the case when the array becomes full,
and it also doesn't include a collision resolution strategy. 
You would need to add more robust methods to handle those cases for a production ready version.

*/

class HashTable(val size: Int) {
    val array = Array(size) { LinkedList<Pair<Int, Any>>() }

    fun put(key: Int, value: Any) {
        val index = key % size
        for (pair in array[index]) {
            if (pair.first == key) {
                pair.second = value
                return
            }
        }
        array[index].add(Pair(key, value))
    }

    fun get(key: Int): Any? {
        val index = key % size
        for (pair in array[index]) {
            if (pair.first == key) {
                return pair.second
            }
        }
        return null
    }

    fun remove(key: Int) {
        val index = key % size
        for (pair in array[index]) {
            if (pair.first == key) {
                array[index].remove(pair)
                return
            }
        }
    }
}
