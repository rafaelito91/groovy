package com.study.groovy.closures.aaabasic

class Arguments {

    static def noArguments = { -> // if there was no ->, a parameter would be
        println "I have no params"  // informed without impacting method execution
    }

    static void main(String[] args) {
        // Simple arugment definition: "*nameOfArgumet* ->"
        [1,2,3].each{ num ->
            print num
        }
        // If no argument defined, the "it" reserved word
        // can be used instead, a "implicit argument"
        [1,2,3].each{
            println it
        }

        // also, if you want to make sure a closure doesn't
        // receive any arguments, do as:
        noArguments() // if you define a argument, an exception will be thrown


    }
}
