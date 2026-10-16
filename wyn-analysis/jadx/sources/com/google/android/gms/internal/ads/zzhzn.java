package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import ka.AbstractC3256n;

/* loaded from: classes3.dex */
public final class zzhzn {
    public static zzhev zza(zzhel zzhelVar, zzhnx zzhnxVar) throws GeneralSecurityException {
        zzibk zzibkVarZzd;
        zzhnn zzhnnVar = new zzhnn();
        for (int i5 = 0; i5 < zzhelVar.zzd(); i5++) {
            zzhei zzheiVarZze = ((zzhek) zzhelVar).zze(i5);
            if (zzheiVarZze.zzb().equals(zzheb.zza)) {
                zzhev zzhevVar = (zzhev) zzhnxVar.zza(zzheiVarZze);
                zzhdz zzhdzVarZza = zzheiVarZze.zza();
                if (zzhdzVarZza instanceof zzhxv) {
                    zzibkVarZzd = ((zzhxv) zzhdzVarZza).zze();
                } else {
                    if (!(zzhdzVarZza instanceof zzhmm)) {
                        String name = zzhdzVarZza.getClass().getName();
                        String strValueOf = String.valueOf(zzhdzVarZza.zza());
                        throw new GeneralSecurityException(AbstractC3256n.h(new StringBuilder(name.length() + 59 + strValueOf.length()), "Cannot get output prefix for key of class ", name, " with parameters ", strValueOf));
                    }
                    zzibkVarZzd = ((zzhmm) zzhdzVarZza).zzd();
                }
                zzhnnVar.zza(zzibkVarZzd, new zzhzm(zzhevVar, zzheiVarZze.zzc()));
            }
        }
        zzhmp zzhmpVar = (zzhmp) zzhelVar.zzf(zzhmp.class);
        return new zzhzl(zzhnnVar.zzb(), (zzhmpVar == null || zzhmpVar.zza()) ? zzhmt.zza : zzhmz.zza().zzb().zza(zzhelVar, zzhmpVar, "public_key_verify", "verify"));
    }
}
