package com.google.android.gms.internal.ads;

import Va.M6;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzhij extends zzhfg {
    private final zzhio zza;
    private final zzibm zzb;
    private final zzibk zzc;
    private final Integer zzd;

    private zzhij(zzhio zzhioVar, zzibm zzibmVar, zzibk zzibkVar, Integer num) {
        this.zza = zzhioVar;
        this.zzb = zzibmVar;
        this.zzc = zzibkVar;
        this.zzd = num;
    }

    public static zzhij zzd(zzhio zzhioVar, zzibm zzibmVar, Integer num) throws GeneralSecurityException {
        zzibk zzibkVarZzb;
        zzhin zzhinVarZzc = zzhioVar.zzc();
        zzhin zzhinVar = zzhin.zzb;
        if (zzhinVarZzc != zzhinVar && num == null) {
            String string = zzhioVar.zzc().toString();
            throw new GeneralSecurityException(M6.t(new StringBuilder(string.length() + 62), "For given Variant ", string, " the value of idRequirement must be non-null"));
        }
        if (zzhioVar.zzc() == zzhinVar && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzibmVar.zzd() != 32) {
            int iZzd = zzibmVar.zzd();
            throw new GeneralSecurityException(N0.a.d(iZzd, "XAesGcmKey key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(iZzd).length() + 68)));
        }
        if (zzhioVar.zzc() == zzhinVar) {
            zzibkVarZzb = zzhnf.zza;
        } else {
            if (zzhioVar.zzc() != zzhin.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzhioVar.zzc().toString()));
            }
            zzibkVarZzb = zzhnf.zzb(num.intValue());
        }
        return new zzhij(zzhioVar, zzibmVar, zzibkVarZzb, num);
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

    public final zzhio zzf() {
        return this.zza;
    }
}
