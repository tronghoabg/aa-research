package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nwh implements defpackage.kxd {
    final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public nwh(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.kxd
    public final void b() {
        int i = this.b;
        java.lang.Object obj = this.a;
        if (i != 0) {
            ((defpackage.eqp) obj).j(java.lang.Boolean.FALSE);
            return;
        }
        defpackage.nwi nwiVar = (defpackage.nwi) obj;
        nwiVar.c.getClass();
        nwiVar.d.getClass();
        nwiVar.b.post(new defpackage.mta(obj, 15));
    }

    @Override // defpackage.kxd
    public final void g() {
        if (this.b != 0) {
            ((defpackage.eqp) this.a).j(java.lang.Boolean.TRUE);
        }
    }

    @Override // defpackage.kxd
    public final void f() {
    }

    @Override // defpackage.kxd
    public final void a(int i) {
    }

    @Override // defpackage.kxd
    public final /* synthetic */ void e(int i) {
    }
}
