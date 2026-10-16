package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* loaded from: classes3.dex */
public final class zzhvi {
    private zzhvf zza = null;
    private ECPoint zzb = null;
    private Integer zzc = null;

    private zzhvi() {
    }

    public final zzhvi zza(zzhvf zzhvfVar) {
        this.zza = zzhvfVar;
        return this;
    }

    public final zzhvi zzb(ECPoint eCPoint) {
        this.zzb = eCPoint;
        return this;
    }

    public final zzhvi zzc(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhvj zzd() throws GeneralSecurityException {
        zzibk zzibkVarZza;
        zzhvf zzhvfVar = this.zza;
        if (zzhvfVar == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        ECPoint eCPoint = this.zzb;
        if (eCPoint == null) {
            throw new GeneralSecurityException("Cannot build without public point");
        }
        zzhlt.zza(eCPoint, zzhvfVar.zzd().zza().getCurve());
        if (this.zza.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzf() == zzhve.zzd) {
            zzibkVarZza = zzhnf.zza;
        } else if (this.zza.zzf() == zzhve.zzc || this.zza.zzf() == zzhve.zzb) {
            zzibkVarZza = zzhnf.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzf() != zzhve.zza) {
                throw new IllegalStateException("Unknown EcdsaParameters.Variant: ".concat(this.zza.zzf().toString()));
            }
            zzibkVarZza = zzhnf.zzb(this.zzc.intValue());
        }
        return new zzhvj(this.zza, this.zzb, zzibkVarZza, this.zzc, null);
    }

    public /* synthetic */ zzhvi(byte[] bArr) {
    }
}
