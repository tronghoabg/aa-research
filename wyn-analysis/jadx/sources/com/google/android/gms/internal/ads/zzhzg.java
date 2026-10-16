package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;

/* loaded from: classes3.dex */
public final class zzhzg implements zzheu {
    private static final byte[] zza = new byte[0];
    private static final byte[] zzb = {0};

    private zzhzg(RSAPrivateCrtKey rSAPrivateCrtKey, zzhxh zzhxhVar, zzhxh zzhxhVar2, int i5, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!zzhle.zza(2)) {
            throw new GeneralSecurityException("Cannot use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzibi.zzc(rSAPrivateCrtKey.getModulus().bitLength());
        zzibi.zzd(rSAPrivateCrtKey.getPublicExponent());
        zzhzh.zzc(zzhxhVar);
        zzhzh.zzd(zzhxhVar, zzhxhVar2, i5);
    }

    public static zzheu zzb(zzhxl zzhxlVar) throws GeneralSecurityException {
        Provider providerZzb = zzhzh.zzb();
        if (providerZzb == null) {
            throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
        }
        KeyFactory keyFactory = KeyFactory.getInstance("RSA", providerZzb);
        zzhxj zzhxjVarZzd = zzhxlVar.zzd();
        return new zzhzg((RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(zzhxlVar.zze().zzd(), zzhxjVarZzd.zzd(), zzhxlVar.zzi().zzb(zzhdx.zza()), zzhxlVar.zzf().zzb(zzhdx.zza()), zzhxlVar.zzh().zzb(zzhdx.zza()), zzhxlVar.zzj().zzb(zzhdx.zza()), zzhxlVar.zzk().zzb(zzhdx.zza()), zzhxlVar.zzl().zzb(zzhdx.zza()))), zzhxjVarZzd.zzf(), zzhxjVarZzd.zzg(), zzhxjVarZzd.zzh(), zzhxlVar.zze().zze().zzc(), zzhxjVarZzd.zze().equals(zzhxi.zzc) ? zzb : zza, providerZzb);
    }

    @Override // com.google.android.gms.internal.ads.zzheu
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        throw null;
    }
}
