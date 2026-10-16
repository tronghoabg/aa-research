package com.google.android.gms.common.c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.api.internal.av;
import com.google.android.gms.common.d.c;
import com.google.android.gms.common.internal.am;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f4923b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static volatile a f4924c;

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f4925a = new ConcurrentHashMap();

    private a() {
    }

    public static a a() {
        if (f4924c == null) {
            synchronized (f4923b) {
                if (f4924c == null) {
                    f4924c = new a();
                }
            }
        }
        a aVar = f4924c;
        av.m(aVar);
        return aVar;
    }

    private static void e(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    private static boolean f(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof am);
    }

    private static final boolean g(Context context, Intent intent, ServiceConnection serviceConnection, int i2, Executor executor) {
        if (executor == null) {
            executor = null;
        }
        return executor != null ? context.bindService(intent, i2, executor, serviceConnection) : context.bindService(intent, serviceConnection, i2);
    }

    public final void b(Context context, ServiceConnection serviceConnection) {
        if (!f(serviceConnection)) {
            e(context, serviceConnection);
            return;
        }
        ConcurrentHashMap concurrentHashMap = this.f4925a;
        if (!concurrentHashMap.containsKey(serviceConnection)) {
            e(context, serviceConnection);
            return;
        }
        try {
            e(context, (ServiceConnection) concurrentHashMap.get(serviceConnection));
        } finally {
            this.f4925a.remove(serviceConnection);
        }
    }

    public final boolean c(Context context, Intent intent, ServiceConnection serviceConnection, int i2) {
        return d(context, context.getClass().getName(), intent, serviceConnection, i2, null);
    }

    public final boolean d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i2, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            try {
                if ((c.b(context).a(component.getPackageName(), 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!f(serviceConnection)) {
            return g(context, intent, serviceConnection, i2, executor);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) this.f4925a.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        try {
            boolean zG = g(context, intent, serviceConnection, i2, executor);
            if (zG) {
                return zG;
            }
            return false;
        } finally {
            this.f4925a.remove(serviceConnection, serviceConnection);
        }
    }
}
