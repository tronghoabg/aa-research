package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
final class zziaw implements zzhqo {
    final zzhqo zza;
    final zzhqo zzb;

    public /* synthetic */ zziaw(zzhqo zzhqoVar, zzhqo zzhqoVar2, byte[] bArr) {
        this.zza = zzhqoVar;
        this.zzb = zzhqoVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhqo
    public final byte[] zza(byte[] bArr, int i5) throws GeneralSecurityException {
        return bArr.length <= 64 ? this.zza.zza(bArr, i5) : this.zzb.zza(bArr, i5);
    }
}
