package com.study.groovy.closures.aaabasic

class Arguments3 {

    // with some dynamic programming, those information
    // can be pretty useful, considering sometimes you
    // might now know which closure was past as param
    // to your method
    static def someMethod(Closure c) {
        println("...")
        println c.maximumNumberOfParameters
        println c.parameterTypes
    }

    static void main(String[] args){
        def someClosure = { int x, int y -> x + y }
        someMethod (someClosure)
    }
}
