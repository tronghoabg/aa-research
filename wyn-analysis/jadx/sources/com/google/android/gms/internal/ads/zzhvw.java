package com.google.android.gms.internal.ads;

import Va.M6;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzhvw extends zzhxv {
    private final zzhvp zza;
    private final zzibk zzb;
    private final zzibk zzc;
    private final Integer zzd;

    private zzhvw(zzhvp zzhvpVar, zzibk zzibkVar, zzibk zzibkVar2, Integer num) {
        this.zza = zzhvpVar;
        this.zzb = zzibkVar;
        this.zzc = zzibkVar2;
        this.zzd = num;
    }

    public static zzhvw zzc(zzhvo zzhvoVar, zzibk zzibkVar, Integer num) throws GeneralSecurityException {
        zzibk zzibkVarZza;
        zzhvp zzhvpVarZzb = zzhvp.zzb(zzhvoVar);
        zzhvo zzhvoVar2 = zzhvo.zzd;
        if (!zzhvoVar.equals(zzhvoVar2) && num == null) {
            String string = zzhvoVar.toString();
            throw new GeneralSecurityException(M6.t(new StringBuilder(string.length() + 62), "For given Variant ", string, " the value of idRequirement must be non-null"));
        }
        if (zzhvoVar.equals(zzhvoVar2) && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzibkVar.zzd() != 32) {
            int iZzd = zzibkVar.zzd();
            throw new GeneralSecurityException(N0.a.d(iZzd, "Ed25519 key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(iZzd).length() + 65)));
        }
        if (zzhvpVarZzb.zzc() == zzhvoVar2) {
            zzibkVarZza = zzhnf.zza;
        } else if (zzhvpVarZzb.zzc() == zzhvo.zzb || zzhvpVarZzb.zzc() == zzhvo.zzc) {
            zzibkVarZza = zzhnf.zza(num.intValue());
        } else {
            if (zzhvpVarZzb.zzc() != zzhvo.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzhvpVarZzb.zzc().toString()));
            }
            zzibkVarZza = zzhnf.zzb(num.intValue());
        }
        return new zzhvw(zzhvpVarZzb, zzibkVar, zzibkVarZza, num);
    }

    @Override // com.google.android.gms.internal.ads.zzhxv, com.google.android.gms.internal.ads.zzhdz
    public final /* synthetic */ zzheq zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhdz
    public final Integer zzb() {
        return this.zzd;
    }

    public final zzibk zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhxv
    public final zzibk zze() {
        return this.zzc;
    }

    public final zzhvp zzf() {
        return this.zza;
    }
}
