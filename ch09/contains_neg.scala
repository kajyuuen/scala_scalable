def containsNeg(nums: List[Int]): Boolean = {
  var exist = false
  for(num <- nums)
    if(num < 0)
      exist = true
  exist
}

// def containsNeg(nums: List[Int]) = nums.exists(_ < 0)
