package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aefw {
    public static final byte[] a = new byte[0];
    public static final byte[] b = new byte[0];

    public static void a(byte[] bArr, int i, int i2) {
        defpackage.aefc.b(bArr.length, i, i2);
    }

    public static void b(byte[] bArr, int i, int i2, defpackage.aegb aegbVar, byte[] bArr2) {
        int i3 = i2 - i;
        if (i3 >= 16) {
            if (bArr2 == null) {
                bArr2 = java.util.Arrays.copyOf(bArr, i2);
            }
            int i4 = (i + i2) >>> 1;
            b(bArr2, i, i4, aegbVar, bArr);
            b(bArr2, i4, i2, aegbVar, bArr);
            if (aegbVar.a(bArr2[i4 - 1], bArr2[i4]) <= 0) {
                java.lang.System.arraycopy(bArr2, i, bArr, i, i3);
                return;
            }
            int i5 = i;
            int i6 = i4;
            while (i < i2) {
                if (i6 >= i2 || (i5 < i4 && aegbVar.a(bArr2[i5], bArr2[i6]) <= 0)) {
                    bArr[i] = bArr2[i5];
                    i5++;
                } else {
                    bArr[i] = bArr2[i6];
                    i6++;
                }
                i++;
            }
            return;
        }
        int i7 = i;
        while (true) {
            int i8 = i7 + 1;
            if (i8 >= i2) {
                return;
            }
            byte b2 = bArr[i8];
            byte b3 = bArr[i7];
            int i9 = i8;
            while (aegbVar.a(b2, b3) < 0) {
                bArr[i9] = b3;
                int i10 = i9 - 1;
                if (i == i10) {
                    i9 = i10;
                    break;
                } else {
                    byte b4 = bArr[i9 - 2];
                    i9 = i10;
                    b3 = b4;
                }
            }
            bArr[i9] = b2;
            i7 = i8;
        }
    }
}
