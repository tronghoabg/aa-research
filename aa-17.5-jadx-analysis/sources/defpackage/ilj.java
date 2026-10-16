package defpackage;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.HandlerThread;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.WindowManager;
import j$.util.Objects;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class ilj {
    public static final yph a = yph.c("EglHelper");
    private static SurfaceView h;
    public EGLDisplay b = EGL14.EGL_NO_DISPLAY;
    public EGLContext c = EGL14.EGL_NO_CONTEXT;
    public EGLSurface d = EGL14.EGL_NO_SURFACE;
    public Context e;
    public Surface f;
    public HandlerThread g;

    public ilj(Context context, Surface surface) {
        this.f = surface;
        this.e = context.getApplicationContext();
    }

    private static final void b(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        throw new RuntimeException(str + ": EGL error: 0x" + Integer.toHexString(iEglGetError));
    }

    public final void a(int i) {
        try {
            EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
            this.b = eGLDisplayEglGetDisplay;
            if (Objects.equals(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
                throw new RuntimeException("unable to get EGL14 display");
            }
            int[] iArr = new int[2];
            if (!EGL14.eglInitialize(this.b, iArr, 0, iArr, 1)) {
                this.b = EGL14.EGL_NO_DISPLAY;
                throw new RuntimeException("unable to initialize EGL14");
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!EGL14.eglChooseConfig(this.b, new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, 1 != i ? 12610 : 12344, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                throw new RuntimeException("unable to find RGB888+recordable ES2 EGL config");
            }
            this.c = EGL14.eglCreateContext(this.b, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344, 0, 0, 0}, 0);
            b("eglCreateContext");
            if (Objects.equals(this.c, EGL14.EGL_NO_CONTEXT)) {
                throw new RuntimeException("null context");
            }
            int[] iArr2 = {12344};
            if (i == 0) {
                this.d = EGL14.eglCreateWindowSurface(this.b, eGLConfigArr[0], this.f, iArr2, 0);
            } else {
                if (h == null) {
                    AtomicReference atomicReference = new AtomicReference();
                    WindowManager windowManager = (WindowManager) this.e.getSystemService("window");
                    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                    layoutParams.type = 2038;
                    layoutParams.height = -1;
                    layoutParams.width = -1;
                    layoutParams.flags = 408;
                    Semaphore semaphore = new Semaphore(0);
                    HandlerThread handlerThread = new HandlerThread("EglHelperHolder");
                    this.g = handlerThread;
                    handlerThread.start();
                    new sss(this.g.getLooper()).post(new etr(this, atomicReference, semaphore, windowManager, layoutParams, 2));
                    try {
                        if (semaphore.tryAcquire(10000L, TimeUnit.MILLISECONDS)) {
                            h = (SurfaceView) atomicReference.get();
                        }
                    } catch (InterruptedException unused) {
                    }
                    throw new RuntimeException("Could not create backup holder");
                }
                this.d = EGL14.eglCreateWindowSurface(this.b, eGLConfigArr[0], ((SurfaceView) new ntn((Object) null).i(h)).getHolder(), iArr2, 0);
            }
            b("eglCreateWindowSurface");
            if (Objects.equals(this.d, EGL14.EGL_NO_SURFACE)) {
                throw new RuntimeException("surface was null");
            }
        } catch (RuntimeException e) {
            if (!Objects.equals(this.c, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext(this.b, this.c);
            }
            if (!Objects.equals(this.d, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglTerminate(this.b);
            }
            EGL14.eglReleaseThread();
            throw e;
        }
    }
}
