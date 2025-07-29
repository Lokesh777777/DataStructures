package arrays;

// two pointers algorithm is efficient
public class WaterTrapping {

        public int maxWater(int arr[]) {
            int n = arr.length;
            int[] left = new int[n];
            int[] right = new int[n];
            
            left[0] = arr[0];
            
            for(int i = 1; i < n; i++){
               left[i] = Math.max(left[i - 1], arr[i]);
            }
            
            right[n - 1] = arr[n - 1];
            
            for(int j = n - 2; j >= 0; j--){
                right[j] = Math.max(right[j + 1], arr[j]);  // Corrected from a[j] to arr[j]
            }
            
            int ans = 0;
            
            for(int i = 0; i < n; i++){
                ans += Math.min(left[i], right[i]) - arr[i];  // Corrected from a[i] to arr[i]
            }
            return ans;
        }
    
    public static int trapWater(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;
        int leftMax = 0, rightMax = 0;
        int waterTrapped = 0;

        while (left <= right) {           //0<=5;
            if (arr[left] < arr[right]) {      //arr[0](3) < arr[5](4)
                if (arr[left] >= leftMax) {    //arr[0](3) >= 0
                    leftMax = arr[left];       //lm = 3
                } else {
                    waterTrapped += leftMax - arr[left];  // left = 1
                }
                left++;
            } else {
                if (arr[right] >= rightMax) {
                    rightMax = arr[right];
                } else {
                    waterTrapped += rightMax - arr[right];
                }
                right--;
            }
        }

        return waterTrapped;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 0, 0, 2, 0, 4};
        int[] arr2 = {7, 4, 0, 9};
        int[] arr3 = {6, 9, 9};

        System.out.println(trapWater(arr1)); // Output: 10
        System.out.println(trapWater(arr2)); // Output: 10
        System.out.println(trapWater(arr3)); // Output: 0
    }
}

/*
 * Let’s break the **Trapping Rain Water** problem into line-by-line explanation with an **example**:  

---

### **Code and Explanation**

```java
public static int trapWater(int[] arr) {
```

- This is the method that takes an array of integers (`arr`) as input, representing heights of bars.

---

### **Example Input**
We will use:  
`arr = {3, 0, 2, 0, 4}`  

---

```java
    int n = arr.length;
    int left = 0, right = n - 1;
    int leftMax = 0, rightMax = 0;
    int waterTrapped = 0;
```

1. **Initialize variables**:
   - `n = arr.length` → Length of the array is 5.  
   - `left = 0`, `right = 4` → Pointers start at both ends of the array.
   - `leftMax = 0`, `rightMax = 0` → Maximum heights seen so far from the left and right.
   - `waterTrapped = 0` → Stores the total water trapped.

---

```java
    while (left <= right) {
```

2. **Loop until left crosses right**:  
   - The loop ensures we process all elements.

---

### **Step 1: Compare Heights**
```java
        if (arr[left] < arr[right]) {
```

- Compare `arr[left]` and `arr[right]`.  
  - If `arr[left] < arr[right]`, process the **left** side.  
  - Otherwise, process the **right** side.  

For the **first iteration**:  
- `arr[left] = 3` and `arr[right] = 4`.  
- Since `3 < 4`, process the **left side**.

---

### **Step 2: Process Left**
```java
            if (arr[left] >= leftMax) {
                leftMax = arr[left];
            } else {
                waterTrapped += leftMax - arr[left];
            }
            left++;
```

**Case 1: Update `leftMax`**  
- If `arr[left] >= leftMax`, update `leftMax`.  
- Otherwise, calculate trapped water as `leftMax - arr[left]`.  

#### **Iteration 1**:  
- `arr[left] = 3`, `leftMax = 0`.  
- Since `3 >= 0`, update `leftMax = 3`.  
- Move `left` to `1`.  

---

#### **Iteration 2**:
- `arr[left] = 0`, `leftMax = 3`.  
- Since `0 < 3`, trapped water = `leftMax - arr[left] = 3 - 0 = 3`.  
- Add `3` to `waterTrapped` → `waterTrapped = 3`.  
- Move `left` to `2`.

---

#### **Iteration 3**:
- `arr[left] = 2`, `leftMax = 3`.  
- Since `2 < 3`, trapped water = `leftMax - arr[left] = 3 - 2 = 1`.  
- Add `1` to `waterTrapped` → `waterTrapped = 4`.  
- Move `left` to `3`.

---

#### **Iteration 4**:
- `arr[left] = 0`, `leftMax = 3`.  
- Since `0 < 3`, trapped water = `leftMax - arr[left] = 3 - 0 = 3`.  
- Add `3` to `waterTrapped` → `waterTrapped = 7`.  
- Move `left` to `4`.

---

#### **Iteration 5**:
- `arr[left] = 4`, `leftMax = 3`.  
- Since `4 >= 3`, update `leftMax = 4`.  
- Move `left` to `5`.

---

### **Step 3: Process Right**
If `arr[left] >= arr[right]`, we process the right side instead.  

```java
        } else {
            if (arr[right] >= rightMax) {
                rightMax = arr[right];
            } else {
                waterTrapped += rightMax - arr[right];
            }
            right--;
        }
```

In this example, all the water is already calculated from the left side, so no additional water is trapped from the right.

---

### **Return the Result**
```java
    return waterTrapped;
```

- At the end of the loop, `waterTrapped = 7`.  
- Return this value.

---

### **Final Output**
For the input `arr = {3, 0, 2, 0, 4}`, the trapped water is:  
**7 units**.

---
 */