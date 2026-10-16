package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class chf extends defpackage.cge implements defpackage.cyp, defpackage.che, defpackage.cwu {
    public defpackage.affc a;
    private final defpackage.chg b;
    private boolean c;

    public chf(defpackage.chg chgVar, defpackage.affc affcVar) {
        this.b = chgVar;
        this.a = affcVar;
        chgVar.a = this;
    }

    @Override // defpackage.cwu
    public final void a() {
        d();
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [affc, java.lang.Object] */
    @Override // defpackage.cwu
    public final void b(defpackage.cxn cxnVar) {
        if (!this.c) {
            defpackage.chg chgVar = this.b;
            chgVar.p();
            defpackage.dai.z(this, new defpackage.bxn(this, chgVar, 2));
            if (chgVar.b == null) {
                defpackage.csc.a("DrawResult not defined, did you forget to call onDraw?");
                throw new defpackage.afap();
            }
            this.c = true;
        }
        defpackage.khb khbVar = this.b.b;
        khbVar.getClass();
        khbVar.a.invoke(cxnVar);
    }

    public final void d() {
        this.c = false;
        this.b.p();
        defpackage.dai.G(this);
    }

    @Override // defpackage.cge
    public final void dk() {
        d();
    }

    @Override // defpackage.cge
    public final void du() {
        d();
    }

    @Override // defpackage.che
    public final long l() {
        return defpackage.dlv.f(defpackage.cjv.s(this, 4).c);
    }

    @Override // defpackage.che
    public final defpackage.dlo m() {
        return defpackage.cjv.r(this).r;
    }

    @Override // defpackage.che
    public final defpackage.dlz n() {
        return defpackage.cjv.r(this).s;
    }

    @Override // defpackage.cge
    /* JADX INFO: renamed from: p */
    public final void t() {
        d();
    }

    @Override // defpackage.cyp
    public final void r() {
        d();
    }

    @Override // defpackage.cge
    public final void q() {
    }
}
