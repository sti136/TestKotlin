
fun main(args: Array<String>){
        var twoSum = TwoSum()
        var nums:IntArray = intArrayOf(2,7,11,15)
        var target:Int = 9
        print("Test 1: ")

        if(checkTwoSum(twoSum.twoSum(nums, target),intArrayOf(0,1)))
                println("Passed")
        else
                println("Failed")

        nums = intArrayOf(3,2,4)
        target = 6
        print("Test 2: ")

        if(checkTwoSum(twoSum.twoSum(nums, target),intArrayOf(1,2)))
                println("Passed")
        else
                println("Failed")

        nums = intArrayOf(3,3)
        target = 6
        print("Test 3: ")

        if(checkTwoSum(twoSum.twoSum(nums, target),intArrayOf(0,1)))
                println("Passed")
        else
                println("Failed")

}
fun checkTwoSum(a:IntArray,b:IntArray) = a contentEquals b


