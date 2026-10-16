package A7;

import c8.C1581e;

/* loaded from: classes4.dex */
public final class D {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f429f = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final String f430a;

    /* renamed from: b, reason: collision with root package name */
    public final C f431b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f432c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f433d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f434e = null;

    public D(String str, Object obj, C c10) {
        this.f430a = str;
        this.f432c = obj;
        this.f431b = c10;
    }

    public final Object a(Object obj) {
        synchronized (this.f433d) {
        }
        if (obj != null) {
            return obj;
        }
        if (I0.k == null) {
            return this.f432c;
        }
        synchronized (f429f) {
            try {
                if (C1581e.e()) {
                    return this.f434e == null ? this.f432c : this.f434e;
                }
                try {
                    for (D d3 : AbstractC0304y.f1166a) {
                        if (C1581e.e()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object objZza = null;
                        try {
                            C c10 = d3.f431b;
                            if (c10 != null) {
                                objZza = c10.zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f429f) {
                            d3.f434e = objZza;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                C c11 = this.f431b;
                if (c11 == null) {
                    return this.f432c;
                }
                try {
                    return c11.zza();
                } catch (IllegalStateException unused3) {
                    return this.f432c;
                } catch (SecurityException unused4) {
                    return this.f432c;
                }
            } finally {
            }
        }
    }
}
