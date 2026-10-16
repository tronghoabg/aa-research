package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzwa;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzbj {
    public static final byte[] zza = new byte[0];

    public static byte[] zza(zzwa.zzb zzbVar) throws GeneralSecurityException {
        int i5 = zzbm.zza[zzbVar.zzf().ordinal()];
        if (i5 == 1 || i5 == 2) {
            return zzog.zza(zzbVar.zza()).zzb();
        }
        if (i5 == 3) {
            return zzog.zzb(zzbVar.zza()).zzb();
        }
        if (i5 == 4) {
            return zza;
        }
        throw new GeneralSecurityException("unknown output prefix type");
    }
}
