fun main() {
  numbers(listOf("Mary","Josephine","Malcom","Nesbit","Leah","Viola","Rukia","Kelly","Klein","Akello"))
var num =weightTotal(listOf(24,34,56,78,90,84))
    println(num)
    var a =Someone("Winnie",24,56,79)
    var b =Someone("Kelly",34,65,69)
    var c =Someone("Mercy",14,76,49)
    var d=Someone("Abok",44,46,56)
    val ages = mutableListOf(a,b,c,d)
    var age =ages.sortedByDescending { Someone->Someone.age }
    println(age)
//    val list = mutableListOf<person>(person("kelly",8,34,35,), person())



    var e =Car("avobQ",240.8,)
    var f =Car("kvmbJ",450.8,)
    var g =Car("bytbK",568.0,)
    var cars = listOf(e,f,g)
    println(cars)

}



// 1. Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc
fun numbers(names:List<String>):List<String>{
names.forEachIndexed { index, x ->
    if (index % 2 == 0)
        println(x)

}
    return  names
}
//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
fun weightTotal(student:List<Int>):String{
    var sum =student.sum()
    var average =student.average()
    var total ="$sum $average"
    return total
}
//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
data class Someone(var name:String,var age:Int,var height:Int,var weight:Int){

}


//Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
//(1 point)
fun oneList(oneList:List<Any>):List<Any>{
    return listOf()
}
//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
class Car (var registration:String,var mileage:Double){
fun average (distance:List<Car>):Double{
    var total =0.0
    distance. forEach{Car->
        total+=Car.mileage}
    var avg =total/distance.count()

    return avg
}
}
