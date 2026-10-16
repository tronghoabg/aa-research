package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class sqf {
    private static final java.lang.Object b = new java.lang.Object();
    private static volatile defpackage.sqf c;
    public final j$.util.concurrent.ConcurrentHashMap a = new j$.util.concurrent.ConcurrentHashMap();

    private sqf() {
    }

    public static defpackage.sqf a() {
        if (c == null) {
            synchronized (b) {
                if (c == null) {
                    c = new defpackage.sqf();
                }
            }
        }
        defpackage.sqf sqfVar = c;
        if (sqfVar != null) {
            return sqfVar;
        }
        throw new java.lang.NullPointerException("null reference");
    }

    private static void f(android.content.Context context, android.content.ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (java.lang.IllegalArgumentException | java.lang.IllegalStateException | java.util.NoSuchElementException unused) {
        }
    }

    private static final boolean g(android.content.Context context, android.content.Intent intent, android.content.ServiceConnection serviceConnection, int i, java.util.concurrent.Executor executor) {
        if (executor == null) {
            executor = null;
        }
        return (!defpackage.sqs.e() || executor == null) ? context.bindService(intent, serviceConnection, i) : ped$.ExternalSyntheticApiModelOutline8.m(context, intent, i, executor, serviceConnection);
    }

    public final void b(android.content.Context context, android.content.ServiceConnection serviceConnection) {
        if (serviceConnection instanceof defpackage.spb) {
            f(context, serviceConnection);
            return;
        }
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.a;
        if (!concurrentHashMap.containsKey(serviceConnection)) {
            f(context, serviceConnection);
            return;
        }
        try {
            f(context, (android.content.ServiceConnection) concurrentHashMap.get(serviceConnection));
        } finally {
            this.a.remove(serviceConnection);
        }
    }

    public final void c(android.content.Context context, android.content.ServiceConnection serviceConnection) {
        try {
            b(context, serviceConnection);
        } catch (java.lang.IllegalArgumentException unused) {
        }
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean d(android.content.Context context, android.content.Intent intent, android.content.ServiceConnection serviceConnection, int i) {
        return e(context, context.getClass().getName(), intent, serviceConnection, i, true, null);
    }

    public final boolean e(android.content.Context context, java.lang.String str, android.content.Intent intent, android.content.ServiceConnection serviceConnection, int i, boolean z, java.util.concurrent.Executor executor) {
        android.content.ComponentName component;
        if (z && (component = intent.getComponent()) != null) {
            try {
                if ((defpackage.sqx.a.a(context).h(component.getPackageName(), 0).flags & 2097152) != 0) {
                    android.util.Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            }
        }
        if (serviceConnection instanceof defpackage.spb) {
            return g(context, intent, serviceConnection, i, executor);
        }
        android.content.ServiceConnection serviceConnection2 = (android.content.ServiceConnection) this.a.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            android.util.Log.w("ConnectionTracker", java.lang.String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        try {
            boolean zG = g(context, intent, serviceConnection, i, executor);
            if (zG) {
                return zG;
            }
            this.a.remove(serviceConnection, serviceConnection);
            return false;
        } catch (java.lang.Throwable th) {
            this.a.remove(serviceConnection, serviceConnection);
            throw th;
        }
    }
}
