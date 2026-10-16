package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class sbb {
    public volatile defpackage.scm b;
    private final android.content.Context c;
    private final android.content.ServiceConnection e = new defpackage.sba(this, 0);
    public final java.util.concurrent.Semaphore a = new java.util.concurrent.Semaphore(0);
    private boolean d = false;

    public sbb(android.content.Context context) {
        this.c = context;
    }

    public final synchronized void a() throws android.os.RemoteException {
        if (defpackage.omv.c("CAR.DATA.SERVICE", 3)) {
            android.util.Log.d("CAR.DATA.SERVICE", "connect");
        }
        android.content.Intent intent = new android.content.Intent("com.google.android.gms.carsetup.CAR_DATA").setPackage("com.google.android.gms");
        boolean zD = defpackage.sqf.a().d(this.c, intent, this.e, 1);
        this.d = zD;
        if (!zD) {
            throw new android.os.RemoteException("Failed to bind to service");
        }
        try {
            if (this.a.tryAcquire(5000L, java.util.concurrent.TimeUnit.MILLISECONDS)) {
            }
        } catch (java.lang.InterruptedException unused) {
        }
        defpackage.sqf.a().b(this.c, this.e);
        this.d = false;
        throw new android.os.RemoteException("Failed to connect");
    }

    public final synchronized void b() {
        if (defpackage.omv.c("CAR.DATA.SERVICE", 3)) {
            android.util.Log.d("CAR.DATA.SERVICE", "disconnect");
        }
        if (this.d) {
            defpackage.sqf.a().b(this.c, this.e);
            this.d = false;
        }
    }
}
