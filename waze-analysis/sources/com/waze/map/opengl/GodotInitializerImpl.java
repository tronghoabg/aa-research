package com.waze.map.opengl;

import android.opengl.EGL14;
import com.waze.config.ConfigValues;
import com.waze.jni.protos.PerformanceTracesConverterKt;
import com.waze.jni.protos.crash.PerformanceTraces;
import com.waze.strings.DisplayStrings;
import java.util.concurrent.Executor;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class GodotInitializerImpl implements g, com.waze.map.v {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.bk.e f29488a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.b f29489b;

    /* renamed from: c, reason: collision with root package name */
    private final p f29490c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.map.a f29491d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f29492e;

    /* renamed from: f, reason: collision with root package name */
    private final a f29493f;

    /* renamed from: g, reason: collision with root package name */
    private EGLSurface f29494g;

    /* renamed from: h, reason: collision with root package name */
    private final EGL10 f29495h;

    /* renamed from: i, reason: collision with root package name */
    private a f29496i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f29497j;

    /* renamed from: k, reason: collision with root package name */
    private final bn f29498k;

    /* renamed from: l, reason: collision with root package name */
    private final ch f29499l;
    private final com.waze.bk.c m;

    public GodotInitializerImpl(com.waze.bk.e eVar, b bVar, d dVar, com.waze.shared_infra.i.b bVar2, p pVar, j jVar, com.waze.map.a aVar, com.waze.shared_infra.i.e eVar2) {
        h.g.b.x.f(eVar, "renderThread");
        h.g.b.x.f(bVar, "eglProvider");
        h.g.b.x.f(dVar, "renderContextProvider");
        h.g.b.x.f(bVar2, "nonFatalErrorReporter");
        h.g.b.x.f(pVar, "externalDependencies");
        h.g.b.x.f(jVar, "config");
        h.g.b.x.f(aVar, "activeMapPerformanceTracesProvider");
        h.g.b.x.f(eVar2, "logger");
        this.f29488a = eVar;
        this.f29489b = bVar2;
        this.f29490c = pVar;
        this.f29491d = aVar;
        this.f29492e = eVar2;
        this.f29493f = dVar.b();
        this.f29495h = bVar.a();
        bn bnVarB = ck.b(false);
        this.f29498k = bnVarB;
        this.f29499l = ai.U(bnVarB);
        this.m = new k(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native boolean cleanupNTV();

    static final h.ab i(GodotInitializerImpl godotInitializerImpl, Throwable th) {
        h.g.b.x.f(th, "<unused var>");
        PerformanceTraces performanceTracesC = godotInitializerImpl.f29491d.c();
        if (performanceTracesC != null) {
            godotInitializerImpl.f29489b.b(PerformanceTracesConverterKt.toKotlinPerformanceTraces(performanceTracesC));
        }
        return h.ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native boolean initializeNTV();

    public static final /* synthetic */ void k(GodotInitializerImpl godotInitializerImpl) {
        a aVar = godotInitializerImpl.f29496i;
        if (aVar == null) {
            return;
        }
        EGL10 egl10 = godotInitializerImpl.f29495h;
        egl10.eglMakeCurrent(aVar.b(), EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
        EGLSurface eGLSurface = godotInitializerImpl.f29494g;
        if (eGLSurface != null) {
            egl10.eglDestroySurface(aVar.b(), eGLSurface);
        } else {
            godotInitializerImpl.r("Trying to destroy surface before it's initialized");
        }
        egl10.eglDestroyContext(aVar.b(), aVar.a());
        egl10.eglTerminate(aVar.b());
    }

    public static final /* synthetic */ void l(final GodotInitializerImpl godotInitializerImpl) {
        if (ConfigValues.CONFIG_VALUE_RENDERING_ANDROID_RENDER_THREAD_RESPONSIVENESS_MONITORING.b().booleanValue() && ConfigValues.CONFIG_VALUE_GENERAL_RECORD_ERROR_FEATURE_ENABLED.b().booleanValue()) {
            p pVar = godotInitializerImpl.f29490c;
            com.waze.bk.e eVar = godotInitializerImpl.f29488a;
            com.waze.bk.e eVar2 = eVar;
            kotlinx.coroutines.ab abVarA = eVar.a();
            h.o.c cVar = h.o.a.f48264a;
            Long lB = ConfigValues.CONFIG_VALUE_RENDERING_ANDROID_RENDER_THREAD_RESPONSIVENESS_CYCLE_DURATION_MS.b();
            h.g.b.x.e(lB, "getValue(...)");
            long jLongValue = lB.longValue();
            h.o.d dVar = h.o.d.f48272c;
            long j2 = h.o.c.j(jLongValue, dVar);
            Long lB2 = ConfigValues.CONFIG_VALUE_RENDERING_ANDROID_RENDER_THREAD_RESPONSIVENESS_INITIAL_DELAY_DURATION_MS.b();
            h.g.b.x.e(lB2, "getValue(...)");
            pVar.e(new com.waze.coroutines.c(eVar2, abVarA, j2, h.o.c.j(lB2.longValue(), dVar), (int) ConfigValues.CONFIG_VALUE_RENDERING_ANDROID_RENDER_THREAD_RESPONSIVENESS_BLOCKED_CYCLES_TO_REPORT.b().longValue()), new h.g.a.l() { // from class: com.waze.map.opengl.h
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return GodotInitializerImpl.i(this.f29548a, (Throwable) obj);
                }
            });
        }
    }

    static final void n(GodotInitializerImpl godotInitializerImpl) {
        godotInitializerImpl.f29488a.g(godotInitializerImpl.m);
    }

    public static final /* synthetic */ boolean o(GodotInitializerImpl godotInitializerImpl) {
        a aVar = godotInitializerImpl.f29493f;
        godotInitializerImpl.f29496i = aVar;
        EGL10 egl10 = godotInitializerImpl.f29495h;
        EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(0);
        h.g.b.x.e(eGLDisplayEglGetDisplay, "eglGetDisplay(...)");
        aVar.f(eGLDisplayEglGetDisplay);
        if (h.g.b.x.n(aVar.b(), EGL14.EGL_NO_DISPLAY)) {
            godotInitializerImpl.r("eglGetDisplay() failed: " + egl10.eglGetError());
            return false;
        }
        if (!egl10.eglInitialize(aVar.b(), new int[2])) {
            godotInitializerImpl.r("eglInitialize failed: " + egl10.eglGetError());
            return false;
        }
        int i2 = s.f29559a;
        EGLConfig eGLConfigB = s.b(egl10, aVar.b());
        if (eGLConfigB == null) {
            godotInitializerImpl.r("choosePbufferConfig() failed: " + egl10.eglGetError());
            return false;
        }
        EGLSurface eGLSurfaceEglCreatePbufferSurface = egl10.eglCreatePbufferSurface(aVar.b(), eGLConfigB, new int[]{12375, DisplayStrings.DS_TRIP_OVERVIEW_PREFERRED_ROUTE_IS_SLOWER_POPUP_BUTTON_TEXT, 12374, 240, 12344});
        h.g.b.x.e(eGLSurfaceEglCreatePbufferSurface, "eglCreatePbufferSurface(...)");
        godotInitializerImpl.f29494g = eGLSurfaceEglCreatePbufferSurface;
        EGLSurface eGLSurface = null;
        if (eGLSurfaceEglCreatePbufferSurface == null) {
            h.g.b.x.j("surface");
            eGLSurfaceEglCreatePbufferSurface = null;
        }
        if (h.g.b.x.n(eGLSurfaceEglCreatePbufferSurface, EGL10.EGL_NO_SURFACE)) {
            godotInitializerImpl.r("eglCreatePbufferSurface failed: " + egl10.eglGetError());
            return false;
        }
        EGLContext eGLContextEglCreateContext = egl10.eglCreateContext(aVar.b(), eGLConfigB, EGL10.EGL_NO_CONTEXT, new int[]{12440, 3, 12344});
        h.g.b.x.e(eGLContextEglCreateContext, "eglCreateContext(...)");
        aVar.e(eGLContextEglCreateContext);
        if (aVar.a() == EGL10.EGL_NO_CONTEXT) {
            godotInitializerImpl.r("eglCreateContext failed: " + egl10.eglGetError());
            EGLDisplay eGLDisplayB = aVar.b();
            EGLSurface eGLSurface2 = godotInitializerImpl.f29494g;
            if (eGLSurface2 == null) {
                h.g.b.x.j("surface");
            } else {
                eGLSurface = eGLSurface2;
            }
            egl10.eglDestroySurface(eGLDisplayB, eGLSurface);
            return false;
        }
        EGLDisplay eGLDisplayB2 = aVar.b();
        EGLSurface eGLSurface3 = godotInitializerImpl.f29494g;
        if (eGLSurface3 == null) {
            h.g.b.x.j("surface");
            eGLSurface3 = null;
        }
        EGLSurface eGLSurface4 = godotInitializerImpl.f29494g;
        if (eGLSurface4 == null) {
            h.g.b.x.j("surface");
            eGLSurface4 = null;
        }
        if (egl10.eglMakeCurrent(eGLDisplayB2, eGLSurface3, eGLSurface4, aVar.a())) {
            return true;
        }
        godotInitializerImpl.r("eglMakeCurrent failed: " + egl10.eglGetError());
        EGLDisplay eGLDisplayB3 = aVar.b();
        EGLSurface eGLSurface5 = godotInitializerImpl.f29494g;
        if (eGLSurface5 == null) {
            h.g.b.x.j("surface");
        } else {
            eGLSurface = eGLSurface5;
        }
        egl10.eglDestroySurface(eGLDisplayB3, eGLSurface);
        egl10.eglDestroyContext(aVar.b(), aVar.a());
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(String str) {
        this.f29489b.a(new Exception("GodotInitializer: ".concat(str)), null);
        this.f29492e.b(str);
    }

    @Override // com.waze.map.v
    public final Executor a() {
        return this.f29488a;
    }

    @Override // com.waze.map.v
    public final kotlinx.coroutines.ab b() {
        return this.f29488a.a();
    }

    @Override // com.waze.map.opengl.g
    public final com.waze.bk.e c() {
        return this.f29488a;
    }

    @Override // com.waze.map.opengl.g
    public final ch d() {
        return this.f29499l;
    }

    @Override // com.waze.map.opengl.g
    public final synchronized void e() {
        if (this.f29497j) {
            return;
        }
        this.f29497j = true;
        this.f29490c.d(new Runnable() { // from class: com.waze.map.opengl.i
            @Override // java.lang.Runnable
            public final void run() {
                GodotInitializerImpl.n(this.f29549a);
            }
        });
    }
}
