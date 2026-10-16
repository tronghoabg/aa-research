package com.waze.map.opengl;

import android.view.Surface;
import com.waze.gw.AaSpeedo;
import java.util.Arrays;
import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class x implements com.waze.bk.h {

    /* renamed from: a, reason: collision with root package name */
    private final f f29570a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.bk.a f29571b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.bk.h f29572c;

    /* renamed from: d, reason: collision with root package name */
    private final a f29573d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f29574e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f29575f;

    /* renamed from: g, reason: collision with root package name */
    private a f29576g;
    private boolean gwAaOverlay;

    /* renamed from: h, reason: collision with root package name */
    private final EGL10 f29577h;

    public /* synthetic */ x(f fVar, com.waze.bk.a aVar, com.waze.bk.h hVar, a aVar2, boolean z) {
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("WazeOpenGLRenderer");
        h.g.b.x.e(eVarD, "create(...)");
        h.g.b.x.f(fVar, "glVersion");
        h.g.b.x.f(aVar, "frameRateLimiter");
        h.g.b.x.f(hVar, "renderer");
        h.g.b.x.f(eVarD, "logger");
        this.f29570a = fVar;
        this.f29571b = aVar;
        this.f29572c = hVar;
        this.f29573d = aVar2;
        this.f29574e = z;
        this.f29575f = eVarD;
        EGL egl = EGLContext.getEGL();
        h.g.b.x.d(egl, "null cannot be cast to non-null type javax.microedition.khronos.egl.EGL10");
        this.f29577h = (EGL10) egl;
    }

    private final void a() {
        a aVar = this.f29576g;
        if (aVar == null) {
            return;
        }
        if (this.f29574e) {
            EGL10 egl10 = this.f29577h;
            if (egl10.eglMakeCurrent(aVar.b(), aVar.c(), aVar.c(), aVar.a())) {
                this.f29572c.i();
            } else {
                this.f29575f.b("eglMakeCurrent failed in destroy: " + egl10.eglGetError());
            }
        } else {
            this.f29572c.i();
        }
        aVar.d(this.f29577h);
        this.f29576g = null;
    }

    private final boolean b() {
        a aVar = this.f29576g;
        if (aVar == null) {
            return false;
        }
        EGL10 egl10 = this.f29577h;
        if (egl10.eglMakeCurrent(aVar.b(), aVar.c(), aVar.c(), aVar.a())) {
            return true;
        }
        com.waze.shared_infra.i.e eVar = this.f29575f;
        String str = String.format("eglMakeCurrent failed: %d", Arrays.copyOf(new Object[]{Integer.valueOf(egl10.eglGetError())}, 1));
        h.g.b.x.e(str, "format(...)");
        eVar.b(str);
        a();
        return false;
    }

    @Override // com.waze.bk.h
    public final void f() {
        this.f29572c.f();
    }

    @Override // com.waze.bk.h
    public final void g(int i2, int i3, int i4) {
        if (this.f29576g == null) {
            return;
        }
        this.f29572c.g(i2, i3, i4);
    }

    public final void gwEnableAaOverlay() {
        this.gwAaOverlay = true;
    }

    @Override // com.waze.bk.h
    public final void h(Surface surface, int i2, int i3, int i4) {
        h.g.b.x.f(surface, "surface");
        EGL10 egl10 = this.f29577h;
        EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            this.f29575f.b("eglGetDisplay() failed.");
            return;
        }
        a aVar = this.f29573d;
        if (aVar == null) {
            aVar = new a(false, 15);
        }
        if (aVar.b() == EGL10.EGL_NO_DISPLAY) {
            com.waze.shared_infra.i.e eVar = this.f29575f;
            eVar.g("initializing");
            if (!egl10.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
                eVar.b("eglInitialized failed");
                return;
            } else {
                h.g.b.x.c(eGLDisplayEglGetDisplay);
                aVar.f(eGLDisplayEglGetDisplay);
            }
        }
        if (!h.g.b.x.n(aVar.b(), eGLDisplayEglGetDisplay)) {
            this.f29575f.b("unsupported multiple displays");
            return;
        }
        int i5 = s.f29559a;
        h.g.b.x.c(eGLDisplayEglGetDisplay);
        EGLConfig eGLConfigA = s.a(egl10, eGLDisplayEglGetDisplay);
        if (eGLConfigA == null) {
            this.f29575f.b("chooseConfig() failed.");
            return;
        }
        EGLSurface eGLSurfaceEglCreateWindowSurface = egl10.eglCreateWindowSurface(eGLDisplayEglGetDisplay, eGLConfigA, surface, null);
        if (h.g.b.x.n(eGLSurfaceEglCreateWindowSurface, EGL10.EGL_NO_SURFACE)) {
            com.waze.shared_infra.i.e eVar2 = this.f29575f;
            String str = String.format("eglCreateWindowSurface failed: %d", Arrays.copyOf(new Object[]{Integer.valueOf(egl10.eglGetError())}, 1));
            h.g.b.x.e(str, "format(...)");
            eVar2.b(str);
            return;
        }
        int[] iArr = {12440, this.f29570a != f.f29545a ? 3 : 2, 12344};
        if (h.g.b.x.n(aVar.a(), EGL10.EGL_NO_CONTEXT)) {
            this.f29575f.g("creating context");
            EGLContext eGLContextEglCreateContext = egl10.eglCreateContext(eGLDisplayEglGetDisplay, eGLConfigA, EGL10.EGL_NO_CONTEXT, iArr);
            h.g.b.x.e(eGLContextEglCreateContext, "eglCreateContext(...)");
            aVar.e(eGLContextEglCreateContext);
        }
        EGLContext eGLContextA = aVar.a();
        if (eGLContextA == EGL10.EGL_NO_CONTEXT) {
            this.f29575f.b("eglCreateContext failed.");
            h.g.b.x.c(eGLSurfaceEglCreateWindowSurface);
            new a(eGLDisplayEglGetDisplay, eGLContextA, eGLSurfaceEglCreateWindowSurface, aVar.g()).d(egl10);
        } else if (egl10.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurfaceEglCreateWindowSurface, eGLSurfaceEglCreateWindowSurface, eGLContextA)) {
            h.g.b.x.c(eGLSurfaceEglCreateWindowSurface);
            this.f29576g = new a(eGLDisplayEglGetDisplay, eGLContextA, eGLSurfaceEglCreateWindowSurface, aVar.g());
            this.f29572c.h(surface, i2, i3, i4);
        } else {
            com.waze.shared_infra.i.e eVar3 = this.f29575f;
            String str2 = String.format("eglMakeCurrent failed: %d", Arrays.copyOf(new Object[]{Integer.valueOf(egl10.eglGetError())}, 1));
            h.g.b.x.e(str2, "format(...)");
            eVar3.b(str2);
            h.g.b.x.c(eGLSurfaceEglCreateWindowSurface);
            new a(eGLDisplayEglGetDisplay, eGLContextA, eGLSurfaceEglCreateWindowSurface, aVar.g()).d(egl10);
        }
    }

    @Override // com.waze.bk.h
    public final void i() {
        a();
    }

    @Override // com.waze.bk.h
    public final boolean l() {
        com.waze.bk.a aVar = this.f29571b;
        if (aVar.e() || !b()) {
            return false;
        }
        aVar.c();
        boolean zL = this.f29572c.l();
        if (!zL) {
            return zL;
        }
        if (!b()) {
            return true;
        }
        if (this.gwAaOverlay) {
            AaSpeedo.draw();
        }
        a aVar2 = this.f29576g;
        if (aVar2 == null || this.f29577h.eglSwapBuffers(aVar2.b(), aVar2.c())) {
            return true;
        }
        a();
        return true;
    }
}
