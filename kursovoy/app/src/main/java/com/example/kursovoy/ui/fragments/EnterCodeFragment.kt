package com.example.kursovoy.ui.fragments


import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_enter_code.*
import com.example.kursovoy.R


class EnterCodeFragment : Fragment(R.layout.fragment_enter_code) {

    override fun onStart() {
        super.onStart()
        register_input_code.addTextChangedListener(object :TextWatcher{
            override fun afterTextChanged(p0: Editable?) {
                val string =  register_input_code.text.toString()
                if (string.length==6){
                    verificateCode()
                }
            }



            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                TODO("Not yet implemented")
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                TODO("Not yet implemented")
            }

        })
    }
    fun verificateCode(){
        Toast.makeText(activity,"ok", Toast.LENGTH_SHORT).show()
    }
}