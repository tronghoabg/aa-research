package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzhqg implements zzhep {
    private zzhqg(zzhep zzhepVar, zzhtx zzhtxVar, byte[] bArr) {
    }

    public static zzhep zza(zzhmm zzhmmVar) throws GeneralSecurityException {
        byte[] bArrZzc;
        zzhnz zzhnzVarZzc = zzhmmVar.zzc(zzhdx.zza());
        zzhep zzhepVar = (zzhep) zzhmb.zza().zzc(zzhnzVarZzc.zzg(), zzhep.class).zza(zzhnzVarZzc.zzb());
        zzhtx zzhtxVarZzd = zzhnzVarZzc.zzd();
        int iOrdinal = zzhtxVarZzd.ordinal();
        if (iOrdinal == 1) {
            bArrZzc = zzhnf.zzb(zzhmmVar.zzb().intValue()).zzc();
        } else if (iOrdinal == 2) {
            bArrZzc = zzhnf.zza(zzhmmVar.zzb().intValue()).zzc();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            bArrZzc = zzhnf.zza(zzhmmVar.zzb().intValue()).zzc();
        } else {
            bArrZzc = zzhnf.zza.zzc();
        }
        return new zzhqg(zzhepVar, zzhtxVarZzd, bArrZzc);
    }
}
