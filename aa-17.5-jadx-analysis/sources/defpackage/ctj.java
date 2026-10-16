package defpackage;

/* loaded from: classes.dex */
public final class ctj implements cvb {
    final /* synthetic */ ctl a;
    final /* synthetic */ Object b;
    private final zj c;

    public ctj(ctl ctlVar, Object obj) {
        this.a = ctlVar;
        this.b = obj;
        int[] iArr = zk.a;
        this.c = new zj(6);
    }

    @Override // defpackage.cvb
    public final int a() {
        cxb cxbVar = (cxb) this.a.n.a(this.b);
        if (cxbVar != null) {
            return cxbVar.v().size();
        }
        return 0;
    }

    @Override // defpackage.cvb
    public final void b() {
        this.a.j(this.b);
    }

    @Override // defpackage.cvb
    public final void c(int i, long j) {
        ctl ctlVar = this.a;
        cxb cxbVar = (cxb) ctlVar.n.a(this.b);
        if (cxbVar == null || !cxbVar.am()) {
            return;
        }
        int size = cxbVar.v().size();
        if (i < 0 || i >= size) {
            crt.d(a.bB(size, i, "Index (", ") is out of bound of [0, ", ")"));
        }
        if (cxbVar.an()) {
            crt.b("Pre-measure called on node that is not placed");
        }
        cxb cxbVar2 = ctlVar.a;
        cxbVar2.n = true;
        cxe.a(cxbVar).w((cxb) cxbVar.v().get(i), j);
        cxbVar2.n = false;
        this.c.d(i);
    }

    @Override // defpackage.cvb
    public final void d(afec afecVar) {
        cxx cxxVar;
        cxb cxbVar = (cxb) this.a.n.a(this.b);
        cfx cfxVar = null;
        if (cxbVar != null && (cxxVar = cxbVar.v) != null) {
            cfxVar = cxxVar.f;
        }
        if (cfxVar == null || !cfxVar.A) {
            return;
        }
        czz.q(cfxVar, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", afecVar);
    }
}
