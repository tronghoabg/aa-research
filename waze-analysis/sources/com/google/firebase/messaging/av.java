package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class av implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final Context f10182a;

    /* renamed from: b, reason: collision with root package name */
    private final Intent f10183b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f10184c;

    /* renamed from: d, reason: collision with root package name */
    private final Queue f10185d;

    /* renamed from: e, reason: collision with root package name */
    private at f10186e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f10187f;

    av(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new com.google.android.gms.common.util.a.b("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f10185d = new ArrayDeque();
        this.f10187f = false;
        Context applicationContext = context.getApplicationContext();
        this.f10182a = applicationContext;
        this.f10183b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f10184c = scheduledThreadPoolExecutor;
    }

    private final void b() {
        while (true) {
            Queue queue = this.f10185d;
            if (queue.isEmpty()) {
                return;
            } else {
                ((b) queue.poll()).b();
            }
        }
    }

    private final synchronized void c() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "flush queue called");
        }
        while (true) {
            Queue queue = this.f10185d;
            if (queue.isEmpty()) {
                break;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "found intent to be delivered");
            }
            at atVar = this.f10186e;
            if (atVar == null || !atVar.isBinderAlive()) {
                break;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
            }
            this.f10186e.a((b) queue.poll());
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "binder is dead. start connection? " + (!this.f10187f));
        }
        if (!this.f10187f) {
            this.f10187f = true;
            try {
            } catch (SecurityException e2) {
                Log.e("FirebaseMessaging", "Exception while binding the service", e2);
            }
            if (!com.google.android.gms.common.c.a.a().c(this.f10182a, this.f10183b, this, 65)) {
                Log.e("FirebaseMessaging", "binding to the service failed");
                this.f10187f = false;
                b();
            }
        }
    }

    final synchronized com.google.android.gms.o.t a(Intent intent) {
        final b bVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
        }
        bVar = new b(intent);
        ScheduledExecutorService scheduledExecutorService = this.f10184c;
        bVar.a().n(scheduledExecutorService, new com.google.android.gms.common.api.internal.b(scheduledExecutorService.schedule(new Runnable() { // from class: com.google.firebase.messaging.au
            @Override // java.lang.Runnable
            public final void run() {
                b bVar2 = bVar;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + ((Intent) bVar2.f10188a).getAction() + " finishing.");
                bVar2.b();
            }
        }, 20L, TimeUnit.SECONDS), 4));
        this.f10185d.add(bVar);
        c();
        return bVar.a();
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceConnected: ".concat(String.valueOf(String.valueOf(componentName))));
        }
        this.f10187f = false;
        if (iBinder instanceof at) {
            this.f10186e = (at) iBinder;
            c();
        } else {
            Log.e("FirebaseMessaging", "Invalid service connection: ".concat(String.valueOf(String.valueOf(iBinder))));
            b();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: ".concat(String.valueOf(String.valueOf(componentName))));
        }
        c();
    }
}
