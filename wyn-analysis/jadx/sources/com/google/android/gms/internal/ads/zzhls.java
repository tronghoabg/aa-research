package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* loaded from: classes3.dex */
final class zzhls {
    static final zzhls zzd;
    final BigInteger zza;
    final BigInteger zzb;
    final BigInteger zzc;

    static {
        BigInteger bigInteger = BigInteger.ONE;
        zzd = new zzhls(bigInteger, bigInteger, BigInteger.ZERO);
    }

    public zzhls(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.zza = bigInteger;
        this.zzb = bigInteger2;
        this.zzc = bigInteger3;
    }

    public final boolean zza() {
        return this.zzc.equals(BigInteger.ZERO);
    }
}
