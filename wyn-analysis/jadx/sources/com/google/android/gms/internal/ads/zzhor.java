package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes3.dex */
public final class zzhor {
    private Integer zza = null;
    private Integer zzb = null;
    private zzhos zzc = zzhos.zzd;

    private zzhor() {
    }

    public final zzhor zza(int i5) throws GeneralSecurityException {
        if (i5 != 16 && i5 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i5 * 8)));
        }
        this.zza = Integer.valueOf(i5);
        return this;
    }

    public final zzhor zzb(int i5) throws GeneralSecurityException {
        if (i5 < 10 || i5 > 16) {
            throw new GeneralSecurityException(N0.a.d(i5, "Invalid tag size for AesCmacParameters: ", new StringBuilder(String.valueOf(i5).length() + 40)));
        }
        this.zzb = Integer.valueOf(i5);
        return this;
    }

    public final zzhor zzc(zzhos zzhosVar) {
        this.zzc = zzhosVar;
        return this;
    }

    public final zzhot zzd() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("tag size not set");
        }
        if (this.zzc != null) {
            return new zzhot(num.intValue(), this.zzb.intValue(), this.zzc, null);
        }
        throw new GeneralSecurityException("variant not set");
    }

    public /* synthetic */ zzhor(byte[] bArr) {
    }
}
