package defpackage;

/* loaded from: classes.dex */
public final class cvn extends cvr {
    public cvt a;

    public cvn(cvt cvtVar) {
        this.a = cvtVar;
    }

    @Override // defpackage.cvr
    public final Object a(bzi bziVar) {
        if (bziVar != this.a.e()) {
            crt.c("Check failed.");
        }
        return this.a.d();
    }

    @Override // defpackage.cvr
    public final void b(bzi bziVar, Object obj) {
        throw null;
    }

    @Override // defpackage.cvr
    public final boolean c(bzi bziVar) {
        return bziVar == this.a.e();
    }
}
