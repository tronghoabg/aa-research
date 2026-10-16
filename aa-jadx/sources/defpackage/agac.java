package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class agac {
    private agac() {
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0040 A[RETURN] */
    public static final long a(long j, long j2) {
        if (j != 4611686018427387903L && j != -4611686018427387903L) {
            return (j2 == 4611686018427387903L || j2 == -4611686018427387903L) ? j2 : defpackage.afqt.j(j + j2, -4611686018427387903L, 4611686018427387903L);
        }
        if (j2 <= -4611686018427387903L) {
            if ((j2 ^ j) >= 0) {
                return 9223372036854759646L;
            }
        } else if (j2 >= 4611686018427387903L) {
            j2 = 4611686018427387903L;
            if ((j2 ^ j) >= 0) {
                return 9223372036854759646L;
            }
        }
        return j;
    }

    public static final long b(long j) {
        long j2 = defpackage.aitq.a;
        int i = defpackage.aitr.a;
        return j + j + 1;
    }

    public static final long c(long j) {
        if (j < -4611686018426L || j >= 4611686018427L) {
            return b(defpackage.afqt.j(j, -4611686018427387903L, 4611686018427387903L));
        }
        long j2 = defpackage.aitq.a;
        int i = defpackage.aitr.a;
        long j3 = j * 1000000;
        return j3 + j3;
    }

    public static final long d(long j) {
        if (j >= -4611686018426999999L && j < 4611686018427000000L) {
            long j2 = defpackage.aitq.a;
            int i = defpackage.aitr.a;
            return j + j;
        }
        long j3 = defpackage.aitq.a;
        int i2 = defpackage.aitr.a;
        long j4 = j / 1000000;
        return j4 + j4 + 1;
    }

    public static final long e(int i, defpackage.aits aitsVar) {
        long j = i;
        if (aitsVar.compareTo(defpackage.aits.SECONDS) > 0) {
            return f(j, aitsVar);
        }
        long jConvert = defpackage.aits.NANOSECONDS.h.convert(j, aitsVar.h);
        long j2 = jConvert + jConvert;
        long j3 = defpackage.aitq.a;
        int i2 = defpackage.aitr.a;
        return j2;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007b A[PHI: r7
  0x007b: PHI (r7v6 long) = (r7v1 long), (r7v2 long) binds: [B:31:0x0079, B:45:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    public static final long f(long j, defpackage.aits aitsVar) {
        long j2;
        java.util.concurrent.TimeUnit timeUnit = defpackage.aits.NANOSECONDS.h;
        java.util.concurrent.TimeUnit timeUnit2 = aitsVar.h;
        long jConvert = timeUnit2.convert(4611686018426999999L, timeUnit);
        if ((-jConvert) <= j && j <= jConvert) {
            long jConvert2 = timeUnit.convert(j, timeUnit2);
            long j3 = jConvert2 + jConvert2;
            long j4 = defpackage.aitq.a;
            int i = defpackage.aitr.a;
            return j3;
        }
        defpackage.aits aitsVar2 = defpackage.aits.MILLISECONDS;
        if (aitsVar.compareTo(aitsVar2) < 0) {
            long j5 = defpackage.afqt.j(aitsVar2.h.convert(j, timeUnit2), -4611686018427387903L, 4611686018427387903L);
            long j6 = j5 + j5 + 1;
            long j7 = defpackage.aitq.a;
            int i2 = defpackage.aitr.a;
            return j6;
        }
        long jSignum = java.lang.Long.signum(j);
        if (j < -9223372036854775807L) {
            j = -9223372036854775807L;
        }
        long jAbs = java.lang.Math.abs(j);
        int iOrdinal = aitsVar.ordinal();
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
                java.util.Objects.toString(aitsVar);
                throw new java.lang.IllegalStateException("Wrong unit for millisMultiplier: ".concat(aitsVar.toString()));
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
                int iNumberOfLeadingZeros = (128 - java.lang.Long.numberOfLeadingZeros(jAbs)) - java.lang.Long.numberOfLeadingZeros(j2);
                if (iNumberOfLeadingZeros < 63) {
                    j2 *= jAbs;
                } else if (iNumberOfLeadingZeros > 63) {
                    j2 = j8;
                } else {
                    long j9 = jAbs * j2;
                    if (j9 <= 4611686018427387903L) {
                        j8 = j9;
                    }
                }
            }
            j8 = j2;
        }
        java.lang.Long.signum(jSignum);
        long j10 = jSignum * j8;
        long j11 = j10 + j10 + 1;
        long j12 = defpackage.aitq.a;
        int i3 = defpackage.aitr.a;
        return j11;
    }

    public /* synthetic */ agac(defpackage.affu affuVar) {
        this();
    }
}
