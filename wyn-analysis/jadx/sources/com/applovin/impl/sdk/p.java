package com.applovin.impl.sdk;

import com.applovin.impl.y2;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private final o f23231a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f23232b = new HashMap(5);

    /* renamed from: c, reason: collision with root package name */
    private final Object f23233c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final Map f23234d = DesugarCollections.synchronizedMap(new HashMap(5));

    /* renamed from: e, reason: collision with root package name */
    private final Map f23235e = DesugarCollections.synchronizedMap(new HashMap(5));

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f23236a;

        /* renamed from: b, reason: collision with root package name */
        private final String f23237b;

        /* renamed from: c, reason: collision with root package name */
        private final String f23238c;

        public a(String str, String str2, String str3) {
            this.f23236a = str;
            this.f23237b = str2;
            this.f23238c = str3;
        }

        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public String b() {
            return this.f23236a;
        }

        public String c() {
            return this.f23238c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!aVar.a(this)) {
                return false;
            }
            String strB = b();
            String strB2 = aVar.b();
            if (strB != null ? !strB.equals(strB2) : strB2 != null) {
                return false;
            }
            String strA = a();
            String strA2 = aVar.a();
            if (strA != null ? !strA.equals(strA2) : strA2 != null) {
                return false;
            }
            String strC = c();
            String strC2 = aVar.c();
            return strC != null ? strC.equals(strC2) : strC2 == null;
        }

        public int hashCode() {
            String strB = b();
            int iHashCode = strB == null ? 43 : strB.hashCode();
            String strA = a();
            int iHashCode2 = ((iHashCode + 59) * 59) + (strA == null ? 43 : strA.hashCode());
            String strC = c();
            return (iHashCode2 * 59) + (strC != null ? strC.hashCode() : 43);
        }

        public String toString() {
            return "MediationWaterfallWinnerTracker.WinningAd(bCode=" + b() + ", adapterName=" + a() + ", networkName=" + c() + ")";
        }

        public String a() {
            return this.f23237b;
        }
    }

    public p(k kVar) {
        this.f23231a = kVar.O();
    }

    public String a(String str) {
        return (String) this.f23235e.get(str);
    }

    public void b(y2 y2Var) {
        this.f23234d.put(y2Var.getAdUnitId(), y2Var.O());
    }

    public void c(y2 y2Var) {
        synchronized (this.f23233c) {
            try {
                if (o.a()) {
                    this.f23231a.a("MediationWaterfallWinnerTracker", "Tracking winning ad: " + y2Var);
                }
                this.f23232b.put(y2Var.getAdUnitId(), new a(y2Var.B(), y2Var.c(), y2Var.getNetworkName()));
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f23235e.put(y2Var.getAdUnitId(), y2Var.O());
    }

    public void a(y2 y2Var) {
        synchronized (this.f23233c) {
            try {
                String adUnitId = y2Var.getAdUnitId();
                a aVar = (a) this.f23232b.get(adUnitId);
                if (aVar == null) {
                    if (o.a()) {
                        this.f23231a.a("MediationWaterfallWinnerTracker", "No previous winner to clear.");
                    }
                    return;
                }
                if (y2Var.B().equals(aVar.b())) {
                    if (o.a()) {
                        this.f23231a.a("MediationWaterfallWinnerTracker", "Clearing previous winning ad: " + aVar);
                    }
                    this.f23232b.remove(adUnitId);
                } else if (o.a()) {
                    this.f23231a.a("MediationWaterfallWinnerTracker", "Previous winner not cleared for ad: " + y2Var + " , since it could have already been updated with a new ad: " + aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String b(String str) {
        return (String) this.f23234d.get(str);
    }

    public a c(String str) {
        a aVar;
        synchronized (this.f23233c) {
            aVar = (a) this.f23232b.get(str);
        }
        return aVar;
    }
}
