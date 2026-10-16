package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class ytk extends ysl implements Serializable {
    public static final ysv a = new ytk();
    private static final long serialVersionUID = 0;
    private final int b = 0;
    private final boolean c = true;

    static {
        int i = ysy.a;
    }

    public static int f(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16) | (bArr[i + 3] << 24) | ((bArr[i + 1] & 255) << 8);
    }

    public static long g(char c) {
        int i = ((c >>> 6) & 63) | 128;
        return (i << 8) | (c >>> '\f') | 224 | (((c & '?') | 128) << 16);
    }

    public static long h(char c) {
        return (c >>> 6) | 192 | (((c & '?') | 128) << 8);
    }

    public static long i(int i) {
        return (((i & 63) | 128) << 24) | ((((i >>> 12) & 63) | 128) << 8) | (i >>> 18) | 240 | ((((i >>> 6) & 63) | 128) << 16);
    }

    public static ysu j(int i, int i2) {
        int i3 = ysu.b;
        int i4 = i ^ i2;
        int i5 = (i4 ^ (i4 >>> 16)) * (-2048144789);
        int i6 = (i5 ^ (i5 >>> 13)) * (-1028477387);
        return new yss(i6 ^ (i6 >>> 16));
    }

    @Override // defpackage.ysl
    public final ysu d(byte[] bArr, int i) {
        int i2 = 0;
        woy.Y(0, i, bArr.length);
        int i3 = 0;
        int iRotateLeft = 0;
        while (true) {
            int i4 = i3 + 4;
            if (i4 > i) {
                break;
            }
            iRotateLeft = (-430675100) + (Integer.rotateLeft((Integer.rotateLeft(f(bArr, i3) * (-862048943), 15) * 461845907) ^ iRotateLeft, 13) * 5);
            i3 = i4;
        }
        int i5 = 0;
        while (i3 < i) {
            i2 ^= (bArr[i3] & 255) << i5;
            i3++;
            i5 += 8;
        }
        return j((Integer.rotateLeft(i2 * (-862048943), 15) * 461845907) ^ iRotateLeft, i);
    }

    @Override // defpackage.ysv
    public final ysw e() {
        return new ytj();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ytk)) {
            return false;
        }
        ytk ytkVar = (ytk) obj;
        int i = ytkVar.b;
        boolean z = ytkVar.c;
        return true;
    }

    public final int hashCode() {
        return getClass().hashCode();
    }

    public final String toString() {
        return "Hashing.murmur3_32(0)";
    }
}
