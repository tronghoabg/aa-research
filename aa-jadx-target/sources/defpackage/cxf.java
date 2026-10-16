package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class cxf extends defpackage.cxv {
    final /* synthetic */ defpackage.cxh f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxf(defpackage.cxh cxhVar) {
        super(cxhVar);
        this.f = cxhVar;
    }

    @Override // defpackage.cxv, defpackage.csy
    public final int c(int i) {
        defpackage.cxh cxhVar = this.f;
        defpackage.cxe cxeVar = cxhVar.f;
        defpackage.cxv cxvVarC = cxhVar.G().C();
        cxvVarC.getClass();
        return cxeVar.h(this, cxvVarC, i);
    }

    @Override // defpackage.cxv, defpackage.csy
    public final int d(int i) {
        defpackage.cxh cxhVar = this.f;
        defpackage.cxe cxeVar = cxhVar.f;
        defpackage.cxv cxvVarC = cxhVar.G().C();
        cxvVarC.getClass();
        return cxeVar.i(this, cxvVarC, i);
    }

    @Override // defpackage.cxv, defpackage.csy
    public final int e(int i) {
        defpackage.cxh cxhVar = this.f;
        defpackage.cxe cxeVar = cxhVar.f;
        defpackage.cxv cxvVarC = cxhVar.G().C();
        cxvVarC.getClass();
        return cxeVar.j(this, cxvVarC, i);
    }

    @Override // defpackage.cxv, defpackage.csy
    public final int f(int i) {
        defpackage.cxh cxhVar = this.f;
        defpackage.cxe cxeVar = cxhVar.f;
        defpackage.cxv cxvVarC = cxhVar.G().C();
        cxvVarC.getClass();
        return cxeVar.k(this, cxvVarC, i);
    }

    @Override // defpackage.cxu
    public final int r(defpackage.csf csfVar) {
        defpackage.aal aalVar = this.q;
        int iA = defpackage.ua.a(this, csfVar);
        aalVar.g(csfVar, iA);
        return iA;
    }

    @Override // defpackage.ctx
    public final defpackage.cux v(long j) {
        A(j);
        defpackage.dlm dlmVar = new defpackage.dlm(j);
        defpackage.cxh cxhVar = this.f;
        cxhVar.g = dlmVar;
        defpackage.cxe cxeVar = cxhVar.f;
        defpackage.cxv cxvVarC = cxhVar.G().C();
        cxvVarC.getClass();
        super.C(cxeVar.dt(this, cxvVarC, j));
        return this;
    }
}
