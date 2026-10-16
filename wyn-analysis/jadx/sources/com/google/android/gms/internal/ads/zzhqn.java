package com.google.android.gms.internal.ads;

import A7.AbstractC0279p0;
import j$.util.Objects;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes3.dex */
public final class zzhqn extends zzhqq {
    private final int zza;

    private zzhqn(int i5) {
        this.zza = i5;
    }

    public static zzhqn zzb(int i5) throws GeneralSecurityException {
        if (i5 == 16 || i5 == 32) {
            return new zzhqn(i5);
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", Integer.valueOf(i5 * 8)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzhqn) && ((zzhqn) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzhqn.class, Integer.valueOf(this.zza));
    }

    public final String toString() {
        int i5 = this.zza;
        return AbstractC0279p0.o(new StringBuilder(String.valueOf(i5).length() + 34), "AesCmac PRF Parameters (", i5, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final boolean zza() {
        return false;
    }

    public final int zzc() {
        return this.zza;
    }
}
