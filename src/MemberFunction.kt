class MemberFunction {
    /* Inline functions
    use the inline keyword which ultimately requests the compiler
     to not allocate memory and simply copy t
    he inlined code of that function at the calling place*/
    inline fun higherfunc( str : String, mycall :(String)-> Unit){
        //invokes the print() by passing the string str
        mycall(str)
    }
    /*
    lambdaFunction
    A lambda expression is always surrounded by curly braces,
     argument declarations go inside curly braces and have optional type annotations,
      the code_body goes after an arrow -> sign. If the inferred return type of the lambda is not Unit,
    then the last expression inside the lambda body is treated as return value.*/
    fun lambdaFunction(){
        val sum1 = { a: Int, b: Int -> a + b }

            val result1 = sum1(2,3)
            println("The sum of two numbers is: $result1")

    }
    /* local function
     local function, it is located inside another function.
     */
    fun localFunction() {
        fun insideFun() {
            println("local function")
        }
        insideFun()

    }
}