package com.google.android.gms.f;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.api.internal.av;
import j$.util.Objects;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class n implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    int f5238a;

    /* renamed from: b, reason: collision with root package name */
    final Messenger f5239b;

    /* renamed from: c, reason: collision with root package name */
    o f5240c;

    /* renamed from: d, reason: collision with root package name */
    final Queue f5241d;

    /* renamed from: e, reason: collision with root package name */
    final SparseArray f5242e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ t f5243f;

    /* synthetic */ n(t tVar) {
        Objects.requireNonNull(tVar);
        this.f5243f = tVar;
        this.f5238a = 0;
        this.f5239b = new Messenger(new com.waze.native_managers.j(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.gms.f.m
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                int i2 = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    Log.d("MessengerIpcClient", "Received response to request: " + i2);
                }
                n nVar = this.f5237a;
                synchronized (nVar) {
                    SparseArray sparseArray = nVar.f5242e;
                    q qVar = (q) sparseArray.get(i2);
                    if (qVar == null) {
                        Log.w("MessengerIpcClient", "Received response for unknown request: " + i2);
                        return true;
                    }
                    sparseArray.remove(i2);
                    nVar.d();
                    Bundle data = message.getData();
                    if (data.getBoolean("unsupported", false)) {
                        qVar.c(new r("Not supported by GmsCore"));
                        return true;
                    }
                    qVar.a(data);
                    return true;
                }
            }
        }));
        this.f5241d = new ArrayDeque();
        this.f5242e = new SparseArray();
    }

    final void a() {
        this.f5243f.f5252c.execute(new Runnable() { // from class: com.google.android.gms.f.i
            @Override // java.lang.Runnable
            public final void run() {
                final q qVar;
                int i2;
                while (true) {
                    final n nVar = this.f5232a;
                    synchronized (nVar) {
                        if (nVar.f5238a != 2) {
                            return;
                        }
                        Queue queue = nVar.f5241d;
                        if (queue.isEmpty()) {
                            nVar.d();
                            return;
                        }
                        qVar = (q) queue.poll();
                        SparseArray sparseArray = nVar.f5242e;
                        i2 = qVar.f5246a;
                        sparseArray.put(i2, qVar);
                        nVar.f5243f.f5252c.schedule(new Runnable() { // from class: com.google.android.gms.f.k
                            @Override // java.lang.Runnable
                            public final void run() {
                                nVar.c(qVar.f5246a);
                            }
                        }, 30L, TimeUnit.SECONDS);
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(String.valueOf(qVar))));
                    }
                    t tVar = nVar.f5243f;
                    Messenger messenger = nVar.f5239b;
                    int i3 = qVar.f5248c;
                    Context context = tVar.f5251b;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i3;
                    messageObtain.arg1 = i2;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", qVar.b());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", qVar.f5249d);
                    messageObtain.setData(bundle);
                    try {
                        nVar.f5240c.a(messageObtain);
                    } catch (RemoteException e2) {
                        nVar.g(e2.getMessage());
                    }
                }
            }
        });
    }

    final synchronized void b() {
        if (this.f5238a == 1) {
            g("Timed out while binding");
        }
    }

    final synchronized void c(int i2) {
        SparseArray sparseArray = this.f5242e;
        q qVar = (q) sparseArray.get(i2);
        if (qVar != null) {
            Log.w("MessengerIpcClient", "Timing out request: " + i2);
            sparseArray.remove(i2);
            qVar.c(new r("Timed out waiting for response"));
            d();
        }
    }

    final synchronized void d() {
        if (this.f5238a == 2 && this.f5241d.isEmpty() && this.f5242e.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.f5238a = 3;
            com.google.android.gms.common.c.a.a().b(this.f5243f.f5251b, this);
        }
    }

    final synchronized boolean e(q qVar) {
        int i2 = this.f5238a;
        if (i2 != 0) {
            if (i2 == 1) {
                this.f5241d.add(qVar);
                return true;
            }
            if (i2 != 2) {
                return false;
            }
            this.f5241d.add(qVar);
            a();
            return true;
        }
        this.f5241d.add(qVar);
        av.i(this.f5238a == 0);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f5238a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            com.google.android.gms.common.c.a aVarA = com.google.android.gms.common.c.a.a();
            t tVar = this.f5243f;
            if (aVarA.c(tVar.f5251b, intent, this, 1)) {
                tVar.f5252c.schedule(new Runnable() { // from class: com.google.android.gms.f.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f5233a.b();
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                g("Unable to bind to service");
            }
        } catch (SecurityException e2) {
            f("Unable to bind to service", e2);
        }
        return true;
    }

    final synchronized void f(String str, Throwable th) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
        }
        int i2 = this.f5238a;
        if (i2 == 0) {
            throw new IllegalStateException();
        }
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                return;
            }
            this.f5238a = 4;
            return;
        }
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Unbinding service");
        }
        this.f5238a = 4;
        com.google.android.gms.common.c.a.a().b(this.f5243f.f5251b, this);
        r rVar = new r(str, th);
        Queue queue = this.f5241d;
        Iterator it = queue.iterator();
        while (it.hasNext()) {
            ((q) it.next()).c(rVar);
        }
        queue.clear();
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.f5242e;
            if (i3 >= sparseArray.size()) {
                sparseArray.clear();
                return;
            } else {
                ((q) sparseArray.valueAt(i3)).c(rVar);
                i3++;
            }
        }
    }

    final synchronized void g(String str) {
        f(str, null);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.f5243f.f5252c.execute(new Runnable() { // from class: com.google.android.gms.f.h
            @Override // java.lang.Runnable
            public final void run() {
                n nVar = this.f5230a;
                IBinder iBinder2 = iBinder;
                synchronized (nVar) {
                    try {
                        if (iBinder2 == null) {
                            nVar.g("Null service connection");
                            return;
                        }
                        try {
                            nVar.f5240c = new o(iBinder2);
                            nVar.f5238a = 2;
                            nVar.a();
                        } catch (RemoteException e2) {
                            nVar.g(e2.getMessage());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.f5243f.f5252c.execute(new Runnable() { // from class: com.google.android.gms.f.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f5236a.g("Service disconnected");
            }
        });
    }
}
