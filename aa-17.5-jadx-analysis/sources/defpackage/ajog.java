package defpackage;

import java.io.EOFException;

/* loaded from: classes2.dex */
public final class ajog {
    public static final byte[] a = ahfp.c("0123456789abcdef");
    public static final long[] b = {-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};

    public static final String a(ajmy ajmyVar, long j) throws EOFException {
        if (j > 0) {
            long j2 = (-1) + j;
            if (ajmyVar.c(j2) == 13) {
                String strO = ajmyVar.o(j2);
                ajmyVar.A(2L);
                return strO;
            }
        }
        String strO2 = ajmyVar.o(j);
        ajmyVar.A(1L);
        return strO2;
    }

    public static final long b(ajmy ajmyVar, ajnb ajnbVar, long j, long j2, int i) {
        ajnx ajnxVar;
        long j3 = j;
        long j4 = j2;
        long j5 = i;
        ahfd.g(ajnbVar.c(), 0L, j5);
        if (i <= 0) {
            throw new IllegalArgumentException("byteCount == 0");
        }
        long j6 = 0;
        if (j3 < 0) {
            throw new IllegalArgumentException(a.bN(j3, "fromIndex < 0: "));
        }
        if (j3 > j4) {
            throw new IllegalArgumentException("fromIndex > toIndex: " + j3 + " > " + j4);
        }
        long j7 = ajmyVar.b;
        if (j4 > j7) {
            j4 = j7;
        }
        if (j3 == j4 || (ajnxVar = ajmyVar.a) == null) {
            return -1L;
        }
        if (j7 - j3 < j3) {
            while (j7 > j3) {
                ajnxVar = ajnxVar.g;
                ajnxVar.getClass();
                j7 -= ajnxVar.c - ajnxVar.b;
            }
            if (ajnxVar == null) {
                return -1L;
            }
            byte[] bArr = ajnbVar.b;
            byte b2 = bArr[0];
            long jMin = Math.min(j4, (ajmyVar.b - j5) + 1);
            long j8 = j7;
            while (j8 < jMin) {
                byte[] bArr2 = ajnxVar.a;
                int iMin = (int) Math.min(ajnxVar.c, (ajnxVar.b + jMin) - j8);
                int i2 = (int) ((ajnxVar.b + j3) - j8);
                while (i2 < iMin) {
                    int i3 = i2 + 1;
                    if (bArr2[i2] == b2 && c(ajnxVar, i3, bArr, i)) {
                        return (i2 - ajnxVar.b) + j8;
                    }
                    i2 = i3;
                }
                j8 += ajnxVar.c - ajnxVar.b;
                ajnxVar = ajnxVar.f;
                ajnxVar.getClass();
                j3 = j8;
            }
            return -1L;
        }
        while (true) {
            long j9 = (ajnxVar.c - ajnxVar.b) + j6;
            if (j9 > j3) {
                break;
            }
            ajnxVar = ajnxVar.f;
            ajnxVar.getClass();
            j6 = j9;
        }
        if (ajnxVar == null) {
            return -1L;
        }
        byte[] bArr3 = ajnbVar.b;
        byte b3 = bArr3[0];
        long jMin2 = Math.min(j4, (ajmyVar.b - j5) + 1);
        long j10 = j6;
        while (j10 < jMin2) {
            byte[] bArr4 = ajnxVar.a;
            int iMin2 = (int) Math.min(ajnxVar.c, (ajnxVar.b + jMin2) - j10);
            int i4 = (int) ((ajnxVar.b + j3) - j10);
            while (i4 < iMin2) {
                int i5 = i4 + 1;
                if (bArr4[i4] == b3 && c(ajnxVar, i5, bArr3, i)) {
                    return (i4 - ajnxVar.b) + j10;
                }
                i4 = i5;
            }
            j10 += ajnxVar.c - ajnxVar.b;
            ajnxVar = ajnxVar.f;
            ajnxVar.getClass();
            j3 = j10;
        }
        return -1L;
    }

    public static final boolean c(ajnx ajnxVar, int i, byte[] bArr, int i2) {
        ajnxVar.getClass();
        bArr.getClass();
        byte[] bArr2 = ajnxVar.a;
        int i3 = ajnxVar.c;
        for (int i4 = 1; i4 < i2; i4++) {
            if (i == i3) {
                ajnxVar = ajnxVar.f;
                ajnxVar.getClass();
                byte[] bArr3 = ajnxVar.a;
                int i5 = ajnxVar.b;
                i3 = ajnxVar.c;
                bArr2 = bArr3;
                i = i5;
            }
            if (bArr2[i] != bArr[i4]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
