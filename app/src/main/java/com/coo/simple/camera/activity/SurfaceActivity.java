package com.coo.simple.camera.activity;

import android.os.Bundle;

import com.coo.simple.camera.R;
import com.coo.simple.camera.base.CameraActivity;

/**
 * Created by jensen on 7/5/16.
 */
public class SurfaceActivity extends CameraActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surface);
    }
}
