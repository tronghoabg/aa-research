package defpackage;

/* loaded from: classes2.dex */
public final class lpo extends eql {
    public final lmb a;
    public final String h;
    private final Runnable i;

    public lpo(lmb lmbVar) {
        this.a = lmbVar;
        String strR = lmbVar.R();
        strR.getClass();
        this.h = strR;
        this.i = new kyl(this, 20);
        r(tby.f(new lpn(lmbVar), new lpl(lmbVar), new lpj(lmbVar), new lph(lmbVar), new kvm(this, lmbVar, 2)), new lnc(this, 3));
    }

    public static boolean a(llu lluVar) {
        return lluVar != null && lluVar.x() == 2;
    }

    @Override // defpackage.eql, defpackage.eqj
    protected final void c() {
        super.c();
        wer.d(this.i, 500L);
    }

    @Override // defpackage.eql, defpackage.eqj
    protected final void d() {
        super.d();
        wer.f(this.i);
    }
}
