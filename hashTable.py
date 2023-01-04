class HashTable:
  def __init__(self, size):
    self.size = size
    self.hash_table = [[] for _ in range(self.size)]

  def set_val(self, key, value): #set value
    hashed_key = hash(key)%self.size
    bucket = self.hash_table[hashed_key]
    for index, record in enumerate (bucket): #update
      record_key, record_value = record
      if record_key==key:
        bucket [index] = (key, value)
        return
    bucket.append((key, value))

  def get_val(self, key): #get value
    hashed_key = hash(key)%self.size
    bucket = self.hash_table[hashed_key]
    for index, record in enumerate(bucket):
       record_key, record_value = record
       if record_key == key:
         return record
    return "Not Found"

  def __str__(self):
    return str(self.hash_table)

  def size(self): # return HashTable size
    return self.size

hash_table = HashTable(256)
hash_table.set_val("goodluck3301","goodluck3301@mail.ru")
print(hash_table.get_val("goodluck3301"))
