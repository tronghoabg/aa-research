package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class zzhfy {
    public static final /* synthetic */ int zza = 0;
    private static final zzhns zzb = zzhns.zzd(zzhfw.zza, zzhfv.class, zzhdr.class);
    private static final zzhea zzc = zzhmj.zze("type.googleapis.com/google.crypto.tink.AesEaxKey", zzhdr.class, zzhta.SYMMETRIC, zzhrl.zzg());
    private static final zzhma zzd = zzhfx.zza;

    public static void zza(boolean z2) throws GeneralSecurityException {
        if (!zzhle.zza(1)) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        int i5 = zzhjf.zza;
        zzhjf.zza(zzhne.zza());
        zzhnb.zza().zzb(zzb);
        zzhna zzhnaVarZza = zzhna.zza();
        HashMap map = new HashMap();
        map.put("AES128_EAX", zzhii.zzc);
        zzhfz zzhfzVar = new zzhfz(null);
        zzhfzVar.zzb(16);
        zzhfzVar.zza(16);
        zzhfzVar.zzc(16);
        zzhga zzhgaVar = zzhga.zzc;
        zzhfzVar.zzd(zzhgaVar);
        map.put("AES128_EAX_RAW", zzhfzVar.zze());
        map.put("AES256_EAX", zzhii.zzd);
        zzhfz zzhfzVar2 = new zzhfz(null);
        zzhfzVar2.zzb(16);
        zzhfzVar2.zza(32);
        zzhfzVar2.zzc(16);
        zzhfzVar2.zzd(zzhgaVar);
        map.put("AES256_EAX_RAW", zzhfzVar2.zze());
        zzhnaVarZza.zzd(DesugarCollections.unmodifiableMap(map));
        zzhmv.zza().zzb(zzd, zzhgb.class);
        zzhmb.zza().zzb(zzc, true);
    }
}
