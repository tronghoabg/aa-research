package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class zzhfp {
    public static final /* synthetic */ int zza = 0;
    private static final zzhns zzb = zzhns.zzd(zzhfo.zza, zzhfl.class, zzhdr.class);
    private static final zzhea zzc = zzhmj.zze("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", zzhdr.class, zzhta.SYMMETRIC, zzhrb.zzg());
    private static final zzhmw zzd = zzhfn.zza;
    private static final zzhma zze = zzhfm.zza;
    private static final int zzf = 2;

    public static void zza(boolean z2) throws GeneralSecurityException {
        int i5 = zzf;
        if (!zzhle.zza(i5)) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i10 = zzhja.zza;
        zzhja.zza(zzhne.zza());
        zzhnb.zza().zzb(zzb);
        zzhna zzhnaVarZza = zzhna.zza();
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", zzhii.zze);
        zzhfq zzhfqVar = new zzhfq(null);
        zzhfqVar.zza(16);
        zzhfqVar.zzb(32);
        zzhfqVar.zzd(16);
        zzhfqVar.zzc(16);
        zzhfr zzhfrVar = zzhfr.zzc;
        zzhfqVar.zzf(zzhfrVar);
        zzhfs zzhfsVar = zzhfs.zzc;
        zzhfqVar.zze(zzhfsVar);
        map.put("AES128_CTR_HMAC_SHA256_RAW", zzhfqVar.zzg());
        map.put("AES256_CTR_HMAC_SHA256", zzhii.zzf);
        zzhfq zzhfqVar2 = new zzhfq(null);
        zzhfqVar2.zza(32);
        zzhfqVar2.zzb(32);
        zzhfqVar2.zzd(32);
        zzhfqVar2.zzc(16);
        zzhfqVar2.zzf(zzhfrVar);
        zzhfqVar2.zze(zzhfsVar);
        map.put("AES256_CTR_HMAC_SHA256_RAW", zzhfqVar2.zzg());
        zzhnaVarZza.zzd(DesugarCollections.unmodifiableMap(map));
        zzhmx.zza().zzb(zzd, zzhft.class);
        zzhmv.zza().zzb(zze, zzhft.class);
        zzhmb.zza().zzf(zzc, i5, true);
    }
}
