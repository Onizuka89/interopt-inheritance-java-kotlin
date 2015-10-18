package com.stiandrobak

/**
 * Created by stiansd on 27.07.15.
 */

open class PersonB(var name:String):PersonA(name){
  override fun toString() = "${javaClass.simpleName}: $name"
}


fun main(args: Array<String>) {
    val pa:PersonA = PersonA("Jake")
    val pb:PersonB = PersonB("Ian")
    val pc:PersonC = PersonC("Ted")
    println(pa)
    println(pb)
    println(pc)

}
