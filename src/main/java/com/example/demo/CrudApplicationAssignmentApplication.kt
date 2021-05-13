//package com.example.demo
//
//import org.springframework.boot.SpringApplication
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration
//import org.springframework.boot.autoconfigure.SpringBootApplication
//import org.springframework.context.annotation.ComponentScan
//
//@SpringBootApplication
////@EnableAutoConfiguration
////@ComponentScan
//class CrudApplicationAssignmentApplication
//{
//    //companion object
//    //{
//
//        //@JvmStatic
//        fun main(args: Array<String>)
//        {
//            SpringApplication.run(CrudApplicationAssignmentApplication::class.java, *args)
//        }
//    //}
//}

package com.example.demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
object CrudApplicationAssignmentApplication
{
    @JvmStatic
    fun main(args: Array<String>)
    {
        SpringApplication.run(CrudApplicationAssignmentApplication::class.java, *args)
    }
}