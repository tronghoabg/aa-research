package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAKeyGenParameterSpec;

/* loaded from: classes3.dex */
final /* synthetic */ class zzhxd implements zzhma {
    static final /* synthetic */ zzhxd zza = new zzhxd();

    private /* synthetic */ zzhxd() {
    }

    @Override // com.google.android.gms.internal.ads.zzhma
    public final /* synthetic */ zzhdz zza(zzheq zzheqVar, Integer num) throws GeneralSecurityException {
        zzhwx zzhwxVar = (zzhwx) zzheqVar;
        int i5 = zzhxf.zza;
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) zziak.zze.zzb("RSA");
        keyPairGenerator.initialize(new RSAKeyGenParameterSpec(zzhwxVar.zzc(), new BigInteger(1, zzhwxVar.zzd().toByteArray())));
        KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
        RSAPublicKey rSAPublicKey = (RSAPublicKey) keyPairGenerateKeyPair.getPublic();
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyPairGenerateKeyPair.getPrivate();
        zzhxa zzhxaVar = new zzhxa(null);
        zzhxaVar.zza(zzhwxVar);
        zzhxaVar.zzb(rSAPublicKey.getModulus());
        zzhxaVar.zzc(num);
        zzhxb zzhxbVarZzd = zzhxaVar.zzd();
        zzhwy zzhwyVar = new zzhwy(null);
        zzhwyVar.zza(zzhxbVarZzd);
        zzhwyVar.zzb(zzibl.zza(rSAPrivateCrtKey.getPrimeP(), zzhdx.zza()), zzibl.zza(rSAPrivateCrtKey.getPrimeQ(), zzhdx.zza()));
        zzhwyVar.zzc(zzibl.zza(rSAPrivateCrtKey.getPrivateExponent(), zzhdx.zza()));
        zzhwyVar.zzd(zzibl.zza(rSAPrivateCrtKey.getPrimeExponentP(), zzhdx.zza()), zzibl.zza(rSAPrivateCrtKey.getPrimeExponentQ(), zzhdx.zza()));
        zzhwyVar.zze(zzibl.zza(rSAPrivateCrtKey.getCrtCoefficient(), zzhdx.zza()));
        return zzhwyVar.zzf();
    }
}
