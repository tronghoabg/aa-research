package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzhzy {
    private final byte[] zza;
    private final byte[] zzb;

    private zzhzy(byte[] bArr, byte[] bArr2) {
        this.zza = bArr;
        this.zzb = bArr2;
    }

    public static zzhzy zzc() throws GeneralSecurityException {
        byte[] bArrZza = zzhoc.zza(32);
        if (bArrZza.length == 32) {
            return new zzhzy(zzhlp.zza(zzhlp.zzb(bArrZza)), bArrZza);
        }
        throw new IllegalArgumentException("Given secret seed length is not 32");
    }

    public final byte[] zza() {
        return Arrays.copyOf(this.zza, 32);
    }

    public final byte[] zzb() {
        byte[] bArr = this.zzb;
        return Arrays.copyOf(bArr, bArr.length);
    }
}
