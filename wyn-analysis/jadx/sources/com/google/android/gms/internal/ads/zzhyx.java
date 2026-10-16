package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;

/* loaded from: classes3.dex */
public final class zzhyx implements zzheu {
    private static final byte[] zzb = new byte[0];
    private static final byte[] zzc = {0};
    private static final byte[] zzd = {1, 2, 3};
    Provider zza;
    private final RSAPrivateCrtKey zze;
    private final String zzf;
    private final byte[] zzg;
    private final byte[] zzh;
    private final zzhev zzi;

    private zzhyx(RSAPrivateCrtKey rSAPrivateCrtKey, zzhwv zzhwvVar, byte[] bArr, byte[] bArr2, zzhev zzhevVar, Provider provider) throws GeneralSecurityException {
        if (!zzhle.zza(2)) {
            throw new GeneralSecurityException("Can not use RSA PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        if (zzhwvVar != zzhwv.zza && zzhwvVar != zzhwv.zzb && zzhwvVar != zzhwv.zzc) {
            throw new GeneralSecurityException("Unsupported hash: ".concat(String.valueOf(zzhwvVar)));
        }
        zzibi.zzc(rSAPrivateCrtKey.getModulus().bitLength());
        zzibi.zzd(rSAPrivateCrtKey.getPublicExponent());
        this.zze = rSAPrivateCrtKey;
        this.zzf = zzhyy.zzc(zzhwvVar);
        this.zzg = bArr;
        this.zzh = bArr2;
        this.zzi = zzhevVar;
        this.zza = provider;
    }

    public static zzheu zzb(zzhwz zzhwzVar) throws GeneralSecurityException {
        Provider providerZzb = zzhyy.zzb();
        zzhyx zzhyxVar = new zzhyx((RSAPrivateCrtKey) (providerZzb != null ? KeyFactory.getInstance("RSA", providerZzb) : (KeyFactory) zziak.zzf.zzb("RSA")).generatePrivate(new RSAPrivateCrtKeySpec(zzhwzVar.zze().zzd(), zzhwzVar.zzd().zzd(), zzhwzVar.zzi().zzb(zzhdx.zza()), zzhwzVar.zzf().zzb(zzhdx.zza()), zzhwzVar.zzh().zzb(zzhdx.zza()), zzhwzVar.zzj().zzb(zzhdx.zza()), zzhwzVar.zzk().zzb(zzhdx.zza()), zzhwzVar.zzl().zzb(zzhdx.zza()))), zzhwzVar.zzd().zzf(), zzhwzVar.zze().zze().zzc(), zzhwzVar.zzd().zze().equals(zzhww.zzc) ? zzc : zzb, providerZzb != null ? zzhyy.zze(zzhwzVar.zze(), providerZzb) : zzibc.zzb(zzhwzVar.zze()), providerZzb);
        zzhyxVar.zza(zzd);
        return zzhyxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzheu
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        Provider provider = this.zza;
        Signature signature = provider != null ? Signature.getInstance(this.zzf, provider) : (Signature) zziak.zzc.zzb(this.zzf);
        signature.initSign(this.zze);
        signature.update(bArr);
        byte[] bArr2 = this.zzh;
        if (bArr2.length > 0) {
            signature.update(bArr2);
        }
        byte[] bArrSign = signature.sign();
        byte[] bArr3 = this.zzg;
        if (bArr3.length > 0) {
            bArrSign = zzhzw.zza(bArr3, bArrSign);
        }
        try {
            this.zzi.zza(bArrSign, bArr);
            return bArrSign;
        } catch (GeneralSecurityException e7) {
            throw new IllegalStateException("RSA signature computation error", e7);
        }
    }
}
