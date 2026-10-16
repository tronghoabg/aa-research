package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzhfu {
    private zzhgb zza = null;
    private zzibm zzb = null;
    private Integer zzc = null;

    private zzhfu() {
    }

    public final zzhfu zza(zzhgb zzhgbVar) {
        this.zza = zzhgbVar;
        return this;
    }

    public final zzhfu zzb(zzibm zzibmVar) {
        this.zzb = zzibmVar;
        return this;
    }

    public final zzhfu zzc(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhfv zzd() throws GeneralSecurityException {
        zzibm zzibmVar;
        zzibk zzibkVarZzb;
        zzhgb zzhgbVar = this.zza;
        if (zzhgbVar == null || (zzibmVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzhgbVar.zzc() != zzibmVar.zzd()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzhgbVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zze() == zzhga.zzc) {
            zzibkVarZzb = zzhnf.zza;
        } else if (this.zza.zze() == zzhga.zzb) {
            zzibkVarZzb = zzhnf.zza(this.zzc.intValue());
        } else {
            if (this.zza.zze() != zzhga.zza) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(this.zza.zze())));
            }
            zzibkVarZzb = zzhnf.zzb(this.zzc.intValue());
        }
        return new zzhfv(this.zza, this.zzb, zzibkVarZzb, this.zzc, null);
    }

    public /* synthetic */ zzhfu(byte[] bArr) {
    }
}
