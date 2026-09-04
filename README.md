# leetcode733
# LeetCode 733 - Flood Fill

## Problem

Given an image represented by a 2D array, perform a flood fill starting from a given cell.

The flood fill changes the color of the starting cell and all connected cells that have the same original color.

## Approach

I used **Depth First Search (DFS)**.

### Steps

1. Store the original color of the starting cell.
2. If the original color is already equal to the new color, return the image.
3. Start DFS from the given `(sr, sc)` position.
4. Change the current cell's color.
5. Visit its four neighboring cells:

   * Up
   * Down
   * Left
   * Right
6. Continue only when the neighboring cell has the original color.
7. Return the modified image.

## Pattern

**Graph/Matrix DFS (Flood Fill)**

## Complexity

* **Time:** `O(m × n)` in the worst case
* **Space:** `O(m × n)` for the DFS recursion stack in the worst case

## LeetCode

Problem: **733. Flood Fill**
