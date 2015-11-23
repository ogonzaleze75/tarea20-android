package cl.inacap.cursoandroid.unidad4.Crud;

import com.example.tarea.u4.oscar.gonzalez20a.R;
import com.example.tarea.u4.oscar.gonzalez20a.R.id;
import com.example.tarea.u4.oscar.gonzalez20a.R.layout;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class ConversionMoneda extends Activity {
	// propiedades de la clase
	private TextView etiResultado;
	private EditText campoValor;
	private Button btnPesosDolar;
	private Button btnDolarPesos;
	private Button btnPesosEuros;
	private Button btnEurosPesos;
	private Button btnDolarEuros;
	private Button btnEurosDolar;
	private Button btnLimpiar;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_conversion_moneda);
		campoValor = (EditText) findViewById(R.id.campoValor);
		etiResultado = (TextView)findViewById(R.id.etiResultado);
		
		btnPesosDolar = (Button) findViewById(R.id.btnPesosDolar);
		btnDolarPesos= (Button) findViewById(R.id.btnDolarPesos);
		btnPesosEuros = (Button) findViewById(R.id.btnPesosEuros);
		btnEurosPesos = (Button) findViewById(R.id.btnEurosPesos);
		btnDolarEuros = (Button) findViewById(R.id.btnDolarEuros);
		btnEurosDolar = (Button) findViewById(R.id.btnEurosDolar);
		btnLimpiar = (Button) findViewById(R.id.btnLimpiar);
		
		//eventos de conversion a los botones, PESOS, DOLAR, EUROS
		btnPesosDolar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String dato = campoValor.getText().toString();
				float valor = Float.parseFloat(dato);
				float resultado = valor / 720;
				String resultadoFinal ="US %:  " + resultado;
				etiResultado.setText(resultadoFinal);
			}
		});
	
		btnDolarPesos.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String dato = campoValor.getText().toString();
				float valor = Float.parseFloat(dato);
				float resultado = valor * 720;
				String resultadoFinal ="Pesos %:  " + resultado;
				etiResultado.setText(resultadoFinal);
			}
		});
		
		btnPesosEuros.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String dato = campoValor.getText().toString();
				float valor = Float.parseFloat(dato);
				float resultado = valor / 750;
				String resultadoFinal ="EUR %:  " + resultado;
				etiResultado.setText(resultadoFinal);
			}
		});
		
		btnEurosPesos.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String dato = campoValor.getText().toString();
				float valor = Float.parseFloat(dato);
				float resultado = valor * 750;
				String resultadoFinal ="Pesos %:  " + resultado;
				etiResultado.setText(resultadoFinal);
			}
		});
		
		btnDolarEuros.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String dato = campoValor.getText().toString();
				float valor = Float.parseFloat(dato);
				float resultado = valor / 2;
				String resultadoFinal ="US %:  " + resultado;
				etiResultado.setText(resultadoFinal);
			}
		});
		
		btnEurosDolar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String dato = campoValor.getText().toString();
				float valor = Float.parseFloat(dato);
				float resultado = valor * 2;
				String resultadoFinal ="US %:  " + resultado;
				etiResultado.setText(resultadoFinal);
			}
		});
		
		btnLimpiar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				campoValor.setText("");
				etiResultado.setText("");
			}
		});
		
		
	}


}
