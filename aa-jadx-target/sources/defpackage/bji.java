package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bji extends defpackage.cyc<defpackage.bjk> {
    private final defpackage.dfb a;
    private final defpackage.dgd b;
    private final defpackage.affc c;
    private final int d;
    private final boolean f;
    private final int g;
    private final int h;
    private final java.util.List i;
    private final defpackage.affc j;
    private final defpackage.bjb k = null;
    private final defpackage.ckg l = null;
    private final defpackage.affc m;
    private final defpackage.wde n;

    public bji(defpackage.dfb dfbVar, defpackage.dgd dgdVar, defpackage.wde wdeVar, defpackage.affc affcVar, int i, boolean z, int i2, int i3, java.util.List list, defpackage.affc affcVar2, defpackage.affc affcVar3) {
        this.a = dfbVar;
        this.b = dgdVar;
        this.n = wdeVar;
        this.c = affcVar;
        this.d = i;
        this.f = z;
        this.g = i2;
        this.h = i3;
        this.i = list;
        this.j = affcVar2;
        this.m = affcVar3;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.bjk(this.a, this.b, this.n, this.c, this.d, this.f, this.g, this.h, this.i, this.j, null, this.m);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        defpackage.bjk bjkVar = (defpackage.bjk) cgeVar;
        defpackage.dgd dgdVar = this.b;
        bjkVar.l(bjkVar.r(dgdVar), bjkVar.o(this.a), bjkVar.s(dgdVar, this.i, this.h, this.g, this.f, this.n, this.d), bjkVar.n(this.c, this.j, null, this.m));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.bji)) {
            return false;
        }
        defpackage.bji bjiVar = (defpackage.bji) obj;
        defpackage.ckg ckgVar = bjiVar.l;
        if (!defpackage.afga.f(this.a, bjiVar.a) || !defpackage.afga.f(this.b, bjiVar.b) || !defpackage.afga.f(this.i, bjiVar.i) || !defpackage.afga.f(this.n, bjiVar.n) || this.c != bjiVar.c || this.m != bjiVar.m || this.d != bjiVar.d || this.f != bjiVar.f || this.g != bjiVar.g || this.h != bjiVar.h || this.j != bjiVar.j) {
            return false;
        }
        defpackage.bjb bjbVar = bjiVar.k;
        return true;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.n.hashCode();
        defpackage.affc affcVar = this.c;
        int iHashCode2 = ((((((((((iHashCode * 31) + (affcVar != null ? affcVar.hashCode() : 0)) * 31) + this.d) * 31) + (true != this.f ? 1237 : 1231)) * 31) + this.g) * 31) + this.h) * 31;
        java.util.List list = this.i;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        defpackage.affc affcVar2 = this.j;
        int iHashCode4 = iHashCode3 + (affcVar2 != null ? affcVar2.hashCode() : 0);
        defpackage.affc affcVar3 = this.m;
        return (iHashCode4 * 29791) + (affcVar3 != null ? affcVar3.hashCode() : 0);
    }
}
