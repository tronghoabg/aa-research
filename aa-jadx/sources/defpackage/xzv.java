package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xzv {
    static final defpackage.xzi a = new defpackage.xzl(new defpackage.wpu());
    static final defpackage.xzo b = new defpackage.xzr();
    defpackage.ybb g;
    defpackage.ybb h;
    defpackage.xyc k;
    defpackage.xyc l;
    defpackage.xzo m;
    defpackage.xzu o;
    defpackage.xzt p;
    boolean c = true;
    int d = -1;
    long e = -1;
    long f = -1;
    long i = -1;
    long j = -1;
    final defpackage.xzi n = a;

    private final void h() {
        if (this.o == null) {
            defpackage.ysr.bk(this.f == -1, "maximumWeight requires weigher");
            return;
        }
        boolean z = this.c;
        long j = this.f;
        if (z) {
            defpackage.ysr.bk(j != -1, "weigher requires maximumWeight");
        } else if (j == -1) {
            defpackage.xzs.a.logp(java.util.logging.Level.WARNING, "com.google.common.cache.CacheBuilder", "checkWeightWithWeigher", "ignoring weigher specified without maximumWeight");
        }
    }

    public final defpackage.xzq a() {
        h();
        return new defpackage.yaw(new defpackage.ybt(this, null));
    }

    public final defpackage.xzy b(defpackage.xzx xzxVar) {
        h();
        return new defpackage.yau(this, xzxVar);
    }

    final defpackage.ybb c() {
        return (defpackage.ybb) defpackage.ysr.bz(this.g, defpackage.ybb.a);
    }

    final defpackage.ybb d() {
        return (defpackage.ybb) defpackage.ysr.bz(this.h, defpackage.ybb.a);
    }

    public final void e(long j) {
        long j2 = this.e;
        defpackage.ysr.bm(j2 == -1, "maximum size was already set to %s", j2);
        long j3 = this.f;
        defpackage.ysr.bm(j3 == -1, "maximum weight was already set to %s", j3);
        defpackage.ysr.bk(this.o == null, "maximum size can not be combined with weigher");
        this.e = j;
    }

    final void f(defpackage.ybb ybbVar) {
        defpackage.ybb ybbVar2 = this.g;
        defpackage.ysr.bn(ybbVar2 == null, "Key strength was already set to %s", ybbVar2);
        ybbVar.getClass();
        this.g = ybbVar;
    }

    public final void g() {
        f(defpackage.ybb.c);
    }

    public final java.lang.String toString() {
        defpackage.xym xymVarBy = defpackage.ysr.by(this);
        int i = this.d;
        if (i != -1) {
            xymVarBy.f("concurrencyLevel", i);
        }
        long j = this.e;
        if (j != -1) {
            xymVarBy.g("maximumSize", j);
        }
        long j2 = this.f;
        if (j2 != -1) {
            xymVarBy.g("maximumWeight", j2);
        }
        long j3 = this.i;
        if (j3 != -1) {
            xymVarBy.b("expireAfterWrite", j3 + "ns");
        }
        long j4 = this.j;
        if (j4 != -1) {
            xymVarBy.b("expireAfterAccess", j4 + "ns");
        }
        defpackage.ybb ybbVar = this.g;
        if (ybbVar != null) {
            xymVarBy.b("keyStrength", defpackage.ysr.bB(ybbVar.toString()));
        }
        defpackage.ybb ybbVar2 = this.h;
        if (ybbVar2 != null) {
            xymVarBy.b("valueStrength", defpackage.ysr.bB(ybbVar2.toString()));
        }
        if (this.k != null) {
            xymVarBy.a("keyEquivalence");
        }
        if (this.l != null) {
            xymVarBy.a("valueEquivalence");
        }
        if (this.p != null) {
            xymVarBy.a("removalListener");
        }
        return xymVarBy.toString();
    }
}
