package defpackage;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public final class zdm {
    public static final long[] a = new long[37];
    public static final int[] b = new int[37];
    public static final int[] c = new int[37];

    static {
        long j;
        long j2;
        long j3;
        BigInteger bigIntegerShiftLeft = BigInteger.ONE.shiftLeft(64);
        for (int i = 2; i <= 36; i++) {
            long j4 = i;
            if (j4 < 0) {
                j2 = Long.compare(Long.MAX_VALUE, j4 ^ Long.MIN_VALUE) < 0 ? 0L : 1L;
                j = -1;
            } else {
                long j5 = Long.MAX_VALUE / j4;
                long j6 = j5 + j5;
                j = -1;
                j2 = j6 + (Long.compare(((-1) - (j6 * j4)) ^ Long.MIN_VALUE, j4 ^ Long.MIN_VALUE) >= 0 ? 1 : 0);
            }
            a[i] = j2;
            if (j4 < 0) {
                j3 = Long.compare(Long.MAX_VALUE, j4 ^ Long.MIN_VALUE) < 0 ? j : j - j4;
            } else {
                long j7 = Long.MAX_VALUE / j4;
                long j8 = j - ((j7 + j7) * j4);
                if (Long.compare(j8 ^ Long.MIN_VALUE, j4 ^ Long.MIN_VALUE) < 0) {
                    j4 = 0;
                }
                j3 = j8 - j4;
            }
            b[i] = (int) j3;
            c[i] = bigIntegerShiftLeft.toString(i).length() - 1;
        }
    }
}
