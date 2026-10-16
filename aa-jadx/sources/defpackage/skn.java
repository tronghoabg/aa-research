package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class skn implements android.content.ServiceConnection {
    public boolean a = false;
    public final java.util.concurrent.BlockingQueue b = new java.util.concurrent.LinkedBlockingQueue();

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        this.b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
    }
}
