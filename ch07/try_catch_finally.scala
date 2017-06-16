import java.net.URL
import java.net.MalformedAttributeException

def urlFor(path: String) =
  try{
    new URL(path)
  }catch{
    case e: MalformedAttributeException =>
      new URL("https://www.scala-lang.org/")
  }
# finally節は何らかの副作用を発生させる手段であり、値を返すべきではない
