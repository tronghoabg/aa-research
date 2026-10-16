package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zziax implements zzhqo {
    public static zzhqo zzb(zzhqm zzhqmVar) throws GeneralSecurityException {
        zzhqo zzhqoVarZzb = zzhqs.zzb(zzhqmVar);
        try {
            return new zziaw(zzhqoVarZzb, zzhqt.zzb(zzhqmVar), null);
        } catch (GeneralSecurityException unused) {
            return zzhqoVarZzb;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhqo
    public final byte[] zza(byte[] bArr, int i5) throws GeneralSecurityException {
        throw null;
    }
}
