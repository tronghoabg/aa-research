package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes3.dex */
public final class zzhkd extends zzhke {
    public zzhkd(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzhke
    public final zzhkc zza(byte[] bArr, int i5) throws InvalidKeyException {
        return new zzhkb(bArr, i5);
    }
}
