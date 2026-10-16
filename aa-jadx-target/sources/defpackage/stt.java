package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class stt implements android.content.ServiceConnection {
    public stt() {
        defpackage.str strVar = defpackage.str.a;
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
