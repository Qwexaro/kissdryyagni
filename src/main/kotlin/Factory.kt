interface Product {
    fun operation(): String
}

class ConcreteProductA : Product {
    override fun operation(): String {
        return "конкретная операция А"
    }
}

class ConcreteProductB : Product {
    override fun operation(): String {
        return "конкретная операция B"
    }
}

class ProductFactory {
    fun createProduct(type: String): Product? {
        return when (type) {
            "A" -> ConcreteProductA()
            "B" -> ConcreteProductB()
            else -> null
        }
    }
}