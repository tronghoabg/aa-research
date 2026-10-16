package com.applovin.impl.sdk;

import com.applovin.impl.C1666u;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final k f22926a;

    /* renamed from: b, reason: collision with root package name */
    private final o f22927b;

    /* renamed from: d, reason: collision with root package name */
    private final Map f22929d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final Map f22930e = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Object f22928c = new Object();

    public e(k kVar) {
        this.f22926a = kVar;
        this.f22927b = kVar.O();
        for (C1666u c1666u : C1666u.a()) {
            this.f22929d.put(c1666u, new q());
            this.f22930e.put(c1666u, new q());
        }
    }

    private q c(C1666u c1666u) {
        synchronized (this.f22928c) {
            try {
                q qVarB = b(c1666u);
                if (qVarB.b() > 0) {
                    return qVarB;
                }
                return d(c1666u);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private q d(C1666u c1666u) {
        q qVar;
        synchronized (this.f22928c) {
            try {
                qVar = (q) this.f22929d.get(c1666u);
                if (qVar == null) {
                    qVar = new q();
                    this.f22929d.put(c1666u, qVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return qVar;
    }

    public void a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f22928c) {
            try {
                d(appLovinAdImpl.getAdZone()).a(appLovinAdImpl);
                if (o.a()) {
                    this.f22927b.a("AdPreloadManager", "Ad enqueued: " + appLovinAdImpl);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f22928c) {
            c(appLovinAdImpl.getAdZone()).b(appLovinAdImpl);
        }
    }

    public AppLovinAdImpl e(C1666u c1666u) {
        com.applovin.impl.sdk.ad.c cVar;
        synchronized (this.f22928c) {
            try {
                q qVarD = d(c1666u);
                if (qVarD.b() > 0) {
                    b(c1666u).a(qVarD.a());
                    cVar = new com.applovin.impl.sdk.ad.c(c1666u, this.f22926a);
                } else {
                    cVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (cVar != null) {
            if (o.a()) {
                this.f22927b.a("AdPreloadManager", "Retrieved ad of zone " + c1666u + "...");
                return cVar;
            }
        } else if (o.a()) {
            this.f22927b.a("AdPreloadManager", "Unable to retrieve ad of zone " + c1666u + "...");
        }
        return cVar;
    }

    public AppLovinAdBase f(C1666u c1666u) {
        AppLovinAdImpl appLovinAdImplD;
        synchronized (this.f22928c) {
            appLovinAdImplD = c(c1666u).d();
        }
        return appLovinAdImplD;
    }

    private q b(C1666u c1666u) {
        q qVar;
        synchronized (this.f22928c) {
            try {
                qVar = (q) this.f22930e.get(c1666u);
                if (qVar == null) {
                    qVar = new q();
                    this.f22930e.put(c1666u, qVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return qVar;
    }

    public AppLovinAdImpl a(C1666u c1666u) {
        AppLovinAdImpl appLovinAdImplA;
        synchronized (this.f22928c) {
            appLovinAdImplA = c(c1666u).a();
        }
        return appLovinAdImplA;
    }
}
