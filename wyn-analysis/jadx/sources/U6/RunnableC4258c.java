package u6;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

/* renamed from: u6.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC4258c implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f46670g = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: a, reason: collision with root package name */
    public final Handler f46671a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f46672b = new int[1];

    /* renamed from: c, reason: collision with root package name */
    public EGLDisplay f46673c;

    /* renamed from: d, reason: collision with root package name */
    public EGLContext f46674d;

    /* renamed from: e, reason: collision with root package name */
    public EGLSurface f46675e;

    /* renamed from: f, reason: collision with root package name */
    public SurfaceTexture f46676f;

    public RunnableC4258c(Handler handler) {
        this.f46671a = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f46671a.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f46676f;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
