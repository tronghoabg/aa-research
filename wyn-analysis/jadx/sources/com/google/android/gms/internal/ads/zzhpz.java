package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;

/* loaded from: classes3.dex */
public final class zzhpz implements zzhou {
    public zzhpz(zzhom zzhomVar) {
    }

    public static zzhou zza(zzhom zzhomVar) throws GeneralSecurityException {
        if (!zzhle.zza(1)) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
        }
        Provider providerZza = zzhli.zza();
        if (providerZza != null) {
            try {
                return zzhpy.zza(zzhomVar, providerZza);
            } catch (GeneralSecurityException unused) {
            }
        }
        return new zzhpz(zzhomVar);
    }
}
