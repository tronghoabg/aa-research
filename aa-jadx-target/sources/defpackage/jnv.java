package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class jnv implements android.content.ServiceConnection {
    final /* synthetic */ android.os.Handler a;
    final /* synthetic */ defpackage.zif b;

    public jnv(android.os.Handler handler, defpackage.zif zifVar) {
        this.a = handler;
        this.b = zifVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        this.a.post(new defpackage.jnu(iBinder, this.b));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        ((defpackage.yqj) ((defpackage.yqj) defpackage.jnx.a.g()).ai((char) 2414)).u("onServiceDisconnected for CarChimeraService in Gearhead");
    }
}
