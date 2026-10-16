package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class sox {
    static android.os.HandlerThread a = null;
    private static final java.lang.Object g = new java.lang.Object();
    private static boolean h = false;
    private static defpackage.sox k;
    public final java.util.HashMap b = new java.util.HashMap();
    public final android.content.Context c;
    public volatile android.os.Handler d;
    public final defpackage.sqf e;
    public final long f;
    private final long i;
    private volatile java.util.concurrent.Executor j;
    private final defpackage.wzh l;

    public sox(android.content.Context context, android.os.Looper looper) {
        defpackage.wzh wzhVar = new defpackage.wzh(this, 1);
        this.l = wzhVar;
        this.c = context.getApplicationContext();
        this.d = new defpackage.stq(looper, wzhVar);
        this.e = defpackage.sqf.a();
        this.i = 5000L;
        this.f = 300000L;
        this.j = null;
    }

    public static android.os.HandlerThread a() {
        synchronized (g) {
            android.os.HandlerThread handlerThread = a;
            if (handlerThread != null && handlerThread.isAlive()) {
                return a;
            }
            android.os.HandlerThread handlerThread2 = new android.os.HandlerThread("GoogleApiHandler", 9);
            a = handlerThread2;
            handlerThread2.start();
            return a;
        }
    }

    public static defpackage.sox b(android.content.Context context) {
        defpackage.sox soxVar;
        synchronized (g) {
            soxVar = k;
            if (soxVar == null) {
                if (!h) {
                    h = defpackage.sov.a(context.getPackageName());
                }
                soxVar = new defpackage.sox(context.getApplicationContext(), h ? a().getLooper() : context.getMainLooper());
                k = soxVar;
            }
        }
        return soxVar;
    }

    public final void c(android.content.ComponentName componentName, android.content.ServiceConnection serviceConnection) {
        e(new defpackage.sow(componentName), serviceConnection);
    }

    public final com.google.android.gms.common.ConnectionResult d(defpackage.sow sowVar, android.content.ServiceConnection serviceConnection, java.lang.String str, java.util.concurrent.Executor executor) {
        java.util.HashMap map = this.b;
        synchronized (map) {
            defpackage.spa spaVar = (defpackage.spa) map.get(sowVar);
            com.google.android.gms.common.ConnectionResult connectionResultA = null;
            if (executor == null) {
                executor = null;
            }
            if (spaVar == null) {
                spaVar = new defpackage.spa(this, sowVar);
                spaVar.d(serviceConnection, serviceConnection);
                connectionResultA = spaVar.a(str, executor);
                map.put(sowVar, spaVar);
            } else {
                this.d.removeMessages(0, sowVar);
                if (spaVar.b(serviceConnection)) {
                    throw new java.lang.IllegalStateException(defpackage.a.bW(sowVar, "Trying to bind a GmsServiceConnection that was already connected before.  config="));
                }
                spaVar.d(serviceConnection, serviceConnection);
                int i = spaVar.b;
                if (i == 1) {
                    serviceConnection.onServiceConnected(spaVar.f, spaVar.d);
                } else if (i == 2) {
                    connectionResultA = spaVar.a(str, executor);
                }
            }
            if (spaVar.c) {
                return com.google.android.gms.common.ConnectionResult.a;
            }
            if (connectionResultA == null) {
                connectionResultA = new com.google.android.gms.common.ConnectionResult(1, -1, null, null, null);
            }
            return connectionResultA;
        }
    }

    protected final void e(defpackage.sow sowVar, android.content.ServiceConnection serviceConnection) {
        java.util.HashMap map = this.b;
        synchronized (map) {
            defpackage.spa spaVar = (defpackage.spa) map.get(sowVar);
            if (spaVar == null) {
                throw new java.lang.IllegalStateException(defpackage.a.bW(sowVar, "Nonexistent connection status for service config: "));
            }
            if (!spaVar.b(serviceConnection)) {
                throw new java.lang.IllegalStateException(defpackage.a.bW(sowVar, "Trying to unbind a GmsServiceConnection  that was not bound before.  config="));
            }
            spaVar.a.remove(serviceConnection);
            if (spaVar.c()) {
                this.d.sendMessageDelayed(this.d.obtainMessage(0, sowVar), this.i);
            }
        }
    }
}
