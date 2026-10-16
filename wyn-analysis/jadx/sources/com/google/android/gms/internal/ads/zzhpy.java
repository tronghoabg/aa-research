package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class zzhpy implements zzhou {
    private zzhpy(zzhom zzhomVar, Provider provider) throws GeneralSecurityException {
        if (!zzhle.zza(1)) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
        }
        try {
            Mac.getInstance("AESCMAC", provider);
            zzhomVar.zze().zzc();
            zzhomVar.zzf();
            new SecretKeySpec(zzhomVar.zzd().zzc(zzhdx.zza()), "AES");
        } catch (NoSuchAlgorithmException e7) {
            throw new GeneralSecurityException("AES-CMAC not available.", e7);
        }
    }

    public static zzhou zza(zzhom zzhomVar, Provider provider) throws GeneralSecurityException {
        return new zzhpy(zzhomVar, provider);
    }
}
