package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.RSAPublicKeySpec;

/* loaded from: classes3.dex */
public final class zzhzh implements zzhev {
    private static final byte[] zza = new byte[0];
    private static final byte[] zzb = {0};
    private final RSAPublicKey zzc;
    private final String zzd;
    private final PSSParameterSpec zze;
    private final byte[] zzf;
    private final byte[] zzg;
    private final Provider zzh;

    private zzhzh(RSAPublicKey rSAPublicKey, zzhxh zzhxhVar, zzhxh zzhxhVar2, int i5, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!zzhle.zza(2)) {
            throw new GeneralSecurityException("Cannot use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        if (!zzhxhVar.equals(zzhxhVar2)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        zzibi.zzc(rSAPublicKey.getModulus().bitLength());
        zzibi.zzd(rSAPublicKey.getPublicExponent());
        this.zzc = rSAPublicKey;
        this.zzd = zzc(zzhxhVar);
        this.zze = zzd(zzhxhVar, zzhxhVar2, i5);
        this.zzf = bArr;
        this.zzg = bArr2;
        this.zzh = provider;
    }

    public static Provider zzb() {
        if (!zzhok.zzc() || zzhok.zzd().intValue() > 23) {
            return zzhli.zza();
        }
        return null;
    }

    public static String zzc(zzhxh zzhxhVar) {
        if (zzhxhVar == zzhxh.zza) {
            return "SHA256withRSA/PSS";
        }
        if (zzhxhVar == zzhxh.zzb) {
            return "SHA384withRSA/PSS";
        }
        if (zzhxhVar == zzhxh.zzc) {
            return "SHA512withRSA/PSS";
        }
        throw new IllegalArgumentException("Unsupported hash: ".concat(String.valueOf(zzhxhVar)));
    }

    public static PSSParameterSpec zzd(zzhxh zzhxhVar, zzhxh zzhxhVar2, int i5) {
        String str;
        MGF1ParameterSpec mGF1ParameterSpec;
        zzhxh zzhxhVar3 = zzhxh.zza;
        if (zzhxhVar == zzhxhVar3) {
            str = "SHA-256";
        } else if (zzhxhVar == zzhxh.zzb) {
            str = "SHA-384";
        } else {
            if (zzhxhVar != zzhxh.zzc) {
                throw new IllegalArgumentException("Unsupported MD hash: ".concat(String.valueOf(zzhxhVar)));
            }
            str = "SHA-512";
        }
        if (zzhxhVar2 == zzhxhVar3) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA256;
        } else if (zzhxhVar2 == zzhxh.zzb) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA384;
        } else {
            if (zzhxhVar2 != zzhxh.zzc) {
                throw new IllegalArgumentException("Unsupported MGF1 hash: ".concat(String.valueOf(zzhxhVar2)));
            }
            mGF1ParameterSpec = MGF1ParameterSpec.SHA512;
        }
        return new PSSParameterSpec(str, "MGF1", mGF1ParameterSpec, i5, 1);
    }

    public static zzhev zze(zzhxn zzhxnVar) throws GeneralSecurityException {
        Provider providerZzb = zzb();
        if (providerZzb == null) {
            throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
        }
        RSAPublicKey rSAPublicKey = (RSAPublicKey) KeyFactory.getInstance("RSA", providerZzb).generatePublic(new RSAPublicKeySpec(zzhxnVar.zzd(), zzhxnVar.zzf().zzd()));
        zzhxj zzhxjVarZzf = zzhxnVar.zzf();
        return new zzhzh(rSAPublicKey, zzhxjVarZzf.zzf(), zzhxjVarZzf.zzg(), zzhxjVarZzf.zzh(), zzhxnVar.zze().zzc(), zzhxnVar.zzf().zze().equals(zzhxi.zzc) ? zzb : zza, providerZzb);
    }

    @Override // com.google.android.gms.internal.ads.zzhev
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzf;
        if (!zzhok.zze(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        String str = this.zzd;
        Provider provider = this.zzh;
        RSAPublicKey rSAPublicKey = this.zzc;
        Signature signature = Signature.getInstance(str, provider);
        signature.initVerify(rSAPublicKey);
        signature.setParameter(this.zze);
        signature.update(bArr2);
        byte[] bArr4 = this.zzg;
        if (bArr4.length > 0) {
            signature.update(bArr4);
        }
        int length = bArr.length;
        int length2 = bArr3.length;
        if (!signature.verify(bArr, length2, length - length2)) {
            throw new GeneralSecurityException("signature verification failed");
        }
    }
}
