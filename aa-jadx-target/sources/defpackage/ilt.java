package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ilt {
    public static final defpackage.yqm a = defpackage.yqm.c("EglHelper");
    private static android.view.SurfaceView h;
    public android.opengl.EGLDisplay b = android.opengl.EGL14.EGL_NO_DISPLAY;
    public android.opengl.EGLContext c = android.opengl.EGL14.EGL_NO_CONTEXT;
    public android.opengl.EGLSurface d = android.opengl.EGL14.EGL_NO_SURFACE;
    public android.content.Context e;
    public android.view.Surface f;
    public android.os.HandlerThread g;

    public ilt(android.content.Context context, android.view.Surface surface) {
        this.f = surface;
        this.e = context.getApplicationContext();
    }

    private static final void b(java.lang.String str) {
        int iEglGetError = android.opengl.EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        throw new java.lang.RuntimeException(str + ": EGL error: 0x" + java.lang.Integer.toHexString(iEglGetError));
    }

    public final void a(int i) {
        try {
            android.opengl.EGLDisplay eGLDisplayEglGetDisplay = android.opengl.EGL14.eglGetDisplay(0);
            this.b = eGLDisplayEglGetDisplay;
            if (j$.util.Objects.equals(eGLDisplayEglGetDisplay, android.opengl.EGL14.EGL_NO_DISPLAY)) {
                throw new java.lang.RuntimeException("unable to get EGL14 display");
            }
            int[] iArr = new int[2];
            if (!android.opengl.EGL14.eglInitialize(this.b, iArr, 0, iArr, 1)) {
                this.b = android.opengl.EGL14.EGL_NO_DISPLAY;
                throw new java.lang.RuntimeException("unable to initialize EGL14");
            }
            android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
            if (!android.opengl.EGL14.eglChooseConfig(this.b, new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, 1 != i ? 12610 : 12344, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                throw new java.lang.RuntimeException("unable to find RGB888+recordable ES2 EGL config");
            }
            this.c = android.opengl.EGL14.eglCreateContext(this.b, eGLConfigArr[0], android.opengl.EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344, 0, 0, 0}, 0);
            b("eglCreateContext");
            if (j$.util.Objects.equals(this.c, android.opengl.EGL14.EGL_NO_CONTEXT)) {
                throw new java.lang.RuntimeException("null context");
            }
            int[] iArr2 = {12344};
            if (i == 0) {
                this.d = android.opengl.EGL14.eglCreateWindowSurface(this.b, eGLConfigArr[0], this.f, iArr2, 0);
            } else {
                if (h == null) {
                    java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
                    android.view.WindowManager windowManager = (android.view.WindowManager) this.e.getSystemService("window");
                    android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
                    layoutParams.type = 2038;
                    layoutParams.height = -1;
                    layoutParams.width = -1;
                    layoutParams.flags = 408;
                    java.util.concurrent.Semaphore semaphore = new java.util.concurrent.Semaphore(0);
                    android.os.HandlerThread handlerThread = new android.os.HandlerThread("EglHelperHolder");
                    this.g = handlerThread;
                    handlerThread.start();
                    new defpackage.stq(this.g.getLooper()).post(new etx(this, atomicReference, semaphore, windowManager, layoutParams, 2));
                    try {
                        if (semaphore.tryAcquire(10000L, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                            h = (android.view.SurfaceView) atomicReference.get();
                        }
                    } catch (java.lang.InterruptedException unused) {
                    }
                    throw new java.lang.RuntimeException("Could not create backup holder");
                }
                this.d = android.opengl.EGL14.eglCreateWindowSurface(this.b, eGLConfigArr[0], ((android.view.SurfaceView) new defpackage.nub((java.lang.Object) null).i(h)).getHolder(), iArr2, 0);
            }
            b("eglCreateWindowSurface");
            if (j$.util.Objects.equals(this.d, android.opengl.EGL14.EGL_NO_SURFACE)) {
                throw new java.lang.RuntimeException("surface was null");
            }
        } catch (java.lang.RuntimeException e) {
            if (!j$.util.Objects.equals(this.c, android.opengl.EGL14.EGL_NO_CONTEXT)) {
                android.opengl.EGL14.eglDestroyContext(this.b, this.c);
            }
            if (!j$.util.Objects.equals(this.d, android.opengl.EGL14.EGL_NO_SURFACE)) {
                android.opengl.EGL14.eglTerminate(this.b);
            }
            android.opengl.EGL14.eglReleaseThread();
            throw e;
        }
    }
}
