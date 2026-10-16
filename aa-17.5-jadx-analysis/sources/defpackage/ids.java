package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.util.Log;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class ids {
    private static volatile ids d;
    public boolean a;
    public final Object b;
    public final Object c;

    private ids(Context context) {
        this.b = new HashSet();
        this.c = new scz(new ifr(new idp(context)), new idq(this));
    }

    static ids a(Context context) {
        if (d == null) {
            synchronized (ids.class) {
                if (d == null) {
                    d = new ids(context.getApplicationContext());
                }
            }
        }
        return d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v3, types: [ifs, java.lang.Object] */
    final synchronized void b(icz iczVar) {
        ?? r0 = this.b;
        r0.add(iczVar);
        if (!this.a && !r0.isEmpty()) {
            Object obj = this.c;
            ?? r02 = ((scz) obj).d;
            boolean z = true;
            ((scz) obj).b = ((ConnectivityManager) r02.a()).getActiveNetwork() != null;
            try {
                ((ConnectivityManager) r02.a()).registerDefaultNetworkCallback((ConnectivityManager.NetworkCallback) ((scz) obj).c);
            } catch (RuntimeException e) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e);
                }
                z = false;
            }
            this.a = z;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v3, types: [ifs, java.lang.Object] */
    final synchronized void c(icz iczVar) {
        ?? r0 = this.b;
        r0.remove(iczVar);
        if (this.a && r0.isEmpty()) {
            Object obj = this.c;
            ((ConnectivityManager) ((scz) obj).d.a()).unregisterNetworkCallback((ConnectivityManager.NetworkCallback) ((scz) obj).c);
            this.a = false;
        }
    }

    public ids(lug lugVar, String str) {
        this.c = lugVar;
        this.b = str;
    }
}
