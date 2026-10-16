package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class zzhvv {
    public static final /* synthetic */ int zza = 0;
    private static final zzhns zzb = zzhns.zzd(zzhvt.zza, zzhvq.class, zzheu.class);
    private static final zzhns zzc = zzhns.zzd(zzhvu.zza, zzhvw.class, zzhev.class);
    private static final zzher zzd = zzhmj.zzf("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", zzheu.class, zzhso.zzg());
    private static final zzhea zze = zzhmj.zze("type.googleapis.com/google.crypto.tink.Ed25519PublicKey", zzhev.class, zzhta.ASYMMETRIC_PUBLIC, zzhsq.zzg());
    private static final zzhmw zzf = zzhvs.zza;
    private static final zzhma zzg = zzhvr.zza;

    public static void zza(boolean z2) throws GeneralSecurityException {
        if (!zzhle.zza(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        int i5 = zzhyl.zza;
        zzhyl.zza(zzhne.zza());
        zzhna zzhnaVarZza = zzhna.zza();
        HashMap map = new HashMap();
        map.put("ED25519", zzhvp.zzb(zzhvo.zza));
        zzhvo zzhvoVar = zzhvo.zzd;
        map.put("ED25519_RAW", zzhvp.zzb(zzhvoVar));
        map.put("ED25519WithRawOutput", zzhvp.zzb(zzhvoVar));
        zzhnaVarZza.zzd(DesugarCollections.unmodifiableMap(map));
        zzhmv.zza().zzb(zzg, zzhvp.class);
        zzhmx.zza().zzb(zzf, zzhvp.class);
        zzhnb.zza().zzb(zzb);
        zzhnb.zza().zzb(zzc);
        zzhmb.zza().zzb(zzd, true);
        zzhmb.zza().zzb(zze, false);
    }
}
