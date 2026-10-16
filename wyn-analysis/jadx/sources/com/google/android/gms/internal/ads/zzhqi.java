package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import ka.AbstractC3256n;

/* loaded from: classes3.dex */
public final class zzhqi {
    public static zzhou zza(zzhel zzhelVar, zzhnx zzhnxVar) throws GeneralSecurityException {
        zzibk zzibkVarZzd;
        zzhei zzheiVarZzc = ((zzhek) zzhelVar).zzc();
        zzhnn zzhnnVar = new zzhnn();
        for (int i5 = 0; i5 < zzhelVar.zzd(); i5++) {
            zzhei zzheiVarZze = ((zzhek) zzhelVar).zze(i5);
            if (zzheiVarZze.zzb().equals(zzheb.zza)) {
                zzhou zzhouVar = (zzhou) zzhnxVar.zza(zzheiVarZze);
                zzhdz zzhdzVarZza = zzheiVarZze.zza();
                if (zzhdzVarZza instanceof zzhpi) {
                    zzibkVarZzd = ((zzhpi) zzhdzVarZza).zze();
                } else {
                    if (!(zzhdzVarZza instanceof zzhmm)) {
                        String name = zzhdzVarZza.getClass().getName();
                        String strValueOf = String.valueOf(zzhdzVarZza.zza());
                        throw new GeneralSecurityException(AbstractC3256n.h(new StringBuilder(name.length() + 59 + strValueOf.length()), "Cannot get output prefix for key of class ", name, " with parameters ", strValueOf));
                    }
                    zzibkVarZzd = ((zzhmm) zzhdzVarZza).zzd();
                }
                zzhnnVar.zza(zzibkVarZzd, zzhouVar);
            }
        }
        return new zzhqh(zzhnnVar.zzb(), (zzhou) zzhnxVar.zza(zzheiVarZzc), null);
    }
}
