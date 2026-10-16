package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bjl extends defpackage.cyc<defpackage.bjo> {
    private final java.lang.String a;
    private final defpackage.dgd b;
    private final int c;
    private final boolean d;
    private final int f;
    private final int g;
    private final defpackage.ckg h = null;
    private final defpackage.wde i;

    public bjl(java.lang.String str, defpackage.dgd dgdVar, defpackage.wde wdeVar, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = dgdVar;
        this.i = wdeVar;
        this.c = i;
        this.d = z;
        this.f = i2;
        this.g = i3;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.bjo(this.a, this.b, this.i, this.c, this.d, this.f, this.g);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        boolean z;
        defpackage.bjo bjoVar = (defpackage.bjo) cgeVar;
        defpackage.dgd dgdVar = bjoVar.b;
        defpackage.dgd dgdVar2 = this.b;
        boolean zU = dgdVar2.u(dgdVar);
        java.lang.String str = bjoVar.a;
        java.lang.String str2 = this.a;
        boolean z2 = true;
        if (defpackage.afga.f(str, str2)) {
            z = false;
        } else {
            bjoVar.a = str2;
            bjoVar.f();
            z = true;
        }
        int i = this.g;
        int i2 = this.f;
        boolean z3 = this.d;
        defpackage.wde wdeVar = this.i;
        int i3 = this.c;
        boolean z4 = !bjoVar.b.v(dgdVar2);
        bjoVar.b = dgdVar2;
        if (bjoVar.f != i) {
            bjoVar.f = i;
            z4 = true;
        }
        if (bjoVar.e != i2) {
            bjoVar.e = i2;
            z4 = true;
        }
        if (bjoVar.d != z3) {
            bjoVar.d = z3;
            z4 = true;
        }
        if (!defpackage.afga.f(bjoVar.i, wdeVar)) {
            bjoVar.i = wdeVar;
            z4 = true;
        }
        if (bjoVar.c != i3) {
            bjoVar.c = i3;
        } else {
            z2 = z4;
        }
        if (z || z2) {
            bjoVar.d().g(bjoVar.a, bjoVar.b, bjoVar.i, bjoVar.c, bjoVar.d, bjoVar.e, bjoVar.f);
        }
        if (bjoVar.A) {
            if (z || (!zU && bjoVar.g != null)) {
                defpackage.cjv.r(bjoVar).J();
            }
            if (z || z2) {
                defpackage.cjv.r(bjoVar).I();
                defpackage.dai.G(bjoVar);
            }
            if (zU) {
                return;
            }
            defpackage.dai.G(bjoVar);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.bjl)) {
            return false;
        }
        defpackage.bjl bjlVar = (defpackage.bjl) obj;
        defpackage.ckg ckgVar = bjlVar.h;
        return defpackage.afga.f(this.a, bjlVar.a) && defpackage.afga.f(this.b, bjlVar.b) && defpackage.afga.f(this.i, bjlVar.i) && this.c == bjlVar.c && this.d == bjlVar.d && this.f == bjlVar.f && this.g == bjlVar.g;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.i.hashCode();
        int i = true != this.d ? 1237 : 1231;
        return ((((((((iHashCode * 31) + this.c) * 31) + i) * 31) + this.f) * 31) + this.g) * 31;
    }
}
