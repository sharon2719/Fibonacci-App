package com.example.fibonaccisequence

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class MainActivity : AppCompatActivity() {
    lateinit var rvNumbers:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvNumbers=findViewById(R.id.rvNumbers)
        rvNumbers.layoutManager=LinearLayoutManager(baseContext)
        var numbersRVAdapter=NumbersRVAdapter(fibonacci(100))
        rvNumbers.adapter=numbersRVAdapter

//        var x=fibonacci(100)
//        print(x.size)
    }
    
    fun fibonacci(num:Int):List<BigInteger>{
        var numList= mutableListOf<BigInteger>()
        numList.add(BigInteger.ZERO)
        numList.add(BigInteger.ONE)
        while (numList.size<100){
            var last=numList.get(numList.lastIndex)
            var secondLast=numList.get(numList.lastIndex-1)
            numList.add(last + secondLast)
        }
        return numList

    }
}