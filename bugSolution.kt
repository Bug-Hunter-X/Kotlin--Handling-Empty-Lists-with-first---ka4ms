fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList)

    val evenNumbers = list.filter { it % 2 == 0 }
    println(evenNumbers)

    //This will return null because the list is empty, handling the exception gracefully
    val firstEven = evenNumbers.firstOrNull()
    println(firstEven)
    
    //Another way to handle it
    val firstEven2 = evenNumbers.firstOrNull() ?: 0
    println(firstEven2)
}