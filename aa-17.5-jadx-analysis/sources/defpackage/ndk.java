package defpackage;

/* loaded from: classes.dex */
public final class ndk implements epf {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ndk(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.epf
    public final void fL(eqa eqaVar) {
        if (this.b != 0) {
            lvb.a().b();
        } else {
            nuj.b().k(((ndn) this.a).c);
        }
    }

    @Override // defpackage.epf
    public final void fy(eqa eqaVar) {
        if (this.b != 0) {
            lvb.a().b();
            lvb.a().c((String) this.a);
            return;
        }
        Object obj = this.a;
        afbg afbgVar = afbg.a;
        ndn ndnVar = (ndn) obj;
        ndnVar.e.m(afbgVar);
        ndnVar.d.m(afbgVar);
        nuj.b().f(ndnVar.c);
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fM() {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fv(eqa eqaVar) {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fw(eqa eqaVar) {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fx(eqa eqaVar) {
    }
}
