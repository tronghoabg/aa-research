package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class zzhpc {
    public static final /* synthetic */ int zza = 0;
    private static final zzhns zzb = zzhns.zzd(zzhoy.zza, zzhox.class, zzhou.class);
    private static final zzhns zzc = zzhns.zzd(zzhpb.zza, zzhox.class, zzhep.class);
    private static final zzhea zzd = zzhmj.zze("type.googleapis.com/google.crypto.tink.HmacKey", zzhep.class, zzhta.SYMMETRIC, zzhsu.zzh());
    private static final zzhmw zze = zzhpa.zza;
    private static final zzhma zzf = zzhoz.zza;
    private static final int zzg = 2;

    public static void zza(boolean z2) throws GeneralSecurityException {
        int i5 = zzg;
        if (!zzhle.zza(i5)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i10 = zzhqf.zza;
        zzhqf.zza(zzhne.zza());
        zzhnb.zza().zzb(zzb);
        zzhnb.zza().zzb(zzc);
        zzhna zzhnaVarZza = zzhna.zza();
        HashMap map = new HashMap();
        map.put("HMAC_SHA256_128BITTAG", zzhpr.zza);
        zzhpd zzhpdVar = new zzhpd(null);
        zzhpdVar.zza(32);
        zzhpdVar.zzb(16);
        zzhpf zzhpfVar = zzhpf.zzd;
        zzhpdVar.zzc(zzhpfVar);
        zzhpe zzhpeVar = zzhpe.zzc;
        zzhpdVar.zzd(zzhpeVar);
        map.put("HMAC_SHA256_128BITTAG_RAW", zzhpdVar.zze());
        zzhpd zzhpdVar2 = new zzhpd(null);
        zzhpdVar2.zza(32);
        zzhpdVar2.zzb(32);
        zzhpf zzhpfVar2 = zzhpf.zza;
        zzhpdVar2.zzc(zzhpfVar2);
        zzhpdVar2.zzd(zzhpeVar);
        map.put("HMAC_SHA256_256BITTAG", zzhpdVar2.zze());
        zzhpd zzhpdVar3 = new zzhpd(null);
        zzhpdVar3.zza(32);
        zzhpdVar3.zzb(32);
        zzhpdVar3.zzc(zzhpfVar);
        zzhpdVar3.zzd(zzhpeVar);
        map.put("HMAC_SHA256_256BITTAG_RAW", zzhpdVar3.zze());
        zzhpd zzhpdVar4 = new zzhpd(null);
        zzhpdVar4.zza(64);
        zzhpdVar4.zzb(16);
        zzhpdVar4.zzc(zzhpfVar2);
        zzhpe zzhpeVar2 = zzhpe.zze;
        zzhpdVar4.zzd(zzhpeVar2);
        map.put("HMAC_SHA512_128BITTAG", zzhpdVar4.zze());
        zzhpd zzhpdVar5 = new zzhpd(null);
        zzhpdVar5.zza(64);
        zzhpdVar5.zzb(16);
        zzhpdVar5.zzc(zzhpfVar);
        zzhpdVar5.zzd(zzhpeVar2);
        map.put("HMAC_SHA512_128BITTAG_RAW", zzhpdVar5.zze());
        zzhpd zzhpdVar6 = new zzhpd(null);
        zzhpdVar6.zza(64);
        zzhpdVar6.zzb(32);
        zzhpdVar6.zzc(zzhpfVar2);
        zzhpdVar6.zzd(zzhpeVar2);
        map.put("HMAC_SHA512_256BITTAG", zzhpdVar6.zze());
        zzhpd zzhpdVar7 = new zzhpd(null);
        zzhpdVar7.zza(64);
        zzhpdVar7.zzb(32);
        zzhpdVar7.zzc(zzhpfVar);
        zzhpdVar7.zzd(zzhpeVar2);
        map.put("HMAC_SHA512_256BITTAG_RAW", zzhpdVar7.zze());
        map.put("HMAC_SHA512_512BITTAG", zzhpr.zzb);
        zzhpd zzhpdVar8 = new zzhpd(null);
        zzhpdVar8.zza(64);
        zzhpdVar8.zzb(64);
        zzhpdVar8.zzc(zzhpfVar);
        zzhpdVar8.zzd(zzhpeVar2);
        map.put("HMAC_SHA512_512BITTAG_RAW", zzhpdVar8.zze());
        zzhnaVarZza.zzd(DesugarCollections.unmodifiableMap(map));
        zzhmv.zza().zzb(zzf, zzhpg.class);
        zzhmx.zza().zzb(zze, zzhpg.class);
        zzhmb.zza().zzf(zzd, i5, true);
    }
}
