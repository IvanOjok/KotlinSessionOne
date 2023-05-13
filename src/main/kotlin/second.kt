fun main() {
    /** Arrays */
    //Non-primitive
    val s = arrayOf(1, 2, 3, 4, 6, 9)
    /**  for loop */
    for(element in s) {
        println(element)
    }

    //primitive arrays
    val p = Array<String>(10, {"Tree"})
    //size and initialization block
    p[2] = "Boy"
    for (i in p) {
        println(i)
    }


    /** forEach statement */
    s.forEach {
        println(it)
    }

    /** step */
    for(i in 0..100 step 2) {
        println(i)
    }



}