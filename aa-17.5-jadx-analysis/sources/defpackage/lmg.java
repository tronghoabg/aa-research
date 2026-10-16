package defpackage;

/* loaded from: classes2.dex */
public final class lmg extends eqj {
    public final ljv a;
    private final lju h = new lme(this, 2);

    public lmg(ljv ljvVar) {
        this.a = ljvVar;
    }

    @Override // defpackage.eqj
    protected final void c() {
        ljv ljvVar = this.a;
        m(ljvVar.c());
        ljvVar.d(this.h);
    }

    @Override // defpackage.eqj
    protected final void d() {
        this.a.e(this.h);
    }
}
