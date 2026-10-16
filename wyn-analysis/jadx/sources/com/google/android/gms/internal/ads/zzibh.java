package com.google.android.gms.internal.ads;

import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzibh {
    public static String zza(zziat zziatVar) throws GeneralSecurityException {
        zzibi.zzb(zziatVar);
        return zziatVar.toString().concat("withECDSA");
    }

    public static String zzb(zziat zziatVar) throws GeneralSecurityException {
        int iOrdinal = zziatVar.ordinal();
        if (iOrdinal == 0) {
            return AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1;
        }
        if (iOrdinal == 1) {
            return "SHA-224";
        }
        if (iOrdinal == 2) {
            return "SHA-256";
        }
        if (iOrdinal == 3) {
            return "SHA-384";
        }
        if (iOrdinal == 4) {
            return "SHA-512";
        }
        throw new GeneralSecurityException("Unsupported hash ".concat(zziatVar.toString()));
    }
}
