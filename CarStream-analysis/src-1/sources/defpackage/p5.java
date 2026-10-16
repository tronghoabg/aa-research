package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.view.Surface;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class p5 {
    public final EGLDisplay a;
    public final EGLContext b;
    public EGLSurface c;
    public Surface d;
    public final EGLConfig e;

    public p5(Surface surface) {
        this.a = EGL14.EGL_NO_DISPLAY;
        this.b = EGL14.EGL_NO_CONTEXT;
        this.c = EGL14.EGL_NO_SURFACE;
        surface.getClass();
        this.d = surface;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.a = eGLDisplayEglGetDisplay;
        int[] iArr = new int[2];
        EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1);
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        EGL14.eglChooseConfig(this.a, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0);
        EGLConfig eGLConfig = eGLConfigArr[0];
        this.e = eGLConfig;
        this.b = EGL14.eglCreateContext(this.a, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        this.c = EGL14.eglCreateWindowSurface(this.a, eGLConfigArr[0], this.d, new int[]{12344}, 0);
    }

    public final void a(Surface surface) {
        surface.getClass();
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(this.a, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        EGLSurface eGLSurface2 = this.c;
        if (eGLSurface2 != EGL14.EGL_NO_SURFACE) {
            EGL14.eglDestroySurface(this.a, eGLSurface2);
        }
        Surface surface2 = this.d;
        if (surface2 != null) {
            surface2.release();
        }
        this.d = surface;
        EGLConfig eGLConfig = this.e;
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.a, eGLConfig, surface, new int[]{12344}, 0);
        this.c = eGLSurfaceEglCreateWindowSurface;
        EGL14.eglMakeCurrent(this.a, eGLSurfaceEglCreateWindowSurface, eGLSurfaceEglCreateWindowSurface, this.b);
    }

    public final void b(long j) {
        EGLExt.eglPresentationTimeANDROID(this.a, this.c, j);
    }

    public final void c() {
        EGL14.eglSwapBuffers(this.a, this.c);
    }
}
