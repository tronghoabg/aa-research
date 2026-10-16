package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzhyo implements zzheu {
    private zzhyo(zzheu zzheuVar, byte[] bArr, byte[] bArr2) {
    }

    public static zzheu zzb(zzhmm zzhmmVar) throws GeneralSecurityException {
        zzhnz zzhnzVarZzc = zzhmmVar.zzc(zzhdx.zza());
        return new zzhyo((zzheu) zzhmb.zza().zzc(zzhnzVarZzc.zzg(), zzheu.class).zza(zzhnzVarZzc.zzb()), zzhyp.zzc(zzhnzVarZzc), zzhyp.zzd(zzhnzVarZzc));
    }

    @Override // com.google.android.gms.internal.ads.zzheu
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        throw null;
    }
}
