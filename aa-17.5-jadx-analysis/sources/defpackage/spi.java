package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class spi {
    private static final Object b = new Object();
    private static volatile spi c;
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    private spi() {
    }

    public static spi a() {
        if (c == null) {
            synchronized (b) {
                if (c == null) {
                    c = new spi();
                }
            }
        }
        spi spiVar = c;
        if (spiVar != null) {
            return spiVar;
        }
        throw new NullPointerException("null reference");
    }

    private static void f(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    private static final boolean g(Context context, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        if (executor == null) {
            executor = null;
        }
        return (!spu.c() || executor == null) ? context.bindService(intent, serviceConnection, i) : context.bindService(intent, i, executor, serviceConnection);
    }

    public final void b(Context context, ServiceConnection serviceConnection) {
        if (serviceConnection instanceof sog) {
            f(context, serviceConnection);
            return;
        }
        ConcurrentHashMap concurrentHashMap = this.a;
        if (!concurrentHashMap.containsKey(serviceConnection)) {
            f(context, serviceConnection);
            return;
        }
        try {
            f(context, (ServiceConnection) concurrentHashMap.get(serviceConnection));
        } finally {
            this.a.remove(serviceConnection);
        }
    }

    public final void c(Context context, ServiceConnection serviceConnection) {
        try {
            b(context, serviceConnection);
        } catch (IllegalArgumentException unused) {
        }
    }

    @ResultIgnorabilityUnspecified
    public final boolean d(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return e(context, context.getClass().getName(), intent, serviceConnection, i, true, null);
    }

    public final boolean e(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, boolean z, Executor executor) {
        ComponentName component;
        if (z && (component = intent.getComponent()) != null) {
            try {
                if ((spz.a.a(context).c(component.getPackageName(), 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (serviceConnection instanceof sog) {
            return g(context, intent, serviceConnection, i, executor);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) this.a.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        try {
            boolean zG = g(context, intent, serviceConnection, i, executor);
            if (zG) {
                return zG;
            }
            return false;
        } finally {
            this.a.remove(serviceConnection, serviceConnection);
        }
    }
}
