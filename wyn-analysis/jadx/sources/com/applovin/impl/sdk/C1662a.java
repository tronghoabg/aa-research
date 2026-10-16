package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.t1;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.sdk.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1662a implements AppLovinBroadcastManager.Receiver {

    /* renamed from: e, reason: collision with root package name */
    private static final long f22867e = TimeUnit.SECONDS.toMillis(2);

    /* renamed from: a, reason: collision with root package name */
    private final k f22868a;

    /* renamed from: b, reason: collision with root package name */
    private final o f22869b;

    /* renamed from: c, reason: collision with root package name */
    private final HashSet f22870c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private final Object f22871d = new Object();

    /* renamed from: com.applovin.impl.sdk.a$a, reason: collision with other inner class name */
    public interface InterfaceC0019a {
        void onAdExpired(t1 t1Var);
    }

    public C1662a(k kVar) {
        this.f22868a = kVar;
        this.f22869b = kVar.O();
    }

    private C1663b b(t1 t1Var) {
        synchronized (this.f22871d) {
            try {
                if (t1Var == null) {
                    return null;
                }
                Iterator it = this.f22870c.iterator();
                while (it.hasNext()) {
                    C1663b c1663b = (C1663b) it.next();
                    if (t1Var == c1663b.b()) {
                        return c1663b;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean a(t1 t1Var, InterfaceC0019a interfaceC0019a) {
        synchronized (this.f22871d) {
            try {
                if (b(t1Var) != null) {
                    if (o.a()) {
                        this.f22869b.a("AdExpirationManager", "Ad expiration already scheduled for ad: " + t1Var);
                    }
                    return true;
                }
                if (t1Var.getTimeToLiveMillis() <= f22867e) {
                    if (o.a()) {
                        this.f22869b.a("AdExpirationManager", "Ad has already expired: " + t1Var);
                    }
                    t1Var.setExpired();
                    return false;
                }
                if (o.a()) {
                    this.f22869b.a("AdExpirationManager", "Scheduling ad expiration " + TimeUnit.MILLISECONDS.toSeconds(t1Var.getTimeToLiveMillis()) + " seconds from now for " + t1Var + "...");
                }
                if (this.f22870c.isEmpty()) {
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
                }
                this.f22870c.add(C1663b.a(t1Var, interfaceC0019a, this.f22868a));
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            a();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            b();
        }
    }

    private void b() {
        HashSet hashSet = new HashSet();
        synchronized (this.f22871d) {
            try {
                Iterator it = this.f22870c.iterator();
                while (it.hasNext()) {
                    C1663b c1663b = (C1663b) it.next();
                    t1 t1VarB = c1663b.b();
                    if (t1VarB == null) {
                        hashSet.add(c1663b);
                    } else {
                        long timeToLiveMillis = t1VarB.getTimeToLiveMillis();
                        if (timeToLiveMillis <= 0) {
                            if (o.a()) {
                                this.f22869b.a("AdExpirationManager", "Ad expired while app was paused. Preparing to notify listener for ad: " + t1VarB);
                            }
                            hashSet.add(c1663b);
                        } else {
                            if (o.a()) {
                                this.f22869b.a("AdExpirationManager", "Rescheduling expiration with remaining " + TimeUnit.MILLISECONDS.toSeconds(timeToLiveMillis) + " seconds for ad: " + t1VarB);
                            }
                            c1663b.a(timeToLiveMillis);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            C1663b c1663b2 = (C1663b) it2.next();
            a(c1663b2);
            c1663b2.d();
        }
    }

    public void a(t1 t1Var) {
        synchronized (this.f22871d) {
            try {
                C1663b c1663bB = b(t1Var);
                if (c1663bB != null) {
                    if (o.a()) {
                        this.f22869b.a("AdExpirationManager", "Cancelling expiration timer for ad: " + t1Var);
                    }
                    c1663bB.a();
                    a(c1663bB);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(C1663b c1663b) {
        synchronized (this.f22871d) {
            try {
                this.f22870c.remove(c1663b);
                if (this.f22870c.isEmpty()) {
                    AppLovinBroadcastManager.unregisterReceiver(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void a() {
        synchronized (this.f22871d) {
            try {
                Iterator it = this.f22870c.iterator();
                while (it.hasNext()) {
                    ((C1663b) it.next()).a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
