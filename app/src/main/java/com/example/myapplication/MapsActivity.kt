package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.*
import java.util.*

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
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
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap


         val uty = LatLng(-7.747033,110.355398)
         mMap.addMarker(MarkerOptions().position(uty).title("Universitas Teknologi Yogyakarta"))
         mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(uty,17.0f))

       // val latitude = 37.422160
      //  val longitude = 110.084270
       // val zoomLevel = 15f
        //val overlaySize = 100f

       // val homeLatLng = LatLng(latitude, longitude)
       // mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(homeLatLng, zoomLevel))
      //  mMap.addMarker(MarkerOptions().position(homeLatLng))

        //val googleOverlay = GroundOverlayOptions()
          //  .image(BitmapDescriptorFactory.fromResource(R.drawable.ic_android_black_24dp))
          //  .position(homeLatLng, overlaySize)
       // mMap.addGroundOverlay(googleOverlay)

    }
}
