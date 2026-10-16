package com.applovin.impl.sdk;

import com.applovin.impl.w3;
import com.applovin.impl.y4;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class n {

    /* renamed from: j, reason: collision with root package name */
    private static final a f23100j = new a();

    /* renamed from: a, reason: collision with root package name */
    private final k f23101a;

    /* renamed from: c, reason: collision with root package name */
    private long f23103c;

    /* renamed from: f, reason: collision with root package name */
    private long f23106f;

    /* renamed from: g, reason: collision with root package name */
    private Object f23107g;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f23102b = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    private final Object f23104d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f23105e = new AtomicBoolean();

    /* renamed from: h, reason: collision with root package name */
    private final Map f23108h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    private final Object f23109i = new Object();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private long f23110a = -1;

        /* renamed from: b, reason: collision with root package name */
        private int f23111b;

        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public long b() {
            return this.f23110a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.a((Object) this) && b() == aVar.b() && a() == aVar.a();
        }

        public int hashCode() {
            long jB = b();
            return a() + ((((int) (jB ^ (jB >>> 32))) + 59) * 59);
        }

        public String toString() {
            return "FullScreenAdTracker.LostShowAttemptsData(lastAttemptedTimeMillis=" + b() + ", attemptCount=" + a() + ")";
        }

        public static /* synthetic */ int a(a aVar) {
            int i5 = aVar.f23111b;
            aVar.f23111b = i5 + 1;
            return i5;
        }

        public int a() {
            return this.f23111b;
        }
    }

    public n(k kVar) {
        this.f23101a = kVar;
    }

    public boolean c() {
        return this.f23102b.get();
    }

    public boolean d() {
        return this.f23105e.get();
    }

    public void a(boolean z2) {
        synchronized (this.f23104d) {
            try {
                this.f23105e.set(z2);
                if (z2) {
                    this.f23106f = System.currentTimeMillis();
                    this.f23101a.O();
                    if (o.a()) {
                        this.f23101a.O().a("FullScreenAdTracker", "Setting fullscreen ad pending display: " + this.f23106f);
                    }
                    Long l10 = (Long) this.f23101a.a(y4.f23659O1);
                    if (l10.longValue() >= 0) {
                        AppLovinSdkUtils.runOnUiThreadDelayed(new u(5, this, l10), l10.longValue());
                    }
                } else {
                    this.f23106f = 0L;
                    this.f23101a.O();
                    if (o.a()) {
                        this.f23101a.O().a("FullScreenAdTracker", "Setting fullscreen ad not pending display: " + System.currentTimeMillis());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public long b() {
        return this.f23103c;
    }

    public void c(String str) {
        synchronized (this.f23109i) {
            try {
                a aVar = (a) this.f23108h.get(str);
                if (aVar == null) {
                    aVar = new a();
                    this.f23108h.put(str, aVar);
                }
                aVar.f23110a = System.currentTimeMillis();
                a.a(aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(Object obj) {
        if (!w3.a(obj) && this.f23102b.compareAndSet(true, false)) {
            this.f23107g = null;
            this.f23101a.O();
            if (o.a()) {
                this.f23101a.O().a("FullScreenAdTracker", "Setting fullscreen ad hidden: " + System.currentTimeMillis());
            }
            AppLovinBroadcastManager.sendBroadcastWithAdObject("com.applovin.fullscreen_ad_hidden", obj);
        }
    }

    public a b(String str) {
        a aVar;
        synchronized (this.f23109i) {
            aVar = (a) this.f23108h.get(str);
            if (aVar == null) {
                aVar = f23100j;
            }
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Long l10) {
        if (d() && System.currentTimeMillis() - this.f23106f >= l10.longValue()) {
            this.f23101a.O();
            if (o.a()) {
                this.f23101a.O().a("FullScreenAdTracker", "Resetting \"pending display\" state...");
            }
            this.f23105e.set(false);
        }
    }

    public Object a() {
        return this.f23107g;
    }

    public void a(Object obj) {
        if (!w3.a(obj) && this.f23102b.compareAndSet(false, true)) {
            this.f23107g = obj;
            this.f23103c = System.currentTimeMillis();
            this.f23101a.O();
            if (o.a()) {
                this.f23101a.O().a("FullScreenAdTracker", "Setting fullscreen ad displayed: " + this.f23103c);
            }
            AppLovinBroadcastManager.sendBroadcastWithAdObject("com.applovin.fullscreen_ad_displayed", obj);
            Long l10 = (Long) this.f23101a.a(y4.f23666P1);
            if (l10.longValue() >= 0) {
                AppLovinSdkUtils.runOnUiThreadDelayed(new s(this, l10, obj, 3), l10.longValue());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Long l10, Object obj) {
        if (this.f23102b.get() && System.currentTimeMillis() - this.f23103c >= l10.longValue()) {
            this.f23101a.O();
            if (o.a()) {
                this.f23101a.O().a("FullScreenAdTracker", "Resetting \"display\" state...");
            }
            b(obj);
        }
    }

    public void a(String str) {
        synchronized (this.f23109i) {
            this.f23108h.remove(str);
        }
    }
}
