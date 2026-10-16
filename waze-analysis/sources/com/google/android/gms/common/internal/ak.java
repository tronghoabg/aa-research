package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.StrictMode;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ak implements ServiceConnection, am {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ aj f4984a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f4985b;

    /* renamed from: c, reason: collision with root package name */
    private int f4986c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4987d;

    /* renamed from: e, reason: collision with root package name */
    private IBinder f4988e;

    /* renamed from: f, reason: collision with root package name */
    private final ai f4989f;

    /* renamed from: g, reason: collision with root package name */
    private ComponentName f4990g;

    public ak(aj ajVar, ai aiVar) {
        Objects.requireNonNull(ajVar);
        this.f4984a = ajVar;
        this.f4989f = aiVar;
        this.f4985b = new HashMap();
        this.f4986c = 2;
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.common.d d(ak akVar, String str, Executor executor) throws RemoteException {
        try {
            Intent intentA = bh.a(akVar.f4984a.f4977e, akVar.f4989f);
            akVar.f4986c = 3;
            StrictMode.VmPolicy vmPolicyA = com.google.android.gms.common.util.g.a();
            try {
                aj ajVar = akVar.f4984a;
                com.google.android.gms.common.c.a aVar = ajVar.f4980h;
                Context context = ajVar.f4977e;
                ai aiVar = akVar.f4989f;
                boolean zD = aVar.d(context, str, intentA, akVar, 4225, executor);
                akVar.f4987d = zD;
                if (zD) {
                    ajVar.f4978f.sendMessageDelayed(ajVar.f4978f.obtainMessage(1, aiVar), ajVar.f4982j);
                    return com.google.android.gms.common.d.f4926a;
                }
                akVar.f4986c = 2;
                try {
                    ajVar.f4980h.b(ajVar.f4977e, akVar);
                } catch (IllegalArgumentException unused) {
                }
                return new com.google.android.gms.common.d(16);
            } finally {
                StrictMode.setVmPolicy(vmPolicyA);
            }
        } catch (bc e2) {
            return e2.f5017a;
        }
    }

    public final int a() {
        return this.f4986c;
    }

    public final ComponentName b() {
        return this.f4990g;
    }

    public final IBinder c() {
        return this.f4988e;
    }

    public final boolean e(ServiceConnection serviceConnection) {
        return this.f4985b.containsKey(serviceConnection);
    }

    public final boolean f() {
        return this.f4985b.isEmpty();
    }

    public final boolean g() {
        return this.f4987d;
    }

    public final void h(ServiceConnection serviceConnection, ServiceConnection serviceConnection2) {
        this.f4985b.put(serviceConnection, serviceConnection2);
    }

    public final void i(ServiceConnection serviceConnection) {
        this.f4985b.remove(serviceConnection);
    }

    public final void j() {
        ai aiVar = this.f4989f;
        aj ajVar = this.f4984a;
        ajVar.f4978f.removeMessages(1, aiVar);
        ajVar.f4980h.b(ajVar.f4977e, this);
        this.f4987d = false;
        this.f4986c = 2;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        aj ajVar = this.f4984a;
        synchronized (ajVar.f4976d) {
            ajVar.f4978f.removeMessages(1, this.f4989f);
            this.f4988e = iBinder;
            this.f4990g = componentName;
            Iterator it = this.f4985b.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
            }
            this.f4986c = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        aj ajVar = this.f4984a;
        synchronized (ajVar.f4976d) {
            ajVar.f4978f.removeMessages(1, this.f4989f);
            this.f4988e = null;
            this.f4990g = componentName;
            Iterator it = this.f4985b.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
            }
            this.f4986c = 2;
        }
    }
}
