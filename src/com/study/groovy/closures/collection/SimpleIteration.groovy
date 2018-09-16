package com.study.groovy.closures.collection

class SimpleIteration {

    static void main(String[] args) {
        List nums = [1,4,7,30,2]
        nums.each{
            println it
        }
    }

}
