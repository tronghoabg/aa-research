package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ctp implements defpackage.ctz {
    final /* synthetic */ defpackage.ctu a;
    final /* synthetic */ int b;
    final /* synthetic */ defpackage.ctz c;
    private final /* synthetic */ defpackage.ctz d;

    public ctp(defpackage.ctz ctzVar, defpackage.ctu ctuVar, int i, defpackage.ctz ctzVar2) {
        this.a = ctuVar;
        this.b = i;
        this.c = ctzVar2;
        this.d = ctzVar;
    }

    @Override // defpackage.ctz
    public final int b() {
        return this.d.b();
    }

    @Override // defpackage.ctz
    public final int c() {
        return this.d.c();
    }

    @Override // defpackage.ctz
    public final java.util.Map f() {
        return this.d.f();
    }

    @Override // defpackage.ctz
    public final defpackage.affc g() {
        return this.d.g();
    }

    @Override // defpackage.ctz
    public final void h() {
        defpackage.ctu ctuVar = this.a;
        ctuVar.d = this.b;
        this.c.h();
        if (ctuVar.a.j == null) {
            ctuVar.h(ctuVar.d);
        }
    }

    @Override // defpackage.ctz
    public final void i() {
        this.d.i();
    }

    @Override // defpackage.ctz
    public final void j() {
        this.d.j();
    }
}
