class InfixFunctionNotation {
    /*Standard library infix function notation
    When we call operators like and, or , shr, shl etc
     then compiler looks for the function and calls the desired one without using parenthesis and dot.
     */
    fun standardInfixFun(){
        var a = 32

        // // call using infix notation
        var result1 = a shr 2  // call using infix notation
        //var result2 = a.shr(1)  call using dot and parenthesis
        println("Signed shift right by 2 bit: $result1")

        println(++a)      // call using infix notation
        //println(a.inc())   call using dot and parenthesis

    }
    /*User defined infix function notation
    We can create own function with infix notation if the function satisfy the following requirements:
    It must be member function or extension function
    It must accepts a single parameter
    The parameter must not accept variable number of arguments and must have no default value
    It must be marked with infix keyword
     */
    // user defined infix member function
    infix fun doublicate(n : Int): Int{
        val num = n + n
        return num
    }








}