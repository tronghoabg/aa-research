package defpackage;

/* loaded from: classes.dex */
public final class cgy extends cfx implements cyg, cgx, cwk {
    public afec a;
    private final cgz b;
    private boolean c;

    public cgy(cgz cgzVar, afec afecVar) {
        this.b = cgzVar;
        this.a = afecVar;
        cgzVar.a = this;
    }

    @Override // defpackage.cwk
    public final void a() {
        d();
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [afec, java.lang.Object] */
    @Override // defpackage.cwk
    public final void b(cxd cxdVar) {
        if (!this.c) {
            cgz cgzVar = this.b;
            cgzVar.p();
            cjn.p(this, new bws(this, cgzVar, 3));
            if (cgzVar.b == null) {
                crt.a("DrawResult not defined, did you forget to call onDraw?");
                throw new aezp();
            }
            this.c = true;
        }
        kgx kgxVar = this.b.b;
        kgxVar.getClass();
        kgxVar.a.invoke(cxdVar);
    }

    public final void d() {
        this.c = false;
        this.b.p();
        cjn.w(this);
    }

    @Override // defpackage.cfx
    public final void ec() {
        d();
    }

    @Override // defpackage.cfx
    public final void em() {
        d();
    }

    @Override // defpackage.cgx
    public final long l() {
        return dln.k(bzi.r(this, 4).c);
    }

    @Override // defpackage.cgx
    public final dlg m() {
        return bzi.q(this).r;
    }

    @Override // defpackage.cgx
    public final dlr n() {
        return bzi.q(this).s;
    }

    @Override // defpackage.cfx
    /* renamed from: p */
    public final void t() {
        d();
    }

    @Override // defpackage.cyg
    public final void r() {
        d();
    }

    @Override // defpackage.cfx
    public final void q() {
    }
}
