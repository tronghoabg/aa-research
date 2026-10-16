package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzhxk {
    private zzhxn zza = null;
    private zzibl zzb = null;
    private zzibl zzc = null;
    private zzibl zzd = null;
    private zzibl zze = null;
    private zzibl zzf = null;
    private zzibl zzg = null;

    private zzhxk() {
    }

    public final zzhxk zza(zzhxn zzhxnVar) {
        this.zza = zzhxnVar;
        return this;
    }

    public final zzhxk zzb(zzibl zziblVar, zzibl zziblVar2) {
        this.zzc = zziblVar;
        this.zzd = zziblVar2;
        return this;
    }

    public final zzhxk zzc(zzibl zziblVar) {
        this.zzb = zziblVar;
        return this;
    }

    public final zzhxk zzd(zzibl zziblVar, zzibl zziblVar2) {
        this.zze = zziblVar;
        this.zzf = zziblVar2;
        return this;
    }

    public final zzhxk zze(zzibl zziblVar) {
        this.zzg = zziblVar;
        return this;
    }

    public final zzhxl zzf() throws GeneralSecurityException {
        zzhxn zzhxnVar = this.zza;
        if (zzhxnVar == null) {
            throw new GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
        }
        if (this.zzc == null || this.zzd == null) {
            throw new GeneralSecurityException("Cannot build without prime factors");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("Cannot build without private exponent");
        }
        if (this.zze == null || this.zzf == null) {
            throw new GeneralSecurityException("Cannot build without prime exponents");
        }
        if (this.zzg == null) {
            throw new GeneralSecurityException("Cannot build without CRT coefficient");
        }
        BigInteger bigIntegerZzd = zzhxnVar.zzf().zzd();
        BigInteger bigIntegerZzd2 = this.zza.zzd();
        BigInteger bigIntegerZzb = this.zzc.zzb(zzhdx.zza());
        BigInteger bigIntegerZzb2 = this.zzd.zzb(zzhdx.zza());
        BigInteger bigIntegerZzb3 = this.zzb.zzb(zzhdx.zza());
        BigInteger bigIntegerZzb4 = this.zze.zzb(zzhdx.zza());
        BigInteger bigIntegerZzb5 = this.zzf.zzb(zzhdx.zza());
        BigInteger bigIntegerZzb6 = this.zzg.zzb(zzhdx.zza());
        if (!bigIntegerZzb.isProbablePrime(10)) {
            throw new GeneralSecurityException("p is not a prime");
        }
        if (!bigIntegerZzb2.isProbablePrime(10)) {
            throw new GeneralSecurityException("q is not a prime");
        }
        if (!bigIntegerZzb.multiply(bigIntegerZzb2).equals(bigIntegerZzd2)) {
            throw new GeneralSecurityException("Prime p times prime q is not equal to the public key's modulus");
        }
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger bigIntegerSubtract = bigIntegerZzb.subtract(bigInteger);
        BigInteger bigIntegerSubtract2 = bigIntegerZzb2.subtract(bigInteger);
        if (!bigIntegerZzd.multiply(bigIntegerZzb3).mod(bigIntegerSubtract.divide(bigIntegerSubtract.gcd(bigIntegerSubtract2)).multiply(bigIntegerSubtract2)).equals(bigInteger)) {
            throw new GeneralSecurityException("D is invalid.");
        }
        if (!bigIntegerZzd.multiply(bigIntegerZzb4).mod(bigIntegerSubtract).equals(bigInteger)) {
            throw new GeneralSecurityException("dP is invalid.");
        }
        if (!bigIntegerZzd.multiply(bigIntegerZzb5).mod(bigIntegerSubtract2).equals(bigInteger)) {
            throw new GeneralSecurityException("dQ is invalid.");
        }
        if (bigIntegerZzb2.multiply(bigIntegerZzb6).mod(bigIntegerZzb).equals(bigInteger)) {
            return new zzhxl(this.zza, this.zzc, this.zzd, this.zzb, this.zze, this.zzf, this.zzg, null);
        }
        throw new GeneralSecurityException("qInv is invalid.");
    }

    public /* synthetic */ zzhxk(byte[] bArr) {
    }
}
