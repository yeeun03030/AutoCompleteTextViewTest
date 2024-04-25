package kr.ac.kopo.autocompletetextviewtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.MultiAutoCompleteTextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var items = arrayOf("apple", "appstore", "application", "banana", "band", "bard", "friend", "fruit")
        var adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, items)

        var auto = findViewById<AutoCompleteTextView>(R.id.auto)
        auto.setAdapter(adapter)

        var multiAuto = findViewById<MultiAutoCompleteTextView>(R.id.multiAuto)
        var token = MultiAutoCompleteTextView.CommaTokenizer()
        multiAuto.setTokenizer(token)
        multiAuto.setAdapter(adapter)
    }
}