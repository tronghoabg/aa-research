package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class lie implements android.content.ServiceConnection {
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        ((defpackage.yqj) defpackage.lin.a.l().ai((char) 3925)).u("Connected to lifetime service");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        ((defpackage.yqj) defpackage.lin.a.l().ai((char) 3926)).u("Disconnected from lifetime service");
    }
}
