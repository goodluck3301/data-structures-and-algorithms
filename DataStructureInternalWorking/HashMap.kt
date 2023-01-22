/* 

This example uses an array of linked lists to store the key-value pairs,
and the built-in hashCode() function to determine the index. The put, get, and remove methods are
used to add, retrieve, and delete key-value pairs, respectively.

It also includes a load factor check, if it exceeds 0.75,
it calls rehash method to make the size of the bucket 2 times larger 
and rehashes the key-value pairs to their new indexes.

Keep in mind that this is a basic implementation and it might not be suitable for production use.
But it demonstrates the basic idea of how a HashMap is implemented in Kotlin.

*/

class HashMap<K, V> {
    private val buckets = Array(16) { LinkedList<Pair<K, V>>() }
    private var size = 0

    fun put(key: K, value: V) {
        val index = key.hashCode() % buckets.size
        for (pair in buckets[index]) {
            if (pair.first == key) {
                pair.second = value
                return
            }
        }
        buckets[index].add(Pair(key, value))
        size++
        if (loadFactor() > 0.75) {
            rehash()
        }
    }

    fun get(key: K): V? {
        val index = key.hashCode() % buckets.size
        for (pair in buckets[index]) {
            if (pair.first == key) {
                return pair.second
            }
        }
        return null
    }

    fun remove(key: K) {
        val index = key.hashCode() % buckets.size
        for (pair in buckets[index]) {
            if (pair.first == key) {
                buckets[index].remove(pair)
                size--
                return
            }
        }
    }

    private fun loadFactor() = size.toFloat() / buckets.size

    private fun rehash() {
        val temp = buckets
        buckets = Array(buckets.size * 2) { LinkedList<Pair<K, V>>() }
        size = 0
        for (bucket in temp) {
            for (pair in bucket) {
                put(pair.first, pair.second)
            }
        }
    }
}
