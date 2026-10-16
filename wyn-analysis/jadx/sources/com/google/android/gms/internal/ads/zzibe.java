package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;

/* loaded from: classes3.dex */
public final class zzibe implements zzheu {
    private static final byte[] zza = new byte[0];
    private static final byte[] zzb = {0};

    public static zzheu zzb(zzhxl zzhxlVar) throws GeneralSecurityException {
        try {
            return zzhzg.zzb(zzhxlVar);
        } catch (NoSuchProviderException unused) {
            RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) ((KeyFactory) zziak.zzf.zzb("RSA")).generatePrivate(new RSAPrivateCrtKeySpec(zzhxlVar.zze().zzd(), zzhxlVar.zzd().zzd(), zzhxlVar.zzi().zzb(zzhdx.zza()), zzhxlVar.zzf().zzb(zzhdx.zza()), zzhxlVar.zzh().zzb(zzhdx.zza()), zzhxlVar.zzj().zzb(zzhdx.zza()), zzhxlVar.zzk().zzb(zzhdx.zza()), zzhxlVar.zzl().zzb(zzhdx.zza())));
            zzhxj zzhxjVarZzd = zzhxlVar.zzd();
            zzhlv zzhlvVar = zzibg.zza;
            return new zzibd(rSAPrivateCrtKey, (zziat) zzhlvVar.zzb(zzhxjVarZzd.zzf()), (zziat) zzhlvVar.zzb(zzhxjVarZzd.zzg()), zzhxjVarZzd.zzh(), zzhxlVar.zze().zze().zzc(), zzhxlVar.zzd().zze().equals(zzhxi.zzc) ? zzb : zza, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzheu
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        throw null;
    }
}
