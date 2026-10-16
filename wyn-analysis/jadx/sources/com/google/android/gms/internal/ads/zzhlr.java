package com.google.android.gms.internal.ads;

import java.lang.reflect.Array;
import java.math.BigInteger;

/* loaded from: classes3.dex */
final class zzhlr {
    static final long[] zza;
    static final long[] zzb;
    static final long[] zzc;
    static final zzhlk[][] zzd;
    static final zzhlk[] zze;
    private static final BigInteger zzf;
    private static final BigInteger zzg;
    private static final BigInteger zzh;
    private static final BigInteger zzi;

    static {
        BigInteger bigIntegerSubtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        zzf = bigIntegerSubtract;
        BigInteger bigIntegerMod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        zzg = bigIntegerMod;
        BigInteger bigIntegerMod2 = BigInteger.valueOf(2L).multiply(bigIntegerMod).mod(bigIntegerSubtract);
        zzh = bigIntegerMod2;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger bigIntegerModPow = bigIntegerValueOf.modPow(bigIntegerSubtract.subtract(bigInteger).divide(BigInteger.valueOf(4L)), bigIntegerSubtract);
        zzi = bigIntegerModPow;
        zzhlq zzhlqVar = new zzhlq(null);
        zzhlqVar.zzd(BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract));
        BigInteger bigIntegerZzc = zzhlqVar.zzc();
        BigInteger bigIntegerMultiply = bigIntegerZzc.pow(2).subtract(bigInteger).multiply(bigIntegerMod.multiply(bigIntegerZzc.pow(2)).add(bigInteger).modInverse(bigIntegerSubtract));
        BigInteger bigIntegerModPow2 = bigIntegerMultiply.modPow(bigIntegerSubtract.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), bigIntegerSubtract);
        if (!bigIntegerModPow2.pow(2).subtract(bigIntegerMultiply).mod(bigIntegerSubtract).equals(BigInteger.ZERO)) {
            bigIntegerModPow2 = bigIntegerModPow2.multiply(bigIntegerModPow).mod(bigIntegerSubtract);
        }
        if (bigIntegerModPow2.testBit(0)) {
            bigIntegerModPow2 = bigIntegerSubtract.subtract(bigIntegerModPow2);
        }
        zzhlqVar.zzb(bigIntegerModPow2);
        zza = zzhlw.zzg(zzb(bigIntegerMod));
        zzb = zzhlw.zzg(zzb(bigIntegerMod2));
        zzc = zzhlw.zzg(zzb(bigIntegerModPow));
        zzd = (zzhlk[][]) Array.newInstance((Class<?>) zzhlk.class, 32, 8);
        zzhlq zzhlqVarZza = zzhlqVar;
        for (int i5 = 0; i5 < 32; i5++) {
            zzhlq zzhlqVarZza2 = zzhlqVarZza;
            for (int i10 = 0; i10 < 8; i10++) {
                zzd[i5][i10] = zzc(zzhlqVarZza2);
                zzhlqVarZza2 = zza(zzhlqVarZza2, zzhlqVarZza);
            }
            for (int i11 = 0; i11 < 8; i11++) {
                zzhlqVarZza = zza(zzhlqVarZza, zzhlqVarZza);
            }
        }
        zzhlq zzhlqVarZza3 = zza(zzhlqVar, zzhlqVar);
        zze = new zzhlk[8];
        for (int i12 = 0; i12 < 8; i12++) {
            zze[i12] = zzc(zzhlqVar);
            zzhlqVar = zza(zzhlqVar, zzhlqVarZza3);
        }
    }

    private static zzhlq zza(zzhlq zzhlqVar, zzhlq zzhlqVar2) {
        zzhlq zzhlqVar3 = new zzhlq(null);
        BigInteger bigIntegerMultiply = zzg.multiply(zzhlqVar.zza().multiply(zzhlqVar2.zza()).multiply(zzhlqVar.zzc()).multiply(zzhlqVar2.zzc()));
        BigInteger bigInteger = zzf;
        BigInteger bigIntegerMod = bigIntegerMultiply.mod(bigInteger);
        BigInteger bigIntegerAdd = zzhlqVar.zza().multiply(zzhlqVar2.zzc()).add(zzhlqVar2.zza().multiply(zzhlqVar.zzc()));
        BigInteger bigInteger2 = BigInteger.ONE;
        zzhlqVar3.zzb(bigIntegerAdd.multiply(bigInteger2.add(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger));
        zzhlqVar3.zzd(zzhlqVar.zzc().multiply(zzhlqVar2.zzc()).add(zzhlqVar.zza().multiply(zzhlqVar2.zza())).multiply(bigInteger2.subtract(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger));
        return zzhlqVar3;
    }

    private static byte[] zzb(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        System.arraycopy(byteArray, 0, bArr, 32 - length, length);
        for (int i5 = 0; i5 < 16; i5++) {
            byte b5 = bArr[i5];
            int i10 = 31 - i5;
            bArr[i5] = bArr[i10];
            bArr[i10] = b5;
        }
        return bArr;
    }

    private static zzhlk zzc(zzhlq zzhlqVar) {
        BigInteger bigIntegerAdd = zzhlqVar.zzc().add(zzhlqVar.zza());
        BigInteger bigInteger = zzf;
        return new zzhlk(zzhlw.zzg(zzb(bigIntegerAdd.mod(bigInteger))), zzhlw.zzg(zzb(zzhlqVar.zzc().subtract(zzhlqVar.zza()).mod(bigInteger))), zzhlw.zzg(zzb(zzh.multiply(zzhlqVar.zza()).multiply(zzhlqVar.zzc()).mod(bigInteger))));
    }
}
