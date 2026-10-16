package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class zzhgh {
    public static final /* synthetic */ int zza = 0;
    private static final zzhns zzb = zzhns.zzd(zzhge.zza, zzhgd.class, zzhdr.class);
    private static final zzhea zzc = zzhmj.zze("type.googleapis.com/google.crypto.tink.AesGcmKey", zzhdr.class, zzhta.SYMMETRIC, zzhrr.zze());
    private static final zzhmw zzd = zzhgg.zza;
    private static final zzhma zze = zzhgf.zza;
    private static final int zzf = 2;

    public static void zza(boolean z2) throws GeneralSecurityException {
        int i5 = zzf;
        if (!zzhle.zza(i5)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i10 = zzhjm.zza;
        zzhjm.zza(zzhne.zza());
        zzhnb.zza().zzb(zzb);
        zzhna zzhnaVarZza = zzhna.zza();
        HashMap map = new HashMap();
        map.put("AES128_GCM", zzhii.zza);
        zzhgi zzhgiVar = new zzhgi(null);
        zzhgiVar.zzb(12);
        zzhgiVar.zza(16);
        zzhgiVar.zzc(16);
        zzhgj zzhgjVar = zzhgj.zzc;
        zzhgiVar.zzd(zzhgjVar);
        map.put("AES128_GCM_RAW", zzhgiVar.zze());
        map.put("AES256_GCM", zzhii.zzb);
        zzhgi zzhgiVar2 = new zzhgi(null);
        zzhgiVar2.zzb(12);
        zzhgiVar2.zza(32);
        zzhgiVar2.zzc(16);
        zzhgiVar2.zzd(zzhgjVar);
        map.put("AES256_GCM_RAW", zzhgiVar2.zze());
        zzhnaVarZza.zzd(DesugarCollections.unmodifiableMap(map));
        zzhmx.zza().zzb(zzd, zzhgk.class);
        zzhmv.zza().zzb(zze, zzhgk.class);
        zzhmb.zza().zzf(zzc, i5, true);
    }
}
