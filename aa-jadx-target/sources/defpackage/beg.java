package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class beg {
    private final defpackage.bwx A;
    private final defpackage.bwx B;
    public defpackage.bep a;
    public final defpackage.bwx b;
    public final defpackage.bwx c;
    public defpackage.ctc d;
    public final defpackage.bwx e;
    public defpackage.dfb f;
    public final defpackage.bwx g;
    public final defpackage.bwx h;
    public final defpackage.bwx i;
    public boolean j;
    public final defpackage.bwx k;
    public defpackage.affc l;
    public final defpackage.affc m;
    public final defpackage.affc n;
    public final defpackage.affc o;
    public long p;
    public final defpackage.bxl q;
    public final defpackage.cjs r;
    public final defpackage.iwa s = new defpackage.iwa(null);
    public final defpackage.epq t;
    public defpackage.fbl u;
    public final defpackage.sr v;
    private final defpackage.bwx w;
    private final defpackage.bwx x;
    private final defpackage.bwx y;
    private final defpackage.bwx z;

    public beg(defpackage.bep bepVar, defpackage.bxl bxlVar, defpackage.sr srVar) {
        this.a = bepVar;
        this.q = bxlVar;
        this.v = srVar;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        defpackage.bxv bxvVar = defpackage.bxv.c;
        this.b = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, bxvVar);
        this.c = new androidx.compose.runtime.ParcelableSnapshotMutableState(new defpackage.dlr(0.0f), bxvVar);
        this.e = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, bxvVar);
        this.w = new androidx.compose.runtime.ParcelableSnapshotMutableState(defpackage.bdz.a, bxvVar);
        this.x = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, bxvVar);
        this.g = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, bxvVar);
        this.h = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, bxvVar);
        this.i = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, bxvVar);
        this.j = true;
        this.y = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.TRUE, bxvVar);
        this.t = new defpackage.epq(srVar);
        this.k = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, bxvVar);
        this.z = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, bxvVar);
        this.l = new defpackage.awl(17);
        this.m = new defpackage.bbs(this, 12);
        this.n = new defpackage.bbs(this, 13);
        this.o = new defpackage.bbs(this, 14);
        this.r = new defpackage.cjs();
        float[] fArr = defpackage.clr.a;
        this.p = defpackage.cjv.k(0.0f, 0.0f, 0.0f, 0.0f, defpackage.clr.u);
        long j = defpackage.dgc.a;
        this.A = new androidx.compose.runtime.ParcelableSnapshotMutableState(new defpackage.dgc(j), bxvVar);
        this.B = new androidx.compose.runtime.ParcelableSnapshotMutableState(new defpackage.dgc(j), bxvVar);
    }

    public final float a() {
        return ((defpackage.dlr) this.c.a()).a;
    }

    public final long b() {
        return ((defpackage.dgc) this.B.a()).b;
    }

    public final long c() {
        return ((defpackage.dgc) this.A.a()).b;
    }

    public final defpackage.bdz d() {
        return (defpackage.bdz) this.w.a();
    }

    public final defpackage.bfi e() {
        return (defpackage.bfi) this.e.a();
    }

    public final defpackage.ctc f() {
        defpackage.ctc ctcVar = this.d;
        if (ctcVar == null || !ctcVar.t()) {
            return null;
        }
        return ctcVar;
    }

    public final void g(boolean z) {
        this.k.b(java.lang.Boolean.valueOf(z));
    }

    public final void h(long j) {
        this.B.b(new defpackage.dgc(j));
    }

    public final void i(defpackage.bdz bdzVar) {
        this.w.b(bdzVar);
    }

    public final void j(boolean z) {
        this.y.b(java.lang.Boolean.valueOf(z));
    }

    public final void k(boolean z) {
        this.z.b(java.lang.Boolean.valueOf(z));
    }

    public final void l(long j) {
        this.A.b(new defpackage.dgc(j));
    }

    public final void m(boolean z) {
        this.i.b(java.lang.Boolean.valueOf(z));
    }

    public final void n(boolean z) {
        this.x.b(java.lang.Boolean.valueOf(z));
    }

    public final void o(boolean z) {
        this.h.b(java.lang.Boolean.valueOf(z));
    }

    public final void p(boolean z) {
        this.g.b(java.lang.Boolean.valueOf(z));
    }

    public final boolean q() {
        return ((java.lang.Boolean) this.b.a()).booleanValue();
    }

    public final boolean r() {
        return ((java.lang.Boolean) this.z.a()).booleanValue();
    }

    public final boolean s() {
        return ((java.lang.Boolean) this.x.a()).booleanValue();
    }

    public final boolean t() {
        return (defpackage.dgc.i(c()) && defpackage.dgc.i(b())) ? false : true;
    }

    public final boolean u() {
        return ((java.lang.Boolean) this.y.a()).booleanValue();
    }
}
