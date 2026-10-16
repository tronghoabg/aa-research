package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import com.applovin.impl.AbstractC1626b;
import com.applovin.impl.o7;
import com.applovin.impl.y4;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public class SessionTracker {
    public static final String ACTION_APPLICATION_PAUSED = "com.applovin.application_paused";
    public static final String ACTION_APPLICATION_RESUMED = "com.applovin.application_resumed";

    /* renamed from: a, reason: collision with root package name */
    final k f22849a;

    /* renamed from: b, reason: collision with root package name */
    private final String f22850b = UUID.randomUUID().toString();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f22851c = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f22852d = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    private final AtomicInteger f22853e = new AtomicInteger();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicLong f22854f = new AtomicLong();

    /* renamed from: g, reason: collision with root package name */
    private final AtomicLong f22855g = new AtomicLong();

    /* renamed from: h, reason: collision with root package name */
    private Date f22856h;

    /* renamed from: i, reason: collision with root package name */
    private Date f22857i;

    public class a extends AbstractC1626b {
        public a() {
        }

        @Override // com.applovin.impl.AbstractC1626b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            super.onActivityResumed(activity);
            SessionTracker.this.b();
        }
    }

    public class b implements ComponentCallbacks2 {
        public b() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i5) {
            SessionTracker.this.f22853e.set(i5);
            if (i5 == 20) {
                SessionTracker.this.a();
            }
        }
    }

    public class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("android.intent.action.USER_PRESENT".equals(action)) {
                if (o7.g()) {
                    SessionTracker.this.b();
                }
            } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                SessionTracker.this.a();
            }
        }
    }

    public static /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22861a;

        static {
            int[] iArr = new int[e.values().length];
            f22861a = iArr;
            try {
                iArr[e.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22861a[e.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22861a[e.RESUMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum e {
        STARTED("started"),
        PAUSED("paused"),
        RESUMED("resumed");


        /* renamed from: a, reason: collision with root package name */
        private final String f22866a;

        e(String str) {
            this.f22866a = str;
        }

        public String b() {
            return this.f22866a;
        }
    }

    public SessionTracker(k kVar) {
        this.f22849a = kVar;
        Application application = (Application) k.o();
        application.registerActivityLifecycleCallbacks(new a());
        application.registerComponentCallbacks(new b());
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        application.registerReceiver(new c(), intentFilter);
    }

    private void d() {
        this.f22849a.O();
        if (o.a()) {
            this.f22849a.O().a("SessionTracker", "Application Resumed");
        }
        this.f22855g.set(System.currentTimeMillis());
        boolean zBooleanValue = ((Boolean) this.f22849a.a(y4.f23951z3)).booleanValue();
        long jLongValue = ((Long) this.f22849a.a(y4.f23554A3)).longValue();
        AppLovinBroadcastManager.sendBroadcastSync(new Intent(ACTION_APPLICATION_RESUMED), null);
        if (this.f22851c.getAndSet(false)) {
            return;
        }
        long millis = TimeUnit.MINUTES.toMillis(jLongValue);
        if (this.f22857i == null || System.currentTimeMillis() - this.f22857i.getTime() >= millis) {
            this.f22849a.F().trackEvent("resumed");
            if (zBooleanValue) {
                this.f22857i = new Date();
            }
        }
        if (zBooleanValue) {
            return;
        }
        this.f22857i = new Date();
    }

    public long getAppEnteredBackgroundTimeMillis() {
        return this.f22854f.get();
    }

    public long getAppEnteredForegroundTimeMillis() {
        return this.f22855g.get();
    }

    public e getCurrentApplicationState() {
        return this.f22852d.get() ? e.PAUSED : this.f22854f.get() != 0 ? e.RESUMED : e.STARTED;
    }

    public long getCurrentApplicationStateDurationMillis() {
        long jN;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i5 = d.f22861a[getCurrentApplicationState().ordinal()];
        if (i5 == 1) {
            jN = k.n();
        } else if (i5 == 2) {
            jN = this.f22854f.get();
        } else {
            if (i5 != 3) {
                return -1L;
            }
            jN = this.f22855g.get();
        }
        return jCurrentTimeMillis - jN;
    }

    public int getLastTrimMemoryLevel() {
        return this.f22853e.get();
    }

    public String getSessionId() {
        return this.f22850b;
    }

    public boolean isApplicationPaused() {
        return this.f22852d.get();
    }

    public void pauseForClick() {
        this.f22851c.set(true);
    }

    public void resumeForClick() {
        this.f22851c.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.f22852d.compareAndSet(false, true)) {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.f22852d.compareAndSet(true, false)) {
            d();
        }
    }

    private void c() {
        this.f22849a.O();
        if (o.a()) {
            this.f22849a.O().a("SessionTracker", "Application Paused");
        }
        this.f22854f.set(System.currentTimeMillis());
        AppLovinBroadcastManager.sendBroadcastSync(new Intent(ACTION_APPLICATION_PAUSED), null);
        if (this.f22851c.get()) {
            return;
        }
        boolean zBooleanValue = ((Boolean) this.f22849a.a(y4.f23951z3)).booleanValue();
        long millis = TimeUnit.MINUTES.toMillis(((Long) this.f22849a.a(y4.f23561B3)).longValue());
        if (this.f22856h == null || System.currentTimeMillis() - this.f22856h.getTime() >= millis) {
            this.f22849a.F().trackEvent("paused");
            if (zBooleanValue) {
                this.f22856h = new Date();
            }
        }
        if (zBooleanValue) {
            return;
        }
        this.f22856h = new Date();
    }
}
