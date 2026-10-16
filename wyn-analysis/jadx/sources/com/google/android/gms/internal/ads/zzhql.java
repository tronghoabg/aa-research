package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import ka.AbstractC3256n;

/* loaded from: classes3.dex */
public final class zzhql {
    public static zzhep zza(zzhel zzhelVar, zzhnx zzhnxVar) throws GeneralSecurityException {
        zzhmq zzhmqVar;
        zzhmq zzhmqVarZza;
        zzibk zzibkVarZzd;
        zzhnn zzhnnVar = new zzhnn();
        for (int i5 = 0; i5 < zzhelVar.zzd(); i5++) {
            zzhei zzheiVarZze = ((zzhek) zzhelVar).zze(i5);
            if (zzheiVarZze.zzb().equals(zzheb.zza)) {
                zzhep zzhepVar = (zzhep) zzhnxVar.zza(zzheiVarZze);
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
                zzhnnVar.zza(zzibkVarZzd, new zzhqj(zzhepVar, zzheiVarZze.zzc()));
            }
        }
        zzhmp zzhmpVar = (zzhmp) zzhelVar.zzf(zzhmp.class);
        if (zzhmpVar == null || zzhmpVar.zza()) {
            zzhmqVar = zzhmt.zza;
            zzhmqVarZza = zzhmqVar;
        } else {
            zzhmr zzhmrVarZzb = zzhmz.zza().zzb();
            zzhmq zzhmqVarZza2 = zzhmrVarZzb.zza(zzhelVar, zzhmpVar, "mac", "compute");
            zzhmqVarZza = zzhmrVarZzb.zza(zzhelVar, zzhmpVar, "mac", "verify");
            zzhmqVar = zzhmqVarZza2;
        }
        zzhek zzhekVar = (zzhek) zzhelVar;
        return new zzhqk(new zzhqj((zzhep) zzhnxVar.zza(zzhekVar.zzc()), zzhekVar.zzc().zzc()), zzhnnVar.zzb(), zzhmqVar, zzhmqVarZza, null);
    }
}
