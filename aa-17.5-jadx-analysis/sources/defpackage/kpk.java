package defpackage;

/* loaded from: classes.dex */
final class kpk implements zge {
    final /* synthetic */ rqo a;
    final /* synthetic */ long b;
    final /* synthetic */ kpn c;
    final /* synthetic */ int d;

    public kpk(kpn kpnVar, rqo rqoVar, long j, int i) {
        this.a = rqoVar;
        this.b = j;
        this.d = i;
        this.c = kpnVar;
    }

    @Override // defpackage.zge
    public final void a(Throwable th) {
        ((ype) ((ype) ((ype) kpn.a.g()).p(th)).ai((char) 3333)).u("Error updating connection status");
        this.c.z((rqp) this.a.l(), this.b, this.d);
    }

    @Override // defpackage.zge
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        yxl yxlVar = (yxl) obj;
        yxlVar.getClass();
        xxm xxmVar = new xxm(yxlVar);
        rqo rqoVar = this.a;
        rqoVar.h = xxmVar;
        this.c.z((rqp) rqoVar.l(), this.b, this.d);
    }
}
