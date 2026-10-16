package com.google.e.a.a.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class k extends l {
    @Override // com.google.e.a.a.a.l
    public final int a() {
        return 12;
    }

    @Override // com.google.e.a.a.a.l
    public final int[] b(int[] iArr, int i2) {
        int length = iArr.length;
        if (length != 3) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
        }
        int[] iArr2 = new int[16];
        j.b(iArr2, this.f8135a);
        iArr2[12] = i2;
        System.arraycopy(iArr, 0, iArr2, 13, 3);
        return iArr2;
    }
}
