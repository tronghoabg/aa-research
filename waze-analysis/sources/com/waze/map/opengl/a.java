package com.waze.map.opengl;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private EGLDisplay f29517a;

    /* renamed from: b, reason: collision with root package name */
    private EGLContext f29518b;

    /* renamed from: c, reason: collision with root package name */
    private final EGLSurface f29519c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f29520d;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ a(boolean z, int i2) {
        EGLDisplay eGLDisplay;
        EGLContext eGLContext;
        EGLSurface eGLSurface = null;
        if ((i2 & 1) != 0) {
            eGLDisplay = EGL10.EGL_NO_DISPLAY;
            h.g.b.x.e(eGLDisplay, "EGL_NO_DISPLAY");
        } else {
            eGLDisplay = null;
        }
        if ((i2 & 2) != 0) {
            eGLContext = EGL10.EGL_NO_CONTEXT;
            h.g.b.x.e(eGLContext, "EGL_NO_CONTEXT");
        } else {
            eGLContext = null;
        }
        if ((i2 & 4) != 0) {
            eGLSurface = EGL10.EGL_NO_SURFACE;
            h.g.b.x.e(eGLSurface, "EGL_NO_SURFACE");
        }
        this(eGLDisplay, eGLContext, eGLSurface, z & ((i2 & 8) == 0));
    }

    public final EGLContext a() {
        return this.f29518b;
    }

    public final EGLDisplay b() {
        return this.f29517a;
    }

    public final EGLSurface c() {
        return this.f29519c;
    }

    public final void d(EGL10 egl10) {
        h.g.b.x.f(egl10, "egl");
        egl10.eglMakeCurrent(this.f29517a, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
        EGLSurface eGLSurface = this.f29519c;
        if (!h.g.b.x.n(eGLSurface, EGL10.EGL_NO_SURFACE)) {
            egl10.eglDestroySurface(this.f29517a, eGLSurface);
        }
        if (this.f29520d) {
            return;
        }
        if (!h.g.b.x.n(this.f29518b, EGL10.EGL_NO_CONTEXT)) {
            egl10.eglDestroyContext(this.f29517a, this.f29518b);
        }
        if (!h.g.b.x.n(this.f29517a, EGL10.EGL_NO_DISPLAY)) {
            egl10.eglTerminate(this.f29517a);
        }
        EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
        h.g.b.x.e(eGLContext, "EGL_NO_CONTEXT");
        this.f29518b = eGLContext;
        EGLDisplay eGLDisplay = EGL10.EGL_NO_DISPLAY;
        h.g.b.x.e(eGLDisplay, "EGL_NO_DISPLAY");
        this.f29517a = eGLDisplay;
    }

    public final void e(EGLContext eGLContext) {
        h.g.b.x.f(eGLContext, "<set-?>");
        this.f29518b = eGLContext;
    }

    public final void f(EGLDisplay eGLDisplay) {
        h.g.b.x.f(eGLDisplay, "<set-?>");
        this.f29517a = eGLDisplay;
    }

    public final boolean g() {
        return this.f29520d;
    }

    public a(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, boolean z) {
        h.g.b.x.f(eGLDisplay, "display");
        h.g.b.x.f(eGLContext, "context");
        h.g.b.x.f(eGLSurface, "surface");
        this.f29517a = eGLDisplay;
        this.f29518b = eGLContext;
        this.f29519c = eGLSurface;
        this.f29520d = z;
    }

    public a() {
        this(false, 15);
    }
}
