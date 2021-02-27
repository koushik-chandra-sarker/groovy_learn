/**
 * @Single-quoted string* */
String S = 'Single-quoted string'
println(S)

/**
 * @Double-quoted string* */
String s = "Double-quoted string"
println(s)


/**
 * @variable in Double Quote
 *
 * */

int A = 5
int B = 3
println("A is $A")
println("Sum of A & B is ${A + B}") // Required curly Braces for more then one variable
//println('A is $A') // variable dose not support in single quote

/**
 * single and double quote dose not support multi-line String
 *
 * @Triple-single-quoted --> Multi-line String supported by Triple-single-quoted string
 *
 * */

String s1 = '''Hello 
Groovy.
How are you'''  // it contains a newline in every line
println(s1)


//String Indexing
def s2 = "Groovy"
println(s2[-1]) // Output: y
println(s2[-2]) // Output: v
println(s2[0]) // Output: G
println(s2[2]) // Output: o

// Slashy string
def s3 = /Hi/
println(s3)

//Slashy strings are multiline:
def multilineSlashy = /one
    two
    three/

println(multilineSlashy)