package com.coo.simple.camera.activity;

import android.opengl.GLSurfaceView;
import android.os.Bundle;

import com.coo.simple.camera.R;
import com.coo.simple.camera.base.CameraActivity;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/**
 * Created by jensen on 7/5/16.
 */
public class GLSurfaceActivity extends CameraActivity {

    private CameraRenderer cameraRenderer;
    private GLSurfaceView gsvContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glsurface);
        cameraRenderer = new CameraRenderer();
        gsvContent = (GLSurfaceView) findViewById(R.id.gsvContent);
        gsvContent.setRenderer(cameraRenderer);
    }


    class CameraRenderer implements GLSurfaceView.Renderer {
        @Override
        public void onSurfaceCreated(GL10 gl, EGLConfig config) {

        }

        @Override
        public void onSurfaceChanged(GL10 gl, int width, int height) {

        }

        @Override
        public void onDrawFrame(GL10 gl) {

        }
    }
}
