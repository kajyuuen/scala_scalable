val fruit = "apples" :: ("orange" :: ("pears" :: Nil))
val nums = 1 :: (2 :: (3 :: (4 :: Nil)))
val diag3 =
  (1 ::(0 :: (0 :: Nil))) ::
  (0 ::(1 :: (0 :: Nil))) ::
  (0 ::(0 :: (1 :: Nil))) :: Nil
val empty = Nil

println(fruit)
println(nums)
println(diag3)
println(empty)
