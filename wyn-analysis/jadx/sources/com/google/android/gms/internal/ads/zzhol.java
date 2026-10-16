package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzhol {
    private zzhot zza = null;
    private zzibm zzb = null;
    private Integer zzc = null;

    private zzhol() {
    }

    public final zzhol zza(zzhot zzhotVar) {
        this.zza = zzhotVar;
        return this;
    }

    public final zzhol zzb(zzibm zzibmVar) throws GeneralSecurityException {
        this.zzb = zzibmVar;
        return this;
    }

    public final zzhol zzc(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhom zzd() throws GeneralSecurityException {
        zzibm zzibmVar;
        zzibk zzibkVarZza;
        zzhot zzhotVar = this.zza;
        if (zzhotVar == null || (zzibmVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzhotVar.zzc() != zzibmVar.zzd()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzhotVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzf() == zzhos.zzd) {
            zzibkVarZza = zzhnf.zza;
        } else if (this.zza.zzf() == zzhos.zzc || this.zza.zzf() == zzhos.zzb) {
            zzibkVarZza = zzhnf.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzf() != zzhos.zza) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.zza.zzf())));
            }
            zzibkVarZza = zzhnf.zzb(this.zzc.intValue());
        }
        return new zzhom(this.zza, this.zzb, zzibkVarZza, this.zzc, null);
    }

    public /* synthetic */ zzhol(byte[] bArr) {
    }
}
