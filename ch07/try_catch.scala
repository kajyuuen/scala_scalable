import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

try{
  val f = new FileReader("imput.txt")
}catch{
  case ex: FileNotFoundException =>
    println("ファイルが無いです")
  case ex: IOException =>
    println("なんかエラー")
}
