/*
A LinkedHashMap in Kotlin is implemented as a combination of a hash table and a linked list.
The hash table is used to provide fast lookups for keys, 
while the linked list is used to maintain the insertion order of the elements.

Here is an example of how the internal implementation of a LinkedHashMap works in Kotlin:
*/


class LinkedHashMap<K, V> {

    // Hash table to store key-value pairs
    private val table = HashMap<K, Node<K, V>>()

    // Linked list to maintain the insertion order
    private class Node<K, V> {
        var key: K
        var value: V
        var next: Node<K, V>?
        var prev: Node<K, V>?

        constructor(key: K, value: V) {
            this.key = key
            this.value = value
        }
    }

    // Head and tail pointers for the linked list
    private var head: Node<K, V>? = null
    private var tail: Node<K, V>? = null

    // Put a key-value pair into the map
    fun put(key: K, value: V) {
        // Look up the key in the hash table
        val node = table[key]
        if (node != null) {
            // Update the value if the key is already in the map
            node.value = value
            // Move the node to the tail of the linked list
            moveToTail(node)
        } else {
            // Create a new node for the key-value pair
            val newNode = Node(key, value)
            //
