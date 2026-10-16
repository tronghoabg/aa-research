package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzhhp extends zzhfg {
    private final zzhht zza;
    private final zzibk zzb;
    private final Integer zzc;

    private zzhhp(zzhht zzhhtVar, zzibk zzibkVar, Integer num) {
        this.zza = zzhhtVar;
        this.zzb = zzibkVar;
        this.zzc = num;
    }

    public static zzhhp zzd(zzhht zzhhtVar, Integer num) throws GeneralSecurityException {
        zzibk zzibkVarZzb;
        if (zzhhtVar.zzc() == zzhhs.zzb) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            zzibkVarZzb = zzhnf.zza;
        } else {
            if (zzhhtVar.zzc() != zzhhs.zza) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(zzhhtVar.zzc())));
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            zzibkVarZzb = zzhnf.zzb(num.intValue());
        }
        return new zzhhp(zzhhtVar, zzibkVarZzb, num);
    }

    @Override // com.google.android.gms.internal.ads.zzhfg, com.google.android.gms.internal.ads.zzhdz
    public final /* synthetic */ zzheq zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhdz
    public final Integer zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhfg
    public final zzibk zzc() {
        return this.zzb;
    }

    public final zzhht zze() {
        return this.zza;
    }
}
