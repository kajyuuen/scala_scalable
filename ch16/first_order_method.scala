// ::は要素を結合してListを作る
// :::はListを結合してListを作る
println(List(1, 2) ::: List(3, 4, 5))
println(List() ::: List(1, 2, 3))
println(List(1, 2, 3) ::: List(4))
