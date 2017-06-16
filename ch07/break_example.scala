import scala.util.control.Breaks._
import java.io

val in = new BufferedReader(new InputSteamReader(system.in))

breakable {
  while(true) {
    println("?")
    if(in.readLine() == "") break
  }
}
