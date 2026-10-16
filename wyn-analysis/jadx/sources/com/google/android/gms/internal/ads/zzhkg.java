package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes3.dex */
public final class zzhkg extends zzhke {
    public zzhkg(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzhke
    public final zzhkc zza(byte[] bArr, int i5) throws InvalidKeyException {
        return new zzhkf(bArr, i5);
    }
}
