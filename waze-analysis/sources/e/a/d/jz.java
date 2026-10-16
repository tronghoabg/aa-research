package e.a.d;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class jz {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f47263a = Logger.getLogger(jz.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f47264b = "-bin".getBytes(StandardCharsets.US_ASCII);

    private jz() {
    }

    public static byte[][] a(e.a.cm cmVar) {
        int length;
        int i2;
        byte[][] bArrF = e.a.bc.f(cmVar);
        int i3 = 0;
        int i4 = 0;
        while (true) {
            length = bArrF.length;
            if (i3 >= length) {
                break;
            }
            byte[] bArr = bArrF[i3];
            byte[] bArr2 = bArrF[i3 + 1];
            if (c(bArr, f47264b)) {
                i2 = i4 + 2;
                bArrF[i4] = bArr;
                bArrF[i4 + 1] = e.a.bc.f46478b.o(bArr2).getBytes(StandardCharsets.US_ASCII);
            } else {
                for (byte b2 : bArr2) {
                    if (b2 < 32 || b2 > 126) {
                        f47263a.logp(Level.WARNING, "io.grpc.internal.TransportFrameUtil", "toHttp2Headers", "Metadata key=" + new String(bArr, StandardCharsets.US_ASCII) + ", value=" + Arrays.toString(bArr2) + " contains invalid ASCII characters");
                        break;
                    }
                }
                i2 = i4 + 2;
                bArrF[i4] = bArr;
                bArrF[i4 + 1] = bArr2;
            }
            i4 = i2;
            i3 += 2;
        }
        return i4 == length ? bArrF : (byte[][]) Arrays.copyOfRange(bArrF, 0, i4);
    }

    public static byte[][] b(byte[][] bArr) {
        int i2 = 0;
        while (i2 < bArr.length) {
            byte[] bArr2 = bArr[i2];
            int i3 = i2 + 1;
            byte[] bArr3 = bArr[i3];
            byte[] bArr4 = f47264b;
            if (c(bArr2, bArr4)) {
                for (byte b2 : bArr3) {
                    if (b2 == 44) {
                        ArrayList arrayList = new ArrayList(bArr.length + 10);
                        for (int i4 = 0; i4 < i2; i4++) {
                            arrayList.add(bArr[i4]);
                        }
                        while (i2 < bArr.length) {
                            byte[] bArr5 = bArr[i2];
                            byte[] bArr6 = bArr[i2 + 1];
                            if (c(bArr5, bArr4)) {
                                int i5 = 0;
                                int i6 = 0;
                                while (true) {
                                    int length = bArr6.length;
                                    if (i5 <= length) {
                                        if (i5 == length || bArr6[i5] == 44) {
                                            byte[] bArrQ = com.google.d.h.f.m().q(new String(bArr6, i6, i5 - i6, StandardCharsets.US_ASCII));
                                            arrayList.add(bArr5);
                                            arrayList.add(bArrQ);
                                            i6 = i5 + 1;
                                        }
                                        i5++;
                                    }
                                }
                            } else {
                                arrayList.add(bArr5);
                                arrayList.add(bArr6);
                            }
                            i2 += 2;
                        }
                        return (byte[][]) arrayList.toArray(new byte[0][]);
                    }
                }
                bArr[i3] = com.google.d.h.f.m().q(new String(bArr3, StandardCharsets.US_ASCII));
            }
            i2 += 2;
        }
        return bArr;
    }

    private static boolean c(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int i2 = length; i2 < bArr.length; i2++) {
            if (bArr[i2] != bArr2[i2 - length]) {
                return false;
            }
        }
        return true;
    }
}
