package com.example.semana18

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import java.util.Random

var i:Int=0;


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
ViewNumber.setOnClickListener(){
    var random=Random()
    var number1=random.nextInt(10)+1
    var number2=random.nextInt(10)+1
    var number3=random.nextInt(10)+1


    text1.setText("$number1");
    text2.setText("$number2");
    text3.setText("$number3");


if(number1==7 && number2==7 && number3==7){
    resultado.setText("GANASTE")


    }else{
        resultado.setText("NO GANASTE, UN INTENTO MENOS")
    i++
}
if(i==3){
    error.setText("No hay mas intentos, perdiste")
ViewNumber.visibility=View.GONE
}


}
    }







}