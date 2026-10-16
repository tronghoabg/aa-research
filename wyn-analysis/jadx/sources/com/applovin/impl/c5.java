package com.applovin.impl;

import A7.AbstractC0279p0;
import Va.M6;
import android.os.SystemClock;
import com.applovin.mediation.MaxAdFormat;
import com.qonversion.android.sdk.internal.Constants;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class c5 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f21198a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f21199b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Object f21200c = new Object();

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f21201a;

        static {
            int[] iArr = new int[b.values().length];
            f21201a = iArr;
            try {
                iArr[b.AD_FORMAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21201a[b.AD_UNIT_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21201a[b.ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum b {
        AD_FORMAT,
        AD_UNIT_ID,
        ALL
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private final d5 f21206a;

        /* renamed from: b, reason: collision with root package name */
        private final long f21207b;

        /* renamed from: c, reason: collision with root package name */
        private final long f21208c;

        public /* synthetic */ c(d5 d5Var, long j8, a aVar) {
            this(d5Var, j8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean d() {
            return SystemClock.elapsedRealtime() - this.f21208c > this.f21207b;
        }

        public boolean a(Object obj) {
            return obj instanceof c;
        }

        public d5 c() {
            return this.f21206a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!cVar.a((Object) this) || b() != cVar.b() || a() != cVar.a()) {
                return false;
            }
            d5 d5VarC = c();
            d5 d5VarC2 = cVar.c();
            return d5VarC != null ? d5VarC.equals(d5VarC2) : d5VarC2 == null;
        }

        public int hashCode() {
            long jB = b();
            long jA = a();
            d5 d5VarC = c();
            return ((((((int) (jB ^ (jB >>> 32))) + 59) * 59) + ((int) ((jA >>> 32) ^ jA))) * 59) + (d5VarC == null ? 43 : d5VarC.hashCode());
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("SignalCacheManager.SignalWrapper(signal=");
            sb2.append(c());
            sb2.append(", expirationTimeMillis=");
            sb2.append(b());
            sb2.append(", cacheTimestampMillis=");
            return M6.s(sb2, a(), ")");
        }

        private c(d5 d5Var, long j8) {
            this.f21206a = d5Var;
            this.f21207b = j8;
            this.f21208c = SystemClock.elapsedRealtime();
        }

        public long b() {
            return this.f21207b;
        }

        public long a() {
            return this.f21208c;
        }
    }

    public c5(com.applovin.impl.sdk.k kVar) {
        this.f21198a = kVar;
    }

    public void a(d5 d5Var, e5 e5Var, String str, MaxAdFormat maxAdFormat) {
        if (d5Var == null) {
            return;
        }
        long jV = e5Var.v();
        if (jV <= 0) {
            return;
        }
        this.f21198a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f21198a.O().a("SignalCacheManager", "Caching signal for: " + e5Var);
        }
        String strA = a(e5Var, str, maxAdFormat);
        c cVar = new c(d5Var, jV, null);
        synchronized (this.f21200c) {
            this.f21199b.put(strA, cVar);
        }
    }

    public d5 b(e5 e5Var, String str, MaxAdFormat maxAdFormat) {
        String strA = a(e5Var, str, maxAdFormat);
        synchronized (this.f21200c) {
            try {
                c cVar = (c) this.f21199b.get(strA);
                if (cVar == null) {
                    return null;
                }
                if (cVar.d()) {
                    this.f21199b.remove(strA);
                    return null;
                }
                this.f21198a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21198a.O().a("SignalCacheManager", "Returning cached signal for: " + e5Var);
                }
                return cVar.f21206a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private String a(e5 e5Var, String str, MaxAdFormat maxAdFormat) {
        String strC = e5Var.c();
        int i5 = a.f21201a[e5Var.t().ordinal()];
        if (i5 != 1) {
            return i5 != 2 ? strC : N0.a.g(strC, Constants.USER_ID_SEPARATOR, str);
        }
        StringBuilder sbQ = AbstractC0279p0.q(strC, Constants.USER_ID_SEPARATOR);
        sbQ.append(maxAdFormat.getLabel());
        return sbQ.toString();
    }
}
