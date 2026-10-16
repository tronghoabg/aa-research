package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class zzibf implements zzhev {
    private final RSAPublicKey zza;
    private final zziat zzb;
    private final zziat zzc;
    private final int zzd;
    private final byte[] zze;
    private final byte[] zzf;

    public /* synthetic */ zzibf(RSAPublicKey rSAPublicKey, zziat zziatVar, zziat zziatVar2, int i5, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (zzhlf.zza()) {
            throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzibi.zzb(zziatVar);
        if (!zziatVar.equals(zziatVar2)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        zzibi.zzc(rSAPublicKey.getModulus().bitLength());
        zzibi.zzd(rSAPublicKey.getPublicExponent());
        this.zza = rSAPublicKey;
        this.zzb = zziatVar;
        this.zzc = zziatVar2;
        this.zzd = i5;
        this.zze = bArr;
        this.zzf = bArr2;
    }

    private final void zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        RSAPublicKey rSAPublicKey = this.zza;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int iBitLength = modulus.bitLength() + 7;
        int iBitLength2 = modulus.bitLength() + 6;
        if (iBitLength / 8 != bArr.length) {
            throw new GeneralSecurityException("invalid signature's length");
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("signature out of range");
        }
        byte[] bArrZzb = zzhlh.zzb(bigInteger.modPow(publicExponent, modulus), iBitLength2 / 8);
        int iBitLength3 = modulus.bitLength() - 1;
        zziat zziatVar = this.zzb;
        zzibi.zzb(zziatVar);
        zziak zziakVar = zziak.zzd;
        MessageDigest messageDigest = (MessageDigest) zziakVar.zzb(zzibh.zzb(zziatVar));
        messageDigest.update(bArr2);
        byte[] bArr3 = this.zzf;
        if (bArr3.length != 0) {
            messageDigest.update(bArr3);
        }
        byte[] bArrDigest = messageDigest.digest();
        int digestLength = messageDigest.getDigestLength();
        int length = bArrZzb.length;
        int i5 = this.zzd;
        if (length < digestLength + i5 + 2) {
            throw new GeneralSecurityException("inconsistent");
        }
        if (bArrZzb[length - 1] != -68) {
            throw new GeneralSecurityException("inconsistent");
        }
        int i10 = length - digestLength;
        int i11 = i10 - 1;
        byte[] bArrCopyOf = Arrays.copyOf(bArrZzb, i11);
        int length2 = bArrCopyOf.length;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrZzb, length2, length2 + digestLength);
        int i12 = 0;
        while (true) {
            long j8 = (length * 8) - iBitLength3;
            if (i12 < j8) {
                if (((bArrCopyOf[i12 / 8] >> (7 - (i12 % 8))) & 1) != 0) {
                    throw new GeneralSecurityException("inconsistent");
                }
                i12++;
            } else {
                MessageDigest messageDigest2 = (MessageDigest) zziakVar.zzb(zzibh.zzb(this.zzc));
                int digestLength2 = messageDigest2.getDigestLength();
                byte[] bArr4 = new byte[i11];
                int i13 = 0;
                int i14 = 0;
                while (i13 <= (i10 - 2) / digestLength2) {
                    messageDigest2.reset();
                    messageDigest2.update(bArrCopyOfRange);
                    int i15 = i5;
                    messageDigest2.update(zzhlh.zzb(BigInteger.valueOf(i13), 4));
                    byte[] bArrDigest2 = messageDigest2.digest();
                    int length3 = bArrDigest2.length;
                    System.arraycopy(bArrDigest2, 0, bArr4, i14, Math.min(length3, i11 - i14));
                    i14 += length3;
                    i13++;
                    i5 = i15;
                    messageDigest2 = messageDigest2;
                }
                int i16 = i5;
                byte[] bArr5 = new byte[i11];
                for (int i17 = 0; i17 < i11; i17++) {
                    bArr5[i17] = (byte) (bArr4[i17] ^ bArrCopyOf[i17]);
                }
                for (int i18 = 0; i18 <= j8; i18++) {
                    int i19 = i18 / 8;
                    bArr5[i19] = (byte) ((~(1 << (7 - (i18 % 8)))) & bArr5[i19]);
                }
                int i20 = 0;
                while (true) {
                    int i21 = (i10 - i16) - 2;
                    if (i20 >= i21) {
                        if (bArr5[i21] != 1) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr5, i11 - i16, i11);
                        int i22 = digestLength + 8;
                        byte[] bArr6 = new byte[i22 + i16];
                        System.arraycopy(bArrDigest, 0, bArr6, 8, bArrDigest.length);
                        System.arraycopy(bArrCopyOfRange2, 0, bArr6, i22, bArrCopyOfRange2.length);
                        if (!MessageDigest.isEqual(messageDigest.digest(bArr6), bArrCopyOfRange)) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        return;
                    }
                    if (bArr5[i20] != 0) {
                        throw new GeneralSecurityException("inconsistent");
                    }
                    i20++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhev
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zze;
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
