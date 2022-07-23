

class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (a in nums.indices){
            for(b in nums.indices){
                if(nums[a]+nums[b]==target && a != b)
                    return intArrayOf(a,b)
            }
        }
        return nums
    }

}