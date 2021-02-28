package Opps.c_Methods

/**
 * A method is defined with a return type or with the def keyword, to make the return type untyped.
 * A method can also receive any number of arguments, which may not have their types explicitly declared.
 * Java modifiers can be used normally, and if no visibility modifier is provided, the method is public.
 *
 * @Methods in Groovy always return some value.
 *       -If no return statement is provided,
 *          the value evaluated in the 'last line' executed will be returned.
 *          For instance, note that none of the following methods uses the return keyword.
 *
 * */

class Method {
    def someMethod() { 'method called' } //Method with no return type declared and no paramete
    String anotherMethod() { 'another method called' } //Method with explicit return type and no parameter
    def thirdMethod(param1) { "$param1 passed" } //Method with a parameter with no type defined
    static String fourthMethod(String param1) { "$param1 passed" } //Static method with a String parameter

    /**
     * @Named parameters* */
    def foo(Map args) { "${args.name}: ${args.age}" }

    def foo1(Map args1, Integer number) {
        "${args1.name}: ${args1.age}, and the number is ${number}"
    }

    /**
     * If we don’t have the Map as the first argument,
     * then a Map must be supplied for that argument instead of named parameters.
     * Failure to do so will lead to groovy.lang.MissingMethodException:
     * */
    def foo3(Integer number, Map args) { "${args.name}: ${args.age}, and the number is ${number}" }

    /**
     * @Default arguments*
     * Default arguments make parameters optional.
     * If the argument is not supplied, the method assumes a default value.
     *
     * */
    def foo4(String par1, Integer par2 = 1) { [name: par1, age: par2] }


    static void main(String[] args) {
        def method = new Method()
        println(method.someMethod())

        println(method.anotherMethod())

        println(method.thirdMethod("Hello"))

        println(fourthMethod("Hello Groovy"))

        /**
         * Named parameters
         * */
        println(method.foo(name: 'Marie', age: 1))


        //	Method call with additional number argument of Integer type
        println(method.foo1(name: 'Marie', age: 1, 23)) //Output: Marie: 1, and the number is 23
        // Method call with changed order of arguments
        println(method.foo1(23, name: 'Marie', age: 1)) //Output: Marie: 1, and the number is 23

//        println(method.foo3(name: 'Marie', age: 1, 23)) //Give an error  see line no: 31


        /**
         * Above() exception can be avoided if we replace named arguments with an explicit Map argument:
         * */
        println(method.foo3(23, [name: 'Marie', age: 1])) //Output: Marie: 1, and the number is 23


        /**
         * @Default arguments call
         */


        println(method.foo4("hello")) //output:[name:hello, age:1]

    }
}
