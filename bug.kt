fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList)

    val evenNumbers = list.filter { it % 2 == 0 }
    println(evenNumbers)

    //This will throw an exception because the list is empty 
    val firstEven = evenNumbers.first()
    println(firstEven)
}