package defpackage;

/* loaded from: classes.dex */
final class adrw {
    private final aeaa a;
    private final advc b = adqs.l();
    private final advc c = adqs.l();
    private final advc d = adqs.l();
    private volatile long e;

    public adrw(aeaa aeaaVar) {
        this.a = aeaaVar;
    }

    public final void a(boolean z) {
        if (z) {
            this.c.a();
        } else {
            this.d.a();
        }
    }

    public final void b() {
        this.b.a();
        this.e = this.a.a();
    }
}
