package com.google.android.gms.internal.ads;

import Va.M6;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzhip extends zzhfg {
    private final zzhiv zza;
    private final zzibm zzb;
    private final zzibk zzc;
    private final Integer zzd;

    private zzhip(zzhiv zzhivVar, zzibm zzibmVar, zzibk zzibkVar, Integer num) {
        this.zza = zzhivVar;
        this.zzb = zzibmVar;
        this.zzc = zzibkVar;
        this.zzd = num;
    }

    public static zzhip zzd(zzhiu zzhiuVar, zzibm zzibmVar, Integer num) throws GeneralSecurityException {
        zzibk zzibkVarZzb;
        zzhiu zzhiuVar2 = zzhiu.zzc;
        if (zzhiuVar != zzhiuVar2 && num == null) {
            String string = zzhiuVar.toString();
            throw new GeneralSecurityException(M6.t(new StringBuilder(string.length() + 62), "For given Variant ", string, " the value of idRequirement must be non-null"));
        }
        if (zzhiuVar == zzhiuVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzibmVar.zzd() != 32) {
            int iZzd = zzibmVar.zzd();
            throw new GeneralSecurityException(N0.a.d(iZzd, "XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(iZzd).length() + 75)));
        }
        zzhiv zzhivVarZzb = zzhiv.zzb(zzhiuVar);
        if (zzhivVarZzb.zzc() == zzhiuVar2) {
            zzibkVarZzb = zzhnf.zza;
        } else if (zzhivVarZzb.zzc() == zzhiu.zzb) {
            zzibkVarZzb = zzhnf.zza(num.intValue());
        } else {
            if (zzhivVarZzb.zzc() != zzhiu.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzhivVarZzb.zzc().toString()));
            }
            zzibkVarZzb = zzhnf.zzb(num.intValue());
        }
        return new zzhip(zzhivVarZzb, zzibmVar, zzibkVarZzb, num);
    }

    @Override // com.google.android.gms.internal.ads.zzhfg, com.google.android.gms.internal.ads.zzhdz
    public final /* synthetic */ zzheq zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhdz
    public final Integer zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhfg
    public final zzibk zzc() {
        return this.zzc;
    }

    public final zzibm zze() {
        return this.zzb;
    }

    public final zzhiv zzf() {
        return this.zza;
    }
}
