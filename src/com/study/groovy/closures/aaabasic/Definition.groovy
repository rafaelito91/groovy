package com.study.groovy.closures.aaabasic

class Definition {

    // if it was a script, no static was needed.
    // it is so right know due to main method having
    // static scope
    static def timesTen(num, abacaxi) {
        abacaxi(num * 10)
    }

    static void main(String[] args) {
        timesTen(10, { println it })

        // Groovy tells me that every time a closure is
        // the last argument in a method, we can remove
        // the method braces and write method as below:
        timesTen(2) {
            println it
        }

        // same reason we can write each method like:
        [1,2,3].each{
            print it
        }
        // instead of
        [1,2,3].each({
            print it
        })
        // because the closure is the last argument!!
    }
}
