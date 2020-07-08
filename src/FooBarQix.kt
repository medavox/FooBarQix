import java.lang.StringBuilder

fun compute(input:String):String {
    val output = StringBuilder()
    val inputAsNum = input.toInt()
    if(inputAsNum % 3 == 0) output.append("Foo")
    if(inputAsNum % 5 == 0) output.append("Bar")
    if(inputAsNum % 7 == 0) output.append("Qix")

    val indivisible:Boolean = (inputAsNum % 3 != 0 && inputAsNum % 5 != 0 && inputAsNum % 7 != 0 )

    if(indivisible) {
        output.append(input.
            replace("0", "*").
            replace("3", "Foo").
            replace("5", "Bar").
            replace("7", "Qix")
        )
    } else {
        for(char in input) {
            output.append(when(char) {
                '0' -> "*"
                '3' -> "Foo"
                '5' -> "Bar"
                '7' -> "Qix"
                else -> ""
            })
        }
    }
    return output.toString()
}
fun main(args:Array<String>) {
    if(args.isEmpty()) {
        println("this program requires at least one argument.")
        return
    }
    println("${args[0]} => "+compute(args[0]))
}