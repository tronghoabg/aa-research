package b.a.a;

import androidx.media3.muxer.MuxerUtil;
import java.math.BigInteger;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class s {
    static BigInteger a(CharSequence charSequence, int i2, int i3) {
        int i4 = i3 - i2;
        d dVar = new d(g.b(i4));
        int i5 = (i4 & 7) + i2;
        int iJ = j(charSequence, i2, i5);
        dVar.b(iJ);
        boolean z = iJ >= 0;
        while (i5 < i3) {
            int iF = f(charSequence, i5);
            z &= iF >= 0;
            dVar.c(iF);
            i5 += 8;
        }
        if (z) {
            return dVar.a();
        }
        throw new NumberFormatException("illegal syntax");
    }

    static BigInteger b(CharSequence charSequence, int i2, int i3, Map map) {
        if (i3 - i2 <= 400) {
            return a(charSequence, i2, i3);
        }
        int iA = g.a(i2, i3);
        return b(charSequence, iA, i3, map).add(j.d(b(charSequence, i2, iA, map), (BigInteger) map.get(Integer.valueOf(i3 - iA))));
    }

    static BigInteger c(char[] cArr, int i2, int i3) {
        int i4;
        int i5 = i3;
        int i6 = i5 - i2;
        d dVar = new d(g.b(i6));
        int i7 = i2;
        boolean z = true;
        int i8 = 0;
        while (true) {
            i4 = i2 + (i6 & 7);
            if (i7 >= i4) {
                break;
            }
            char c2 = (char) (cArr[i7] - '0');
            z &= c2 < '\n';
            i7++;
            i8 = (i8 * 10) + c2;
        }
        if (true != z) {
            i8 = -1;
        }
        boolean z2 = i8 >= 0;
        dVar.b(i8);
        while (i4 < i5) {
            boolean z3 = z2;
            int iG = g(cArr[i4] | (cArr[i4 + 1] << 16) | (cArr[i4 + 2] << 32) | (cArr[i4 + 3] << 48), (cArr[i4 + 7] << 48) | cArr[i4 + 4] | (cArr[i4 + 5] << 16) | (cArr[i4 + 6] << 32));
            z2 = z3 & (iG >= 0);
            dVar.c(iG);
            i4 += 8;
            i5 = i3;
        }
        if (z2) {
            return dVar.a();
        }
        throw new NumberFormatException("illegal syntax");
    }

    static BigInteger d(char[] cArr, int i2, int i3, Map map) {
        if (i3 - i2 <= 400) {
            return c(cArr, i2, i3);
        }
        int iA = g.a(i2, i3);
        return d(cArr, iA, i3, map).add(j.d(d(cArr, i2, iA, map), (BigInteger) map.get(Integer.valueOf(i3 - iA))));
    }

    public static /* synthetic */ long e(long j2, long j3) {
        long j4 = j2 >> 32;
        long j5 = j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        long j6 = j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        long j7 = j3 >> 32;
        long j8 = (j4 * j6) + ((j5 * j6) >>> 32);
        long j9 = (j4 * j7) + (j8 >> 32) + (((j7 * j5) + (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j8)) >> 32);
        if (j2 < 0) {
            j9 += j3;
        }
        return j3 < 0 ? j9 + j2 : j9;
    }

    public static int f(CharSequence charSequence, int i2) {
        return g(charSequence.charAt(i2) | (charSequence.charAt(i2 + 1) << 16) | (charSequence.charAt(i2 + 2) << 32) | (charSequence.charAt(i2 + 3) << 48), (charSequence.charAt(i2 + 7) << 48) | charSequence.charAt(i2 + 4) | (charSequence.charAt(i2 + 5) << 16) | (charSequence.charAt(i2 + 6) << 32));
    }

    public static int g(long j2, long j3) {
        long j4 = j3 + 19703549022044230L;
        long j5 = 19703549022044230L + j2;
        long j6 = j3 - 13511005043687472L;
        long j7 = j2 - 13511005043687472L;
        if (((j5 | j7 | j4 | j6) & (-35747867511423104L)) != 0) {
            return -1;
        }
        return ((int) ((j6 * 281475406208040961L) >>> 48)) + (((int) ((j7 * 281475406208040961L) >>> 48)) * 10000);
    }

    public static int h(char[] cArr, int i2) {
        return i((cArr[i2 + 3] << 48) | cArr[i2] | (cArr[i2 + 1] << 16) | (cArr[i2 + 2] << 32));
    }

    public static int i(long j2) {
        long j3 = 19703549022044230L + j2;
        long j4 = j2 - 13511005043687472L;
        if (((j3 | j4) & (-35747867511423104L)) != 0) {
            return -1;
        }
        return (int) ((j4 * 281475406208040961L) >>> 48);
    }

    public static int j(CharSequence charSequence, int i2, int i3) {
        boolean z = true;
        int i4 = 0;
        while (i2 < i3) {
            char cCharAt = (char) (charSequence.charAt(i2) - '0');
            z &= cCharAt < '\n';
            i2++;
            i4 = (i4 * 10) + cCharAt;
        }
        if (z) {
            return i4;
        }
        return -1;
    }

    public static long k(long j2, long j3) {
        if (((j2 | j3) & (-71777214294589696L)) != 0) {
            return -1L;
        }
        long j4 = j2 * 65792;
        long j5 = 65792 * j3;
        long j6 = ((j5 & 4294901760L) >>> 16) | (j4 & (-281474976710656L)) | ((j4 & 4294901760L) << 16) | ((j5 & (-281474976710656L)) >>> 32);
        long j7 = 2314885530818453536L | j6;
        long j8 = j7 - 3472328296227680304L;
        long j9 = (5063812098665367110L + j6) & (-9187201950435737472L);
        if ((((j6 - 3472328296227680304L) & (-9187201950435737472L)) | j9) != ((j7 - 7451037802321897319L) & (2242545357980376863L + j7) & (-9187201950435737472L))) {
            return -1L;
        }
        long j10 = (j9 >>> 7) * 255;
        long j11 = ((~j10) & j8) | (j8 - (j10 & 2821266740684990247L));
        long j12 = (j11 | (j11 >>> 4)) & 71777214294589695L;
        long j13 = j12 | (j12 >>> 8);
        return (j13 & 65535) | ((j13 >>> 16) & 4294901760L);
    }

    protected static boolean l(char c2) {
        return ((char) (c2 + 65488)) < '\n';
    }

    public static boolean m(CharSequence charSequence, int i2) {
        boolean zL = true;
        for (int i3 = 0; i3 < 8; i3++) {
            zL &= l(charSequence.charAt(i3 + i2));
        }
        return zL;
    }

    public static boolean n(char[] cArr, int i2) {
        long j2 = cArr[i2 + 4] | (cArr[i2 + 5] << 16) | (cArr[i2 + 6] << 32) | (cArr[i2 + 7] << 48);
        long j3 = cArr[i2] | (cArr[i2 + 1] << 16) | (cArr[i2 + 2] << 32) | (cArr[i2 + 3] << 48);
        return ((((j3 + (-13511005043687472L)) | (19703549022044230L + j3)) | ((j2 + 19703549022044230L) | (j2 + (-13511005043687472L)))) & (-35747867511423104L)) == 0;
    }

    public static boolean o(CharSequence charSequence, int i2) {
        boolean z = true;
        for (int i3 = 0; i3 < 8; i3++) {
            z &= charSequence.charAt(i3 + i2) == '0';
        }
        return z;
    }

    public static boolean p(char[] cArr, int i2) {
        long j2 = cArr[i2];
        long j3 = cArr[i2 + 1];
        long j4 = cArr[i2 + 2];
        long j5 = cArr[i2 + 3];
        long j6 = cArr[i2 + 4];
        long j7 = cArr[i2 + 5];
        long j8 = cArr[i2 + 6];
        long j9 = cArr[i2 + 7];
        if ((j2 | (j3 << 16) | (j4 << 32) | (j5 << 48)) == 13511005043687472L) {
            return ((((j7 << 16) | j6) | (j8 << 32)) | (j9 << 48)) == 13511005043687472L;
        }
        return false;
    }
}
