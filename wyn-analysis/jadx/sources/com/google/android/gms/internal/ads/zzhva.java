package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzhva {
    private zzhvd zza = null;
    private zzhvb zzb = null;
    private zzhvc zzc = null;
    private zzhve zzd = zzhve.zzd;

    private zzhva() {
    }

    public final zzhva zza(zzhvd zzhvdVar) {
        this.zza = zzhvdVar;
        return this;
    }

    public final zzhva zzb(zzhvb zzhvbVar) {
        this.zzb = zzhvbVar;
        return this;
    }

    public final zzhva zzc(zzhvc zzhvcVar) {
        this.zzc = zzhvcVar;
        return this;
    }

    public final zzhva zzd(zzhve zzhveVar) {
        this.zzd = zzhveVar;
        return this;
    }

    public final zzhvf zze() throws GeneralSecurityException {
        zzhvd zzhvdVar = this.zza;
        if (zzhvdVar == null) {
            throw new GeneralSecurityException("signature encoding is not set");
        }
        zzhvb zzhvbVar = this.zzb;
        if (zzhvbVar == null) {
            throw new GeneralSecurityException("EC curve type is not set");
        }
        zzhvc zzhvcVar = this.zzc;
        if (zzhvcVar == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        zzhve zzhveVar = this.zzd;
        if (zzhveVar == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (zzhvbVar == zzhvb.zza && zzhvcVar != zzhvc.zza) {
            throw new GeneralSecurityException("NIST_P256 requires SHA256");
        }
        if (zzhvbVar == zzhvb.zzb && zzhvcVar != zzhvc.zzb && zzhvcVar != zzhvc.zzc) {
            throw new GeneralSecurityException("NIST_P384 requires SHA384 or SHA512");
        }
        if (zzhvbVar != zzhvb.zzc || zzhvcVar == zzhvc.zzc) {
            return new zzhvf(zzhvdVar, zzhvbVar, zzhvcVar, zzhveVar, null);
        }
        throw new GeneralSecurityException("NIST_P521 requires SHA512");
    }

    public /* synthetic */ zzhva(byte[] bArr) {
    }
}
