package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cbf implements defpackage.cbe {
    final /* synthetic */ defpackage.cbe a;
    final /* synthetic */ defpackage.bzp b;

    public cbf(defpackage.cbe cbeVar, defpackage.bzp bzpVar) {
        this.a = cbeVar;
        this.b = bzpVar;
    }

    @Override // defpackage.cbe
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.cbe
    public final java.util.List b() {
        java.util.List listB = this.a.b();
        defpackage.bzp bzpVar = this.b;
        int i = bzpVar.q;
        return i < 0 ? listB : defpackage.afga.aS(defpackage.vm.d(bzpVar, i, java.lang.Integer.valueOf(bzpVar.k(i))), listB);
    }
}
