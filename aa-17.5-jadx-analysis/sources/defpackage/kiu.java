package defpackage;

/* loaded from: classes.dex */
public final class kiu extends eqj {
    private final kit a;

    public kiu() {
        super(null);
        this.a = new kit(this);
    }

    public static kiu a() {
        return (kiu) mki.a.b(kiu.class, new lfu(1));
    }

    @Override // defpackage.eqj
    protected final void c() {
        ept lifecycle = ((lhm) mki.a.i(lhm.class)).getLifecycle();
        kit kitVar = this.a;
        lifecycle.c(kitVar);
        yph yphVar = kio.a;
        ((kio) mki.a.i(kio.class)).v(kitVar);
    }

    @Override // defpackage.eqj
    protected final void d() {
        ept lifecycle = lbh.d().getLifecycle();
        kit kitVar = this.a;
        lifecycle.d(kitVar);
        kio.b().w(kitVar);
    }
}
