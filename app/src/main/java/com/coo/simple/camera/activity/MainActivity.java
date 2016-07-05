package com.coo.simple.camera.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.coo.simple.camera.R;
import com.coo.simple.camera.base.BaseActivity;

/**
 * Created by jensen on 7/5/16.
 */
public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onDisplaySelected(View v) {
        switch (v.getId()) {
            case R.id.bnSurface:
                toSurfaceActivity();
                break;
            case R.id.bnGlSurface:
                toGLSurfaceActivity();
                break;
            case R.id.bnTexture:
                toTextureActivity();
                break;
            default:
                break;
        }
    }

    protected void toSurfaceActivity() {
        startActivity(new Intent(this, SurfaceActivity.class));
    }

    protected void toGLSurfaceActivity() {
        startActivity(new Intent(this, GLSurfaceActivity.class));
    }

    protected void toTextureActivity() {
        startActivity(new Intent(this, TextureActivity.class));
    }
}
