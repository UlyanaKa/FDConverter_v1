package com.example.fdconverter_v1

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText_RUB.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                          }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

                            }

            override fun onTextChanged(s:CharSequence?, start:Int, before: Int, count: Int){
                var firstsum: EditText = findViewById(R.id.editText_RUB)
                var secondsum: TextView = findViewById(R.id.textView_USD_sum)
                var rubs: String
                if  (s.toString() != "") {
                   rubs = s.toString()
                var rub: Double
                    rub = try { rubs.toDouble()} catch (e:NumberFormatException) {100.toDouble()}
                    rub=rub/74*100
                var rubint: Int  = rub.toInt()
                rub = rubint.toDouble()/100
                secondsum.setText(rub.toString())}
                else {secondsum.setText("")}
          }
        })
        var firstsum: EditText = findViewById(R.id.editText_RUB)
        var secondsum: TextView = findViewById(R.id.textView_USD_sum)
        var rubs: String
        if  (firstsum.text.toString() != "") { rubs = firstsum.text.toString()} else {
            rubs="1000"
            firstsum.setText(rubs)}
        var rub: Double = rubs.toDouble()/74*100
        var rubint: Int  = rub.toInt()
        rub = rubint.toDouble()/100
        secondsum.setText(rub.toString())

            }

}

