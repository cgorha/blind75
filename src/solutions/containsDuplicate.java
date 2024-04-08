package solutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class containsDuplicate {
    public boolean containsDuplicateHashSet(int[] nums) {
        HashSet<Integer> ansSet = new HashSet<>();

        for(int num : nums) {
            if(ansSet.contains(num)) {
                return true;
            }
            ansSet.add(num);
        }
        return false;
    }

    public boolean containsDuplicateArray(int[] nums) {
        Arrays.sort(nums);

        for(int i =0; i < nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
