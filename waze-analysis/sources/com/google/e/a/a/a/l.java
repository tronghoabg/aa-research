package com.google.e.a.a.a;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
abstract class l {

    /* renamed from: a, reason: collision with root package name */
    int[] f8135a;

    /* renamed from: b, reason: collision with root package name */
    private final int f8136b;

    public l(byte[] bArr, int i2) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f8135a = j.f(bArr);
        this.f8136b = i2;
    }

    private final void f(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        if (bArr.length != a()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + a());
        }
        int iRemaining = byteBuffer2.remaining();
        int i2 = iRemaining / 64;
        for (int i3 = 0; i3 < i2 + 1; i3++) {
            ByteBuffer byteBufferC = c(bArr, this.f8136b + i3);
            if (i3 == i2) {
                com.google.e.a.d.a.d.c(byteBuffer, byteBuffer2, byteBufferC, iRemaining % 64);
            } else {
                com.google.e.a.d.a.d.c(byteBuffer, byteBuffer2, byteBufferC, 64);
            }
        }
    }

    abstract int a();

    abstract int[] b(int[] iArr, int i2);

    final ByteBuffer c(byte[] bArr, int i2) {
        int[] iArrB = b(j.f(bArr), i2);
        int[] iArr = (int[]) iArrB.clone();
        j.c(iArr);
        for (int i3 = 0; i3 < 16; i3++) {
            iArrB[i3] = iArrB[i3] + iArr[i3];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrB, 0, 16);
        return byteBufferOrder;
    }

    public final void d(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < bArr2.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        f(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
    }

    public final byte[] e(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        f(bArr, byteBufferAllocate, byteBuffer);
        return byteBufferAllocate.array();
    }
}
