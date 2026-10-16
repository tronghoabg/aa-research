package com.applovin.impl;

import A7.AbstractC0279p0;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes.dex */
public class i8 {

    /* renamed from: f, reason: collision with root package name */
    private static final Set f21743f = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f21744a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f21745b;

    /* renamed from: c, reason: collision with root package name */
    private Runnable f21746c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f21747d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final Timer f21748e;

    public class a extends TimerTask {

        /* renamed from: com.applovin.impl.i8$a$a, reason: collision with other inner class name */
        public class C0011a implements AppLovinBroadcastManager.Receiver {
            public C0011a() {
            }

            @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
            public void onReceive(Intent intent, Map map) {
                AppLovinBroadcastManager.unregisterReceiver(this);
                i8.this.c();
            }
        }

        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (!i8.this.f21745b.n0().isApplicationPaused() || i8.this.f21744a) {
                i8.this.c();
            } else {
                AppLovinBroadcastManager.registerReceiver(new C0011a(), new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
            }
        }
    }

    private i8(long j8, boolean z2, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        Timer timer = new Timer();
        this.f21748e = timer;
        if (j8 < 0) {
            throw new IllegalArgumentException(AbstractC0279p0.k(j8, "Cannot create wall clock timer. Invalid timer length: "));
        }
        if (kVar == null) {
            throw new IllegalArgumentException("Cannot create wall clock timer. Sdk is null");
        }
        if (runnable == null) {
            throw new IllegalArgumentException("Cannot create wall clock timer. Runnable is null.");
        }
        this.f21744a = z2;
        this.f21745b = kVar;
        this.f21746c = runnable;
        f21743f.add(this);
        timer.schedule(b(), j8);
    }

    public static i8 a(long j8, boolean z2, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        return new i8(j8, z2, kVar, runnable);
    }

    private TimerTask b() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Runnable runnable = this.f21746c;
        if (runnable != null) {
            runnable.run();
            a();
        }
    }

    public void a() {
        synchronized (this.f21747d) {
            this.f21748e.cancel();
            this.f21746c = null;
            f21743f.remove(this);
        }
    }
}
