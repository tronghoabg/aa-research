package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class zzhvn {
    public static final /* synthetic */ int zza = 0;
    private static final zzhns zzb = zzhns.zzd(zzhvk.zza, zzhvh.class, zzheu.class);
    private static final zzhns zzc = zzhns.zzd(zzhvm.zza, zzhvj.class, zzhev.class);
    private static final zzher zzd = zzhmj.zzf("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", zzheu.class, zzhsh.zzg());
    private static final zzhea zze = zzhmj.zze("type.googleapis.com/google.crypto.tink.EcdsaPublicKey", zzhev.class, zzhta.ASYMMETRIC_PUBLIC, zzhsj.zzi());
    private static final zzhma zzf = zzhvl.zza;
    private static final int zzg = 2;

    public static void zza(boolean z2) throws GeneralSecurityException {
        int i5 = zzg;
        if (!zzhle.zza(i5)) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i10 = zzhyc.zza;
        zzhyc.zza(zzhne.zza());
        zzhna zzhnaVarZza = zzhna.zza();
        HashMap map = new HashMap();
        map.put("ECDSA_P256", zzhwp.zza);
        map.put("ECDSA_P256_IEEE_P1363", zzhwp.zzd);
        zzhva zzhvaVar = new zzhva(null);
        zzhvaVar.zzc(zzhvc.zza);
        zzhvaVar.zzb(zzhvb.zza);
        zzhvaVar.zza(zzhvd.zza);
        zzhvaVar.zzd(zzhve.zzd);
        map.put("ECDSA_P256_RAW", zzhvaVar.zze());
        map.put("ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX", zzhwp.zzf);
        map.put("ECDSA_P384", zzhwp.zzb);
        map.put("ECDSA_P384_IEEE_P1363", zzhwp.zze);
        zzhva zzhvaVar2 = new zzhva(null);
        zzhvaVar2.zzc(zzhvc.zzc);
        zzhvb zzhvbVar = zzhvb.zzb;
        zzhvaVar2.zzb(zzhvbVar);
        zzhvd zzhvdVar = zzhvd.zzb;
        zzhvaVar2.zza(zzhvdVar);
        zzhve zzhveVar = zzhve.zza;
        zzhvaVar2.zzd(zzhveVar);
        map.put("ECDSA_P384_SHA512", zzhvaVar2.zze());
        zzhva zzhvaVar3 = new zzhva(null);
        zzhvaVar3.zzc(zzhvc.zzb);
        zzhvaVar3.zzb(zzhvbVar);
        zzhvaVar3.zza(zzhvdVar);
        zzhvaVar3.zzd(zzhveVar);
        map.put("ECDSA_P384_SHA384", zzhvaVar3.zze());
        map.put("ECDSA_P521", zzhwp.zzc);
        map.put("ECDSA_P521_IEEE_P1363", zzhwp.zzg);
        zzhnaVarZza.zzd(DesugarCollections.unmodifiableMap(map));
        zzhnb.zza().zzb(zzb);
        zzhnb.zza().zzb(zzc);
        zzhmv.zza().zzb(zzf, zzhvf.class);
        zzhmb.zza().zzf(zzd, i5, true);
        zzhmb.zza().zzf(zze, i5, false);
    }
}
