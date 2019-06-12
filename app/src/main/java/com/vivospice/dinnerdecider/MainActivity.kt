package com.vivospice.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

val foodList = arrayListOf("Chinese", "Hamburger", "Pizza", "Salad")

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener {
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            selectedFoodText.text = foodList[randomFood]
        }

        addFoodBtn.setOnClickListener{
            val newFood = addFoodTxt.text.toString()
            if ( newFood == "") {
                addFoodTxt.text.clear()
            }else {
                while (newFood !in foodList) {
                    foodList.add(newFood)
                }
            }
            addFoodTxt.text.clear()
            //println(foodList)
        }
    }
}
