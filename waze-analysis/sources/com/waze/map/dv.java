package com.waze.map;

import android.opengl.GLSurfaceView;
import android.util.Log;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class dv implements GLSurfaceView.EGLConfigChooser {

    /* renamed from: a, reason: collision with root package name */
    final int[] f28770a = {12329, 0, 12352, 4, 12351, 12430, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12338, 1, 12344};

    /* renamed from: b, reason: collision with root package name */
    final int[] f28771b = {12329, 0, 12352, 4, 12351, 12430, 12344};

    dv() {
    }

    @Override // android.opengl.GLSurfaceView.EGLConfigChooser
    public final EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        egl10.eglChooseConfig(eGLDisplay, this.f28770a, eGLConfigArr, 1, iArr);
        if (iArr[0] != 0) {
            Log.i("MyConfigChooser", "Specific config succeeded");
            return eGLConfigArr[0];
        }
        Log.i("MyConfigChooser", "Specific config failed, trying relaxed config");
        egl10.eglChooseConfig(eGLDisplay, this.f28771b, eGLConfigArr, 1, iArr);
        if (iArr[0] == 0) {
            return null;
        }
        Log.i("MyConfigChooser", "Relaxed config succeeded");
        return eGLConfigArr[0];
    }
}
