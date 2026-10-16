package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class zzibb implements zzhev {
    private final RSAPublicKey zza;
    private final zziat zzb;
    private final byte[] zzc;
    private final byte[] zzd;

    public /* synthetic */ zzibb(RSAPublicKey rSAPublicKey, zziat zziatVar, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (zzhlf.zza()) {
            throw new GeneralSecurityException("Conscrypt is not available, and we cannot use Java Implementation of RSA-PKCS1.5 in FIPS-mode.");
        }
        zzibi.zzb(zziatVar);
        zzibi.zzc(rSAPublicKey.getModulus().bitLength());
        zzibi.zzd(rSAPublicKey.getPublicExponent());
        this.zza = rSAPublicKey;
        this.zzb = zziatVar;
        this.zzc = bArr;
        this.zzd = bArr2;
    }

    private final void zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrZza;
        int i5;
        RSAPublicKey rSAPublicKey = this.zza;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int iBitLength = (modulus.bitLength() + 7) / 8;
        if (iBitLength != bArr.length) {
            throw new GeneralSecurityException("invalid signature's length");
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("signature out of range");
        }
        byte[] bArrZzb = zzhlh.zzb(bigInteger.modPow(publicExponent, modulus), iBitLength);
        zziat zziatVar = this.zzb;
        zzibi.zzb(zziatVar);
        MessageDigest messageDigest = (MessageDigest) zziak.zzd.zzb(zzibh.zzb(zziatVar));
        messageDigest.update(bArr2);
        byte[] bArr3 = this.zzd;
        if (bArr3.length != 0) {
            messageDigest.update(bArr3);
        }
        byte[] bArrDigest = messageDigest.digest();
        int iOrdinal = zziatVar.ordinal();
        int i10 = 2;
        if (iOrdinal == 2) {
            bArrZza = zziau.zza("3031300d060960864801650304020105000420");
        } else if (iOrdinal == 3) {
            bArrZza = zziau.zza("3041300d060960864801650304020205000430");
        } else {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unsupported hash ".concat(zziatVar.toString()));
            }
            bArrZza = zziau.zza("3051300d060960864801650304020305000440");
        }
        if (iBitLength < bArrZza.length + bArrDigest.length + 11) {
            throw new GeneralSecurityException("intended encoded message length too short");
        }
        byte[] bArr4 = new byte[iBitLength];
        bArr4[0] = 0;
        bArr4[1] = 1;
        int i11 = 0;
        while (true) {
            i5 = i10 + 1;
            if (i11 >= (iBitLength - r5) - 3) {
                break;
            }
            bArr4[i10] = -1;
            i11++;
            i10 = i5;
        }
        bArr4[i10] = 0;
        int length = bArrZza.length;
        System.arraycopy(bArrZza, 0, bArr4, i5, length);
        System.arraycopy(bArrDigest, 0, bArr4, i5 + length, bArrDigest.length);
        if (!MessageDigest.isEqual(bArrZzb, bArr4)) {
            throw new GeneralSecurityException("invalid signature");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhev
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzc;
        int length = bArr3.length;
        if (length == 0) {
            zzb(bArr, bArr2);
        } else {
            if (!zzhok.zze(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            zzb(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }
}
