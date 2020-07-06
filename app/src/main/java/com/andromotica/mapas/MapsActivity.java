package com.andromotica.mapas;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {

        BitmapDescriptor icono = BitmapDescriptorFactory.fromResource(getIntent().getIntExtra("icono", 22));

        mMap = googleMap;
        // Add a marker in Sydney and move the camera
        LatLng place = new LatLng( getIntent().getDoubleExtra("lat", 000), getIntent().getDoubleExtra("lng", 000));
        mMap.addMarker(new MarkerOptions().icon(icono).anchor(0.02f,0.02f).position(place).title(getIntent().getStringExtra("title")));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(place));
        mMap.animateCamera( CameraUpdateFactory.zoomTo( 14.0f ) );
        //mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(place.latitude, place.longitude), 12.0f));

    }
}