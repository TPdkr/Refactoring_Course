package jetbrains.refactoring.course.patterns

import java.time.LocalDate

data class Order(public val totalAmount: Double, public val date: LocalDate) {
    /*fun processPayment() {
        when (paymentMethod) {
            "CreditCard" -> {
                println("Processing credit card payment: $totalAmount")
            }
            "PayPal" -> {
                println("Processing PayPal payment: $totalAmount")
            }
            "Bitcoin" -> {
                println("Processing Bitcoin payment: $totalAmount")
            }
            else -> {
                println("Invalid payment method")
            }
        }
    }*/
}
