package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzhxm {
    private zzhxj zza = null;
    private BigInteger zzb = null;
    private Integer zzc = null;

    private zzhxm() {
    }

    public final zzhxm zza(zzhxj zzhxjVar) {
        this.zza = zzhxjVar;
        return this;
    }

    public final zzhxm zzb(BigInteger bigInteger) {
        this.zzb = bigInteger;
        return this;
    }

    public final zzhxm zzc(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhxn zzd() throws GeneralSecurityException {
        zzibk zzibkVarZza;
        if (this.zza == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        BigInteger bigInteger = this.zzb;
        if (bigInteger == null) {
            throw new GeneralSecurityException("Cannot build without modulus");
        }
        int iBitLength = bigInteger.bitLength();
        int iZzc = this.zza.zzc();
        if (iBitLength != iZzc) {
            throw new GeneralSecurityException(com.google.android.gms.internal.consent_sdk.a.u(iBitLength, iZzc, "Got modulus size ", ", but parameters requires modulus size ", new StringBuilder(String.valueOf(iBitLength).length() + 56 + String.valueOf(iZzc).length())));
        }
        if (this.zza.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zze() == zzhxi.zzd) {
            zzibkVarZza = zzhnf.zza;
        } else if (this.zza.zze() == zzhxi.zzc || this.zza.zze() == zzhxi.zzb) {
            zzibkVarZza = zzhnf.zza(this.zzc.intValue());
        } else {
            if (this.zza.zze() != zzhxi.zza) {
                throw new IllegalStateException("Unknown RsaSsaPssParameters.Variant: ".concat(String.valueOf(this.zza.zze())));
            }
            zzibkVarZza = zzhnf.zzb(this.zzc.intValue());
        }
        return new zzhxn(this.zza, this.zzb, zzibkVarZza, this.zzc, null);
    }

    public /* synthetic */ zzhxm(byte[] bArr) {
    }
}
