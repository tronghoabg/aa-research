package j$.util;

import java.util.Arrays;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public class Base64 {

    /* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
    public static class Encoder {

        /* renamed from: a, reason: collision with root package name */
        public static final char[] f50118a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

        /* renamed from: b, reason: collision with root package name */
        public static final Encoder f50119b = new Encoder();

        public String encodeToString(byte[] bArr) {
            int length = ((bArr.length + 2) / 3) * 4;
            byte[] bArrCopyOf = new byte[length];
            int length2 = bArr.length;
            int i2 = (length2 / 3) * 3;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                char[] cArr = f50118a;
                if (i3 >= i2) {
                    if (i3 < length2) {
                        int i5 = i3 + 1;
                        int i6 = bArr[i3] & 255;
                        int i7 = i4 + 1;
                        bArrCopyOf[i4] = (byte) cArr[i6 >> 2];
                        if (i5 == length2) {
                            bArrCopyOf[i7] = (byte) cArr[(i6 << 4) & 63];
                            int i8 = i4 + 3;
                            bArrCopyOf[i4 + 2] = 61;
                            i4 += 4;
                            bArrCopyOf[i8] = 61;
                        } else {
                            int i9 = bArr[i5] & 255;
                            bArrCopyOf[i7] = (byte) cArr[((i6 << 4) & 63) | (i9 >> 4)];
                            int i10 = i4 + 3;
                            bArrCopyOf[i4 + 2] = (byte) cArr[(i9 << 2) & 63];
                            i4 += 4;
                            bArrCopyOf[i10] = 61;
                        }
                    }
                    if (i4 != length) {
                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, i4);
                    }
                    return new String(bArrCopyOf, 0, 0, bArrCopyOf.length);
                }
                int iMin = Math.min(i3 + i2, i2);
                int i11 = i3;
                int i12 = i4;
                while (i11 < iMin) {
                    int i13 = i11 + 2;
                    int i14 = ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11] & 255) << 16);
                    i11 += 3;
                    int i15 = i14 | (bArr[i13] & 255);
                    bArrCopyOf[i12] = (byte) cArr[(i15 >>> 18) & 63];
                    bArrCopyOf[i12 + 1] = (byte) cArr[(i15 >>> 12) & 63];
                    int i16 = i12 + 3;
                    bArrCopyOf[i12 + 2] = (byte) cArr[(i15 >>> 6) & 63];
                    i12 += 4;
                    bArrCopyOf[i16] = (byte) cArr[i15 & 63];
                }
                int i17 = ((iMin - i3) / 3) * 4;
                i4 += i17;
                if (i17 == -1 && iMin < length2) {
                    throw null;
                }
                i3 = iMin;
            }
        }
    }

    public static Encoder getEncoder() {
        return Encoder.f50119b;
    }
}
