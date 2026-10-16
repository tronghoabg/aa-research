package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzhph {
    static {
        int i5 = zzhtz.zza;
        try {
            zza();
        } catch (GeneralSecurityException e7) {
            throw new ExceptionInInitializerError(e7);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzhpl.zzc();
        zzhov.zzc();
        zzhpc.zza(true);
        if (zzhlf.zza()) {
            return;
        }
        zzhoq.zza(true);
    }
}
