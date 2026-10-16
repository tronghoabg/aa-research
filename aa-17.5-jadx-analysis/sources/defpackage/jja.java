package defpackage;

import android.content.Context;
import android.view.SurfaceControlViewHost;
import android.view.SurfaceView;

/* loaded from: classes2.dex */
public final class jja extends SurfaceView {
    public static final yph a = yph.c("CAR.WM.ProjSurfaceView");
    public final int b;
    public final jjf c;
    public jjk d;
    public SurfaceControlViewHost.SurfacePackage e;

    public jja(Context context, int i, jjf jjfVar) {
        super(context);
        this.b = i;
        this.c = jjfVar;
        addOnAttachStateChangeListener(new hy(this, 2));
    }

    @Override // android.view.SurfaceView, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((ype) a.f()).w("onDetachedFromWindow cleanup for window %d", this.b);
        jjk jjkVar = this.d;
        if (jjkVar != null) {
            jjkVar.c();
        }
        this.d = null;
        SurfaceControlViewHost.SurfacePackage surfacePackage = this.e;
        if (surfacePackage != null) {
            surfacePackage.release();
        }
        this.e = null;
    }
}
