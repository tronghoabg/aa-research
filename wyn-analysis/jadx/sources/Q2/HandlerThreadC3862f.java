package q2;

import Q1.x;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import java.util.Locale;
import u6.AbstractC4256a;
import u6.C4261f;
import u6.RunnableC4258c;
import u6.v;

/* renamed from: q2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerThreadC3862f extends HandlerThread implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44027a;

    /* renamed from: b, reason: collision with root package name */
    public Handler f44028b;

    /* renamed from: c, reason: collision with root package name */
    public Error f44029c;

    /* renamed from: d, reason: collision with root package name */
    public RuntimeException f44030d;

    /* renamed from: e, reason: collision with root package name */
    public Object f44031e;

    /* renamed from: f, reason: collision with root package name */
    public Surface f44032f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HandlerThreadC3862f(String str, int i5) {
        super(str);
        this.f44027a = i5;
    }

    private final boolean a(Message message) {
        int i5 = message.what;
        try {
            if (i5 == 1) {
                try {
                    b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                    return true;
                } catch (Q1.e e7) {
                    Q1.k.l("PlaceholderSurface", "Failed to initialize placeholder surface", e7);
                    this.f44030d = new IllegalStateException(e7);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e10) {
                    Q1.k.l("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.f44029c = e10;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e11) {
                    Q1.k.l("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.f44030d = e11;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i5 == 2) {
                try {
                    c();
                    return true;
                } catch (Throwable th) {
                    try {
                        Q1.k.l("PlaceholderSurface", "Failed to release placeholder surface", th);
                    } finally {
                        quit();
                    }
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }

    public final void b(int i5) throws Q1.e, C4261f {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2;
        switch (this.f44027a) {
            case 0:
                ((Q1.d) this.f44031e).getClass();
                Q1.d dVar = (Q1.d) this.f44031e;
                dVar.getClass();
                EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
                Q1.k.d("eglGetDisplay failed", eGLDisplayEglGetDisplay != null);
                int[] iArr = new int[2];
                Q1.k.d("eglInitialize failed", EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1));
                dVar.f9669c = eGLDisplayEglGetDisplay;
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr2 = new int[1];
                boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, Q1.d.f9666g, 0, eGLConfigArr, 0, 1, iArr2, 0);
                boolean z2 = zEglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null;
                Object[] objArr = {Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]};
                int i10 = x.f9724a;
                Q1.k.d(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z2);
                EGLConfig eGLConfig = eGLConfigArr[0];
                EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(dVar.f9669c, eGLConfig, EGL14.EGL_NO_CONTEXT, i5 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
                Q1.k.d("eglCreateContext failed", eGLContextEglCreateContext != null);
                dVar.f9670d = eGLContextEglCreateContext;
                EGLDisplay eGLDisplay = dVar.f9669c;
                if (i5 == 1) {
                    eGLSurface = EGL14.EGL_NO_SURFACE;
                } else {
                    EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i5 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                    Q1.k.d("eglCreatePbufferSurface failed", eGLSurfaceEglCreatePbufferSurface != null);
                    eGLSurface = eGLSurfaceEglCreatePbufferSurface;
                }
                Q1.k.d("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContextEglCreateContext));
                dVar.f9671e = eGLSurface;
                int[] iArr3 = dVar.f9668b;
                GLES20.glGenTextures(1, iArr3, 0);
                StringBuilder sb2 = new StringBuilder();
                boolean z10 = false;
                while (true) {
                    int iGlGetError = GLES20.glGetError();
                    if (iGlGetError == 0) {
                        if (z10) {
                            throw new Q1.e(sb2.toString());
                        }
                        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr3[0]);
                        dVar.f9672f = surfaceTexture;
                        surfaceTexture.setOnFrameAvailableListener(dVar);
                        SurfaceTexture surfaceTexture2 = ((Q1.d) this.f44031e).f9672f;
                        surfaceTexture2.getClass();
                        this.f44032f = new C3863g(this, surfaceTexture2, i5 != 0);
                        return;
                    }
                    if (z10) {
                        sb2.append('\n');
                    }
                    String strGluErrorString = GLU.gluErrorString(iGlGetError);
                    if (strGluErrorString == null) {
                        strGluErrorString = "error code: 0x" + Integer.toHexString(iGlGetError);
                    }
                    sb2.append("glError: ");
                    sb2.append(strGluErrorString);
                    z10 = true;
                }
                break;
            default:
                ((RunnableC4258c) this.f44031e).getClass();
                RunnableC4258c runnableC4258c = (RunnableC4258c) this.f44031e;
                runnableC4258c.getClass();
                EGLDisplay eGLDisplayEglGetDisplay2 = EGL14.eglGetDisplay(0);
                AbstractC4256a.g("eglGetDisplay failed", eGLDisplayEglGetDisplay2 != null);
                int[] iArr4 = new int[2];
                AbstractC4256a.g("eglInitialize failed", EGL14.eglInitialize(eGLDisplayEglGetDisplay2, iArr4, 0, iArr4, 1));
                runnableC4258c.f46673c = eGLDisplayEglGetDisplay2;
                EGLConfig[] eGLConfigArr2 = new EGLConfig[1];
                int[] iArr5 = new int[1];
                boolean zEglChooseConfig2 = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay2, RunnableC4258c.f46670g, 0, eGLConfigArr2, 0, 1, iArr5, 0);
                boolean z11 = zEglChooseConfig2 && iArr5[0] > 0 && eGLConfigArr2[0] != null;
                Object[] objArr2 = {Boolean.valueOf(zEglChooseConfig2), Integer.valueOf(iArr5[0]), eGLConfigArr2[0]};
                int i11 = v.f46721a;
                AbstractC4256a.g(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr2), z11);
                EGLConfig eGLConfig2 = eGLConfigArr2[0];
                EGLContext eGLContextEglCreateContext2 = EGL14.eglCreateContext(runnableC4258c.f46673c, eGLConfig2, EGL14.EGL_NO_CONTEXT, i5 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
                AbstractC4256a.g("eglCreateContext failed", eGLContextEglCreateContext2 != null);
                runnableC4258c.f46674d = eGLContextEglCreateContext2;
                EGLDisplay eGLDisplay2 = runnableC4258c.f46673c;
                if (i5 == 1) {
                    eGLSurface2 = EGL14.EGL_NO_SURFACE;
                } else {
                    EGLSurface eGLSurfaceEglCreatePbufferSurface2 = EGL14.eglCreatePbufferSurface(eGLDisplay2, eGLConfig2, i5 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                    AbstractC4256a.g("eglCreatePbufferSurface failed", eGLSurfaceEglCreatePbufferSurface2 != null);
                    eGLSurface2 = eGLSurfaceEglCreatePbufferSurface2;
                }
                AbstractC4256a.g("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, eGLContextEglCreateContext2));
                runnableC4258c.f46675e = eGLSurface2;
                int[] iArr6 = runnableC4258c.f46672b;
                GLES20.glGenTextures(1, iArr6, 0);
                AbstractC4256a.f();
                SurfaceTexture surfaceTexture3 = new SurfaceTexture(iArr6[0]);
                runnableC4258c.f46676f = surfaceTexture3;
                surfaceTexture3.setOnFrameAvailableListener(runnableC4258c);
                SurfaceTexture surfaceTexture4 = ((RunnableC4258c) this.f44031e).f46676f;
                surfaceTexture4.getClass();
                this.f44032f = new v6.g(this, surfaceTexture4, i5 != 0);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        switch (this.f44027a) {
            case 0:
                ((Q1.d) this.f44031e).getClass();
                Q1.d dVar = (Q1.d) this.f44031e;
                dVar.f9667a.removeCallbacks(dVar);
                try {
                    SurfaceTexture surfaceTexture = dVar.f9672f;
                    if (surfaceTexture != null) {
                        surfaceTexture.release();
                        GLES20.glDeleteTextures(1, dVar.f9668b, 0);
                    }
                    return;
                } finally {
                    EGLDisplay eGLDisplay = dVar.f9669c;
                    if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                        EGLDisplay eGLDisplay2 = dVar.f9669c;
                        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                        EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                    }
                    EGLSurface eGLSurface2 = dVar.f9671e;
                    if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                        EGL14.eglDestroySurface(dVar.f9669c, dVar.f9671e);
                    }
                    EGLContext eGLContext = dVar.f9670d;
                    if (eGLContext != null) {
                        EGL14.eglDestroyContext(dVar.f9669c, eGLContext);
                    }
                    EGL14.eglReleaseThread();
                    EGLDisplay eGLDisplay3 = dVar.f9669c;
                    if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                        EGL14.eglTerminate(dVar.f9669c);
                    }
                    dVar.f9669c = null;
                    dVar.f9670d = null;
                    dVar.f9671e = null;
                    dVar.f9672f = null;
                }
            default:
                ((RunnableC4258c) this.f44031e).getClass();
                RunnableC4258c runnableC4258c = (RunnableC4258c) this.f44031e;
                runnableC4258c.f46671a.removeCallbacks(runnableC4258c);
                try {
                    SurfaceTexture surfaceTexture2 = runnableC4258c.f46676f;
                    if (surfaceTexture2 != null) {
                        surfaceTexture2.release();
                        GLES20.glDeleteTextures(1, runnableC4258c.f46672b, 0);
                    }
                    return;
                } finally {
                    EGLDisplay eGLDisplay4 = runnableC4258c.f46673c;
                    if (eGLDisplay4 != null && !eGLDisplay4.equals(EGL14.EGL_NO_DISPLAY)) {
                        EGLDisplay eGLDisplay5 = runnableC4258c.f46673c;
                        EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                        EGL14.eglMakeCurrent(eGLDisplay5, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
                    }
                    EGLSurface eGLSurface4 = runnableC4258c.f46675e;
                    if (eGLSurface4 != null && !eGLSurface4.equals(EGL14.EGL_NO_SURFACE)) {
                        EGL14.eglDestroySurface(runnableC4258c.f46673c, runnableC4258c.f46675e);
                    }
                    EGLContext eGLContext2 = runnableC4258c.f46674d;
                    if (eGLContext2 != null) {
                        EGL14.eglDestroyContext(runnableC4258c.f46673c, eGLContext2);
                    }
                    if (v.f46721a >= 19) {
                        EGL14.eglReleaseThread();
                    }
                    EGLDisplay eGLDisplay6 = runnableC4258c.f46673c;
                    if (eGLDisplay6 != null && !eGLDisplay6.equals(EGL14.EGL_NO_DISPLAY)) {
                        EGL14.eglTerminate(runnableC4258c.f46673c);
                    }
                    runnableC4258c.f46673c = null;
                    runnableC4258c.f46674d = null;
                    runnableC4258c.f46675e = null;
                    runnableC4258c.f46676f = null;
                }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f44027a) {
            case 0:
                return a(message);
            default:
                int i5 = message.what;
                try {
                    if (i5 == 1) {
                        try {
                            try {
                                try {
                                    b(message.arg1);
                                    synchronized (this) {
                                        notify();
                                    }
                                } catch (RuntimeException e7) {
                                    AbstractC4256a.p("PlaceholderSurface", "Failed to initialize placeholder surface", e7);
                                    this.f44030d = e7;
                                    synchronized (this) {
                                        notify();
                                    }
                                }
                            } catch (C4261f e10) {
                                AbstractC4256a.p("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                                this.f44030d = new IllegalStateException(e10);
                                synchronized (this) {
                                    notify();
                                }
                            }
                        } catch (Error e11) {
                            AbstractC4256a.p("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                            this.f44029c = e11;
                            synchronized (this) {
                                notify();
                            }
                        }
                    } else if (i5 == 2) {
                        try {
                            c();
                        } finally {
                            try {
                            } finally {
                            }
                        }
                    }
                    return true;
                } catch (Throwable th) {
                    synchronized (this) {
                        notify();
                        throw th;
                    }
                }
        }
    }
}
