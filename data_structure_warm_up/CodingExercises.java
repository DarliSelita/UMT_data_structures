import java.util.*;
public class UniqueString {
    public static List<String> findUnique(List<String> strings) {
        Set<String> uniqueStrings = new LinkedHashSet<>(); 
        for (String s : strings) {
            uniqueStrings.add(s);
        }
        return new ArrayList<>(uniqueStrings);
    }
}
------------------------------------------------------------------------------------------------------------------------------------------
import java.util.*;

public class EvenIntegers {
    public static List<Integer> findEven(List<Integer> integers) {
        List<Integer> evenIntegers = new ArrayList<>();
        for (Integer i : integers) {
            if (i % 2 == 0) {
                evenIntegers.add(i);
            }
        }
        return evenIntegers;
    }
}
------------------------------------------------------------------------------------------------------------------------------------------
import java.util.Arrays;

public class KthSmallestInteger {
    public static int findKthSmallest(int[] nums, int k) {
        Arrays.sort(nums); 
        return nums[k-1];
    }
}
------------------------------------------------------------------------------------------------------------------------------------------import java.util.List;
import java.util.*;

public class Exercise4 {
    public static List<Integer> findLongestIncreasingSubsequence(int[] nums) {
        int n = nums.length;
        int[] x = new int[n];
        int[] prev = new int[n];
        Arrays.fill(prev, -1);
        int maxIndex = 0;
        for (int i = 0; i < n; i++) {
            x[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j] && x[j] + 1 > x[i]) {
                    x[i] = x[j] + 1;
                    prev[i] = j;
                }
            }
            if (x[i] > x[maxIndex]) {
                maxIndex = i;
            }
        }
        List<Integer> longestIncreasingSubsequence = new ArrayList<>();
        while (maxIndex != -1) {
            longestIncreasingSubsequence.add(nums[maxIndex]);
            maxIndex = prev[maxIndex];
        }
        return reverse(longestIncreasingSubsequence);
    }
    
    private static List<Integer> reverse(List<Integer> list) {
        List<Integer> reversedList = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }
}
------------------------------------------------------------------------------------------------------------------------------------------import java.util.Set;

public class Exercise5 {

    public static List<Integer> findLongestConsecutiveSubsequence(List<Integer> nums) {
        Set<Integer> numSet = new HashSet<>(nums);
        int maxlength = 0;
        List<Integer> longestSubsequence = new ArrayList<>();
        for (int num : nums) {
            if (!numSet.contains(num - 1)) {
                int currNum = num;
                int currlength = 1;
                while (numSet.contains(currNum + 1)) {
                    currNum++;
                    currlength++;
                }
                if (currlength > maxlength) {
                    maxlength = currlength;
                    longestSubsequence.clear();
                    for (int i = num; i <= currNum; i++) {
                        longestSubsequence.add(i);
                    }
                }
            }
        }
        return longestSubsequence;
    }