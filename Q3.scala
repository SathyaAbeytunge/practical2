object question3{

    val normalAmount = 250
    val otAmount = 85
    val taxRate = 0.12

    def calculateSalary(normalHours: Int, otHours: Int): Double = {
        (normalHours * normalAmount) + (otHours * otAmount)
    }

    def calculateTax(salary: Double): Double = {
        salary * taxRate
    }

    def calculateTakeHomeSalary(normalHours: Int, otHours: Int): Double = {
        val salary = calculateSalary(normalHours, otHours)
        val tax = calculateTax(salary)
        salary - tax
    }

    def main (args: Array[String]): Unit={
        val normalHours = 40
        val otHours = 30
        val takeHomeSalary = calculateTakeHomeSalary(normalHours, otHours)

        println(s"Take-home salary: Rs. $takeHomeSalary")

        }

  
}


