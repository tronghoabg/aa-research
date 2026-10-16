package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzlv implements zzbn {
    private zzlv(zzbn zzbnVar, byte[] bArr) {
    }

    public static zzbn zza(zznc zzncVar) throws GeneralSecurityException {
        byte[] bArrZzb;
        zzpc zzpcVarZza = zzncVar.zza(zzbq.zza());
        zzbn zzbnVar = (zzbn) zzco.zza((zzvq) ((zzajy) zzvq.zza().zza(zzpcVarZza.zzf()).zza(zzpcVarZza.zzd()).zza(zzpcVarZza.zza()).zze()), zzbn.class);
        zzws zzwsVarZzb = zzpcVarZza.zzb();
        int i5 = zzlu.zza[zzwsVarZzb.ordinal()];
        if (i5 == 1) {
            bArrZzb = zzog.zza.zzb();
        } else if (i5 == 2 || i5 == 3) {
            bArrZzb = zzog.zza(zzncVar.zza().intValue()).zzb();
        } else {
            if (i5 != 4) {
                throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(zzwsVarZzb)));
            }
            bArrZzb = zzog.zzb(zzncVar.zza().intValue()).zzb();
        }
        return new zzlv(zzbnVar, bArrZzb);
    }
}
