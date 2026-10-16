package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.h7;
import com.applovin.impl.r3;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class f implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a, reason: collision with root package name */
    private h7 f22931a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f22932b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f22933c = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    private boolean f22934d;

    /* renamed from: e, reason: collision with root package name */
    private final k f22935e;

    /* renamed from: f, reason: collision with root package name */
    private final WeakReference f22936f;

    /* renamed from: g, reason: collision with root package name */
    private long f22937g;

    public interface a {
        void onAdRefresh();
    }

    public f(k kVar, a aVar) {
        this.f22936f = new WeakReference(aVar);
        this.f22935e = kVar;
    }

    private void e() {
        if (((Boolean) this.f22935e.a(r3.f22688I7)).booleanValue()) {
            k();
        }
    }

    private void f() {
        if (((Boolean) this.f22935e.a(r3.f22688I7)).booleanValue()) {
            synchronized (this.f22932b) {
                try {
                    if (this.f22934d) {
                        this.f22935e.O();
                        if (o.a()) {
                            this.f22935e.O().a("AdRefreshManager", "Fullscreen ad dismissed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh.");
                        }
                    } else if (this.f22935e.n0().isApplicationPaused()) {
                        this.f22935e.O();
                        if (o.a()) {
                            this.f22935e.O().a("AdRefreshManager", "Waiting for the application to enter foreground to resume the timer.");
                        }
                    } else {
                        h7 h7Var = this.f22931a;
                        if (h7Var != null) {
                            h7Var.e();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        l();
        a aVar = (a) this.f22936f.get();
        if (aVar != null) {
            aVar.onAdRefresh();
        }
    }

    private void k() {
        synchronized (this.f22932b) {
            try {
                h7 h7Var = this.f22931a;
                if (h7Var != null) {
                    h7Var.d();
                } else {
                    this.f22935e.O();
                    if (o.a()) {
                        this.f22935e.O().a("AdRefreshManager", "An ad load is in progress. Will pause refresh once the ad finishes loading.");
                    }
                    this.f22933c.set(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void l() {
        synchronized (this.f22932b) {
            try {
                this.f22931a = null;
                if (!((Boolean) this.f22935e.a(r3.f22689J7)).booleanValue()) {
                    AppLovinBroadcastManager.unregisterReceiver(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void n() {
        synchronized (this.f22932b) {
            try {
                h7 h7Var = this.f22931a;
                if (h7Var != null) {
                    h7Var.e();
                } else {
                    this.f22933c.set(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public long b() {
        long jC;
        synchronized (this.f22932b) {
            try {
                h7 h7Var = this.f22931a;
                jC = h7Var != null ? h7Var.c() : -1L;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jC;
    }

    public void c() {
        if (((Boolean) this.f22935e.a(r3.f22687H7)).booleanValue()) {
            k();
        }
    }

    public void d() {
        boolean z2;
        a aVar;
        if (((Boolean) this.f22935e.a(r3.f22687H7)).booleanValue()) {
            synchronized (this.f22932b) {
                try {
                    if (this.f22934d) {
                        this.f22935e.O();
                        if (o.a()) {
                            this.f22935e.O().a("AdRefreshManager", "Application resumed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh.");
                        }
                        return;
                    }
                    if (this.f22935e.H().c()) {
                        this.f22935e.O();
                        if (o.a()) {
                            this.f22935e.O().a("AdRefreshManager", "Waiting for the full screen ad to be dismissed to resume the timer.");
                        }
                        return;
                    }
                    if (this.f22931a != null) {
                        long jB = this.f22937g - b();
                        long jLongValue = ((Long) this.f22935e.a(r3.f22685G7)).longValue();
                        if (jLongValue < 0 || jB <= jLongValue) {
                            this.f22931a.e();
                            z2 = false;
                        } else {
                            a();
                            z2 = true;
                        }
                    } else {
                        z2 = false;
                    }
                    if (!z2 || (aVar = (a) this.f22936f.get()) == null) {
                        return;
                    }
                    aVar.onAdRefresh();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public boolean g() {
        return this.f22934d;
    }

    public boolean h() {
        boolean z2;
        synchronized (this.f22932b) {
            z2 = this.f22931a != null;
        }
        return z2;
    }

    public void j() {
        synchronized (this.f22932b) {
            k();
            this.f22934d = true;
        }
    }

    public void m() {
        synchronized (this.f22932b) {
            n();
            this.f22934d = false;
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            c();
            return;
        }
        if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            d();
        } else if ("com.applovin.fullscreen_ad_displayed".equals(action)) {
            e();
        } else if ("com.applovin.fullscreen_ad_hidden".equals(action)) {
            f();
        }
    }

    public void a(long j8) {
        synchronized (this.f22932b) {
            try {
                a();
                this.f22937g = j8;
                this.f22931a = h7.a(j8, this.f22935e, new com.applovin.adview.a(this, 5));
                if (!((Boolean) this.f22935e.a(r3.f22689J7)).booleanValue()) {
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_displayed"));
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_hidden"));
                }
                if (((Boolean) this.f22935e.a(r3.f22688I7)).booleanValue() && (this.f22935e.H().c() || this.f22935e.n0().isApplicationPaused())) {
                    this.f22931a.d();
                }
                if (this.f22933c.compareAndSet(true, false) && ((Boolean) this.f22935e.a(r3.f22690K7)).booleanValue()) {
                    this.f22935e.O();
                    if (o.a()) {
                        this.f22935e.O().a("AdRefreshManager", "Pausing refresh for a previous request.");
                    }
                    this.f22931a.d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a() {
        synchronized (this.f22932b) {
            try {
                h7 h7Var = this.f22931a;
                if (h7Var != null) {
                    h7Var.a();
                    l();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
