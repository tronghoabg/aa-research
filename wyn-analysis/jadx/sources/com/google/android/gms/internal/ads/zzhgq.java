package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class zzhgq {
    public static final /* synthetic */ int zza = 0;
    private static final zzhns zzb = zzhns.zzd(zzhgn.zza, zzhgm.class, zzhdr.class);
    private static final zzhma zzc = zzhgp.zza;
    private static final zzhmw zzd = zzhgo.zza;
    private static final zzhea zze = zzhmj.zze("type.googleapis.com/google.crypto.tink.AesGcmSivKey", zzhdr.class, zzhta.SYMMETRIC, zzhrv.zze());

    public static void zza(boolean z2) throws GeneralSecurityException {
        if (!zzhle.zza(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        int i5 = zzhjt.zza;
        zzhjt.zza(zzhne.zza());
        zzhna zzhnaVarZza = zzhna.zza();
        HashMap map = new HashMap();
        zzhgr zzhgrVar = new zzhgr(null);
        zzhgrVar.zza(16);
        zzhgs zzhgsVar = zzhgs.zza;
        zzhgrVar.zzb(zzhgsVar);
        map.put("AES128_GCM_SIV", zzhgrVar.zzc());
        zzhgr zzhgrVar2 = new zzhgr(null);
        zzhgrVar2.zza(16);
        zzhgs zzhgsVar2 = zzhgs.zzc;
        zzhgrVar2.zzb(zzhgsVar2);
        map.put("AES128_GCM_SIV_RAW", zzhgrVar2.zzc());
        zzhgr zzhgrVar3 = new zzhgr(null);
        zzhgrVar3.zza(32);
        zzhgrVar3.zzb(zzhgsVar);
        map.put("AES256_GCM_SIV", zzhgrVar3.zzc());
        zzhgr zzhgrVar4 = new zzhgr(null);
        zzhgrVar4.zza(32);
        zzhgrVar4.zzb(zzhgsVar2);
        map.put("AES256_GCM_SIV_RAW", zzhgrVar4.zzc());
        zzhnaVarZza.zzd(DesugarCollections.unmodifiableMap(map));
        zzhmx.zza().zzb(zzd, zzhgt.class);
        zzhmv.zza().zzb(zzc, zzhgt.class);
        zzhnb.zza().zzb(zzb);
        zzhmb.zza().zzb(zze, true);
    }
}
