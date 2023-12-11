package com.example.econome

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.Calendar
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import java.util.*
import android.graphics.Canvas


class Homepage : AppCompatActivity() {

    private lateinit var textViewDate: TextView
    private lateinit var textViewMonth: TextView

    private lateinit var incomeImage: ImageView
    private lateinit var expensesEditText: EditText
    private lateinit var incomeEditText: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)

        textViewDate = findViewById(R.id.textCurrentDate)
        textViewMonth = findViewById(R.id.textCurrentMonth)

        // Display the current month and date in the TextView
        val calendar = Calendar.getInstance()
        val date = calendar.time
        val dateFormat = SimpleDateFormat("MMMM dd, yyyy", Locale.getDefault())
        textViewDate.text = dateFormat.format(date)

        val currentDate = Calendar.getInstance()
        val dateFormat2 = SimpleDateFormat("MMMM", Locale.getDefault())

        val currentMonth = dateFormat2.format(currentDate.time)
        textViewMonth.text = currentMonth

        incomeImage = findViewById(R.id.income_image)
        expensesEditText = findViewById(R.id.expenses_edittext)
        incomeEditText = findViewById(R.id.income_edittext)

        findViewById<View>(R.id.submit_button).setOnClickListener {
            val expenses = expensesEditText.text.toString().toDouble()
            val income = incomeEditText.text.toString().toDouble()

            displayIncomeImage(expenses, income)
        }
    }

    private fun displayIncomeImage(expenses: Double, income: Double) {
        val difference = expenses - income
        val percentages = arrayOf(0.125, 0.25, 0.375, 0.5, 0.625, 0.75, 0.875, 1.0)
        val drawableIds = arrayOf(
            R.drawable.income_12,
            R.drawable.income_25,
            R.drawable.income_37,
            R.drawable.income_50,
            R.drawable.income_62,
            R.drawable.income_75,
            R.drawable.income_87,
            R.drawable.income_100
        )


        var found = false
        for (i in percentages.indices) {
            if (difference / (expenses + income) < percentages[i]) {
                incomeImage.setImageResource(drawableIds[i])
                found = true
                break
            }
        }

        if (!found) {
            incomeImage.setImageResource(drawableIds.last())
        }

    }
}