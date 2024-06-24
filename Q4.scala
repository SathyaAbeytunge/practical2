object question4{

  // let x=noOfAttendees y=ticketPrice
  //profit=xy-(500+3x)
  //x=-4y+180
  //profit=-4(y^2-48y+260)
  def calculateProfit(ticketPrice: Int): Int = {
    val Profit = -4 * ((ticketPrice * ticketPrice) - (48 * ticketPrice) +260)
    Profit
  }

  def findBestTicketPrice(): Unit = {
    //maxTicketPrice=45 (noOfAttendees=0)
    for (i <- 1 to 45) {
        var Profit =calculateProfit(i)
        println(s"Profit when ticket price is $i = $Profit")
    }
  }

  def main(args: Array[String]): Unit={

    findBestTicketPrice()
  }

  //according to the output best ticket price is Rs.24
}
