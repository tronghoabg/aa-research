package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzhk {
    private static final int[] zza = zza(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    private static int zza(int i5, int i10) {
        return (i5 >>> (-i10)) | (i5 << i10);
    }

    public static int[] zzb(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        zza(iArr3, iArr);
        iArr3[12] = iArr2[0];
        iArr3[13] = iArr2[1];
        iArr3[14] = iArr2[2];
        iArr3[15] = iArr2[3];
        zza(iArr3);
        iArr3[4] = iArr3[12];
        iArr3[5] = iArr3[13];
        iArr3[6] = iArr3[14];
        iArr3[7] = iArr3[15];
        return Arrays.copyOf(iArr3, 8);
    }

    private static void zza(int[] iArr, int i5, int i10, int i11, int i12) {
        int i13 = iArr[i5] + iArr[i10];
        iArr[i5] = i13;
        int iZza = zza(i13 ^ iArr[i12], 16);
        iArr[i12] = iZza;
        int i14 = iArr[i11] + iZza;
        iArr[i11] = i14;
        int iZza2 = zza(iArr[i10] ^ i14, 12);
        iArr[i10] = iZza2;
        int i15 = iArr[i5] + iZza2;
        iArr[i5] = i15;
        int iZza3 = zza(iArr[i12] ^ i15, 8);
        iArr[i12] = iZza3;
        int i16 = iArr[i11] + iZza3;
        iArr[i11] = i16;
        iArr[i10] = zza(iArr[i10] ^ i16, 7);
    }

    public static void zza(int[] iArr, int[] iArr2) {
        int[] iArr3 = zza;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    public static void zza(int[] iArr) {
        for (int i5 = 0; i5 < 10; i5++) {
            zza(iArr, 0, 4, 8, 12);
            zza(iArr, 1, 5, 9, 13);
            zza(iArr, 2, 6, 10, 14);
            zza(iArr, 3, 7, 11, 15);
            zza(iArr, 0, 5, 10, 15);
            zza(iArr, 1, 6, 11, 12);
            zza(iArr, 2, 7, 8, 13);
            zza(iArr, 3, 4, 9, 14);
        }
    }

    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        int[] iArrZzb = zzb(zza(bArr), zza(bArr2));
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(iArrZzb.length << 2).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrZzb);
        return byteBufferOrder.array();
    }

    public static int[] zza(byte[] bArr) {
        if (bArr.length % 4 == 0) {
            IntBuffer intBufferAsIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
            int[] iArr = new int[intBufferAsIntBuffer.remaining()];
            intBufferAsIntBuffer.get(iArr);
            return iArr;
        }
        throw new IllegalArgumentException("invalid input length");
    }
}
