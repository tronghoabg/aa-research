package v6;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.view.Surface;
import q2.HandlerThreadC3862f;
import u6.AbstractC4256a;
import u6.RunnableC4258c;
import u6.v;

/* loaded from: classes3.dex */
public final class g extends Surface {

    /* renamed from: d, reason: collision with root package name */
    public static int f46885d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f46886e;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f46887a;

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThreadC3862f f46888b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f46889c;

    public g(HandlerThreadC3862f handlerThreadC3862f, SurfaceTexture surfaceTexture, boolean z2) {
        super(surfaceTexture);
        this.f46888b = handlerThreadC3862f;
        this.f46887a = z2;
    }

    public static int c(Context context) {
        String strEglQueryString;
        String strEglQueryString2;
        int i5 = v.f46721a;
        if (i5 >= 24 && ((i5 >= 26 || !("samsung".equals(v.f46723c) || "XT1650".equals(v.f46724d))) && ((i5 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content")))) {
            return (i5 >= 17 && (strEglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString2.contains("EGL_KHR_surfaceless_context")) ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean e(Context context) {
        try {
            if (!f46886e) {
                f46885d = c(context);
                f46886e = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f46885d != 0;
    }

    public static g f(Context context, boolean z2) {
        boolean z10 = false;
        AbstractC4256a.i(!z2 || e(context));
        HandlerThreadC3862f handlerThreadC3862f = new HandlerThreadC3862f("ExoPlayer:PlaceholderSurface", 1);
        int i5 = z2 ? f46885d : 0;
        handlerThreadC3862f.start();
        Handler handler = new Handler(handlerThreadC3862f.getLooper(), handlerThreadC3862f);
        handlerThreadC3862f.f44028b = handler;
        handlerThreadC3862f.f44031e = new RunnableC4258c(handler);
        synchronized (handlerThreadC3862f) {
            handlerThreadC3862f.f44028b.obtainMessage(1, i5, 0).sendToTarget();
            while (((g) handlerThreadC3862f.f44032f) == null && handlerThreadC3862f.f44030d == null && handlerThreadC3862f.f44029c == null) {
                try {
                    handlerThreadC3862f.wait();
                } catch (InterruptedException unused) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = handlerThreadC3862f.f44030d;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = handlerThreadC3862f.f44029c;
        if (error != null) {
            throw error;
        }
        g gVar = (g) handlerThreadC3862f.f44032f;
        gVar.getClass();
        return gVar;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f46888b) {
            try {
                if (!this.f46889c) {
                    HandlerThreadC3862f handlerThreadC3862f = this.f46888b;
                    handlerThreadC3862f.f44028b.getClass();
                    handlerThreadC3862f.f44028b.sendEmptyMessage(2);
                    this.f46889c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
