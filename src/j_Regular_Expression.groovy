import com.sun.org.apache.xpath.internal.operations.Bool

import java.util.regex.Matcher
import java.util.regex.Pattern

/**
 * @Pattern operator
 * The pattern operator (~) provides a simple way to create a java.util.regex.Pattern instance:
 * */

def p = ~/foo/
assert p instanceof Pattern
println(p.getClass().getName()) //Output: java.util.regex.Pattern

/**
 * while in general, you find the pattern operator with an expression in a slashy-string,
 * it can be used with any kind of String in Groovy
 * */

/*
p = ~'foo'
p = ~"foo"
p = ~$/dollar/slashy $ string/$
p = ~"${pattern}"
*/

/**
 * @Find operator
 * Alternatively to building a pattern, you can use the find operator (=~) to directly
 * create a java.util.regex.Matcher instance:
 * */

def text = "some text to match"
def m = text =~ /match/
assert m instanceof Matcher
if (!m) {
    throw new RuntimeException("Oops, text not found!")
}else {
    println('Text Found')
}


/**
 * @Match operator
 * The match operator (==~) is a slight variation of the find operator,
 * that does not return a Matcher but a boolean and requires a strict match of the input string:
 * */

def m1 = text ==~ /match/
//assert m1 instanceof Matcher //give an error
assert m1 instanceof Boolean
if (m1) {
    throw new RuntimeException("Should not reach that point!\"")
}else {
    println('Text Found')
}