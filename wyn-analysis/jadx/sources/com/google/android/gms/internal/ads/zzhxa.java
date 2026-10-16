package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzhxa {
    private zzhwx zza = null;
    private BigInteger zzb = null;
    private Integer zzc = null;

    private zzhxa() {
    }

    public final zzhxa zza(zzhwx zzhwxVar) {
        this.zza = zzhwxVar;
        return this;
    }

    public final zzhxa zzb(BigInteger bigInteger) {
        this.zzb = bigInteger;
        return this;
    }

    public final zzhxa zzc(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhxb zzd() throws GeneralSecurityException {
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
        if (this.zza.zze() == zzhww.zzd) {
            zzibkVarZza = zzhnf.zza;
        } else if (this.zza.zze() == zzhww.zzc || this.zza.zze() == zzhww.zzb) {
            zzibkVarZza = zzhnf.zza(this.zzc.intValue());
        } else {
            if (this.zza.zze() != zzhww.zza) {
                throw new IllegalStateException("Unknown RsaSsaPkcs1Parameters.Variant: ".concat(String.valueOf(this.zza.zze())));
            }
            zzibkVarZza = zzhnf.zzb(this.zzc.intValue());
        }
        return new zzhxb(this.zza, this.zzb, zzibkVarZza, this.zzc, null);
    }

    public /* synthetic */ zzhxa(byte[] bArr) {
    }
}
