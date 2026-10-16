package defpackage;

/* loaded from: classes.dex */
public final class mrr implements lhg {
    private boolean a;

    public static mrr a() {
        return (mrr) mki.a.i(mrr.class);
    }

    public final boolean b() {
        woy.aa(this.a, "called outside of lifetime start");
        return nsr.c().b().m() == nsv.e;
    }

    @Override // defpackage.lhg
    public final void c() {
        this.a = true;
    }

    @Override // defpackage.lhg
    public final void d() {
        this.a = false;
    }
}
