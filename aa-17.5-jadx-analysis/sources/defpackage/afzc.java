package defpackage;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class afzc {
    private afzc() {
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0040 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long a(long r7, long r9) {
        /*
            r0 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r3 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            if (r2 == 0) goto L2e
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 != 0) goto L13
            goto L2e
        L13:
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 == 0) goto L2d
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 != 0) goto L1c
            goto L2d
        L1c:
            long r1 = r7 + r9
            r3 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            r5 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            long r7 = defpackage.afpt.j(r1, r3, r5)
            return r7
        L2d:
            return r9
        L2e:
            int r2 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r2 <= 0) goto L38
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 >= 0) goto L37
            goto L3f
        L37:
            r9 = r0
        L38:
            long r9 = r9 ^ r7
            r0 = 0
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 < 0) goto L40
        L3f:
            return r7
        L40:
            r7 = 9223372036854759646(0x7fffffffffffc0de, double:NaN)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afzc.a(long, long):long");
    }

    public static final long b(long j) {
        long j2 = aisq.a;
        int i = aisr.a;
        return j + j + 1;
    }

    public static final long c(int i, aiss aissVar) {
        long j = i;
        if (aissVar.compareTo(aiss.d) > 0) {
            return d(j, aissVar);
        }
        long jConvert = aiss.a.h.convert(j, aissVar.h);
        long j2 = jConvert + jConvert;
        long j3 = aisq.a;
        int i2 = aisr.a;
        return j2;
    }

    public static final long d(long j, aiss aissVar) {
        long j2;
        TimeUnit timeUnit = aiss.a.h;
        TimeUnit timeUnit2 = aissVar.h;
        long jConvert = timeUnit2.convert(4611686018426999999L, timeUnit);
        if ((-jConvert) <= j && j <= jConvert) {
            long jConvert2 = timeUnit.convert(j, timeUnit2);
            long j3 = jConvert2 + jConvert2;
            long j4 = aisq.a;
            int i = aisr.a;
            return j3;
        }
        aiss aissVar2 = aiss.c;
        if (aissVar.compareTo(aissVar2) < 0) {
            long j5 = afpt.j(aissVar2.h.convert(j, timeUnit2), -4611686018427387903L, 4611686018427387903L);
            long j6 = j5 + j5 + 1;
            long j7 = aisq.a;
            int i2 = aisr.a;
            return j6;
        }
        long jSignum = Long.signum(j);
        if (j < -9223372036854775807L) {
            j = -9223372036854775807L;
        }
        long jAbs = Math.abs(j);
        int iOrdinal = aissVar.ordinal();
        if (iOrdinal == 2) {
            j2 = 1;
        } else if (iOrdinal == 3) {
            j2 = 1000;
        } else if (iOrdinal == 4) {
            j2 = 60000;
        } else if (iOrdinal == 5) {
            j2 = 3600000;
        } else {
            if (iOrdinal != 6) {
                Objects.toString(aissVar);
                throw new IllegalStateException("Wrong unit for millisMultiplier: ".concat(aissVar.toString()));
            }
            j2 = 86400000;
        }
        long j8 = 0;
        if (jAbs == 0) {
            j2 = j8;
            j8 = j2;
        } else if (jAbs == 1) {
            j8 = j2;
        } else {
            j8 = 4611686018427387903L;
            if (j2 == 1) {
                if (jAbs > 4611686018427387903L) {
                    jAbs = 4611686018427387903L;
                }
                j2 = jAbs;
            } else {
                int iNumberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(jAbs)) - Long.numberOfLeadingZeros(j2);
                if (iNumberOfLeadingZeros < 63) {
                    j2 *= jAbs;
                } else {
                    if (iNumberOfLeadingZeros <= 63) {
                        long j9 = jAbs * j2;
                        if (j9 <= 4611686018427387903L) {
                            j8 = j9;
                        }
                    }
                    j2 = j8;
                }
            }
            j8 = j2;
        }
        Long.signum(jSignum);
        long j10 = jSignum * j8;
        long j11 = j10 + j10 + 1;
        long j12 = aisq.a;
        int i3 = aisr.a;
        return j11;
    }

    public /* synthetic */ afzc(afeu afeuVar) {
        this();
    }
}
