package Opps

class b_Outer_inner_class {

    def st = "Call Inner Class from"

    def sum(def a,def b){
        return a+b
    }
    def callInnerClass(){
        def inner = new Inner()
        inner.method1()
    }

    class Inner{
        def method1(){
            println(st)
        }

    }

    static void main(String[] args) {
        def boic = new b_Outer_inner_class()
        println("Sum of 2 and 5 is ${boic.sum(2,5)}")

        boic.callInnerClass()
    }
}
