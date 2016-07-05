package com.coo.simple.camera.activity;

import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.view.TextureView;

import com.coo.simple.camera.R;
import com.coo.simple.camera.base.CameraActivity;

public class TextureActivity extends CameraActivity {

    protected TextureView tvContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_texture);

        tvContent = (TextureView) findViewById(R.id.tvContent);
        tvContent.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() {
            @Override
            public void onSurfaceTextureAvailable(SurfaceTexture surface, int width, int height) {

            }

            @Override
            public void onSurfaceTextureSizeChanged(SurfaceTexture surface, int width, int height) {

            }

            @Override
            public boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
                return false;
            }

            @Override
            public void onSurfaceTextureUpdated(SurfaceTexture surface) {

            }
        });
    }

}
