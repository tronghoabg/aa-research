package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class zzhit {
    public static final /* synthetic */ int zza = 0;
    private static final zzhns zzb = zzhns.zzd(zzhis.zza, zzhip.class, zzhdr.class);
    private static final zzhea zzc = zzhmj.zze("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", zzhdr.class, zzhta.SYMMETRIC, zzhux.zze());
    private static final zzhmw zzd = zzhiq.zza;
    private static final zzhma zze = zzhir.zza;

    public static void zza(boolean z2) throws GeneralSecurityException {
        if (!zzhle.zza(1)) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        int i5 = zzhkx.zza;
        zzhkx.zza(zzhne.zza());
        zzhnb.zza().zzb(zzb);
        zzhna zzhnaVarZza = zzhna.zza();
        HashMap map = new HashMap();
        map.put("XCHACHA20_POLY1305", zzhiv.zzb(zzhiu.zza));
        map.put("XCHACHA20_POLY1305_RAW", zzhiv.zzb(zzhiu.zzc));
        zzhnaVarZza.zzd(DesugarCollections.unmodifiableMap(map));
        zzhmv.zza().zzb(zze, zzhiv.class);
        zzhmx.zza().zzb(zzd, zzhiv.class);
        zzhmb.zza().zzb(zzc, true);
    }
}
