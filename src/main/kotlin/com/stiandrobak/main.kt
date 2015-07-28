package com.stiandrobak

/**
 * Created by stiansd on 27.07.15.
 */

open class PersonB(var _name:String):PersonA(_name)


fun main(args: Array<String>) {
    val pa:PersonA = PersonA("Jake")
    val pb:PersonB = PersonB("Ian")
    val pc:PersonC = PersonC("Ted")
    println(pa)
    println(pb)
    println(pc)

}