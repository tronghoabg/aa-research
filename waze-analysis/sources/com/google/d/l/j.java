package com.google.d.l;

import androidx.collection.SieveCacheKt;
import androidx.compose.foundation.style.StylePropertiesKt;
import androidx.media3.muxer.MuxerUtil;
import com.google.d.b.an;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class j {
    public static long a(int i2) {
        return i2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
    }

    public static byte b(long j2) {
        an.p((j2 >> 8) == 0, "out of range: %s", j2);
        return (byte) j2;
    }

    public static Comparator c() {
        return i.f7974b;
    }

    public static /* synthetic */ int d(byte b2) {
        return b2 & 255;
    }

    public static byte[] e(long j2) {
        byte[] bArr = new byte[8];
        for (int i2 = 7; i2 >= 0; i2--) {
            bArr[i2] = (byte) (255 & j2);
            j2 >>= 8;
        }
        return bArr;
    }

    public static long[] f(long[]... jArr) {
        long length = 0;
        for (long[] jArr2 : jArr) {
            length += jArr2.length;
        }
        int i2 = (int) length;
        an.p(length == ((long) i2), "the total number of elements (%s) in the arrays must fit in an int", length);
        long[] jArr3 = new long[i2];
        int i3 = 0;
        for (long[] jArr4 : jArr) {
            int length2 = jArr4.length;
            System.arraycopy(jArr4, 0, jArr3, i3, length2);
            i3 += length2;
        }
        return jArr3;
    }

    static /* bridge */ /* synthetic */ int g(int[] iArr, int i2, int i3, int i4) {
        while (i3 < i4) {
            if (iArr[i3] == i2) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    public static int h(long j2) {
        int i2 = (int) j2;
        an.p(((long) i2) == j2, "Out of range: %s", j2);
        return i2;
    }

    public static int i(byte[] bArr) {
        int length = bArr.length;
        an.r(length >= 4, "array too small: %s < %s", length, 4);
        return j(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    public static int j(byte b2, byte b3, byte b4, byte b5) {
        return (b2 << StylePropertiesKt.TranslationXId) | ((b3 & 255) << 16) | ((b4 & 255) << 8) | (b5 & 255);
    }

    public static int k(long j2) {
        if (j2 > SieveCacheKt.NodeLinkMask) {
            return Integer.MAX_VALUE;
        }
        if (j2 < SieveCacheKt.NodeMetaAndPreviousMask) {
            return Integer.MIN_VALUE;
        }
        return (int) j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Integer l(java.lang.String r12) {
        /*
            com.google.d.b.an.B(r12)
            r0 = r12
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r12.isEmpty()
            r1 = 0
            if (r0 == 0) goto L10
        Ld:
            r12 = r1
            goto L72
        L10:
            r0 = 0
            char r2 = r12.charAt(r0)
            r3 = 45
            if (r2 != r3) goto L1a
            r0 = 1
        L1a:
            int r4 = r12.length()
            if (r0 != r4) goto L21
            goto Ld
        L21:
            int r4 = r0 + 1
            char r0 = r12.charAt(r0)
            int r0 = com.google.d.l.f.a(r0)
            if (r0 < 0) goto Ld
            r5 = 10
            if (r0 < r5) goto L32
            goto Ld
        L32:
            int r0 = -r0
            long r6 = (long) r0
        L34:
            int r0 = r12.length()
            r8 = -9223372036854775808
            if (r4 >= r0) goto L61
            int r0 = r4 + 1
            char r4 = r12.charAt(r4)
            int r4 = com.google.d.l.f.a(r4)
            if (r4 < 0) goto Ld
            if (r4 >= r5) goto Ld
            r10 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r10 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r10 >= 0) goto L54
            goto Ld
        L54:
            r10 = 10
            long r6 = r6 * r10
            long r10 = (long) r4
            long r8 = r8 + r10
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 >= 0) goto L5e
            goto Ld
        L5e:
            long r6 = r6 - r10
            r4 = r0
            goto L34
        L61:
            if (r2 != r3) goto L68
            java.lang.Long r12 = java.lang.Long.valueOf(r6)
            goto L72
        L68:
            int r12 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r12 != 0) goto L6d
            goto Ld
        L6d:
            long r2 = -r6
            java.lang.Long r12 = java.lang.Long.valueOf(r2)
        L72:
            if (r12 == 0) goto L8b
            long r2 = r12.longValue()
            int r0 = r12.intValue()
            long r4 = (long) r0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L82
            goto L8b
        L82:
            int r12 = r12.intValue()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            return r12
        L8b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.l.j.l(java.lang.String):java.lang.Integer");
    }

    public static List m(int... iArr) {
        int length = iArr.length;
        return length == 0 ? Collections.EMPTY_LIST : new e(iArr, 0, length);
    }

    public static byte[] n(int i2) {
        return new byte[]{(byte) (i2 >> 24), (byte) (i2 >> 16), (byte) (i2 >> 8), (byte) i2};
    }

    public static int[] o(Collection collection) {
        if (collection instanceof e) {
            e eVar = (e) collection;
            return Arrays.copyOfRange(eVar.f7967a, eVar.f7968b, eVar.f7969c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = array[i2];
            an.B(obj);
            iArr[i2] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static int p(int i2, int i3) {
        an.r(true, "min (%s) must be less than or equal to max (%s)", i3, 1073741823);
        return Math.min(Math.max(i2, i3), 1073741823);
    }

    public static char q(byte b2, byte b3) {
        return (char) ((b2 << 8) | (b3 & 255));
    }

    public static byte[] r(byte[]... bArr) {
        long length = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= bArr.length) {
                break;
            }
            length += bArr[i2].length;
            i2++;
        }
        int i3 = (int) length;
        an.p(length == ((long) i3), "the total number of elements (%s) in the arrays must fit in an int", length);
        byte[] bArr2 = new byte[i3];
        int i4 = 0;
        for (byte[] bArr3 : bArr) {
            int length2 = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i4, length2);
            i4 += length2;
        }
        return bArr2;
    }

    public static byte[] s(Collection collection) {
        if (collection instanceof a) {
            throw null;
        }
        Object[] array = collection.toArray();
        int length = array.length;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = array[i2];
            an.B(obj);
            bArr[i2] = ((Number) obj).byteValue();
        }
        return bArr;
    }

    static /* synthetic */ int t(int i2, int i3) {
        if (i3 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int i4 = i2 + (i2 >> 1) + 1;
        if (i4 < i3) {
            int iHighestOneBit = Integer.highestOneBit(i3 - 1);
            i4 = iHighestOneBit + iHighestOneBit;
        }
        if (i4 < 0) {
            return Integer.MAX_VALUE;
        }
        return i4;
    }
}
