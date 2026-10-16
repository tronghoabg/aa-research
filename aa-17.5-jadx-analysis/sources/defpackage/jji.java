package defpackage;

import android.view.Surface;
import android.view.SurfaceControl;

/* loaded from: classes2.dex */
final class jji {
    public final jjj a;
    public final SurfaceControl b;
    public final Surface c;

    public jji(jjj jjjVar, SurfaceControl surfaceControl, Surface surface) {
        jjjVar.getClass();
        this.a = jjjVar;
        this.b = surfaceControl;
        this.c = surface;
    }

    public final boolean a() {
        return this.b.isValid() && this.c.isValid();
    }
}
