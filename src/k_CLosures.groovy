/**
 * A closure in Groovy is an open, anonymous, block of code that can take arguments,
 * return a value and be assigned to a variable.
 * A closure may reference variables declared in its surrounding scope.
 *
 * Closure in the Groovy language can also contain free variables which are defined
 * outside of its surrounding scope.
 * */


{ println 'Hello Groovy'}  // Closure without variable




// Closure with variable
def greeting = {
    println 'hello world'
}

//Explicit call
greeting.call() //Output: hello world

//Implicit call--> its like function call
greeting()  //Output: hello world


//Closure can contain parameter
def greetingSecond = {String name ->
    println "Hello $name"
}

greetingSecond.call('Groovy')   //Output: Hello Groovy
greetingSecond('Koushik')   //Output: Hello Koushik


/**
 *  @return type of the closure by using the generic type of groovy.lang.Closure
 * */


Closure<String> greetingThird = { def name ->
    return "Hello $name"
}




def s = greetingThird 'greetingThird' // you can call Closures without 'parentheses'
println s  //Output: Hello greetingThird

//If not using def or var, or generic use groovy.lang.Closure as the type
Closure greetingFourth = { def name ->
    return "Hello $name"
}

GString s1 = greetingFourth('greetingFourth') //Output: Hello greetingFourth
println s1

/**
 * @Varargs
 * */

def greetingFifth = {String... s3 ->
    for (def s4 in s3) println "Hello $s4"
}

greetingFifth 'Foo', 'Faa' // Output : Hello Jony
//                                             Hello Rony

