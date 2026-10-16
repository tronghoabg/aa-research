package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class baz implements defpackage.bad {
    final /* synthetic */ defpackage.bby a;
    final /* synthetic */ boolean b;

    public baz(defpackage.bby bbyVar, boolean z) {
        this.a = bbyVar;
        this.b = z;
    }

    @Override // defpackage.bad
    public final float a() {
        defpackage.bby bbyVar = this.a;
        return defpackage.bca.a(bbyVar.w(), bbyVar.b());
    }

    @Override // defpackage.bad
    public final float b() {
        return defpackage.afw.T(this.a);
    }

    @Override // defpackage.bad
    public final int c() {
        defpackage.bby bbyVar = this.a;
        return bbyVar.w().a() + bbyVar.w().d;
    }

    @Override // defpackage.bad
    public final int d() {
        defpackage.bby bbyVar = this.a;
        return (int) (bbyVar.w().e == defpackage.apn.a ? bbyVar.w().d() & 4294967295L : bbyVar.w().d() >> 32);
    }

    @Override // defpackage.bad
    public final defpackage.ddp e() {
        boolean z = this.b;
        defpackage.bby bbyVar = this.a;
        return z ? new defpackage.ddp(bbyVar.b(), 1) : new defpackage.ddp(1, bbyVar.b());
    }

    @Override // defpackage.bad
    public final java.lang.Object f(int i, defpackage.afdk afdkVar) {
        java.lang.Object objZ = this.a.z(i, afdkVar);
        return objZ == defpackage.afdr.a ? objZ : defpackage.afbk.a;
    }
}
