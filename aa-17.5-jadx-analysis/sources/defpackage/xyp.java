package defpackage;

import java.util.logging.Level;

/* loaded from: classes3.dex */
public final class xyp {
    static final xyc a = new xyf(new ysi());
    static final xyi b = new xyl();
    xzv g;
    xzv h;
    xww k;
    xww l;
    xyi m;
    xyo o;
    xyn p;
    boolean c = true;
    int d = -1;
    long e = -1;
    long f = -1;
    long i = -1;
    long j = -1;
    final xyc n = a;

    private final void h() {
        if (this.o == null) {
            woy.aa(this.f == -1, "maximumWeight requires weigher");
            return;
        }
        boolean z = this.c;
        long j = this.f;
        if (z) {
            woy.aa(j != -1, "weigher requires maximumWeight");
        } else if (j == -1) {
            xym.a.logp(Level.WARNING, "com.google.common.cache.CacheBuilder", "checkWeightWithWeigher", "ignoring weigher specified without maximumWeight");
        }
    }

    public final xyk a() {
        h();
        return new xzq(new yan(this, null));
    }

    public final xys b(xyr xyrVar) {
        h();
        return new xzo(this, xyrVar);
    }

    final xzv c() {
        return (xzv) woy.ap(this.g, xzv.a);
    }

    final xzv d() {
        return (xzv) woy.ap(this.h, xzv.a);
    }

    public final void e(long j) {
        long j2 = this.e;
        woy.ac(j2 == -1, "maximum size was already set to %s", j2);
        long j3 = this.f;
        woy.ac(j3 == -1, "maximum weight was already set to %s", j3);
        woy.aa(this.o == null, "maximum size can not be combined with weigher");
        this.e = j;
    }

    final void f(xzv xzvVar) {
        xzv xzvVar2 = this.g;
        woy.ad(xzvVar2 == null, "Key strength was already set to %s", xzvVar2);
        xzvVar.getClass();
        this.g = xzvVar;
    }

    public final void g() {
        f(xzv.c);
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        int i = this.d;
        if (i != -1) {
            xxgVarAo.f("concurrencyLevel", i);
        }
        long j = this.e;
        if (j != -1) {
            xxgVarAo.g("maximumSize", j);
        }
        long j2 = this.f;
        if (j2 != -1) {
            xxgVarAo.g("maximumWeight", j2);
        }
        long j3 = this.i;
        if (j3 != -1) {
            xxgVarAo.b("expireAfterWrite", j3 + "ns");
        }
        long j4 = this.j;
        if (j4 != -1) {
            xxgVarAo.b("expireAfterAccess", j4 + "ns");
        }
        xzv xzvVar = this.g;
        if (xzvVar != null) {
            xxgVarAo.b("keyStrength", woy.ar(xzvVar.toString()));
        }
        xzv xzvVar2 = this.h;
        if (xzvVar2 != null) {
            xxgVarAo.b("valueStrength", woy.ar(xzvVar2.toString()));
        }
        if (this.k != null) {
            xxgVarAo.a("keyEquivalence");
        }
        if (this.l != null) {
            xxgVarAo.a("valueEquivalence");
        }
        if (this.p != null) {
            xxgVarAo.a("removalListener");
        }
        return xxgVarAo.toString();
    }
}
