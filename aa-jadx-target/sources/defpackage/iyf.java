package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class iyf implements android.content.ServiceConnection {
    public boolean a;
    final /* synthetic */ defpackage.iyh b;
    public qer c;

    public iyf(defpackage.iyh iyhVar) {
        this.b = iyhVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        qer qerVar;
        ((defpackage.yqj) defpackage.iyh.a.l().ai((char) 1553)).u("PlayStoreServiceConnection onServiceConnected");
        this.a = false;
        if (iBinder == null) {
            qerVar = null;
        } else {
            qer qerVarQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.services.IPlayGearheadService");
            qerVar = qerVarQueryLocalInterface instanceof qer ? qerVarQueryLocalInterface : new qer(iBinder);
        }
        this.c = qerVar;
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("CpvPreCacheThread");
        handlerThread.start();
        new android.os.Handler(handlerThread.getLooper()).post(new defpackage.iqv(this.b, 14));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        ((defpackage.yqj) defpackage.iyh.a.l().ai((char) 1554)).u("PlayStoreServiceConnection onServiceConnected");
        this.a = false;
        this.c = null;
    }
}
