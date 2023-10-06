package com.example.ceeeeee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast
import com.example.ceeeeee.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy{ ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        var output = 0
        var input = 0
        var text = ""
        var count = 0
        var design = ""

        fun add(a: Int){
            input = input * 10 + a
            binding.Edit2.text = input.toString()
        }

        fun sign(a: String) {
            when (a) {
                "÷" -> design = "÷"
                "*" -> design = "×"
                "-" -> design = "-"
                "+" -> design = "+"
                "%" -> design = "%"
            }
            text = a
            output = input
            input = 0
            binding.Edit1.text = output.toString()
            binding.Edit2.text = input.toString()
        }

        fun commend() {
            binding.Edit2.text = input.toString()
            binding.Edit1.text = output.toString()
        }

        binding.one.setOnClickListener{
            add(1)
        }

        binding.two.setOnClickListener{
            add(2)
        }

        binding.three.setOnClickListener{
            add(3)
        }

        binding.four.setOnClickListener{
            add(4)
        }

        binding.five.setOnClickListener{
            add(5)
        }

        binding.six.setOnClickListener{
            add(6)
        }

        binding.seven.setOnClickListener{
            add(7)
        }

        binding.eight.setOnClickListener{
            add(8)
        }

        binding.nine.setOnClickListener{
            add(9)
        }

        binding.zero.setOnClickListener{
            add(0)
        }

        binding.plus.setOnClickListener{
            sign("+")
        }

       binding.divi.setOnClickListener{
           sign("÷")
       }

        binding.minu.setOnClickListener{
            sign("-")
        }

        binding.mult.setOnClickListener{
            sign("x")
        }

        binding.equal.setOnClickListener{
            when(text) {
                "÷" -> output /= input
                "+" -> output += input
                "-" -> output -= input
                "x" -> output *= input
            }
            if(count != 1){
                input = 0
            }
            commend()
        }

        binding.AC.setOnClickListener{
            text = ""
            input = 0
            output = 0
            commend()
        }
    }
}