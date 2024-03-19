import java.lang.IllegalArgumentException

class Calul {

    suspend fun  Calkulytor_delenie(num1:Double,num2:Double):Double{
        var otv:Double
        if (num1==0.0){
            throw
            IllegalArgumentException("$num1 нельзя делить")
        }
        else{
            otv=num1/num2
        }
        return otv
    }

    suspend fun  Calkulytor_umnogenie(num1:Double,num2:Double):Double{
        var otv:Double
        otv=num1*num2
        return  otv
    }
}