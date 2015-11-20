package cl.inacap.cursoandroid.unidad4.Crud;

import cl.inacap.cursoandroid.unidad4.Crud.ProductosFrescosGlobal;
import cl.inacap.cursoandroid.unidad4.Crud.UsuarioListaActivity;
import cl.inacap.cursoandroid.unidad4.business.UsuarioBS;
import cl.inacap.cursoandroid.unidad4.datamodel.UsuarioDM;

import java.util.ArrayList;

//import com.example.tarea1.oscar.gonzalez.Activity_opciones;
//import com.example.tarea1.oscar.gonzalez.ListadoClientes;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;



public class UsuarioNuevoActivity extends Activity {
	private boolean editar = false;
	private UsuarioDM usuario_dm;
	private ImageButton imListar;
	private ImageButton imGrabar;
	private ImageButton imUsuario;
	private ImageButton imEditar;
	private ImageButton imEliminar;
	private Button btnMapa;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_usuario_nuevo);
		//Se logra Recibir de la Acrivity Listado si el usuario se puede modificar
		Bundle bundle = getIntent().getExtras();
        this.editar = bundle.getBoolean("editar");
        /*se buscan los valores de la activity considerando
		 los nombres de los objetos de los ImageButtons creados en el layout activity_usuario_nuevo  
		 */
//		imListar=(ImageButton)findViewById(R.id.imListar);
//		imGrabar=(ImageButton)findViewById(R.id.imGrabar);
//		imUsuario= (ImageButton)findViewById(R.id.imUsuario);
//		imEditar=(ImageButton)findViewById(R.id.imEditar);
//		btnMapa=(Button)findViewById(R.id.btnMapa);	
		
		//se incluye el botón con imagen para agregar el registro
		imGrabar.setOnClickListener(new OnClickListener() {
        	   @Override
        	   public void onClick(View v) {
        		   confirmarRegistro();
        	   }
        	  }); 
        if(editar)
	        {
//	        	UsuarioNuevoActivity.this.setTitle(getResources().getString(R.string.title_activity_usuario_editar));
	        	//btn_ingresar.setText(getResources().getString(R.string.str_usuario_editar));
	        	final ProductosFrescosGlobal global = (ProductosFrescosGlobal) getApplicationContext();
	        	usuario_dm = global.getUsuarioEdicion();
	        	
//	        	EditText txt_nombre = (EditText)findViewById(R.id.txt_nombre);
//	    		EditText txt_login = (EditText)findViewById(R.id.txt_login);
//	    		EditText txt_password = (EditText)findViewById(R.id.txt_password);
	    		
//	    		txt_nombre.setText(usuario_dm.getNombre());
//	    		txt_login.setText(usuario_dm.getLogin());
//	    		txt_password.setText(usuario_dm.getContrasena());
	        }
        //se activa el botón para editar los registros necesarios
        imEditar.setOnClickListener(new OnClickListener() {
     	   @Override
     	   public void onClick(View v) {
     		  confirmarRegistro();
     	   }
     	  }); 
        imListar.setOnClickListener(new OnClickListener() {
	    	 @Override
	    	 public void onClick(View arg0) {
	    		UsuarioBS usuario = new UsuarioBS();
	    		Intent intent = new Intent(UsuarioNuevoActivity.this, UsuarioListaActivity.class);
	 			final ProductosFrescosGlobal global = (ProductosFrescosGlobal) getApplicationContext();
	 			usuario_dm = global.getUsuarioEdicion();
	 			global.setUsuario(usuario.getUsuario());
	 			UsuarioNuevoActivity.this.startActivity(intent);
	       
	    	 }
	    	 });
           //se incluye un botón que permite limpiar los objetos del usuario
      		//de la activity
      	imUsuario.setOnClickListener(new OnClickListener() {
      	    	 @Override
      	    	 public void onClick(View arg0) {
      	    		 Limpiar();
      	    	 }
      	       });
      	
 //     	btnMapa.setOnClickListener(new OnClickListener() {
 //     			@Override
 //     			public void onClick(View arg0){
 //     					Intent intent = new Intent(UsuarioNuevoActivity.this, Activity_maps.class);
 //     					UsuarioNuevoActivity.this.startActivity(intent);
 //     			}
 //     	});

      	
        
	}

	/**
	 * Se pregunta al usuario si realmente desea salir de la aplicacion
	 * */
	private void confirmarRegistro()
	{
		AlertDialog.Builder dialogo1 = new AlertDialog.Builder(this);  
        dialogo1.setTitle("Confirmacion");  
        if(!editar){
        	dialogo1.setMessage("Esta seguro de agregar este usuario ?");
        }
        else
        {
        	dialogo1.setMessage("Esta seguro de modificar este usuario ?");
        }
        dialogo1.setPositiveButton("Si", new DialogInterface.OnClickListener() {  
            public void onClick(DialogInterface dialogo1, int id) {  
            	validarUsuario();
            }  
        });  
        dialogo1.setNegativeButton("No", new DialogInterface.OnClickListener() {  
            public void onClick(DialogInterface dialogo1, int id) {  
                return;
            }  
        });            
        dialogo1.show();  
	}
	
	/**
	 *Se realiza la validacion de los datos ingresados y se registra el nuevo usuario
	 **/
	private void validarUsuario()
	{
//		EditText txt_nombre = (EditText)findViewById(R.id.txt_nombre);
//		EditText txt_login = (EditText)findViewById(R.id.txt_login);
//		EditText txt_password = (EditText)findViewById(R.id.txt_password);
		
//		if(txt_nombre.getText().toString().trim().equals(""))
		{
			Toast.makeText(UsuarioNuevoActivity.this, "Debe ingresar un nombre", Toast.LENGTH_LONG).show();
//			txt_nombre.requestFocus();
			return;
		}
		
//		if(txt_login.getText().toString().trim().equals(""))
//		{
//			Toast.makeText(UsuarioNuevoActivity.this, "Debe ingresar un login", Toast.LENGTH_LONG).show();
//			txt_login.requestFocus();
//			return;
//		}
		
//		if((txt_password.getText().toString().trim().equals("")) || (txt_password.getText().toString().trim().length() < 4))
//		{
//			Toast.makeText(UsuarioNuevoActivity.this, "Password debe tener minimo 4 caracteres", Toast.LENGTH_LONG).show();
//			txt_nombre.requestFocus();
//			return;
		}
		
		UsuarioBS usuario = new UsuarioBS();
		
//		if(!editar && usuario.agregarUsuario(txt_nombre.getText().toString(), txt_login.getText().toString(),  txt_password.getText().toString(), this.getApplication()))
		{
			Toast.makeText(UsuarioNuevoActivity.this, "Usuario agregado correctamente", Toast.LENGTH_LONG).show();
			this.finish();
		}
//		else if(editar && usuario.modificarUsuario(usuario_dm.getId(), txt_nombre.getText().toString(), txt_login.getText().toString(),  txt_password.getText().toString(), this.getApplication()))
		{
			Toast.makeText(UsuarioNuevoActivity.this, "Usuario modificado correctamente", Toast.LENGTH_LONG).show();
			this.finish();
		}
//		else
		{
			Toast.makeText(UsuarioNuevoActivity.this, usuario.getMensajeValidacion(), Toast.LENGTH_LONG).show();
		}
//	}
	
	//Creación del Método para limpiar el Formulario
	//De esta manera se puede llamar al método en varias oportunidades
public void Limpiar()
{
//	EditText txt_nombre = (EditText)findViewById(R.id.txt_nombre);
//	EditText txt_login = (EditText)findViewById(R.id.txt_login);
//	EditText txt_password = (EditText)findViewById(R.id.txt_password);
//	txt_nombre.setText("");
//	txt_login.setText("");
//	txt_password.setText("");
//	txt_nombre.requestFocus();
}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.usuario_nuevo, menu);
		return true;
	}

	/**
	 * Se valida el menu seleccionado
	 * @returns Retorna el resultado de la operacion
	 **/
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
//		// as you specify a parent activity in AndroidManifest.xml.
//		int id = item.getItemId();
//		if (id == R.id.mn_usuario_nuevo_volver) {
			this.finish();
			return true;
//		}
//		return super.onOptionsItemSelected(item);
	}
	
	
}
