package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cts implements defpackage.cvk {
    final /* synthetic */ defpackage.ctu a;
    final /* synthetic */ java.lang.Object b;
    private final defpackage.zq c;

    public cts(defpackage.ctu ctuVar, java.lang.Object obj) {
        this.a = ctuVar;
        this.b = obj;
        int[] iArr = defpackage.zr.a;
        this.c = new defpackage.zq(6);
    }

    @Override // defpackage.cvk
    public final int a() {
        defpackage.cxl cxlVar = (defpackage.cxl) this.a.n.a(this.b);
        if (cxlVar != null) {
            return cxlVar.v().size();
        }
        return 0;
    }

    @Override // defpackage.cvk
    public final void b() {
        this.a.j(this.b);
    }

    @Override // defpackage.cvk
    public final void c(int i, long j) {
        defpackage.ctu ctuVar = this.a;
        defpackage.cxl cxlVar = (defpackage.cxl) ctuVar.n.a(this.b);
        if (cxlVar == null || !cxlVar.am()) {
            return;
        }
        int size = cxlVar.v().size();
        if (i < 0 || i >= size) {
            defpackage.csc.d(defpackage.a.bz(size, i, "Index (", ") is out of bound of [0, ", ")"));
        }
        if (cxlVar.an()) {
            defpackage.csc.b("Pre-measure called on node that is not placed");
        }
        defpackage.cxl cxlVar2 = ctuVar.a;
        cxlVar2.n = true;
        defpackage.cxo.a(cxlVar).w((defpackage.cxl) cxlVar.v().get(i), j);
        cxlVar2.n = false;
        this.c.d(i);
    }

    @Override // defpackage.cvk
    public final void d(defpackage.affc affcVar) {
        defpackage.cyg cygVar;
        defpackage.cxl cxlVar = (defpackage.cxl) this.a.n.a(this.b);
        defpackage.cge cgeVar = null;
        if (cxlVar != null && (cygVar = cxlVar.v) != null) {
            cgeVar = cygVar.f;
        }
        if (cgeVar == null || !cgeVar.A) {
            return;
        }
        defpackage.dai.q(cgeVar, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", affcVar);
    }
}
