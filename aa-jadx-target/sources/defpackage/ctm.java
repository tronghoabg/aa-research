package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ctm implements defpackage.ctz {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ java.util.Map c;
    final /* synthetic */ defpackage.affc d;
    final /* synthetic */ defpackage.ctn e;
    final /* synthetic */ defpackage.ctu f;
    final /* synthetic */ defpackage.affc g;

    public ctm(int i, int i2, java.util.Map map, defpackage.affc affcVar, defpackage.ctn ctnVar, defpackage.ctu ctuVar, defpackage.affc affcVar2) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = affcVar;
        this.e = ctnVar;
        this.f = ctuVar;
        this.g = affcVar2;
    }

    @Override // defpackage.ctz
    public final int b() {
        return this.b;
    }

    @Override // defpackage.ctz
    public final int c() {
        return this.a;
    }

    @Override // defpackage.ctz
    public final java.util.Map f() {
        return this.c;
    }

    @Override // defpackage.ctz
    public final defpackage.affc g() {
        return this.d;
    }

    @Override // defpackage.ctz
    public final void h() {
        defpackage.cxv cxvVar;
        if (!this.e.dU() || (cxvVar = ((defpackage.cxa) this.f.a.p()).g) == null) {
            this.g.invoke(this.f.a.p().n);
        } else {
            this.g.invoke(cxvVar.n);
        }
    }

    @Override // defpackage.ctz
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.ctz
    public final /* synthetic */ void j() {
    }
}
