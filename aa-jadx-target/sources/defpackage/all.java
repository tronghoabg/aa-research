package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class all implements defpackage.aqk {
    public static final defpackage.cdz g = new defpackage.cdz(new defpackage.abw(2), new defpackage.ajg(6));
    public float c;
    private final defpackage.bys i;
    private final defpackage.bys j;
    private final defpackage.byj k;
    public final defpackage.byj d = new androidx.compose.runtime.ParcelableSnapshotMutableIntState(0);
    public final defpackage.byj e = new androidx.compose.runtime.ParcelableSnapshotMutableIntState(0);
    public final defpackage.bwx a = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.bxv.c);
    public final defpackage.ask b = new defpackage.asl();
    public final defpackage.byj f = new androidx.compose.runtime.ParcelableSnapshotMutableIntState(Integer.MAX_VALUE);
    private final defpackage.aqk h = new defpackage.ano(new defpackage.act(this, 11));

    public all(int i) {
        this.k = new androidx.compose.runtime.ParcelableSnapshotMutableIntState(i);
        defpackage.nz nzVar = new defpackage.nz(this, 20);
        defpackage.lam lamVar = defpackage.byp.a;
        this.i = new defpackage.bvr(nzVar, null);
        this.j = new defpackage.bvr(new defpackage.aln(this, 1), null);
    }

    @Override // defpackage.aqk
    public final float a(float f) {
        return this.h.a(f);
    }

    public final int b() {
        return this.f.e();
    }

    public final int c() {
        return this.k.e();
    }

    public final int d() {
        return this.d.e();
    }

    @Override // defpackage.aqk
    public final java.lang.Object e(defpackage.akv akvVar, defpackage.affg affgVar, defpackage.afdk afdkVar) {
        java.lang.Object objE = this.h.e(akvVar, affgVar, afdkVar);
        return objE == defpackage.afdr.a ? objE : defpackage.afbk.a;
    }

    public final void f(int i) {
        this.k.h(i);
    }

    @Override // defpackage.aqk
    public final boolean g() {
        return ((java.lang.Boolean) this.j.a()).booleanValue();
    }

    @Override // defpackage.aqk
    public final boolean h() {
        return ((java.lang.Boolean) this.i.a()).booleanValue();
    }

    @Override // defpackage.aqk
    public final boolean i() {
        return this.h.i();
    }
}
