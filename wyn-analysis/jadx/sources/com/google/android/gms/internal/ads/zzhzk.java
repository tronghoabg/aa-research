package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzhzk {
    public static zzheu zza(zzhel zzhelVar, zzhnx zzhnxVar) throws GeneralSecurityException {
        zzhmp zzhmpVar = (zzhmp) zzhelVar.zzf(zzhmp.class);
        zzhmq zzhmqVarZza = (zzhmpVar == null || zzhmpVar.zza()) ? zzhmt.zza : zzhmz.zza().zzb().zza(zzhelVar, zzhmpVar, "public_key_sign", "sign");
        zzhek zzhekVar = (zzhek) zzhelVar;
        return new zzhzi(new zzhzj((zzheu) zzhnxVar.zza(zzhekVar.zzc()), zzhekVar.zzc().zzc()), zzhmqVarZza);
    }
}
