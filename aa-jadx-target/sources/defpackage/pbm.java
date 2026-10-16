package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class pbm implements android.content.ServiceConnection {
    final /* synthetic */ java.util.concurrent.Executor a;
    public final /* synthetic */ defpackage.pbn b;

    public pbm(defpackage.pbn pbnVar, java.util.concurrent.Executor executor) {
        this.a = executor;
        this.b = pbnVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        pce pccVar;
        defpackage.pbn pbnVar = this.b;
        pbnVar.i = true;
        if (iBinder == null) {
            pccVar = null;
        } else {
            pce pceVarQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.auto.wireless.setup.service.IWirelessSetupSharedService");
            pccVar = pceVarQueryLocalInterface instanceof pce ? pceVarQueryLocalInterface : new pcc(iBinder);
        }
        pbnVar.g = pccVar;
        this.a.execute(new pbl(this, 2));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        ((defpackage.yqj) defpackage.pbn.a.l().ai((char) 6294)).u("Connection to wirelessSetupSharedService disconnected.");
        defpackage.pbn pbnVar = this.b;
        pbnVar.i = false;
        pbnVar.j = false;
        defpackage.pbh pbhVar = pbnVar.h;
        ((defpackage.yqj) ((defpackage.yqj) defpackage.pbk.a.g()).ai((char) 6287)).u("Connection failed to service");
        ((defpackage.pbk) pbhVar).j.b(java.lang.Boolean.FALSE);
    }
}
