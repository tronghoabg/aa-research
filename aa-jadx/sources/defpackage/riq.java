package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class riq implements android.content.ServiceConnection {
    protected riq() {
    }

    public abstract void a(android.content.ComponentName componentName, android.os.IBinder iBinder);

    public abstract void b(android.content.ComponentName componentName);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        a(componentName, iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        b(componentName);
    }
}
