package Opps.b_Interface

class SystemGreeter implements Greeter{
    @Override
    void greet(String s) {
        println "Hello ${s}"
    }

    static void main(String[] args) {
        def sg = new SystemGreeter()
        sg.greet("Groovy")
    }
}
