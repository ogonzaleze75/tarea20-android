package cl.inacap.cursoandroid.unidad4.Crud;


import com.example.tarea.u4.oscar.gonzalez20a.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class Activity_maps extends Activity {
	   static final LatLng TutorialsPoint = new LatLng(-40.58 , -73.11);
	   private GoogleMap googleMap;
	   
	   @Override
	   protected void onCreate(Bundle savedInstanceState) {
	      super.onCreate(savedInstanceState);
	      setContentView(R.layout.activity_activity_maps);
	    
	      
	      try {
	         if (googleMap == null) {
	            googleMap = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
	         }
	         googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
	         Marker TP = googleMap.addMarker(new MarkerOptions().
	         position(TutorialsPoint).title("TutorialsPoint"));
	          // Move the camera instantly to hamburg with a zoom of 15.
             googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(TutorialsPoint, 19));
             // Zoom in, animating the camera.
             googleMap.animateCamera(CameraUpdateFactory.zoomTo(17), 2000, null);

	      }
	      catch (Exception e) {
	         e.printStackTrace();
	      }
	   }
	}


