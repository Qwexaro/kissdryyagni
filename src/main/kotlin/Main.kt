fun main() {
    val factory = ProductFactory()
    val productA = factory.createProduct("A")
    val productB = factory.createProduct("B")

    println(productA?.operation())
    println(productB?.operation())
}