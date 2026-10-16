package com.google.android.gms.internal.ads;

import Va.M6;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzhgu extends zzhfg {
    private final zzhgz zza;
    private final zzibm zzb;
    private final zzibk zzc;
    private final Integer zzd;

    private zzhgu(zzhgz zzhgzVar, zzibm zzibmVar, zzibk zzibkVar, Integer num) {
        this.zza = zzhgzVar;
        this.zzb = zzibmVar;
        this.zzc = zzibkVar;
        this.zzd = num;
    }

    public static zzhgu zzd(zzhgy zzhgyVar, zzibm zzibmVar, Integer num) throws GeneralSecurityException {
        zzibk zzibkVarZzb;
        zzhgy zzhgyVar2 = zzhgy.zzc;
        if (zzhgyVar != zzhgyVar2 && num == null) {
            String string = zzhgyVar.toString();
            throw new GeneralSecurityException(M6.t(new StringBuilder(string.length() + 62), "For given Variant ", string, " the value of idRequirement must be non-null"));
        }
        if (zzhgyVar == zzhgyVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzibmVar.zzd() != 32) {
            int iZzd = zzibmVar.zzd();
            throw new GeneralSecurityException(N0.a.d(iZzd, "ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(iZzd).length() + 74)));
        }
        zzhgz zzhgzVarZzb = zzhgz.zzb(zzhgyVar);
        if (zzhgzVarZzb.zzc() == zzhgyVar2) {
            zzibkVarZzb = zzhnf.zza;
        } else if (zzhgzVarZzb.zzc() == zzhgy.zzb) {
            zzibkVarZzb = zzhnf.zza(num.intValue());
        } else {
            if (zzhgzVarZzb.zzc() != zzhgy.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzhgzVarZzb.zzc().toString()));
            }
            zzibkVarZzb = zzhnf.zzb(num.intValue());
        }
        return new zzhgu(zzhgzVarZzb, zzibmVar, zzibkVarZzb, num);
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

    public final zzhgz zzf() {
        return this.zza;
    }
}
