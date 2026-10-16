package com.google.e.a.a.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class o extends l {
    @Override // com.google.e.a.a.a.l
    final int a() {
        return 24;
    }

    @Override // com.google.e.a.a.a.l
    final int[] b(int[] iArr, int i2) {
        int length = iArr.length;
        if (length != 6) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
        }
        int[] iArr2 = new int[16];
        j.b(iArr2, j.e(this.f8135a, iArr));
        iArr2[12] = i2;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }
}
