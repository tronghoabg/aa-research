package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class biz extends defpackage.cyc<defpackage.bja> {
    private final defpackage.dfb a;
    private final defpackage.dgd b;
    private final defpackage.affc c;
    private final int d;
    private final boolean f;
    private final int g;
    private final int h;
    private final java.util.List i;
    private final defpackage.affc j;
    private final defpackage.bjb k;
    private final defpackage.ckg l = null;
    private final defpackage.ben m = null;
    private final defpackage.wde n;

    public biz(defpackage.dfb dfbVar, defpackage.dgd dgdVar, defpackage.wde wdeVar, defpackage.affc affcVar, int i, boolean z, int i2, int i3, java.util.List list, defpackage.affc affcVar2, defpackage.bjb bjbVar) {
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
        this.k = bjbVar;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.bja(this.a, this.b, this.n, this.c, this.d, this.f, this.g, this.h, this.i, this.j, this.k);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        defpackage.bja bjaVar = (defpackage.bja) cgeVar;
        defpackage.bjk bjkVar = bjaVar.b;
        defpackage.dgd dgdVar = this.b;
        defpackage.affc affcVar = this.c;
        defpackage.affc affcVar2 = this.j;
        defpackage.bjb bjbVar = this.k;
        bjkVar.l(bjkVar.r(dgdVar), bjkVar.o(this.a), bjkVar.s(dgdVar, this.i, this.h, this.g, this.f, this.n, this.d), bjkVar.n(affcVar, affcVar2, bjbVar, null));
        if (bjaVar.c && !defpackage.afga.f(bjbVar, bjaVar.a)) {
            defpackage.bjb bjbVar2 = bjaVar.a;
            if (bjbVar2 != null) {
                bjbVar2.b();
            }
            bjbVar.a();
        }
        bjbVar.c(bjaVar.l());
        bjaVar.a = bjbVar;
        defpackage.cjv.r(bjaVar).I();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.biz)) {
            return false;
        }
        defpackage.biz bizVar = (defpackage.biz) obj;
        defpackage.ckg ckgVar = bizVar.l;
        if (!defpackage.afga.f(this.a, bizVar.a) || !defpackage.afga.f(this.b, bizVar.b) || !defpackage.afga.f(this.i, bizVar.i) || !defpackage.afga.f(this.n, bizVar.n)) {
            return false;
        }
        defpackage.ben benVar = bizVar.m;
        return this.c == bizVar.c && this.d == bizVar.d && this.f == bizVar.f && this.g == bizVar.g && this.h == bizVar.h && this.j == bizVar.j && defpackage.afga.f(this.k, bizVar.k);
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.n.hashCode();
        defpackage.affc affcVar = this.c;
        int iHashCode2 = ((((((((((iHashCode * 31) + (affcVar != null ? affcVar.hashCode() : 0)) * 31) + this.d) * 31) + (true != this.f ? 1237 : 1231)) * 31) + this.g) * 31) + this.h) * 31;
        java.util.List list = this.i;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        defpackage.affc affcVar2 = this.j;
        return (((iHashCode3 + (affcVar2 != null ? affcVar2.hashCode() : 0)) * 31) + this.k.hashCode()) * 961;
    }
}
