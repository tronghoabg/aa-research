package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class kpq implements defpackage.zhh {
    final /* synthetic */ defpackage.rri a;
    final /* synthetic */ long b;
    final /* synthetic */ defpackage.kpt c;
    final /* synthetic */ int d;

    public kpq(defpackage.kpt kptVar, defpackage.rri rriVar, long j, int i) {
        this.a = rriVar;
        this.b = j;
        this.d = i;
        this.c = kptVar;
    }

    @Override // defpackage.zhh
    public final void a(java.lang.Throwable th) {
        ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.kpt.a.g()).p(th)).ai((char) 3336)).u("Error updating connection status");
        this.c.z((defpackage.rrj) this.a.l(), this.b, this.d);
    }

    @Override // defpackage.zhh
    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        defpackage.yyq yyqVar = (defpackage.yyq) obj;
        yyqVar.getClass();
        defpackage.xys xysVar = new defpackage.xys(yyqVar);
        defpackage.rri rriVar = this.a;
        rriVar.h = xysVar;
        this.c.z((defpackage.rrj) rriVar.l(), this.b, this.d);
    }
}
