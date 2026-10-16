package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qrz implements android.os.IBinder.DeathRecipient {
    final qwq a;
    public final /* synthetic */ defpackage.qsa b;

    public qrz(defpackage.qsa qsaVar, qwq qwqVar) throws android.os.RemoteException {
        this.b = qsaVar;
        this.a = qwqVar;
        qwqVar.asBinder().linkToDeath(this, 0);
    }

    public final void a() {
        defpackage.ypu ypuVarAi = defpackage.qsa.a.l().ai(7724);
        qwq qwqVar = this.a;
        ypuVarAi.y("ClientWrapper.unlink: %s", qwqVar.asBinder());
        qwqVar.asBinder().unlinkToDeath(this, 0);
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        defpackage.rbz.k(new defpackage.qjo(this, 18, null));
    }
}
