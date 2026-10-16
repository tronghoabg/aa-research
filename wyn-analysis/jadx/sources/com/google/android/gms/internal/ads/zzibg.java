package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

/* loaded from: classes3.dex */
public final class zzibg implements zzhev {
    static final zzhlv zza;
    private static final byte[] zzb;
    private static final byte[] zzc;

    static {
        zzhlu zzhluVarZza = zzhlv.zza();
        zzhluVarZza.zza(zziat.SHA256, zzhxh.zza);
        zzhluVarZza.zza(zziat.SHA384, zzhxh.zzb);
        zzhluVarZza.zza(zziat.SHA512, zzhxh.zzc);
        zza = zzhluVarZza.zzb();
        zzb = new byte[0];
        zzc = new byte[]{0};
    }

    public static zzhev zzb(zzhxn zzhxnVar) throws GeneralSecurityException {
        try {
            return zzhzh.zze(zzhxnVar);
        } catch (NoSuchProviderException unused) {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) ((KeyFactory) zziak.zzf.zzb("RSA")).generatePublic(new RSAPublicKeySpec(zzhxnVar.zzd(), zzhxnVar.zzf().zzd()));
            zzhxj zzhxjVarZzf = zzhxnVar.zzf();
            zzhlv zzhlvVar = zza;
            return new zzibf(rSAPublicKey, (zziat) zzhlvVar.zzb(zzhxjVarZzf.zzf()), (zziat) zzhlvVar.zzb(zzhxjVarZzf.zzg()), zzhxjVarZzf.zzh(), zzhxnVar.zze().zzc(), zzhxnVar.zzf().zze().equals(zzhxi.zzc) ? zzc : zzb, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhev
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }
}
