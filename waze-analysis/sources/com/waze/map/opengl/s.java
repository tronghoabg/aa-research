package com.waze.map.opengl;

import h.g.b.ar;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f29559a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final h.f f29560b = h.g.a(new com.waze.main_screen.ac.k(5));

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f29561c = {12329, 0, 12352, 4, 12351, 12430, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12344};

    public static final EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay) {
        h.g.b.x.f(egl10, "egl");
        h.g.b.x.f(eGLDisplay, "display");
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        egl10.eglChooseConfig(eGLDisplay, f29561c, eGLConfigArr, 1, iArr);
        if (iArr[0] != 0) {
            c().e("Specific config succeeded");
            return eGLConfigArr[0];
        }
        c().b("Failed to find a suitable EGL config. Required: RGBA 8888, Depth 16. May not render correctly on this device.");
        org.a.d.k.b bVarC = com.waze.web.r.k().a().c();
        int i2 = ar.f48106a;
        ((p) bVarC.a(new h.g.b.m(p.class), null, null)).a(new RuntimeException("eglChooseConfig failed (error: " + egl10.eglGetError() + ")"));
        return null;
    }

    public static final EGLConfig b(EGL10 egl10, EGLDisplay eGLDisplay) {
        h.g.b.x.f(egl10, "egl");
        h.g.b.x.f(eGLDisplay, "display");
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        egl10.eglChooseConfig(eGLDisplay, new int[]{12351, 12430, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12329, 0, 12352, 4, 12339, 1, 12344}, eGLConfigArr, 1, iArr);
        if (iArr[0] != 0) {
            c().e("PBuffer config succeeded");
            return eGLConfigArr[0];
        }
        c().b("Failed to choose EGLConfig for PBuffer");
        return null;
    }

    private static final com.waze.shared_infra.i.e c() {
        return (com.waze.shared_infra.i.e) f29560b.getValue();
    }
}
