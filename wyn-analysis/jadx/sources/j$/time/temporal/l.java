package j$.time.temporal;

import j$.util.Objects;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class l {

    /* renamed from: a, reason: collision with root package name */
    static final r f37684a = new o(1);

    /* renamed from: b, reason: collision with root package name */
    static final r f37685b = new o(2);

    /* renamed from: c, reason: collision with root package name */
    static final r f37686c = new o(3);

    /* renamed from: d, reason: collision with root package name */
    static final r f37687d = new o(4);

    /* renamed from: e, reason: collision with root package name */
    static final r f37688e = new o(5);

    /* renamed from: f, reason: collision with root package name */
    static final r f37689f = new o(6);

    /* renamed from: g, reason: collision with root package name */
    static final r f37690g = new o(7);

    public static r k() {
        return f37684a;
    }

    public static t d(TemporalAccessor temporalAccessor, q qVar) {
        if (!(qVar instanceof a)) {
            Objects.requireNonNull(qVar, "field");
            return qVar.B(temporalAccessor);
        }
        if (temporalAccessor.g(qVar)) {
            return ((a) qVar).o();
        }
        throw new s(j$.time.d.a("Unsupported field: ", qVar));
    }

    public static r e() {
        return f37685b;
    }

    public static int a(TemporalAccessor temporalAccessor, q qVar) {
        t tVarT = temporalAccessor.t(qVar);
        if (!tVarT.h()) {
            throw new s("Invalid field " + qVar + " for get() method, use getLong() instead");
        }
        long jW = temporalAccessor.w(qVar);
        if (tVarT.i(jW)) {
            return (int) jW;
        }
        throw new j$.time.c("Invalid value for " + qVar + " (valid values " + tVarT + "): " + jW);
    }

    public static r i() {
        return f37686c;
    }

    public static r j() {
        return f37688e;
    }

    public static r h() {
        return f37687d;
    }

    public static Object c(TemporalAccessor temporalAccessor, r rVar) {
        if (rVar == f37684a || rVar == f37685b || rVar == f37686c) {
            return null;
        }
        return rVar.h(temporalAccessor);
    }

    public static r f() {
        return f37689f;
    }

    public static r g() {
        return f37690g;
    }

    public static Temporal b(Temporal temporal, long j8, TemporalUnit temporalUnit) {
        long j10;
        if (j8 == Long.MIN_VALUE) {
            temporal = temporal.e(Long.MAX_VALUE, temporalUnit);
            j10 = 1;
        } else {
            j10 = -j8;
        }
        return temporal.e(j10, temporalUnit);
    }
}
