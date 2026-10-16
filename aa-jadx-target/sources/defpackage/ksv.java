package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class ksv {
    public final defpackage.dgd a;
    public final defpackage.dgd b;
    public final defpackage.dgd c;
    public final defpackage.dgd d;
    public final defpackage.dgd e;
    public final defpackage.dgd f;
    public final defpackage.dgd g;
    public final defpackage.dgd h;
    public final defpackage.dgd i;
    public final defpackage.dgd j;
    public final defpackage.dgd k;
    public final defpackage.dgd l;
    public final defpackage.dgd m;
    public final defpackage.dgd n;
    public final defpackage.dgd o;
    private final defpackage.dgd p;
    private final defpackage.dil q;
    private final defpackage.dlo r;

    public ksv(defpackage.dgd dgdVar, defpackage.dil dilVar, defpackage.dlo dloVar) {
        dilVar.getClass();
        dloVar.getClass();
        this.p = dgdVar;
        this.q = dilVar;
        this.r = dloVar;
        this.a = defpackage.dgd.w(dgdVar, 0L, a(56.0f), null, null, null, null, 0L, null, 0, 0, a(64.0f), null, null, 16646141);
        this.b = defpackage.dgd.w(dgdVar, 0L, a(44.0f), null, null, null, null, 0L, null, 0, 0, a(52.0f), null, null, 16646141);
        this.c = defpackage.dgd.w(dgdVar, 0L, a(36.0f), null, null, null, null, 0L, null, 0, 0, a(44.0f), null, null, 16646141);
        this.d = defpackage.dgd.w(dgdVar, 0L, a(32.0f), null, null, null, null, 0L, null, 0, 0, a(40.0f), null, null, 16646141);
        defpackage.dgd dgdVarW = defpackage.dgd.w(dgdVar, 0L, a(28.0f), null, null, null, null, 0L, null, 0, 0, a(36.0f), null, null, 16646141);
        this.e = dgdVarW;
        defpackage.dgd dgdVarW2 = defpackage.dgd.w(dgdVar, 0L, a(24.0f), null, null, null, null, 0L, null, 0, 0, a(32.0f), null, null, 16646141);
        this.f = dgdVarW2;
        defpackage.dgd dgdVarW3 = defpackage.dgd.w(dgdVarW, 0L, 0L, dilVar, null, null, null, 0L, null, 0, 0, 0L, null, null, 16777211);
        this.g = dgdVarW3;
        this.h = dgdVarW3;
        defpackage.dgd dgdVarW4 = defpackage.dgd.w(dgdVarW2, 0L, 0L, dilVar, null, null, null, 0L, null, 0, 0, 0L, null, null, 16777211);
        this.i = dgdVarW4;
        this.j = dgdVarW;
        this.k = dgdVarW;
        this.l = dgdVarW2;
        this.m = dgdVarW4;
        this.n = dgdVarW4;
        this.o = defpackage.dgd.w(dgdVar, 0L, a(16.0f), dilVar, null, null, null, 0L, null, 0, 0, a(24.0f), null, null, 16646137);
    }

    private final long a(float f) {
        return this.r.dQ(f);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ksv)) {
            return false;
        }
        defpackage.ksv ksvVar = (defpackage.ksv) obj;
        return defpackage.afga.f(this.p, ksvVar.p) && defpackage.afga.f(this.q, ksvVar.q) && defpackage.afga.f(this.r, ksvVar.r);
    }

    public final int hashCode() {
        return (((this.p.hashCode() * 31) + this.q.o) * 31) + this.r.hashCode();
    }

    public final java.lang.String toString() {
        return "AdjustedStyles(baseStyle=" + this.p + ", increasedWeight=" + this.q + ", density=" + this.r + ")";
    }
}
