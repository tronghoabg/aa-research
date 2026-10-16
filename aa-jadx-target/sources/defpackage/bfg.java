package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class bfg extends defpackage.cyc<defpackage.bfh> {
    private final defpackage.dgd a;
    private final int b;
    private final int c;
    private final boolean d;
    private final boolean f;
    private final defpackage.beg g;

    public bfg(defpackage.dgd dgdVar, int i, int i2, boolean z, boolean z2, defpackage.beg begVar) {
        this.a = dgdVar;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.f = z2;
        this.g = begVar;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.bfh(this.a, this.b, this.c, this.d, this.f, this.g);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        defpackage.bfh bfhVar = (defpackage.bfh) cgeVar;
        defpackage.dgd dgdVar = bfhVar.a;
        defpackage.dgd dgdVar2 = this.a;
        if (!defpackage.afga.f(dgdVar, dgdVar2)) {
            defpackage.dgd dgdVarF = defpackage.dax.f(dgdVar2, defpackage.cjv.r(bfhVar).s);
            bfhVar.f(dgdVarF, (defpackage.wde) defpackage.cjv.y(bfhVar, defpackage.dbl.f));
            bfhVar.g = dgdVarF;
            bfhVar.a = dgdVar2;
            bfhVar.f = true;
        }
        defpackage.beg begVar = this.g;
        boolean z = this.f;
        boolean z2 = this.d;
        int i = this.c;
        int i2 = this.b;
        if (bfhVar.b != i2 || bfhVar.c != i || bfhVar.d != z2 || bfhVar.e != z || java.lang.Float.compare(bfhVar.h.a(), begVar.a()) != 0) {
            bfhVar.b = i2;
            bfhVar.c = i;
            bfhVar.d = z2;
            bfhVar.e = z;
            bfhVar.h = begVar;
            bfhVar.f = true;
        }
        if (bfhVar.f) {
            defpackage.cjv.r(bfhVar).I();
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.bfg)) {
            return false;
        }
        defpackage.bfg bfgVar = (defpackage.bfg) obj;
        return defpackage.afga.f(this.a, bfgVar.a) && this.b == bfgVar.b && this.c == bfgVar.c && this.d == bfgVar.d && this.f == bfgVar.f && defpackage.afga.f(this.g, bfgVar.g);
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + (true == this.d ? 1231 : 1237)) * 31) + (true != this.f ? 1237 : 1231)) * 31) + this.g.hashCode();
    }
}
