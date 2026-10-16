package com.google.android.gms.internal.ads;

import java.security.InvalidKeyException;

/* loaded from: classes3.dex */
public final class zzhkf extends zzhkc {
    public zzhkf(byte[] bArr, int i5) throws InvalidKeyException {
        super(bArr, i5);
    }

    @Override // com.google.android.gms.internal.ads.zzhkc
    public final int[] zza(int[] iArr, int i5) {
        int length = iArr.length;
        if (length != 6) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
        }
        int[] iArr2 = new int[16];
        zzhka.zza(iArr2, zzhka.zze(this.zza, iArr));
        iArr2[12] = i5;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzhkc
    public final int zzb() {
        return 24;
    }
}
