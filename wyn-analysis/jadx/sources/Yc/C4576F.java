package yc;

import android.graphics.SurfaceTexture;
import android.util.Log;

/* renamed from: yc.F, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4576F implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4577G f48078a;

    public C4576F(C4577G c4577g) {
        this.f48078a = c4577g;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this.f48078a.f48095r) {
            try {
                if (this.f48078a.f48096s.booleanValue()) {
                    Log.w("VideoRenderer", "Frame available before processing other frames. dropping frames");
                }
                C4577G c4577g = this.f48078a;
                c4577g.f48096s = Boolean.TRUE;
                c4577g.f48095r.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
