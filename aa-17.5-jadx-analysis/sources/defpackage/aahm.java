package defpackage;

import android.opengl.GLSurfaceView;
import android.util.Log;
import android.view.Choreographer;

/* loaded from: classes3.dex */
public final class aahm extends aahn implements Choreographer.FrameCallback {
    private final Choreographer c;

    public aahm(Choreographer choreographer) {
        zkt.n(choreographer, "choreographer");
        this.c = choreographer;
    }

    @Override // defpackage.aahn
    protected final void a() {
        this.c.postFrameCallback(this);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        GLSurfaceView gLSurfaceView = this.b;
        if (gLSurfaceView != null) {
            String str = aahn.a;
            if (zrn.e(str, 2)) {
                Log.v(str, "doFrameNow()");
            }
            gLSurfaceView.requestRender();
            return;
        }
        String str2 = aahn.a;
        if (zrn.e(str2, 3)) {
            Log.d(str2, "doFrameNow() called without any GLSurfaceView!");
        }
    }
}
