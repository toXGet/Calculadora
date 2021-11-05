package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*val etNumUno = findViewById<EditText>(R.id.etNumeroUno)
        val etNumDos = findViewById<EditText>(R.id.etNumeroDos)
        val btnRes = findViewById<Button>(R.id.btnResultado)
        val tvRes = findViewById<TextView>(R.id.tvResultado)

        btnRes.setOnClickListener(){
            var numeroUno: Int = etNumUno.text.toString().toInt()
            var numeroDos: Int = etNumDos.text.toString().toInt()
            var resultado: Int = numeroUno + numeroDos
            tvRes.text = "El resultado es $resultado"
        }*/

        val tvOps = findViewById<TextView>(R.id.tvOperaciones)
        val tvRes = findViewById<TextView>(R.id.tvResultado)

        val btnBor = findViewById<Button>(R.id.btnAc)
        val btnBor2 = findViewById<Button>(R.id.btnC)
        val btn1 = findViewById<Button>(R.id.btnUno)
        val btn2 = findViewById<Button>(R.id.btnDos)
        val btn3 = findViewById<Button>(R.id.btnTres)
        val btn4 = findViewById<Button>(R.id.btnCuatro)
        val btn5 = findViewById<Button>(R.id.btnCinco)
        val btn6 = findViewById<Button>(R.id.btnSeis)
        val btn7 = findViewById<Button>(R.id.btnSiete)
        val btn8 = findViewById<Button>(R.id.btnOcho)
        val btn9 = findViewById<Button>(R.id.btnNueve)
        val btn0 = findViewById<Button>(R.id.btnCero)
        val btnPun = findViewById<Button>(R.id.btnPunto)
        val btnDiv = findViewById<Button>(R.id.btnDividir)
        val btnMul = findViewById<Button>(R.id.btnMultiplicar)
        val btnRes = findViewById<Button>(R.id.btnRestar)
        val btnSum = findViewById<Button>(R.id.btnSumar)
        val btnIgu = findViewById<Button>(R.id.btnIgual)

        var numUno: String = ""
        var numDos: String = ""
        var operador: String = ""
        var chequeo: Boolean = false

        fun limpiar() {
            tvOps.text = ""
            tvRes.text = ""
            numUno = ""
            numDos = ""
            operador = ""
            chequeo = false
        }

        fun constructorExp(cadena: String, oper: Boolean) {
            if (tvRes.text != ""){limpiar()}
            if (oper){
                if (chequeo){
                    Toast.makeText(this,
                        "Lo sentimos. En el momento sólo se puede hacer una operación",
                        Toast.LENGTH_SHORT).show()
                }else{
                    operador = cadena
                    chequeo = true
                    tvOps.append(cadena)
                }
            }else{
                if (!chequeo){
                    numUno += cadena
                }else{
                    numDos += cadena
                }
                tvOps.append(cadena)
            }
        }

        fun division(): String {
            if (numDos == "0"){
                return "ERROR! No se puede dividir por 0"
            }else{
                return (numUno.toDouble() / numDos.toDouble()).toString()
            }
        }

        fun calcular() {
            when (operador){
                "+" -> tvRes.text = (numUno.toDouble() + numDos.toDouble()).toString()
                "-" -> tvRes.text = (numUno.toDouble() - numDos.toDouble()).toString()
                "*" -> tvRes.text = (numUno.toDouble() * numDos.toDouble()).toString()
                "/" -> tvRes.text = division()
                else -> tvRes.text = "0"
            }
        }
        btn0.setOnClickListener{constructorExp("0",false)}
        btn1.setOnClickListener{constructorExp("1",false)}
        btn2.setOnClickListener{constructorExp("2",false)}
        btn3.setOnClickListener{constructorExp("3",false)}
        btn4.setOnClickListener{constructorExp("4",false)}
        btn5.setOnClickListener{constructorExp("5",false)}
        btn6.setOnClickListener{constructorExp("6",false)}
        btn7.setOnClickListener{constructorExp("7",false)}
        btn8.setOnClickListener{constructorExp("8",false)}
        btn9.setOnClickListener{constructorExp("9",false)}
        btnPun.setOnClickListener{constructorExp(".",false)}
        btnDiv.setOnClickListener{constructorExp("/",true)}
        btnMul.setOnClickListener{constructorExp("*",true)}
        btnRes.setOnClickListener{constructorExp("-",true)}
        btnSum.setOnClickListener{constructorExp("+",true)}
        btnBor.setOnClickListener{limpiar()}
        btnBor2.setOnClickListener{limpiar()}
        btnIgu.setOnClickListener{calcular()}
    }
}