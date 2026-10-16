package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzhyy implements zzhev {
    private static final byte[] zza = new byte[0];
    private static final byte[] zzb = {0};
    private final RSAPublicKey zzc;
    private final String zzd;
    private final byte[] zze;
    private final byte[] zzf;
    private final Provider zzg;

    private zzhyy(RSAPublicKey rSAPublicKey, zzhwv zzhwvVar, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!zzhle.zza(2)) {
            throw new GeneralSecurityException("Can not use RSA-PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzibi.zzc(rSAPublicKey.getModulus().bitLength());
        zzibi.zzd(rSAPublicKey.getPublicExponent());
        this.zzc = rSAPublicKey;
        this.zzd = zzc(zzhwvVar);
        this.zze = bArr;
        this.zzf = bArr2;
        this.zzg = provider;
    }

    public static Provider zzb() {
        if (zzhok.zzc()) {
            zzhok.zzd().getClass();
        }
        return zzhli.zza();
    }

    public static String zzc(zzhwv zzhwvVar) throws GeneralSecurityException {
        if (zzhwvVar == zzhwv.zza) {
            return "SHA256withRSA";
        }
        if (zzhwvVar == zzhwv.zzb) {
            return "SHA384withRSA";
        }
        if (zzhwvVar == zzhwv.zzc) {
            return "SHA512withRSA";
        }
        throw new GeneralSecurityException("unknown hash type");
    }

    public static zzhev zzd(zzhxb zzhxbVar) throws GeneralSecurityException {
        Provider providerZzb = zzb();
        if (providerZzb != null) {
            return zze(zzhxbVar, providerZzb);
        }
        throw new NoSuchProviderException("RSA-PKCS1.5 using Conscrypt is not supported.");
    }

    public static zzhev zze(zzhxb zzhxbVar, Provider provider) throws GeneralSecurityException {
        return new zzhyy((RSAPublicKey) KeyFactory.getInstance("RSA", provider).generatePublic(new RSAPublicKeySpec(zzhxbVar.zzd(), zzhxbVar.zzf().zzd())), zzhxbVar.zzf().zzf(), zzhxbVar.zze().zzc(), zzhxbVar.zzf().zze().equals(zzhww.zzc) ? zzb : zza, provider);
    }

    @Override // com.google.android.gms.internal.ads.zzhev
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zze;
        if (!zzhok.zze(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        String str = this.zzd;
        Provider provider = this.zzg;
        RSAPublicKey rSAPublicKey = this.zzc;
        Signature signature = Signature.getInstance(str, provider);
        signature.initVerify(rSAPublicKey);
        signature.update(bArr2);
        byte[] bArr4 = this.zzf;
        if (bArr4.length > 0) {
            signature.update(bArr4);
        }
        try {
            if (signature.verify(Arrays.copyOfRange(bArr, bArr3.length, bArr.length))) {
                return;
            }
        } catch (RuntimeException unused) {
        }
        throw new GeneralSecurityException("Invalid signature");
    }
}
