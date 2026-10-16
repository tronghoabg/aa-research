package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes3.dex */
public final class zzhfz {
    private Integer zza = null;
    private Integer zzb = null;
    private Integer zzc = null;
    private zzhga zzd = zzhga.zzc;

    private zzhfz() {
    }

    public final zzhfz zza(int i5) throws GeneralSecurityException {
        if (i5 != 16 && i5 != 24 && i5 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i5)));
        }
        this.zza = Integer.valueOf(i5);
        return this;
    }

    public final zzhfz zzb(int i5) throws GeneralSecurityException {
        if (i5 != 12 && i5 != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i5)));
        }
        this.zzb = Integer.valueOf(i5);
        return this;
    }

    public final zzhfz zzc(int i5) throws GeneralSecurityException {
        this.zzc = 16;
        return this;
    }

    public final zzhfz zzd(zzhga zzhgaVar) {
        this.zzd = zzhgaVar;
        return this;
    }

    public final zzhgb zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.zzd == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (this.zzc == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        int iIntValue2 = this.zzb.intValue();
        this.zzc.getClass();
        return new zzhgb(iIntValue, iIntValue2, 16, this.zzd, null);
    }

    public /* synthetic */ zzhfz(byte[] bArr) {
    }
}
