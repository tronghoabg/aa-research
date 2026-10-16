package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class jjo {
    public final defpackage.jjp a;
    public final android.view.SurfaceControl b;
    public final android.view.Surface c;

    public jjo(defpackage.jjp jjpVar, android.view.SurfaceControl surfaceControl, android.view.Surface surface) {
        jjpVar.getClass();
        this.a = jjpVar;
        this.b = surfaceControl;
        this.c = surface;
    }

    public final boolean a() {
        return this.b.isValid() && this.c.isValid();
    }
}
