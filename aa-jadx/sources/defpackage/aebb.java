package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aebb {
    private static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.aebb.class.getName());
    private static final byte[] b = "-bin".getBytes(java.nio.charset.StandardCharsets.US_ASCII);

    private aebb() {
    }

    public static byte[][] a(defpackage.adnd adndVar) {
        int i;
        java.nio.charset.Charset charset = defpackage.adlq.a;
        int iA = adndVar.a();
        byte[][] bArr = new byte[iA][];
        java.lang.Object[] objArr = adndVar.d;
        if (objArr instanceof byte[][]) {
            java.lang.System.arraycopy(objArr, 0, bArr, 0, adndVar.a());
        } else {
            for (int i2 = 0; i2 < adndVar.e; i2++) {
                int i3 = i2 + i2;
                bArr[i3] = adndVar.h(i2);
                bArr[i3 + 1] = adndVar.j(i2);
            }
        }
        int i4 = 0;
        for (int i5 = 0; i5 < iA; i5 += 2) {
            byte[] bArr2 = bArr[i5];
            byte[] bArr3 = bArr[i5 + 1];
            if (c(bArr2, b)) {
                i = i4 + 2;
                bArr[i4] = bArr2;
                bArr[i4 + 1] = defpackage.adlq.b.i(bArr3).getBytes(java.nio.charset.StandardCharsets.US_ASCII);
            } else {
                int length = bArr3.length;
                int i6 = 0;
                while (true) {
                    if (i6 >= length) {
                        i = i4 + 2;
                        bArr[i4] = bArr2;
                        bArr[i4 + 1] = bArr3;
                    } else {
                        byte b2 = bArr3[i6];
                        if (b2 < 32 || b2 > 126) {
                            java.lang.String str = new java.lang.String(bArr2, java.nio.charset.StandardCharsets.US_ASCII);
                            a.logp(java.util.logging.Level.WARNING, "io.grpc.internal.TransportFrameUtil", "toHttp2Headers", "Metadata key=" + str + ", value=" + java.util.Arrays.toString(bArr3) + " contains invalid ASCII characters");
                        } else {
                            i6++;
                        }
                    }
                }
            }
            i4 = i;
        }
        return i4 == iA ? bArr : (byte[][]) java.util.Arrays.copyOfRange(bArr, 0, i4);
    }

    public static byte[][] b(byte[][] bArr) {
        int i = 0;
        while (i < bArr.length) {
            byte[] bArr2 = bArr[i];
            int i2 = i + 1;
            byte[] bArr3 = bArr[i2];
            byte[] bArr4 = b;
            if (c(bArr2, bArr4)) {
                for (byte b2 : bArr3) {
                    if (b2 == 44) {
                        java.util.ArrayList arrayList = new java.util.ArrayList(bArr.length + 10);
                        for (int i3 = 0; i3 < i; i3++) {
                            arrayList.add(bArr[i3]);
                        }
                        while (i < bArr.length) {
                            byte[] bArr5 = bArr[i];
                            byte[] bArr6 = bArr[i + 1];
                            if (c(bArr5, bArr4)) {
                                int i4 = 0;
                                int i5 = 0;
                                while (true) {
                                    int length = bArr6.length;
                                    if (i4 <= length) {
                                        if (i4 == length || bArr6[i4] == 44) {
                                            byte[] bArrJ = defpackage.yuv.d.j(new java.lang.String(bArr6, i5, i4 - i5, java.nio.charset.StandardCharsets.US_ASCII));
                                            arrayList.add(bArr5);
                                            arrayList.add(bArrJ);
                                            i5 = i4 + 1;
                                        }
                                        i4++;
                                    }
                                }
                            } else {
                                arrayList.add(bArr5);
                                arrayList.add(bArr6);
                            }
                            i += 2;
                        }
                        return (byte[][]) arrayList.toArray(new byte[0][]);
                    }
                }
                bArr[i2] = defpackage.yuv.d.j(new java.lang.String(bArr3, java.nio.charset.StandardCharsets.US_ASCII));
            }
            i += 2;
        }
        return bArr;
    }

    private static boolean c(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int i = length; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i - length]) {
                return false;
            }
        }
        return true;
    }
}
