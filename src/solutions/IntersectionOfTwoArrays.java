package solutions;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> ans = new HashSet<>();

        for (int i : nums1) {
            set1.add(i);
        }
        for (int i : nums2) {
            if (set1.contains(i)){
                ans.add(i);
            }
        }

        int[] result = new int[ans.size()];
        int index = 0;
        for (int i : ans) {
            result[index++] = i;
        }
        return result;
    }
}
