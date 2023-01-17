fun main() {
    val price = 100
    val discountStart = 1000
    val discountSecond = 10000
    var regularBuyer: Boolean = true
    var quantity = 500

    var amount = if ((quantity * price) < discountStart) {
        quantity * price
    } else if ((quantity * price) > discountStart && (quantity * price) < discountSecond) {
        (quantity * price) - 100
    } else {
        (quantity * price) - (quantity * price * 5 / 100)
    }
    var totalPrice = if (regularBuyer == true) amount - (amount * 1 / 100) else amount

    println("Сумма заказа: $totalPrice")

}

