package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzlt implements zzbo {
    private final zzbo zza;
    private final byte[] zzb;

    private zzlt(zzbo zzboVar, byte[] bArr) {
        this.zza = zzboVar;
        this.zzb = bArr;
    }

    public static zzbo zza(zznc zzncVar) throws GeneralSecurityException {
        byte[] bArrZzb;
        zzpc zzpcVarZza = zzncVar.zza(zzbq.zza());
        zzbo zzboVar = (zzbo) zzco.zza((zzvq) ((zzajy) zzvq.zza().zza(zzpcVarZza.zzf()).zza(zzpcVarZza.zzd()).zza(zzpcVarZza.zza()).zze()), zzbo.class);
        zzws zzwsVarZzb = zzpcVarZza.zzb();
        int i5 = zzls.zza[zzwsVarZzb.ordinal()];
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
        return new zzlt(zzboVar, bArrZzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbo
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        if (bArr3.length == 0) {
            return this.zza.zza(bArr, bArr2);
        }
        if (zzpr.zza(bArr3, bArr)) {
            return this.zza.zza(Arrays.copyOfRange(bArr, this.zzb.length, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("Invalid ciphertext (output prefix mismatch)");
    }
}
