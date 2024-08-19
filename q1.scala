object q1{
    val calInterest:Double=>Double = deposit =>{ deposit match{
        case x if(deposit<=20000) => deposit*0.02
        case x if (deposit<=200000) => deposit*0.04
        case x if (deposit<=2000000) => deposit*0.035
        case _ => deposit*0.065
    }
    }
    def main(Args:Array[String]):Unit ={
        println("Interest is "+calInterest(18000))
        println("Interest is "+calInterest(180000))
        println("Interest is "+calInterest(1800000))
        println("Interest is "+calInterest(18000000))
    }
}