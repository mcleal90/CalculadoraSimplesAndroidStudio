package com.example.calculadoraaula2908;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btCalcular;
    EditText txtOp1, txtOp2, txtResultado;
    Spinner spOp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtOp1 = findViewById(R.id.txtOp1);
        txtOp2 = findViewById(R.id.txtOp2);
        spOp = findViewById(R.id.spOp);
        btCalcular = findViewById(R.id.btCalcular);
        txtResultado = findViewById(R.id.txtResultado);

        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float oper1, oper2, resultado;
                String op;

                oper1 = Float.valueOf(txtOp1.getText().toString());
                oper2 = Float.valueOf(txtOp2.getText().toString());
                op = spOp.getSelectedItem().toString();

                switch (op) {
                    case "+":
                        resultado = oper1 + oper2;
                        break;
                    case "-":
                        resultado = oper1 - oper2;
                        break;
                    case "/":
                        resultado = oper1 / oper2;
                        break;
                    case "*":
                        resultado = oper1 * oper2;
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + op);
                }
                txtResultado.setText(String.valueOf(resultado));
            }
        });
    }
}