package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzhxs {
    static {
        int i5 = zzhtz.zza;
        try {
            zza();
        } catch (GeneralSecurityException e7) {
            throw new ExceptionInInitializerError(e7);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzhwr.zzc();
        zzhwt.zzc();
        zzhvn.zza(true);
        zzhxf.zza(true);
        zzhxr.zza(true);
        if (zzhlf.zza()) {
            return;
        }
        zzhvv.zza(true);
    }
}
