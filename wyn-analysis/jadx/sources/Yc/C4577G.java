package yc;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import com.unity3d.services.UnityAdsConstants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import od.A0;

/* renamed from: yc.G, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4577G {

    /* renamed from: d, reason: collision with root package name */
    public int f48082d;

    /* renamed from: j, reason: collision with root package name */
    public EGLDisplay f48088j;
    public EGLContext k;

    /* renamed from: l, reason: collision with root package name */
    public EGLSurface f48089l;

    /* renamed from: m, reason: collision with root package name */
    public final H4.a f48090m;

    /* renamed from: n, reason: collision with root package name */
    public final Surface f48091n;

    /* renamed from: o, reason: collision with root package name */
    public SurfaceTexture f48092o;

    /* renamed from: p, reason: collision with root package name */
    public Surface f48093p;

    /* renamed from: q, reason: collision with root package name */
    public HandlerThread f48094q;

    /* renamed from: t, reason: collision with root package name */
    public final int f48097t;

    /* renamed from: u, reason: collision with root package name */
    public final int f48098u;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f48079a = new int[1];

    /* renamed from: b, reason: collision with root package name */
    public final float[] f48080b = {-1.0f, -1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -1.0f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f, 1.0f, -1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};

    /* renamed from: c, reason: collision with root package name */
    public final int[] f48081c = {2, 1, 0, 0, 3, 2};

    /* renamed from: e, reason: collision with root package name */
    public int f48083e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f48084f = new int[2];

    /* renamed from: g, reason: collision with root package name */
    public int f48085g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f48086h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f48087i = 0;

    /* renamed from: r, reason: collision with root package name */
    public final Object f48095r = new Object();

    /* renamed from: s, reason: collision with root package name */
    public Boolean f48096s = Boolean.FALSE;

    /* renamed from: v, reason: collision with root package name */
    public int f48099v = 0;

    /* renamed from: w, reason: collision with root package name */
    public final Object f48100w = new Object();

    public C4577G(Surface surface, int i5, int i10, A0 a02) {
        this.f48091n = surface;
        this.f48098u = i10;
        this.f48097t = i5;
        Log.d("VideoRenderer", "Starting OpenGL Thread");
        H4.a aVar = new H4.a(4, (Object) this, false);
        this.f48090m = aVar;
        aVar.setUncaughtExceptionHandler(a02);
        this.f48090m.start();
        Log.d("VideoRenderer", "VideoRenderer setup complete");
    }

    public final void a() {
        synchronized (this.f48100w) {
            try {
                EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
                this.f48088j = eGLDisplayEglGetDisplay;
                if (eGLDisplayEglGetDisplay == EGL14.EGL_NO_DISPLAY) {
                    throw new RuntimeException("eglDisplay == EGL14.EGL_NO_DISPLAY: " + GLUtils.getEGLErrorString(EGL14.eglGetError()));
                }
                int[] iArr = new int[2];
                if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
                    throw new RuntimeException("eglInitialize(): " + GLUtils.getEGLErrorString(EGL14.eglGetError()));
                }
                if (!EGL14.eglQueryString(this.f48088j, 12373).contains("EGL_ANDROID_presentation_time")) {
                    throw new RuntimeException("cannot configure OpenGL. missing EGL_ANDROID_presentation_time");
                }
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (!EGL14.eglChooseConfig(this.f48088j, AbstractC4575E.f48077a >= 26 ? new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344} : new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                    throw new RuntimeException(GLUtils.getEGLErrorString(EGL14.eglGetError()));
                }
                int iEglGetError = EGL14.eglGetError();
                if (iEglGetError != 12288) {
                    throw new RuntimeException(GLUtils.getEGLErrorString(iEglGetError));
                }
                this.k = EGL14.eglCreateContext(this.f48088j, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                int iEglGetError2 = EGL14.eglGetError();
                if (iEglGetError2 != 12288) {
                    throw new RuntimeException(GLUtils.getEGLErrorString(iEglGetError2));
                }
                this.f48089l = EGL14.eglCreateWindowSurface(this.f48088j, eGLConfigArr[0], this.f48091n, new int[]{12344}, 0);
                int iEglGetError3 = EGL14.eglGetError();
                if (iEglGetError3 != 12288) {
                    throw new RuntimeException(GLUtils.getEGLErrorString(iEglGetError3));
                }
                EGLDisplay eGLDisplay = this.f48088j;
                EGLSurface eGLSurface = this.f48089l;
                if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.k)) {
                    throw new RuntimeException("eglMakeCurrent(): " + GLUtils.getEGLErrorString(EGL14.eglGetError()));
                }
                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.f48080b.length * 4);
                byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
                byteBufferAllocateDirect.asFloatBuffer().put(this.f48080b);
                byteBufferAllocateDirect.asFloatBuffer().position(0);
                ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(this.f48081c.length * 4);
                byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
                byteBufferAllocateDirect2.asIntBuffer().put(this.f48081c);
                byteBufferAllocateDirect2.position(0);
                int iGlCreateShader = GLES20.glCreateShader(35633);
                GLES20.glShaderSource(iGlCreateShader, "  precision highp float;\n            attribute vec3 vertexPosition;\n            attribute vec2 uvs;\n            varying vec2 varUvs;\n            uniform mat4 texMatrix;\n            uniform mat4 mvp;\n\n            void main()\n            {\n                varUvs = (texMatrix * vec4(uvs.x, uvs.y, 0, 1.0)).xy;\n                gl_Position = mvp * vec4(vertexPosition, 1.0);\n            }");
                GLES20.glCompileShader(iGlCreateShader);
                int iGlCreateShader2 = GLES20.glCreateShader(35632);
                GLES20.glShaderSource(iGlCreateShader2, " #extension GL_OES_EGL_image_external : require\n            precision mediump float;\n\n            varying vec2 varUvs;\n            uniform samplerExternalOES texSampler;\n\n            void main()\n            {\n                vec4 c = texture2D(texSampler, varUvs);\n                gl_FragColor = vec4(c.r, c.g, c.b, c.a);\n            }");
                GLES20.glCompileShader(iGlCreateShader2);
                int iGlCreateProgram = GLES20.glCreateProgram();
                this.f48082d = iGlCreateProgram;
                GLES20.glAttachShader(iGlCreateProgram, iGlCreateShader);
                GLES20.glAttachShader(this.f48082d, iGlCreateShader2);
                GLES20.glLinkProgram(this.f48082d);
                GLES20.glDeleteShader(iGlCreateShader);
                GLES20.glDeleteShader(iGlCreateShader2);
                this.f48083e = GLES20.glGetAttribLocation(this.f48082d, "vertexPosition");
                this.f48085g = GLES20.glGetAttribLocation(this.f48082d, "uvs");
                this.f48086h = GLES20.glGetUniformLocation(this.f48082d, "texMatrix");
                this.f48087i = GLES20.glGetUniformLocation(this.f48082d, "mvp");
                GLES20.glGenBuffers(2, this.f48084f, 0);
                GLES20.glBindBuffer(34962, this.f48084f[0]);
                GLES20.glBufferData(34962, this.f48080b.length * 4, byteBufferAllocateDirect, 35048);
                GLES20.glBindBuffer(34963, this.f48084f[1]);
                GLES20.glBufferData(34963, this.f48081c.length * 4, byteBufferAllocateDirect2, 35048);
                GLES20.glGenTextures(1, this.f48079a, 0);
                GLES20.glBindTexture(36197, this.f48079a[0]);
                SurfaceTexture surfaceTexture = new SurfaceTexture(this.f48079a[0]);
                this.f48092o = surfaceTexture;
                surfaceTexture.setDefaultBufferSize(this.f48097t, this.f48098u);
                HandlerThread handlerThread = new HandlerThread("FrameHandlerThread");
                this.f48094q = handlerThread;
                handlerThread.start();
                this.f48093p = new Surface(this.f48092o);
                this.f48092o.setOnFrameAvailableListener(new C4576F(this), new Handler(this.f48094q.getLooper()));
                this.f48100w.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(float[] fArr, int i5, int i10) {
        GLES20.glClear(16640);
        GLES20.glClearColor(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        GLES20.glViewport(0, 0, i5, i10);
        GLES20.glUseProgram(this.f48082d);
        GLES20.glUniformMatrix4fv(this.f48086h, 1, false, fArr, 0);
        int i11 = this.f48087i;
        float[] fArr2 = new float[16];
        Matrix.setIdentityM(fArr2, 0);
        Matrix.rotateM(fArr2, 0, this.f48099v, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        GLES20.glUniformMatrix4fv(i11, 1, false, fArr2, 0);
        int[] iArr = this.f48084f;
        GLES20.glBindBuffer(34962, iArr[0]);
        GLES20.glBindBuffer(34963, iArr[1]);
        GLES20.glEnableVertexAttribArray(this.f48083e);
        GLES20.glVertexAttribPointer(this.f48083e, 3, 5126, false, 20, 0);
        GLES20.glEnableVertexAttribArray(this.f48085g);
        GLES20.glVertexAttribPointer(this.f48085g, 2, 5126, false, 20, 12);
        GLES20.glDrawElements(4, 6, 5125, 0);
        EGLExt.eglPresentationTimeANDROID(this.f48088j, this.f48089l, SystemClock.uptimeMillis() * 1000000);
        if (EGL14.eglSwapBuffers(this.f48088j, this.f48089l)) {
            return;
        }
        Log.w("VideoRenderer", "eglSwapBuffers() " + GLUtils.getEGLErrorString(EGL14.eglGetError()));
    }
}
