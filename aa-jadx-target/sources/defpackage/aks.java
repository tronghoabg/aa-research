package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aks extends defpackage.cyc<defpackage.akt> {
    private final defpackage.affc a;
    private final defpackage.affc c;
    private final defpackage.alf f;
    private final defpackage.affc b = null;
    private final float d = Float.NaN;

    public aks(defpackage.affc affcVar, defpackage.affc affcVar2, defpackage.alf alfVar) {
        this.a = affcVar;
        this.c = affcVar2;
        this.f = alfVar;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.akt(this.a, this.c, this.f);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        defpackage.akt aktVar = (defpackage.akt) cgeVar;
        float f = aktVar.c;
        long j = aktVar.e;
        float f2 = aktVar.f;
        boolean z = aktVar.d;
        float f3 = aktVar.g;
        boolean z2 = aktVar.h;
        defpackage.alf alfVar = aktVar.i;
        android.view.View view = aktVar.j;
        defpackage.dlo dloVar = aktVar.k;
        aktVar.a = this.a;
        aktVar.c = Float.NaN;
        aktVar.d = true;
        aktVar.e = 9205357640488583168L;
        aktVar.f = Float.NaN;
        aktVar.g = Float.NaN;
        aktVar.h = true;
        aktVar.b = this.c;
        defpackage.alf alfVar2 = this.f;
        aktVar.i = alfVar2;
        android.view.View viewG = defpackage.ua.g(aktVar);
        defpackage.dlo dloVarU = defpackage.cjv.u(aktVar);
        if (aktVar.o != null && ((!java.lang.Float.isNaN(f) && f != Float.NaN && !alfVar2.a()) || !defpackage.a.i(9205357640488583168L, j) || !defpackage.dlr.c(Float.NaN, f2) || !defpackage.dlr.c(Float.NaN, f3) || !z || !z2 || !defpackage.afga.f(alfVar2, alfVar) || !defpackage.afga.f(viewG, view) || !defpackage.afga.f(dloVarU, dloVar))) {
            aktVar.f();
        }
        aktVar.h();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.aks)) {
            return false;
        }
        defpackage.aks aksVar = (defpackage.aks) obj;
        if (this.a != aksVar.a) {
            return false;
        }
        defpackage.affc affcVar = aksVar.b;
        float f = aksVar.d;
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((this.a.hashCode() * 961) + 2143289344) * 31) + 1231) * 31) + defpackage.a.f(9205357640488583168L)) * 31) + 2143289344) * 31) + 2143289344) * 31) + 1231) * 31) + this.c.hashCode()) * 31) + this.f.hashCode();
    }
}
