package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import java.util.concurrent.ExecutorService;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class f extends Service {

    /* renamed from: b, reason: collision with root package name */
    private Binder f10197b;

    /* renamed from: d, reason: collision with root package name */
    private int f10199d;

    /* renamed from: a, reason: collision with root package name */
    final ExecutorService f10196a = com.google.android.gms.k.e.b.d.a().b(new com.google.android.gms.common.util.a.b("Firebase-Messaging-Intent-Handle"));

    /* renamed from: c, reason: collision with root package name */
    private final Object f10198c = new Object();

    /* renamed from: e, reason: collision with root package name */
    private int f10200e = 0;

    /* JADX INFO: Access modifiers changed from: private */
    public final com.google.android.gms.o.t e(Intent intent) {
        com.google.android.gms.o.w wVar = new com.google.android.gms.o.w();
        this.f10196a.execute(new android.support.v4.app.n(this, intent, wVar, 1));
        return wVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(Intent intent) {
        if (intent != null) {
            ar.b(intent);
        }
        synchronized (this.f10198c) {
            int i2 = this.f10200e - 1;
            this.f10200e = i2;
            if (i2 == 0) {
                stopSelfResult(this.f10199d);
            }
        }
    }

    public abstract void b(Intent intent);

    protected Intent d() {
        throw null;
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.f10197b == null) {
            this.f10197b = new at(new l(this));
        }
        return this.f10197b;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.f10196a.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i2, int i3) {
        synchronized (this.f10198c) {
            this.f10199d = i3;
            this.f10200e++;
        }
        Intent intentD = d();
        if (intentD == null) {
            f(intent);
            return 2;
        }
        com.google.android.gms.o.t tVarE = e(intentD);
        if (tVarE.j()) {
            f(intent);
            return 2;
        }
        tVarE.n(new com.google.android.gms.f.v(4), new e(this, intent, 0));
        return 3;
    }
}
