package com.google.e.a.a.a;

import androidx.compose.foundation.style.StylePropertiesKt;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f8134a = f(new byte[]{101, 120, 112, 97, 110, 100, StylePropertiesKt.ZIndexId, 51, 50, StylePropertiesKt.FontSynthesisId, 98, 121, 116, 101, StylePropertiesKt.ZIndexId, 107});

    static void a(int[] iArr, int i2, int i3, int i4, int i5) {
        int i6 = iArr[i2] + iArr[i3];
        iArr[i2] = i6;
        int iG = g(i6 ^ iArr[i5], 16);
        iArr[i5] = iG;
        int i7 = iArr[i4] + iG;
        iArr[i4] = i7;
        int iG2 = g(iArr[i3] ^ i7, 12);
        iArr[i3] = iG2;
        int i8 = iArr[i2] + iG2;
        iArr[i2] = i8;
        int iG3 = g(iArr[i5] ^ i8, 8);
        iArr[i5] = iG3;
        int i9 = iArr[i4] + iG3;
        iArr[i4] = i9;
        iArr[i3] = g(iArr[i3] ^ i9, 7);
    }

    static void b(int[] iArr, int[] iArr2) {
        int[] iArr3 = f8134a;
        int length = iArr3.length;
        System.arraycopy(iArr3, 0, iArr, 0, length);
        System.arraycopy(iArr2, 0, iArr, length, 8);
    }

    static void c(int[] iArr) {
        for (int i2 = 0; i2 < 10; i2++) {
            a(iArr, 0, 4, 8, 12);
            a(iArr, 1, 5, 9, 13);
            a(iArr, 2, 6, 10, 14);
            a(iArr, 3, 7, 11, 15);
            a(iArr, 0, 5, 10, 15);
            a(iArr, 1, 6, 11, 12);
            a(iArr, 2, 7, 8, 13);
            a(iArr, 3, 4, 9, 14);
        }
    }

    static byte[] d(byte[] bArr, byte[] bArr2) {
        int[] iArrE = e(f(bArr), f(bArr2));
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(iArrE.length * 4).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrE);
        return byteBufferOrder.array();
    }

    static int[] e(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        b(iArr3, iArr);
        iArr3[12] = iArr2[0];
        iArr3[13] = iArr2[1];
        iArr3[14] = iArr2[2];
        iArr3[15] = iArr2[3];
        c(iArr3);
        iArr3[4] = iArr3[12];
        iArr3[5] = iArr3[13];
        iArr3[6] = iArr3[14];
        iArr3[7] = iArr3[15];
        return Arrays.copyOf(iArr3, 8);
    }

    static int[] f(byte[] bArr) {
        if ((bArr.length & 3) != 0) {
            throw new IllegalArgumentException("invalid input length");
        }
        IntBuffer intBufferAsIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[intBufferAsIntBuffer.remaining()];
        intBufferAsIntBuffer.get(iArr);
        return iArr;
    }

    private static int g(int i2, int i3) {
        int i4 = -i3;
        return (i2 >>> i4) | (i2 << i3);
    }
}
