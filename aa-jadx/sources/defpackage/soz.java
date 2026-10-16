package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class soz implements android.content.ServiceConnection, defpackage.spb {
    private final android.content.ServiceConnection a;

    public soz(android.content.ServiceConnection serviceConnection) {
        this.a = serviceConnection;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        this.a.onServiceConnected(componentName, iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        this.a.onServiceDisconnected(componentName);
    }
}
