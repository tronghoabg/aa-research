package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class bfs implements defpackage.cth {
    public final defpackage.bff a;
    public final int b;
    public final defpackage.dkg c;
    public final defpackage.afer d;

    public bfs(defpackage.bff bffVar, int i, defpackage.dkg dkgVar, defpackage.afer aferVar) {
        this.a = bffVar;
        this.b = i;
        this.c = dkgVar;
        this.d = aferVar;
    }

    @Override // defpackage.cgf
    public final /* synthetic */ defpackage.cgf a(defpackage.cgf cgfVar) {
        return cgfVar == defpackage.cgf.e ? this : new defpackage.cga(this, cgfVar);
    }

    @Override // defpackage.cgf
    public final /* synthetic */ java.lang.Object b(java.lang.Object obj, defpackage.affg affgVar) {
        return affgVar.invoke(obj, this);
    }

    @Override // defpackage.cgf
    public final /* synthetic */ boolean c(defpackage.affc affcVar) {
        return ((java.lang.Boolean) affcVar.invoke(this)).booleanValue();
    }

    @Override // defpackage.cth
    public final /* synthetic */ int d(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return defpackage.tw.m(this, cszVar, csyVar, i);
    }

    @Override // defpackage.cth
    public final /* synthetic */ int e(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return defpackage.tw.n(this, cszVar, csyVar, i);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.bfs)) {
            return false;
        }
        defpackage.bfs bfsVar = (defpackage.bfs) obj;
        return defpackage.afga.f(this.a, bfsVar.a) && this.b == bfsVar.b && defpackage.afga.f(this.c, bfsVar.c) && defpackage.afga.f(this.d, bfsVar.d);
    }

    @Override // defpackage.cth
    public final /* synthetic */ int f(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return defpackage.tw.o(this, cszVar, csyVar, i);
    }

    @Override // defpackage.cth
    public final /* synthetic */ int g(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return defpackage.tw.p(this, cszVar, csyVar, i);
    }

    @Override // defpackage.cth
    public final defpackage.ctz h(defpackage.cub cubVar, defpackage.ctx ctxVar, long j) {
        defpackage.cux cuxVarV = ctxVar.v(defpackage.dlm.m(j, 0, 0, 0, Integer.MAX_VALUE, 7));
        int iMin = java.lang.Math.min(cuxVarV.b, defpackage.dlm.a(j));
        return cubVar.dS(cuxVarV.a, iMin, defpackage.afcf.a, new defpackage.bfr(this, cuxVarV, iMin, 0));
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final java.lang.String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.a + ", cursorOffset=" + this.b + ", transformedText=" + this.c + ", textLayoutResultProvider=" + this.d + ")";
    }
}
