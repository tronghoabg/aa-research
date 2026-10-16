package com.google.android.gms.internal.ads;

import java.security.InvalidKeyException;

/* loaded from: classes3.dex */
public final class zzhkb extends zzhkc {
    public zzhkb(byte[] bArr, int i5) throws InvalidKeyException {
        super(bArr, i5);
    }

    @Override // com.google.android.gms.internal.ads.zzhkc
    public final int[] zza(int[] iArr, int i5) {
        int length = iArr.length;
        if (length != 3) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
        }
        int[] iArr2 = new int[16];
        zzhka.zza(iArr2, this.zza);
        iArr2[12] = i5;
        System.arraycopy(iArr, 0, iArr2, 13, 3);
        return iArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzhkc
    public final int zzb() {
        return 12;
    }
}
