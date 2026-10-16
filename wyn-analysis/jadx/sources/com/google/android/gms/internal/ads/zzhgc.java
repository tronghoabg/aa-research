package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzhgc {
    private zzhgk zza = null;
    private zzibm zzb = null;
    private Integer zzc = null;

    private zzhgc() {
    }

    public final zzhgc zza(zzhgk zzhgkVar) {
        this.zza = zzhgkVar;
        return this;
    }

    public final zzhgc zzb(zzibm zzibmVar) {
        this.zzb = zzibmVar;
        return this;
    }

    public final zzhgc zzc(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhgd zzd() throws GeneralSecurityException {
        zzibm zzibmVar;
        zzibk zzibkVarZzb;
        zzhgk zzhgkVar = this.zza;
        if (zzhgkVar == null || (zzibmVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzhgkVar.zzc() != zzibmVar.zzd()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzhgkVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzd() == zzhgj.zzc) {
            zzibkVarZzb = zzhnf.zza;
        } else if (this.zza.zzd() == zzhgj.zzb) {
            zzibkVarZzb = zzhnf.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzd() != zzhgj.zza) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(this.zza.zzd())));
            }
            zzibkVarZzb = zzhnf.zzb(this.zzc.intValue());
        }
        return new zzhgd(this.zza, this.zzb, zzibkVarZzb, this.zzc, null);
    }

    public /* synthetic */ zzhgc(byte[] bArr) {
    }
}
