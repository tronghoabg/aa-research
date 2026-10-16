package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import m7.C3493a;

/* loaded from: classes3.dex */
public final class V implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f26622a;

    /* renamed from: b, reason: collision with root package name */
    public int f26623b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f26624c;

    /* renamed from: d, reason: collision with root package name */
    public IBinder f26625d;

    /* renamed from: e, reason: collision with root package name */
    public final U f26626e;

    /* renamed from: f, reason: collision with root package name */
    public ComponentName f26627f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ X f26628g;

    public V(X x5, U u10) {
        Objects.requireNonNull(x5);
        this.f26628g = x5;
        this.f26626e = u10;
        this.f26622a = new HashMap();
        this.f26623b = 2;
    }

    public final d7.b a(String str, Executor executor) throws Throwable {
        try {
            Intent intentA = M.a(this.f26628g.f26631e, this.f26626e);
            this.f26623b = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(n7.h.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                X x5 = this.f26628g;
                C3493a c3493a = x5.f26633g;
                Context context = x5.f26631e;
                U u10 = this.f26626e;
                try {
                    boolean zD = c3493a.d(context, str, intentA, this, 4225, executor);
                    this.f26624c = zD;
                    if (zD) {
                        x5.f26632f.sendMessageDelayed(x5.f26632f.obtainMessage(1, u10), x5.f26635i);
                        d7.b bVar = d7.b.f34113f;
                        StrictMode.setVmPolicy(vmPolicy);
                        return bVar;
                    }
                    this.f26623b = 2;
                    try {
                        x5.f26633g.c(x5.f26631e, this);
                    } catch (IllegalArgumentException unused) {
                    }
                    d7.b bVar2 = new d7.b(16, null, null);
                    StrictMode.setVmPolicy(vmPolicy);
                    return bVar2;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    StrictMode.setVmPolicy(vmPolicy);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (L e7) {
            return e7.f26604a;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        X x5 = this.f26628g;
        synchronized (x5.f26630d) {
            try {
                x5.f26632f.removeMessages(1, this.f26626e);
                this.f26625d = iBinder;
                this.f26627f = componentName;
                Iterator it = this.f26622a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f26623b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        X x5 = this.f26628g;
        synchronized (x5.f26630d) {
            try {
                x5.f26632f.removeMessages(1, this.f26626e);
                this.f26625d = null;
                this.f26627f = componentName;
                Iterator it = this.f26622a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f26623b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
