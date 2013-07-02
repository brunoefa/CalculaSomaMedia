package com.cursoandroid.calculasomamedia;

import java.text.DecimalFormat;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	Double valor1 = 0.0, valor2 = 0.0, valor3 = 0.0, resultado = 0.0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void calculaSoma(View view) {
		obtemValores();
		resultado = valor1 + valor2 + valor3;
		mostrarResultado(resultado);
	}
	
	public void calculaMedia(View view) {
		obtemValores();
		resultado = (valor1 + valor2 + valor3) / 3;
		mostrarResultado(resultado);
	}
	
	public void mostrarResultado(Double resultado) {
		DecimalFormat df = new DecimalFormat("#.##");
		TextView tv = (TextView)findViewById(R.id.resultado);
		tv.setText("O resultado é: " + df.format(resultado));
	}
	
	public void obtemValores() {
		EditText et1 = (EditText)findViewById(R.id.valor1);
		EditText et2 = (EditText)findViewById(R.id.valor2);
		EditText et3 = (EditText)findViewById(R.id.valor3);
		
		valor1 = Double.parseDouble(et1.getText().toString());
		valor2 = Double.parseDouble(et2.getText().toString());
		valor3 = Double.parseDouble(et3.getText().toString());
	}

}
