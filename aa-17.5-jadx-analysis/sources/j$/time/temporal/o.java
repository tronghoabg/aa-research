package j$.time.temporal;

import j$.time.DateTimeException;
import j$.util.Objects;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public abstract class o {
    public static final j$.desugar.sun.nio.fs.n a = new j$.desugar.sun.nio.fs.n(6);
    public static final j$.desugar.sun.nio.fs.n b = new j$.desugar.sun.nio.fs.n(7);
    public static final j$.desugar.sun.nio.fs.n c = new j$.desugar.sun.nio.fs.n(8);
    public static final j$.desugar.sun.nio.fs.n d = new j$.desugar.sun.nio.fs.n(9);
    public static final j$.desugar.sun.nio.fs.n e = new j$.desugar.sun.nio.fs.n(10);
    public static final j$.desugar.sun.nio.fs.n f = new j$.desugar.sun.nio.fs.n(11);
    public static final j$.desugar.sun.nio.fs.n g = new j$.desugar.sun.nio.fs.n(12);

    public static int a(k kVar, n nVar) {
        q qVarL = kVar.l(nVar);
        if (!qVarL.d()) {
            throw new p("Invalid field " + String.valueOf(nVar) + " for get() method, use getLong() instead");
        }
        long jC = kVar.C(nVar);
        if (qVarL.e(jC)) {
            return (int) jC;
        }
        throw new DateTimeException("Invalid value for " + String.valueOf(nVar) + " (valid values " + String.valueOf(qVarL) + "): " + jC);
    }

    public static Temporal b(Temporal temporal, long j, TemporalUnit temporalUnit) {
        long j2;
        if (j == Long.MIN_VALUE) {
            temporal = temporal.b(Long.MAX_VALUE, temporalUnit);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return temporal.b(j2, temporalUnit);
    }

    public static Object c(k kVar, j$.desugar.sun.nio.fs.n nVar) {
        if (nVar == a || nVar == b || nVar == c) {
            return null;
        }
        return nVar.c(kVar);
    }

    public static q d(k kVar, n nVar) {
        if (!(nVar instanceof a)) {
            Objects.a(nVar, "field");
            return nVar.k(kVar);
        }
        if (kVar.d(nVar)) {
            return ((a) nVar).b;
        }
        j$.time.g.e("Unsupported field: ".concat(String.valueOf(nVar)));
        return null;
    }

    public static /* synthetic */ int e(int i) {
        int i2 = i % 7;
        if (i2 == 0) {
            return 0;
        }
        return (((i ^ 7) >> 31) | 1) > 0 ? i2 : i2 + 7;
    }
}
