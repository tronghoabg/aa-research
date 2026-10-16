package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ieb {
    private static volatile defpackage.ieb d;
    public boolean a;
    public final java.lang.Object b;
    public final java.lang.Object c;

    private ieb(android.content.Context context) {
        this.b = new java.util.HashSet();
        this.c = new defpackage.sdv(new defpackage.ifz(new defpackage.idy(context)), new defpackage.idz(this));
    }

    static defpackage.ieb a(android.content.Context context) {
        if (d == null) {
            synchronized (defpackage.ieb.class) {
                if (d == null) {
                    d = new defpackage.ieb(context.getApplicationContext());
                }
            }
        }
        return d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v3, types: [iga, java.lang.Object] */
    final synchronized void b(defpackage.idi idiVar) {
        ?? r0 = this.b;
        r0.add(idiVar);
        if (!this.a && !r0.isEmpty()) {
            java.lang.Object obj = this.c;
            ?? r1 = ((defpackage.sdv) obj).d;
            boolean z = true;
            ((defpackage.sdv) obj).b = ((android.net.ConnectivityManager) r1.a()).getActiveNetwork() != null;
            try {
                ((android.net.ConnectivityManager) r1.a()).registerDefaultNetworkCallback((android.net.ConnectivityManager.NetworkCallback) ((defpackage.sdv) obj).c);
            } catch (java.lang.RuntimeException e) {
                if (android.util.Log.isLoggable("ConnectivityMonitor", 5)) {
                    android.util.Log.w("ConnectivityMonitor", "Failed to register callback", e);
                }
                z = false;
            }
            this.a = z;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v3, types: [iga, java.lang.Object] */
    final synchronized void c(defpackage.idi idiVar) {
        ?? r0 = this.b;
        r0.remove(idiVar);
        if (this.a && r0.isEmpty()) {
            java.lang.Object obj = this.c;
            ((android.net.ConnectivityManager) ((defpackage.sdv) obj).d.a()).unregisterNetworkCallback((android.net.ConnectivityManager.NetworkCallback) ((defpackage.sdv) obj).c);
            this.a = false;
        }
    }

    public ieb(defpackage.lum lumVar, java.lang.String str) {
        this.c = lumVar;
        this.b = str;
    }
}
