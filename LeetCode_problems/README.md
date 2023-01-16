# LeetCode
 - ## Easy
   - [Reverse Integer](https://github.com/goodluck3301/data-structures-and-algorithms/blob/main/LeetCode_problems/README.md#reverse-integer)
   - [Two Sum](hhttps://github.com/goodluck3301/data-structures-and-algorithms/tree/main/LeetCode_problems#two-sum)

 
 
 
 ## Reverse Integer
 
Given a signed 32-bit integer ```x```, return ```x``` with its digits reversed. If reversing ```x``` causes the value to go outside the signed 32-bit integer range ```[-231, 231 - 1]```, then return ```0```.</br>

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

```
Example 1:
  Input: x = 123
  Output: 321

Example 2:
  Input: x = -123
  Output: -321

Example 3:
  Input: x = 120
  Output: 21
```
```
Constraints:
 -231 <= x <= 231 - 1
```

[Source Code](https://github.com/goodluck3301/data-structures-and-algorithms/blob/main/LeetCode_problems/Reverse_Integer.kt)

 ## Two Sum

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.</br>

You may assume that each input would have exactly one solution, and you may not use the same element twice.</br>

You can return the answer in any order.</br>

```
Example 1:
  Input: nums = [2,7,11,15], target = 9
  Output: [0,1]
  Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
  Input: nums = [3,2,4], target = 6
  Output: [1,2]

Example 3:
  Input: nums = [3,3], target = 6
  Output: [0,1]
  

Constraints:
  2 <= nums.length <= 104
  -109 <= nums[i] <= 109
  -109 <= target <= 109
  Only one valid answer exists.
```
[Source Code](https://github.com/goodluck3301/data-structures-and-algorithms/blob/main/LeetCode_problems/Two_Sum.kt)
