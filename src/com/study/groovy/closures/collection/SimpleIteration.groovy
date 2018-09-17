package com.study.groovy.closures.collection

class SimpleIteration {

    static void main(String[] args) {
        List nums = [1,4,7,30,2]

        // old way
        for(num in nums) {
            println num
        }
        // with closure
        nums.each{
            println it
        }

        // and now obtaining the index. In the old way
        // there would be a variable that would hold
        // the value of the index. Now... it's given
        // to us
        nums.eachWithIndex { int value, int index ->
            println "$index: $value"
        }
    }

}
