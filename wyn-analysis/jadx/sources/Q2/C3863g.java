package q2;

import Q1.x;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;

/* renamed from: q2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3863g extends Surface {

    /* renamed from: d, reason: collision with root package name */
    public static int f44033d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f44034e;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f44035a;

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThreadC3862f f44036b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f44037c;

    public C3863g(HandlerThreadC3862f handlerThreadC3862f, SurfaceTexture surfaceTexture, boolean z2) {
        super(surfaceTexture);
        this.f44036b = handlerThreadC3862f;
        this.f44035a = z2;
    }

    public static synchronized boolean c(Context context) {
        String strEglQueryString;
        int i5;
        try {
            if (!f44034e) {
                int i10 = x.f9724a;
                if (i10 >= 24 && ((i10 >= 26 || !("samsung".equals(x.f9726c) || "XT1650".equals(x.f9727d))) && ((i10 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content")))) {
                    String strEglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    i5 = strEglQueryString2 != null && strEglQueryString2.contains("EGL_KHR_surfaceless_context") ? 1 : 2;
                } else {
                    i5 = 0;
                }
                f44033d = i5;
                f44034e = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f44033d != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f44036b) {
            try {
                if (!this.f44037c) {
                    HandlerThreadC3862f handlerThreadC3862f = this.f44036b;
                    handlerThreadC3862f.f44028b.getClass();
                    handlerThreadC3862f.f44028b.sendEmptyMessage(2);
                    this.f44037c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
