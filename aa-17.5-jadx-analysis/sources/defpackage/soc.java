package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class soc {
    static HandlerThread a = null;
    private static final Object g = new Object();
    private static boolean h = false;
    private static soc k;
    public final HashMap b = new HashMap();
    public final Context c;
    public volatile Handler d;
    public final spi e;
    public final long f;
    private final long i;
    private volatile Executor j;
    private final wyl l;

    public soc(Context context, Looper looper) {
        wyl wylVar = new wyl(this, 1);
        this.l = wylVar;
        this.c = context.getApplicationContext();
        this.d = new sss(looper, wylVar);
        this.e = spi.a();
        this.i = 5000L;
        this.f = 300000L;
        this.j = null;
    }

    public static HandlerThread a() {
        synchronized (g) {
            HandlerThread handlerThread = a;
            if (handlerThread != null && handlerThread.isAlive()) {
                return a;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            a = handlerThread2;
            handlerThread2.start();
            return a;
        }
    }

    public static soc b(Context context) {
        soc socVar;
        synchronized (g) {
            socVar = k;
            if (socVar == null) {
                if (!h) {
                    h = soa.a(context.getPackageName());
                }
                socVar = new soc(context.getApplicationContext(), h ? a().getLooper() : context.getMainLooper());
                k = socVar;
            }
        }
        return socVar;
    }

    public final void c(ComponentName componentName, ServiceConnection serviceConnection) {
        e(new sob(componentName), serviceConnection);
    }

    public final ConnectionResult d(sob sobVar, ServiceConnection serviceConnection, String str, Executor executor) {
        HashMap map = this.b;
        synchronized (map) {
            sof sofVar = (sof) map.get(sobVar);
            ConnectionResult connectionResultA = null;
            if (executor == null) {
                executor = null;
            }
            if (sofVar == null) {
                sofVar = new sof(this, sobVar);
                sofVar.d(serviceConnection, serviceConnection);
                connectionResultA = sofVar.a(str, executor);
                map.put(sobVar, sofVar);
            } else {
                this.d.removeMessages(0, sobVar);
                if (sofVar.b(serviceConnection)) {
                    throw new IllegalStateException(a.bX(sobVar, "Trying to bind a GmsServiceConnection that was already connected before.  config="));
                }
                sofVar.d(serviceConnection, serviceConnection);
                int i = sofVar.b;
                if (i == 1) {
                    serviceConnection.onServiceConnected(sofVar.f, sofVar.d);
                } else if (i == 2) {
                    connectionResultA = sofVar.a(str, executor);
                }
            }
            if (sofVar.c) {
                return ConnectionResult.a;
            }
            if (connectionResultA == null) {
                connectionResultA = new ConnectionResult(1, -1, null, null, null);
            }
            return connectionResultA;
        }
    }

    protected final void e(sob sobVar, ServiceConnection serviceConnection) {
        HashMap map = this.b;
        synchronized (map) {
            sof sofVar = (sof) map.get(sobVar);
            if (sofVar == null) {
                throw new IllegalStateException(a.bX(sobVar, "Nonexistent connection status for service config: "));
            }
            if (!sofVar.b(serviceConnection)) {
                throw new IllegalStateException(a.bX(sobVar, "Trying to unbind a GmsServiceConnection  that was not bound before.  config="));
            }
            sofVar.a.remove(serviceConnection);
            if (sofVar.c()) {
                this.d.sendMessageDelayed(this.d.obtainMessage(0, sobVar), this.i);
            }
        }
    }
}
