package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bfe implements defpackage.aqk {
    private final /* synthetic */ defpackage.aqk a;
    private final defpackage.bys b;
    private final defpackage.bys c;

    public bfe(defpackage.aqk aqkVar, defpackage.bff bffVar) {
        this.a = aqkVar;
        defpackage.bfd bfdVar = new defpackage.bfd(bffVar, 1);
        defpackage.lam lamVar = defpackage.byp.a;
        this.b = new defpackage.bvr(bfdVar, null);
        this.c = new defpackage.bvr(new defpackage.bfd(bffVar, 0), null);
    }

    @Override // defpackage.aqk
    public final float a(float f) {
        return this.a.a(f);
    }

    @Override // defpackage.aqk
    public final java.lang.Object e(defpackage.akv akvVar, defpackage.affg affgVar, defpackage.afdk afdkVar) {
        return this.a.e(akvVar, affgVar, afdkVar);
    }

    @Override // defpackage.aqk
    public final boolean g() {
        return ((java.lang.Boolean) this.c.a()).booleanValue();
    }

    @Override // defpackage.aqk
    public final boolean h() {
        return ((java.lang.Boolean) this.b.a()).booleanValue();
    }

    @Override // defpackage.aqk
    public final boolean i() {
        return this.a.i();
    }
}
