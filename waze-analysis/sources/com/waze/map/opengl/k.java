package com.waze.map.opengl;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class k implements com.waze.bk.c {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ GodotInitializerImpl f29550a;

    k(GodotInitializerImpl godotInitializerImpl) {
        this.f29550a = godotInitializerImpl;
    }

    @Override // com.waze.bk.c
    public final void a() {
        GodotInitializerImpl godotInitializerImpl = this.f29550a;
        godotInitializerImpl.cleanupNTV();
        GodotInitializerImpl.k(godotInitializerImpl);
    }

    @Override // com.waze.bk.c
    public final void b() {
        GodotInitializerImpl godotInitializerImpl = this.f29550a;
        GodotInitializerImpl.l(godotInitializerImpl);
        if (!GodotInitializerImpl.o(godotInitializerImpl)) {
            godotInitializerImpl.r("GodotInitializer::initializeEglContext failed");
        } else if (godotInitializerImpl.initializeNTV()) {
            godotInitializerImpl.f29498k.e(true);
        } else {
            godotInitializerImpl.r("GodotInitializer::initializeNTV failed");
        }
    }

    @Override // com.waze.bk.c
    public final void c() {
        GodotInitializerImpl godotInitializerImpl = this.f29550a;
        godotInitializerImpl.f29495h.eglMakeCurrent(godotInitializerImpl.f29493f.b(), EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
    }

    @Override // com.waze.bk.c
    public final void d() {
        GodotInitializerImpl godotInitializerImpl = this.f29550a;
        EGL10 egl10 = godotInitializerImpl.f29495h;
        EGLDisplay eGLDisplayB = godotInitializerImpl.f29493f.b();
        EGLSurface eGLSurface = godotInitializerImpl.f29494g;
        EGLSurface eGLSurface2 = null;
        if (eGLSurface == null) {
            h.g.b.x.j("surface");
            eGLSurface = null;
        }
        EGLSurface eGLSurface3 = godotInitializerImpl.f29494g;
        if (eGLSurface3 == null) {
            h.g.b.x.j("surface");
        } else {
            eGLSurface2 = eGLSurface3;
        }
        if (egl10.eglMakeCurrent(eGLDisplayB, eGLSurface, eGLSurface2, godotInitializerImpl.f29493f.a())) {
            return;
        }
        godotInitializerImpl.r("eglMakeCurrent failed: " + godotInitializerImpl.f29495h.eglGetError());
    }
}
