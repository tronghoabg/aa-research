package defpackage;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zpk {
    private static final byte[][] a = {new byte[]{16, 11, 12, 14, 12, 10, 16, 14, 13, 14, 18, 17, 16, 19, 24, 40, 26, 24, 22, 22, 24, 49, 35, 37, 29, 40, 58, 51, 61, 60, 57, 51, 56, 55, 64, 72, 92, 78, 64, 68, 87, 69, 55, 56, 80, 109, 81, 87, 95, 98, 103, 104, 103, 62, 77, 113, 121, 112, 100, 120, 92, 101, 103, 99}, new byte[]{17, 18, 18, 24, 21, 24, 47, 26, 26, 47, 99, 66, 56, 66, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99}};
    private static final Map b = new HashMap();
    private static final int[] c = {-1, 1677721601, 838860801, 559240577, 419430401, 335544321, 279620289, 239674513, 209715201, 186413505, 167772161, 152520145, 139810145, 129055513, 119837257, 111848105, 104857601, 98689505, 93206753, 88301137, 83886081, 79891505, 76260073, 72944417, 69905073, 67108865, 64527757, 62137837, 59918629, 57852473, 55924053, 54120053, 52428801, 50840049, 49344753, 47934905, 46603377, 45343829, 44150569, 43018505, 41943041, 40920041, 39945753, 39016781, 38130037, 37282705, 36472209, 35696205, 34952537, 34239217, 33554433, 32883345, 32212257, 31541169, 30870077, 30198989, 29527901, 28856813, 28185725, 27514637, 26843545, 26172457, 25501369, 24830281, 24159193, 23488105, 22817013, 22145925, 21474837, 20803749, 20132661, 19461573, 18790481, 18119393, 17448305, 16777217, 16106129, 15435041, 14763953, 14092861, 13421773, 12750685, 12079597, 11408509, 10737421, 10066329, 9395241, 8724153, 8053065, 7381977, 6710889, 6039797, 5368709, 4697621, 4026533, 3355445, 2684357, 2013265, 1342177, 671089, 1};

    public static synchronized byte[] a(int i, int i2, int i3) {
        byte[] bArr;
        int iMin;
        Map map = b;
        int i4 = (i * 154) + (i3 * 77) + (i2 - 24);
        bArr = (byte[]) map.get(Integer.valueOf(i4));
        if (bArr == null) {
            byte[] bArr2 = new byte[64];
            byte[] bArr3 = a[i];
            for (int i5 = 0; i5 < 64; i5++) {
                int i6 = 255;
                int i7 = bArr3[i5] & 255;
                if (i3 != 0) {
                    iMin = ((i7 * (i2 < 50 ? Math.min(5000 / i2, 5000) : Math.max(200 - (i2 + i2), 0))) + 50) / 100;
                } else if (i7 != 99) {
                    iMin = (int) ((((i7 * c[i2]) / 16777216) + 1) / 2);
                } else if (i2 == 36) {
                    iMin = 138;
                } else {
                    i7 = 99;
                    iMin = (int) ((((i7 * c[i2]) / 16777216) + 1) / 2);
                }
                if (iMin <= 0) {
                    i6 = 1;
                } else if (iMin <= 255) {
                    i6 = iMin;
                }
                bArr2[i5] = (byte) i6;
            }
            map.put(Integer.valueOf(i4), bArr2);
            bArr = bArr2;
        }
        return bArr;
    }

    public static byte[] b(byte[] bArr, int i, int i2) {
        byte b2 = bArr[i];
        if (b2 == -1) {
            if (bArr[i + 1] == -40) {
                byte[] bArr2 = new byte[i2];
                System.arraycopy(bArr, i, bArr2, 0, i2);
                return bArr2;
            }
        } else if (b2 == 67 && bArr[i + 1] == 74 && bArr[i + 2] == 80 && bArr[i + 3] == 71) {
            int i3 = bArr[i + 4] & 255;
            int i4 = bArr[i + 5] & 255;
            int i5 = bArr[i + 6] & 255;
            int i6 = bArr[i + 7] & 255;
            int i7 = bArr[i + 8] & 255;
            int i8 = bArr[i + 9] & 255;
            int i9 = bArr[i + 10] & 255;
            try {
                byte[] bArr3 = zpj.a;
                if (i3 != 0) {
                    throw new IllegalArgumentException("Unknown variant " + i3);
                }
                int i10 = (i6 << 8) | i7;
                int i11 = (i4 << 8) | i5;
                int i12 = i2 + 612;
                byte[] bArr4 = new byte[i12];
                if (i9 != 0 && i9 != 1) {
                    throw new IllegalArgumentException(a.bp(i9, "qualityAlgorithm = "));
                }
                System.arraycopy(bArr, i + 11, bArr4, 623, i2 - 11);
                if (i8 < 24 || i8 > 100) {
                    throw new IllegalArgumentException("quality");
                }
                if (i9 != 0) {
                    i9 = 1;
                }
                if (i12 < 623) {
                    throw new ArrayIndexOutOfBoundsException("dest");
                }
                System.arraycopy(zpj.a, 0, bArr4, 0, 623);
                bArr4[163] = (byte) (i10 >> 8);
                bArr4[164] = (byte) (i10 & 255);
                bArr4[165] = (byte) (i11 >> 8);
                bArr4[166] = (byte) (i11 & 255);
                if (i8 != 75) {
                    zpj.a(bArr4, 25, 0, i8, i9);
                    zpj.a(bArr4, 94, 1, i8, i9);
                }
                return bArr4;
            } catch (IllegalArgumentException unused) {
                throw new UnsupportedOperationException(a.bp(i3, "Unknown variant "));
            }
        }
        throw new UnsupportedOperationException("Input is not in compact JPEG format");
    }
}
