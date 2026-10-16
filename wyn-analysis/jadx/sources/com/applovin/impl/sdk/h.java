package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.applovin.impl.d2;
import com.applovin.impl.o7;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.y4;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.tika.metadata.OfficeOpenXMLExtended;

/* loaded from: classes.dex */
public class h implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a, reason: collision with root package name */
    private final k f22961a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference f22962b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f22963c;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f22964d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicLong f22965e = new AtomicLong(0);

    /* renamed from: f, reason: collision with root package name */
    private long f22966f;

    /* renamed from: g, reason: collision with root package name */
    private long f22967g;

    /* renamed from: h, reason: collision with root package name */
    private long f22968h;

    public enum b {
        INELIGIBLE,
        IDLE,
        MONITORING
    }

    public class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            if (h.this.f22962b.get() != b.MONITORING) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - h.this.f22965e.get();
            if (jCurrentTimeMillis >= 0 && jCurrentTimeMillis <= h.this.f22966f) {
                h.this.f22964d.postDelayed(this, h.this.f22968h);
                return;
            }
            h.this.f22962b.set(b.INELIGIBLE);
            AppLovinBroadcastManager.unregisterReceiver(h.this);
            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
            if (stackTrace.length > 0) {
                StackTraceElement stackTraceElement = stackTrace[0];
                str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            } else {
                str = OfficeOpenXMLExtended.SECURITY_NONE;
            }
            long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - k.n());
            HashMap map = new HashMap(3);
            map.put("top_main_method", str);
            map.put("source", h.this.f22961a.A0() ? "non_first_session" : "first_session");
            map.put("details", "seconds_since_app_launch=" + seconds);
            h.this.f22961a.D().d(d2.f21264E0, map);
        }
    }

    public class d implements Runnable {
        private d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (h.this.f22962b.get() != b.MONITORING) {
                return;
            }
            h.this.f22965e.set(System.currentTimeMillis());
            h.this.f22963c.postDelayed(this, h.this.f22967g);
        }
    }

    public h(k kVar) {
        this.f22961a = kVar;
        this.f22962b = new AtomicReference(!o7.c(kVar) ? b.IDLE : b.INELIGIBLE);
        this.f22963c = new Handler(k.o().getMainLooper());
        HandlerThread handlerThread = new HandlerThread("AppLovinSdk:anr_detector");
        handlerThread.start();
        this.f22964d = new Handler(handlerThread.getLooper());
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            b();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            c();
        }
    }

    private void b() {
        AtomicReference atomicReference = this.f22962b;
        b bVar = b.MONITORING;
        b bVar2 = b.IDLE;
        while (!atomicReference.compareAndSet(bVar, bVar2)) {
            if (atomicReference.get() != bVar) {
                return;
            }
        }
        this.f22963c.removeCallbacksAndMessages(null);
        this.f22964d.removeCallbacksAndMessages(null);
    }

    private void c() {
        if (((Boolean) this.f22961a.a(y4.f23803g6)).booleanValue() && this.f22961a.n0().getCurrentApplicationState() == SessionTracker.e.PAUSED) {
            return;
        }
        AtomicReference atomicReference = this.f22962b;
        b bVar = b.IDLE;
        b bVar2 = b.MONITORING;
        while (!atomicReference.compareAndSet(bVar, bVar2)) {
            if (atomicReference.get() != bVar) {
                return;
            }
        }
        this.f22963c.post(new d());
        this.f22964d.postDelayed(new c(), this.f22968h / 2);
    }

    private void d() {
        AppLovinBroadcastManager.unregisterReceiver(this);
        this.f22966f = ((Long) this.f22961a.a(y4.f23778d6)).longValue();
        this.f22967g = ((Long) this.f22961a.a(y4.f23787e6)).longValue();
        this.f22968h = ((Long) this.f22961a.a(y4.f23794f6)).longValue();
        if (((Boolean) this.f22961a.a(y4.f23803g6)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
        }
    }

    public void a() {
        if (this.f22962b.get() == b.INELIGIBLE) {
            return;
        }
        if (!((Boolean) this.f22961a.a(y4.f23771c6)).booleanValue()) {
            b();
        } else {
            d();
            c();
        }
    }
}
