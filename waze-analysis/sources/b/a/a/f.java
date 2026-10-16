package b.a.a;

import com.waze.strings.DisplayStrings;
import java.math.BigInteger;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final float[] f1693a = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};

    static float a(boolean z, long j2, int i2, boolean z2, int i3) {
        if (j2 == 0) {
            return 0.0f;
        }
        if (!z2) {
            if (i2 < -45 || i2 > 38) {
                return Float.NaN;
            }
            return b(z, j2, i2);
        }
        if (i3 < -45 || i3 > 38) {
            return Float.NaN;
        }
        float fB = b(z, j2, i3);
        if (b(z, j2 + 1, i3) == fB) {
            return fB;
        }
        return Float.NaN;
    }

    static float b(boolean z, long j2, int i2) {
        if (i2 >= -10 && i2 <= 10 && Long.compare(Long.MIN_VALUE ^ j2, -9223372036837998593L) <= 0) {
            float f2 = j2;
            float f3 = i2 < 0 ? f2 / f1693a[-i2] : f2 * f1693a[i2];
            return z ? -f3 : f3;
        }
        long j3 = e.f1691a[i2 + DisplayStrings.DS_CARPLAY_TRIP_OVERVIEW_ANIMAL_PS];
        long j4 = i2;
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j2);
        BigInteger bigInteger = g.f1694a;
        long jE = s.e(j2 << iNumberOfLeadingZeros, j3);
        long j5 = jE >>> 63;
        int i3 = iNumberOfLeadingZeros + ((int) (j5 ^ 1));
        long j6 = j4 * 217706;
        long j7 = jE & 274877906943L;
        if (j7 != 274877906943L) {
            long j8 = jE >>> ((int) (j5 + 38));
            if (j7 != 0 || (3 & j8) != 1) {
                long j9 = (j8 + 1) >>> 1;
                if (j9 >= 16777216) {
                    i3--;
                    j9 = 8388608;
                }
                long j10 = ((j6 >> 16) + 191) - i3;
                if (j10 >= 1 && j10 <= 254) {
                    return Float.intBitsToFloat((int) ((j9 & (-8388609)) | (j10 << 23) | (true == z ? 2147483648L : 0L)));
                }
            }
        }
        return Float.NaN;
    }

    static float c(boolean z, long j2, int i2, boolean z2, int i3) {
        if (true == z2) {
            i2 = i3;
        }
        if (i2 < -126 || i2 > 127) {
            return Float.NaN;
        }
        float fIntBitsToFloat = (j2 + (j2 < 0 ? 1.8446744E19f : 0.0f)) * Float.intBitsToFloat((i2 + 127) << 23);
        return z ? -fIntBitsToFloat : fIntBitsToFloat;
    }
}
