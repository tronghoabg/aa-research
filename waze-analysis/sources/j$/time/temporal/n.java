package j$.time.temporal;

import j$.util.Objects;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final j$.desugar.sun.nio.fs.n f50065a = new j$.desugar.sun.nio.fs.n(4);

    /* renamed from: b, reason: collision with root package name */
    public static final j$.desugar.sun.nio.fs.n f50066b = new j$.desugar.sun.nio.fs.n(5);

    /* renamed from: c, reason: collision with root package name */
    public static final j$.desugar.sun.nio.fs.n f50067c = new j$.desugar.sun.nio.fs.n(6);

    /* renamed from: d, reason: collision with root package name */
    public static final j$.desugar.sun.nio.fs.n f50068d = new j$.desugar.sun.nio.fs.n(7);

    /* renamed from: e, reason: collision with root package name */
    public static final j$.desugar.sun.nio.fs.n f50069e = new j$.desugar.sun.nio.fs.n(8);

    /* renamed from: f, reason: collision with root package name */
    public static final j$.desugar.sun.nio.fs.n f50070f = new j$.desugar.sun.nio.fs.n(9);

    /* renamed from: g, reason: collision with root package name */
    public static final j$.desugar.sun.nio.fs.n f50071g = new j$.desugar.sun.nio.fs.n(10);

    public static int a(TemporalAccessor temporalAccessor, m mVar) {
        p pVarK = temporalAccessor.k(mVar);
        if (!pVarK.d()) {
            j$.time.f.f(j$.desugar.sun.nio.fs.h.a("Invalid field ", String.valueOf(mVar), " for get() method, use getLong() instead"));
            return 0;
        }
        long jD = temporalAccessor.D(mVar);
        if (pVarK.e(jD)) {
            return (int) jD;
        }
        throw new j$.time.c("Invalid value for " + String.valueOf(mVar) + " (valid values " + String.valueOf(pVarK) + "): " + jD);
    }

    public static Temporal b(Temporal temporal, long j2, TemporalUnit temporalUnit) {
        long j3;
        if (j2 == Long.MIN_VALUE) {
            temporal = temporal.b(Long.MAX_VALUE, temporalUnit);
            j3 = 1;
        } else {
            j3 = -j2;
        }
        return temporal.b(j3, temporalUnit);
    }

    public static Object c(TemporalAccessor temporalAccessor, j$.desugar.sun.nio.fs.n nVar) {
        if (nVar == f50065a || nVar == f50066b || nVar == f50067c) {
            return null;
        }
        return nVar.d(temporalAccessor);
    }

    public static p d(TemporalAccessor temporalAccessor, m mVar) {
        if (!(mVar instanceof a)) {
            Objects.requireNonNull(mVar, "field");
            return mVar.h(temporalAccessor);
        }
        if (temporalAccessor.c(mVar)) {
            return ((a) mVar).f50048b;
        }
        j$.time.f.f("Unsupported field: ".concat(String.valueOf(mVar)));
        return null;
    }

    public static /* synthetic */ int e(int i2) {
        int i3 = i2 % 7;
        if (i3 == 0) {
            return 0;
        }
        return (((i2 ^ 7) >> 31) | 1) > 0 ? i3 : i3 + 7;
    }
}
