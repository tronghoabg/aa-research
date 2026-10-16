package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECPrivateKeySpec;

/* loaded from: classes3.dex */
public final class zzhyd implements zzheu {
    private static final byte[] zza = new byte[0];
    private static final byte[] zzb = {0};

    private zzhyd(ECPrivateKey eCPrivateKey, zziat zziatVar, zziad zziadVar, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!zzhle.zza(2)) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        }
        zzibh.zza(zziatVar);
    }

    public static zzheu zzb(zzhvh zzhvhVar) throws GeneralSecurityException {
        Provider providerZza = zzhli.zza();
        return new zzhyd((ECPrivateKey) (providerZza != null ? KeyFactory.getInstance("EC", providerZza) : (KeyFactory) zziak.zzf.zzb("EC")).generatePrivate(new ECPrivateKeySpec(zzhvhVar.zzf().zzb(zzhdx.zza()), zziae.zzb((zziac) zzhye.zzc.zzb(zzhvhVar.zzd().zzd())))), (zziat) zzhye.zza.zzb(zzhvhVar.zzd().zze()), (zziad) zzhye.zzb.zzb(zzhvhVar.zzd().zzc()), zzhvhVar.zze().zze().zzc(), zzhvhVar.zzd().zzf().equals(zzhve.zzc) ? zzb : zza, providerZza);
    }

    @Override // com.google.android.gms.internal.ads.zzheu
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        throw null;
    }
}
