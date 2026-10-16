package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes3.dex */
public final class zzhgr {
    private Integer zza = null;
    private zzhgs zzb = zzhgs.zzc;

    private zzhgr() {
    }

    public final zzhgr zza(int i5) throws GeneralSecurityException {
        if (i5 != 16 && i5 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i5)));
        }
        this.zza = Integer.valueOf(i5);
        return this;
    }

    public final zzhgr zzb(zzhgs zzhgsVar) {
        this.zzb = zzhgsVar;
        return this;
    }

    public final zzhgt zzc() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.zzb != null) {
            return new zzhgt(num.intValue(), this.zzb, null);
        }
        throw new GeneralSecurityException("Variant is not set");
    }

    public /* synthetic */ zzhgr(byte[] bArr) {
    }
}
