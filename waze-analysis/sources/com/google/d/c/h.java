package com.google.d.c;

import java.util.logging.Level;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    static final com.google.d.b.aj f7367a = com.google.d.b.an.b(new c());

    /* renamed from: b, reason: collision with root package name */
    static final com.google.d.b.aq f7368b;

    /* renamed from: h, reason: collision with root package name */
    bi f7374h;

    /* renamed from: i, reason: collision with root package name */
    al f7375i;

    /* renamed from: j, reason: collision with root package name */
    al f7376j;
    com.google.d.b.s m;
    com.google.d.b.s n;
    bg o;
    com.google.d.b.aq p;

    /* renamed from: c, reason: collision with root package name */
    boolean f7369c = true;

    /* renamed from: d, reason: collision with root package name */
    int f7370d = -1;

    /* renamed from: e, reason: collision with root package name */
    int f7371e = -1;

    /* renamed from: f, reason: collision with root package name */
    long f7372f = -1;

    /* renamed from: g, reason: collision with root package name */
    long f7373g = -1;

    /* renamed from: k, reason: collision with root package name */
    long f7377k = -1;

    /* renamed from: l, reason: collision with root package name */
    long f7378l = -1;
    final com.google.d.b.aj q = f7367a;

    static {
        new k();
        f7368b = new d();
    }

    private h() {
    }

    public static h b() {
        return new h();
    }

    public final b a() {
        if (this.f7374h == null) {
            com.google.d.b.an.v(this.f7373g == -1, "maximumWeight requires weigher");
        } else {
            boolean z = this.f7369c;
            long j2 = this.f7373g;
            if (z) {
                com.google.d.b.an.v(j2 != -1, "weigher requires maximumWeight");
            } else if (j2 == -1) {
                e.f7362a.logp(Level.WARNING, "com.google.common.cache.CacheBuilder", "checkWeightWithWeigher", "ignoring weigher specified without maximumWeight");
            }
        }
        com.google.d.b.an.v(true, "refreshAfterWrite requires a LoadingCache");
        return new ag(this);
    }

    final al c() {
        return (al) com.google.d.b.an.I(this.f7375i, al.f7299a);
    }

    final al d() {
        return (al) com.google.d.b.an.I(this.f7376j, al.f7299a);
    }

    public final void e() {
        int i2 = this.f7370d;
        com.google.d.b.an.w(i2 == -1, "initial capacity was already set to %s", i2);
        com.google.d.b.an.l(true);
        this.f7370d = 10;
    }

    public final void f(long j2) {
        long j3 = this.f7372f;
        com.google.d.b.an.x(j3 == -1, "maximum size was already set to %s", j3);
        long j4 = this.f7373g;
        com.google.d.b.an.x(j4 == -1, "maximum weight was already set to %s", j4);
        com.google.d.b.an.v(this.f7374h == null, "maximum size can not be combined with weigher");
        com.google.d.b.an.m(true, "maximum size must not be negative");
        this.f7372f = j2;
    }

    public final String toString() {
        com.google.d.b.z zVarH = com.google.d.b.an.H(this);
        int i2 = this.f7370d;
        if (i2 != -1) {
            zVarH.b("initialCapacity", i2);
        }
        int i3 = this.f7371e;
        if (i3 != -1) {
            zVarH.b("concurrencyLevel", i3);
        }
        long j2 = this.f7372f;
        if (j2 != -1) {
            zVarH.c("maximumSize", j2);
        }
        long j3 = this.f7373g;
        if (j3 != -1) {
            zVarH.c("maximumWeight", j3);
        }
        long j4 = this.f7377k;
        if (j4 != -1) {
            zVarH.d("expireAfterWrite", j4 + "ns");
        }
        long j5 = this.f7378l;
        if (j5 != -1) {
            zVarH.d("expireAfterAccess", j5 + "ns");
        }
        al alVar = this.f7375i;
        if (alVar != null) {
            zVarH.d("keyStrength", com.google.d.b.an.K(alVar.toString()));
        }
        al alVar2 = this.f7376j;
        if (alVar2 != null) {
            zVarH.d("valueStrength", com.google.d.b.an.K(alVar2.toString()));
        }
        if (this.m != null) {
            zVarH.g("keyEquivalence");
        }
        if (this.n != null) {
            zVarH.g("valueEquivalence");
        }
        if (this.o != null) {
            zVarH.g("removalListener");
        }
        return zVarH.toString();
    }
}
