package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class zzhxr {
    public static final /* synthetic */ int zza = 0;
    private static final zzhns zzb = zzhns.zzd(zzhxo.zza, zzhxl.class, zzheu.class);
    private static final zzhns zzc = zzhns.zzd(zzhxq.zza, zzhxn.class, zzhev.class);
    private static final zzher zzd = zzhmj.zzf("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", zzheu.class, zzhun.zzl());
    private static final zzhea zze = zzhmj.zze("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey", zzhev.class, zzhta.ASYMMETRIC_PUBLIC, zzhup.zzi());
    private static final zzhma zzf = zzhxp.zza;
    private static final int zzg = 2;

    public static void zza(boolean z2) throws GeneralSecurityException {
        int i5 = zzg;
        if (!zzhle.zza(i5)) {
            throw new GeneralSecurityException("Can not use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i10 = zzhzf.zza;
        zzhzf.zza(zzhne.zza());
        zzhna zzhnaVarZza = zzhna.zza();
        HashMap map = new HashMap();
        BigInteger bigInteger = zzhxj.zza;
        zzhxg zzhxgVar = new zzhxg(null);
        zzhxh zzhxhVar = zzhxh.zza;
        zzhxgVar.zzd(zzhxhVar);
        zzhxgVar.zze(zzhxhVar);
        zzhxgVar.zzf(32);
        zzhxgVar.zza(3072);
        BigInteger bigInteger2 = zzhxj.zza;
        zzhxgVar.zzb(bigInteger2);
        zzhxi zzhxiVar = zzhxi.zza;
        zzhxgVar.zzc(zzhxiVar);
        map.put("RSA_SSA_PSS_3072_SHA256_F4", zzhxgVar.zzg());
        zzhxg zzhxgVar2 = new zzhxg(null);
        zzhxgVar2.zzd(zzhxhVar);
        zzhxgVar2.zze(zzhxhVar);
        zzhxgVar2.zzf(32);
        zzhxgVar2.zza(3072);
        zzhxgVar2.zzb(bigInteger2);
        zzhxi zzhxiVar2 = zzhxi.zzd;
        zzhxgVar2.zzc(zzhxiVar2);
        map.put("RSA_SSA_PSS_3072_SHA256_F4_RAW", zzhxgVar2.zzg());
        map.put("RSA_SSA_PSS_3072_SHA256_SHA256_32_F4", zzhwp.zzk);
        zzhxg zzhxgVar3 = new zzhxg(null);
        zzhxh zzhxhVar2 = zzhxh.zzc;
        zzhxgVar3.zzd(zzhxhVar2);
        zzhxgVar3.zze(zzhxhVar2);
        zzhxgVar3.zzf(64);
        zzhxgVar3.zza(4096);
        zzhxgVar3.zzb(bigInteger2);
        zzhxgVar3.zzc(zzhxiVar);
        map.put("RSA_SSA_PSS_4096_SHA512_F4", zzhxgVar3.zzg());
        zzhxg zzhxgVar4 = new zzhxg(null);
        zzhxgVar4.zzd(zzhxhVar2);
        zzhxgVar4.zze(zzhxhVar2);
        zzhxgVar4.zzf(64);
        zzhxgVar4.zza(4096);
        zzhxgVar4.zzb(bigInteger2);
        zzhxgVar4.zzc(zzhxiVar2);
        map.put("RSA_SSA_PSS_4096_SHA512_F4_RAW", zzhxgVar4.zzg());
        map.put("RSA_SSA_PSS_4096_SHA512_SHA512_64_F4", zzhwp.zzl);
        zzhnaVarZza.zzd(DesugarCollections.unmodifiableMap(map));
        zzhnb.zza().zzb(zzb);
        zzhnb.zza().zzb(zzc);
        zzhmv.zza().zzb(zzf, zzhxj.class);
        zzhmb.zza().zzf(zzd, i5, true);
        zzhmb.zza().zzf(zze, i5, false);
    }
}
