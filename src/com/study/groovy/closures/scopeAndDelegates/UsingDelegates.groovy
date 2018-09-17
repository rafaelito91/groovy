package com.study.groovy.closures.scopeAndDelegates

// Let's say we have a closure called writer
def writer = {
    append "Dan"
    append " Lives in Cleveland"
}

// if we call "writer()" an exception will be thrown,
// because the method append is not defined
// so we could define this method in the owner class, like:

def append(String s) {
    println "append() called with argument: $s"
}

// However, we can delegate this action to a class that already
// has the append method implemented. In this way:

StringBuffer sb = new StringBuffer()
writer.resolveStrategy = Closure.DELEGATE_FIRST // due to the fact that there are
writer.delegate = sb                            // two implementations we have to tell
println writer()                                // groovy to use the delegate one
                                                // since it uses the owners one by default


