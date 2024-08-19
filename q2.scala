import scala.io.StdIn.readLine
object q2{
    def main(args:Array[String]):Unit={
        val number=readLine("Enter a number").toInt
            val num=(number:Int)=>{
            number match{
                case x if(number<=0)=>"Negative/Zero"
                case x if(number%2==0) => "Even"
                case _ => "Odd"
            }
        }
        println( num(number) + " Is given ")

    }
}