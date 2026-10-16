package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mrv implements defpackage.lhn {
    private boolean a;

    public static defpackage.mrv a() {
        return (defpackage.mrv) defpackage.mkp.a.i(defpackage.mrv.class);
    }

    public final boolean b() {
        defpackage.ysr.bk(this.a, "called outside of lifetime start");
        return defpackage.nte.c().b().m() == defpackage.nti.e;
    }

    @Override // defpackage.lhn
    public final void d() {
        this.a = false;
    }

    @Override // defpackage.lhn
    public final void eQ() {
        this.a = true;
    }
}
