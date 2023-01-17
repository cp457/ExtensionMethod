fun main() {
    val list = listOf (22, 30, 20, 33, 16, 345, 517, 199, 1000, 6435)

    list.filter().print()


}


fun List <Int>.filter() : List <Int> {

     return this.filter{it < 500}
}

fun List <Int>.print() {

    this.forEach { it -> println(it)}

}

/* Write an extension method that filters a list by value (e.g. smaller than 500).
Write an extension method that prints list values.
Then create a list that that has at least 10 members, filter them and then print the values that pass the filter.
 */