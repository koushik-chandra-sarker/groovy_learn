/** Variable
 *  Variables in Groovy can be defined in two ways − using the native syntax
 * for the data type or the next is by using the def keyword.
 * For variable definitions it is mandatory to either provide
 * a type name explicitly or to use "def" in replacement.
 * This is required by the Groovy parser.
 *
 *
 * There are following basic types of variable in Groovy --->
 * -byte
 * -short
 * -int
 * -long
 * -float
 * -double
 * -char
 * -Boolean
 * -String
 * */



/** b, B is define as a variable
 * Variable can be 'lowercase', 'uppercase' or with the 'underscore'
 *
 * Variable can't be start with 'number' or any 'special character'
 * */
byte b = 10
byte B = 20
int _i = 50
String s = "Hello Groovy"
boolean flag = true
println(b)
println(B)
println(_i)
println(s)
println(flag)


//Print variable with String - double quote
println("Sum of b & B is) "+(b+B))
//Print variable with String - single quote
println('Sum of b & B is '+(b+B))
//Print variable in String
println("Sum of b & _i is ${b+_i}")
println("Sum of b & _i is $b") // for a single variable no need to give 'curly braces' {}



