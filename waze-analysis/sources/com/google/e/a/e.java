package com.google.e.a;

import androidx.compose.foundation.style.StylePropertiesKt;
import androidx.media3.muxer.MuxerUtil;
import com.google.e.a.h.bl;
import com.google.e.a.h.bm;
import com.google.v.de;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e {
    public static y a() {
        return y.a();
    }

    public static n b(com.google.android.libraries.phenotype.client.a aVar) {
        return n.f(aVar.c(), x.a());
    }

    public static void c(n nVar, com.google.d.b.v vVar) throws IOException {
        vVar.c(nVar.h());
    }

    public static byte[] d(byte[] bArr, byte[] bArr2) {
        long jG = g(bArr, 0, 0);
        long jG2 = g(bArr, 3, 2) & 67108611;
        long jG3 = g(bArr, 6, 4) & 67092735;
        long jG4 = g(bArr, 9, 6) & 66076671;
        long jG5 = g(bArr, 12, 8) & 1048575;
        int i2 = 17;
        byte[] bArr3 = new byte[17];
        long j2 = 0;
        int i3 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        while (true) {
            int length = bArr2.length;
            if (i3 >= length) {
                long j7 = j2 + (j3 >> 26);
                long j8 = j7 & 67108863;
                long j9 = j4 + (j7 >> 26);
                long j10 = j9 & 67108863;
                long j11 = j5 + (j9 >> 26);
                long j12 = j11 & 67108863;
                long j13 = j6 + ((j11 >> 26) * 5);
                long j14 = j13 & 67108863;
                long j15 = j14 + 5;
                long j16 = (j3 & 67108863) + (j13 >> 26);
                long j17 = j16 + (j15 >> 26);
                long j18 = (j17 >> 26) + j8;
                long j19 = j10 + (j18 >> 26);
                long j20 = (j12 + (j19 >> 26)) - 67108864;
                long j21 = j20 >> 63;
                long j22 = ~j21;
                long j23 = (j16 & j21) | (j17 & 67108863 & j22);
                long j24 = (j8 & j21) | (j18 & 67108863 & j22);
                long j25 = (j10 & j21) | (j19 & 67108863 & j22);
                long j26 = (j12 & j21) | (j20 & j22);
                long jH = (((j21 & j14) | (j15 & 67108863 & j22) | (j23 << 26)) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) + h(bArr, 16);
                long jH2 = (((j23 >> 6) | (j24 << 20)) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) + h(bArr, 20);
                long jH3 = (((j24 >> 12) | (j25 << 14)) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) + h(bArr, 24);
                long jH4 = (((j25 >> 18) | (j26 << 8)) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) + h(bArr, 28);
                byte[] bArr4 = new byte[16];
                i(bArr4, jH & MuxerUtil.UNSIGNED_INT_MAX_VALUE, 0);
                long j27 = jH2 + (jH >> 32);
                i(bArr4, j27 & MuxerUtil.UNSIGNED_INT_MAX_VALUE, 4);
                long j28 = jH3 + (j27 >> 32);
                i(bArr4, j28 & MuxerUtil.UNSIGNED_INT_MAX_VALUE, 8);
                i(bArr4, (jH4 + (j28 >> 32)) & MuxerUtil.UNSIGNED_INT_MAX_VALUE, 12);
                return bArr4;
            }
            int iMin = Math.min(16, length - i3);
            System.arraycopy(bArr2, i3, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, i2, (byte) 0);
            }
            long j29 = jG5 * 5;
            long j30 = jG4 * 5;
            long j31 = jG3 * 5;
            long jG6 = j6 + g(bArr3, 0, 0);
            long jG7 = j3 + g(bArr3, 3, 2);
            long jG8 = j2 + g(bArr3, 6, 4);
            long jG9 = j4 + g(bArr3, 9, 6);
            long jG10 = j5 + (g(bArr3, 12, 8) | (bArr3[16] << StylePropertiesKt.TranslationXId));
            long j32 = jG7 * jG;
            long j33 = jG7 * jG2;
            long j34 = jG7 * jG3;
            long j35 = jG9 * jG;
            long j36 = jG7 * jG4;
            long j37 = jG10 * jG;
            long j38 = (jG6 * jG) + (jG7 * j29) + (jG8 * j30) + (jG9 * j31) + (jG2 * 5 * jG10);
            long j39 = (jG6 * jG2) + j32 + (jG8 * j29) + (jG9 * j30) + (j31 * jG10) + (j38 >> 26);
            long j40 = (jG6 * jG3) + j33 + (jG8 * jG) + (jG9 * j29) + (j30 * jG10) + (j39 >> 26);
            long j41 = (jG6 * jG4) + j34 + (jG8 * jG2) + j35 + (jG10 * j29) + (j40 >> 26);
            long j42 = (jG6 * jG5) + j36 + (jG8 * jG3) + (jG9 * jG2) + j37 + (j41 >> 26);
            long j43 = (j38 & 67108863) + ((j42 >> 26) * 5);
            j3 = (j39 & 67108863) + (j43 >> 26);
            i3 += 16;
            j2 = j40 & 67108863;
            j4 = j41 & 67108863;
            j5 = j42 & 67108863;
            i2 = 17;
            j6 = j43 & 67108863;
        }
    }

    public static com.google.d.m.a.a.b e(byte[] bArr) throws GeneralSecurityException {
        try {
            bm from = bm.parseFrom(bArr, de.a());
            com.google.e.a.e.v vVarA = com.google.e.a.e.v.a();
            com.google.android.libraries.e.a.f fVarH = com.google.android.libraries.e.a.f.h(from.getTypeUrl(), com.google.e.a.b.a.a.c(from.getOutputPrefixType()), from.getValue());
            return !vVarA.i(fVarH) ? new com.google.e.a.e.j(fVarH) : vVarA.j(fVarH);
        } catch (IOException e2) {
            throw new GeneralSecurityException("Failed to parse proto", e2);
        }
    }

    public static byte[] f(com.google.d.m.a.a.b bVar) {
        com.google.android.libraries.e.a.f fVarK = com.google.e.a.e.v.a().k(bVar);
        bl blVarNewBuilder = bm.newBuilder();
        blVarNewBuilder.b(fVarK.g());
        blVarNewBuilder.c(fVarK.f());
        blVarNewBuilder.a(com.google.e.a.b.a.a.e(fVarK.e()));
        return blVarNewBuilder.build().toByteArray();
    }

    private static long g(byte[] bArr, int i2, int i3) {
        return (h(bArr, i2) >> i3) & 67108863;
    }

    private static long h(byte[] bArr, int i2) {
        int i3 = bArr[i2] & 255;
        int i4 = bArr[i2 + 1] & 255;
        int i5 = bArr[i2 + 2] & 255;
        return (((bArr[i2 + 3] & 255) << 24) | (i4 << 8) | i3 | (i5 << 16)) & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
    }

    private static void i(byte[] bArr, long j2, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            bArr[i2 + i3] = (byte) (255 & j2);
            j2 >>= 8;
        }
    }
}
