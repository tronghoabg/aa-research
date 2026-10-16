package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzhff {
    private static final zzhdw zza = new zzhfe();

    public static zzhdw zza() throws GeneralSecurityException {
        if (zzhlf.zza()) {
            throw new GeneralSecurityException("Cannot use non-FIPS-compliant AeadConfigurationV1 in FIPS mode");
        }
        return zza;
    }
}
