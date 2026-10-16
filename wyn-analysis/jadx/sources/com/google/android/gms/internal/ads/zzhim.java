package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class zzhim {
    private static final zzhma zza = zzhil.zza;
    private static final zzhns zzb = zzhns.zzd(zzhik.zza, zzhij.class, zzhdr.class);

    public static void zza(boolean z2) throws GeneralSecurityException {
        int i5 = zzhkr.zza;
        zzhkr.zza(zzhne.zza());
        zzhna zzhnaVarZza = zzhna.zza();
        HashMap map = new HashMap();
        map.put("XAES_256_GCM_192_BIT_NONCE", zzhii.zzg);
        map.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", zzhii.zzh);
        map.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", zzhii.zzi);
        map.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", zzhii.zzj);
        zzhnaVarZza.zzd(DesugarCollections.unmodifiableMap(map));
        zzhnb.zza().zzb(zzb);
        zzhmv.zza().zzb(zza, zzhio.class);
    }
}
