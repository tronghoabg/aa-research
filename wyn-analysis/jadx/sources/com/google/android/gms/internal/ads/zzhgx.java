package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class zzhgx {
    public static final /* synthetic */ int zza = 0;
    private static final zzhns zzb = zzhns.zzd(zzhgw.zza, zzhgu.class, zzhdr.class);
    private static final zzhma zzc = zzhgv.zza;
    private static final zzhea zzd = zzhmj.zze("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", zzhdr.class, zzhta.SYMMETRIC, zzhrz.zze());

    public static void zza(boolean z2) throws GeneralSecurityException {
        if (!zzhle.zza(1)) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        int i5 = zzhjz.zza;
        zzhjz.zza(zzhne.zza());
        zzhnb.zza().zzb(zzb);
        zzhmv.zza().zzb(zzc, zzhgz.class);
        zzhna zzhnaVarZza = zzhna.zza();
        HashMap map = new HashMap();
        map.put("CHACHA20_POLY1305", zzhgz.zzb(zzhgy.zza));
        map.put("CHACHA20_POLY1305_RAW", zzhgz.zzb(zzhgy.zzc));
        zzhnaVarZza.zzd(DesugarCollections.unmodifiableMap(map));
        zzhmb.zza().zzb(zzd, true);
    }
}
