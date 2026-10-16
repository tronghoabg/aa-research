package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rep implements defpackage.zhh {
    final /* synthetic */ int a;
    final /* synthetic */ defpackage.qtv b;

    public rep(defpackage.qtv qtvVar, int i) {
        this.a = i;
        this.b = qtvVar;
    }

    @Override // defpackage.zhh
    public final void a(java.lang.Throwable th) {
        if (defpackage.rrx.e("CAR.TOKEN", 4)) {
            defpackage.rrx.d(4, "CAR.TOKEN", null, "Failed to disconnect %s, was not connected.", new defpackage.zkf(defpackage.zke.a, this));
        }
    }

    @Override // defpackage.zhh
    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        defpackage.rei reiVar = (defpackage.rei) obj;
        if (reiVar != null) {
            defpackage.rda rdaVar = this.b.d;
            if (defpackage.omv.c("CAR.CLIENT", 3)) {
                defpackage.zke zkeVar = defpackage.zke.a;
                defpackage.rrx.d(3, "CAR.CLIENT", null, "Unregistering CarConnectionListener %s with multiplex listener %s", new defpackage.zkf(zkeVar, rdaVar), new defpackage.zkf(zkeVar, reiVar.a));
            }
            reiVar.a.g(rdaVar);
            reiVar.l.c();
            if (defpackage.rrx.e("CAR.TOKEN", 4)) {
                defpackage.zke zkeVar2 = defpackage.zke.a;
                defpackage.rrx.d(4, "CAR.TOKEN", null, "Disconnected %s using %s (cx attempt %s)", new defpackage.zkf(zkeVar2, this), new defpackage.zkf(zkeVar2, reiVar), new defpackage.zkf(zkeVar2, java.lang.Integer.valueOf(this.a)));
            }
        }
    }
}
