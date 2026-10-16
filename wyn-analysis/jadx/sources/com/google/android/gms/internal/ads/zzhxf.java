package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class zzhxf {
    public static final /* synthetic */ int zza = 0;
    private static final zzhns zzb = zzhns.zzd(zzhxc.zza, zzhwz.class, zzheu.class);
    private static final zzhns zzc = zzhns.zzd(zzhxe.zza, zzhxb.class, zzhev.class);
    private static final zzher zzd = zzhmj.zzf("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", zzheu.class, zzhuf.zzl());
    private static final zzhea zze = zzhmj.zze("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey", zzhev.class, zzhta.ASYMMETRIC_PUBLIC, zzhuh.zzi());
    private static final zzhma zzf = zzhxd.zza;
    private static final int zzg = 2;

    public static void zza(boolean z2) throws GeneralSecurityException {
        int i5 = zzg;
        if (!zzhle.zza(i5)) {
            throw new GeneralSecurityException("Can not use RSA SSA PKCS1 in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i10 = zzhyw.zza;
        zzhyw.zza(zzhne.zza());
        zzhna zzhnaVarZza = zzhna.zza();
        HashMap map = new HashMap();
        map.put("RSA_SSA_PKCS1_3072_SHA256_F4", zzhwp.zzh);
        BigInteger bigInteger = zzhwx.zza;
        zzhwu zzhwuVar = new zzhwu(null);
        zzhwuVar.zzd(zzhwv.zza);
        zzhwuVar.zza(3072);
        BigInteger bigInteger2 = zzhwx.zza;
        zzhwuVar.zzb(bigInteger2);
        zzhww zzhwwVar = zzhww.zzd;
        zzhwuVar.zzc(zzhwwVar);
        map.put("RSA_SSA_PKCS1_3072_SHA256_F4_RAW", zzhwuVar.zze());
        map.put("RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX", zzhwp.zzi);
        map.put("RSA_SSA_PKCS1_4096_SHA512_F4", zzhwp.zzj);
        zzhwu zzhwuVar2 = new zzhwu(null);
        zzhwuVar2.zzd(zzhwv.zzc);
        zzhwuVar2.zza(4096);
        zzhwuVar2.zzb(bigInteger2);
        zzhwuVar2.zzc(zzhwwVar);
        map.put("RSA_SSA_PKCS1_4096_SHA512_F4_RAW", zzhwuVar2.zze());
        zzhnaVarZza.zzd(map);
        zzhnb.zza().zzb(zzb);
        zzhnb.zza().zzb(zzc);
        zzhmv.zza().zzb(zzf, zzhwx.class);
        zzhmb.zza().zzf(zzd, i5, true);
        zzhmb.zza().zzf(zze, i5, false);
    }
}
