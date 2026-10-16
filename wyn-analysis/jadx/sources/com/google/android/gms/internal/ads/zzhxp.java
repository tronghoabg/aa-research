package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAKeyGenParameterSpec;

/* loaded from: classes3.dex */
final /* synthetic */ class zzhxp implements zzhma {
    static final /* synthetic */ zzhxp zza = new zzhxp();

    private /* synthetic */ zzhxp() {
    }

    @Override // com.google.android.gms.internal.ads.zzhma
    public final /* synthetic */ zzhdz zza(zzheq zzheqVar, Integer num) throws GeneralSecurityException {
        zzhxj zzhxjVar = (zzhxj) zzheqVar;
        int i5 = zzhxr.zza;
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) zziak.zze.zzb("RSA");
        keyPairGenerator.initialize(new RSAKeyGenParameterSpec(zzhxjVar.zzc(), new BigInteger(1, zzhxjVar.zzd().toByteArray())));
        KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
        RSAPublicKey rSAPublicKey = (RSAPublicKey) keyPairGenerateKeyPair.getPublic();
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyPairGenerateKeyPair.getPrivate();
        zzhxm zzhxmVar = new zzhxm(null);
        zzhxmVar.zza(zzhxjVar);
        zzhxmVar.zzb(rSAPublicKey.getModulus());
        zzhxmVar.zzc(num);
        zzhxn zzhxnVarZzd = zzhxmVar.zzd();
        zzhxk zzhxkVar = new zzhxk(null);
        zzhxkVar.zza(zzhxnVarZzd);
        zzhxkVar.zzb(zzibl.zza(rSAPrivateCrtKey.getPrimeP(), zzhdx.zza()), zzibl.zza(rSAPrivateCrtKey.getPrimeQ(), zzhdx.zza()));
        zzhxkVar.zzc(zzibl.zza(rSAPrivateCrtKey.getPrivateExponent(), zzhdx.zza()));
        zzhxkVar.zzd(zzibl.zza(rSAPrivateCrtKey.getPrimeExponentP(), zzhdx.zza()), zzibl.zza(rSAPrivateCrtKey.getPrimeExponentQ(), zzhdx.zza()));
        zzhxkVar.zze(zzibl.zza(rSAPrivateCrtKey.getCrtCoefficient(), zzhdx.zza()));
        return zzhxkVar.zzf();
    }
}
