package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class jgp implements defpackage.jgn {
    final /* synthetic */ defpackage.jgq a;
    private final defpackage.zbd b;
    private final java.util.Random c = new java.util.Random();
    private final float d;

    public jgp(defpackage.jgq jgqVar, defpackage.zbd zbdVar, float f) {
        this.a = jgqVar;
        this.b = zbdVar;
        this.d = f;
    }

    @Override // defpackage.jgn
    public final void a(j$.time.Duration duration) {
        if (((double) this.c.nextFloat()) * 100.0d < this.d) {
            defpackage.jgq jgqVar = this.a;
            jgqVar.c.f(defpackage.zbe.PROJECTION_WINDOW_MANAGER, this.b, duration.toMillis());
        }
    }
}
