package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes3.dex */
public final class zzhgi {
    private Integer zza = null;
    private Integer zzb = null;
    private Integer zzc = null;
    private zzhgj zzd = zzhgj.zzc;

    private zzhgi() {
    }

    public final zzhgi zza(int i5) throws GeneralSecurityException {
        if (i5 != 16 && i5 != 24 && i5 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i5)));
        }
        this.zza = Integer.valueOf(i5);
        return this;
    }

    public final zzhgi zzb(int i5) throws GeneralSecurityException {
        this.zzb = 12;
        return this;
    }

    public final zzhgi zzc(int i5) throws GeneralSecurityException {
        this.zzc = 16;
        return this;
    }

    public final zzhgi zzd(zzhgj zzhgjVar) {
        this.zzd = zzhgjVar;
        return this;
    }

    public final zzhgk zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.zzd == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.zzc == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        this.zzb.getClass();
        this.zzc.getClass();
        return new zzhgk(iIntValue, 12, 16, this.zzd, null);
    }

    public /* synthetic */ zzhgi(byte[] bArr) {
    }
}
