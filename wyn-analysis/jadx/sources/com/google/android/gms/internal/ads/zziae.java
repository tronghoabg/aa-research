package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.ECParameterSpec;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zziae {
    public static byte[] zza(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2;
        int i5;
        int length = bArr.length;
        if ((length & 1) != 0 || length == 0 || length > 132) {
            throw new GeneralSecurityException("Invalid IEEE_P1363 encoding");
        }
        int i10 = length >> 1;
        byte[] bArrZzc = zzc(Arrays.copyOf(bArr, i10));
        byte[] bArrZzc2 = zzc(Arrays.copyOfRange(bArr, i10, length));
        int length2 = bArrZzc.length;
        int length3 = bArrZzc2.length;
        int i11 = length2 + 4 + length3;
        if (i11 >= 128) {
            bArr2 = new byte[i11 + 3];
            bArr2[0] = 48;
            bArr2[1] = -127;
            bArr2[2] = (byte) i11;
            i5 = 3;
        } else {
            bArr2 = new byte[i11 + 2];
            bArr2[0] = 48;
            bArr2[1] = (byte) i11;
            i5 = 2;
        }
        int i12 = i5 + 1;
        bArr2[i5] = 2;
        int i13 = i5 + 2;
        bArr2[i12] = (byte) length2;
        System.arraycopy(bArrZzc, 0, bArr2, i13, length2);
        int i14 = i13 + length2;
        bArr2[i14] = 2;
        bArr2[i14 + 1] = (byte) length3;
        System.arraycopy(bArrZzc2, 0, bArr2, i14 + 2, length3);
        return bArr2;
    }

    public static ECParameterSpec zzb(zziac zziacVar) throws NoSuchAlgorithmException {
        int iOrdinal = zziacVar.ordinal();
        if (iOrdinal == 0) {
            return zzhlt.zza;
        }
        if (iOrdinal == 1) {
            return zzhlt.zzb;
        }
        if (iOrdinal == 2) {
            return zzhlt.zzc;
        }
        throw new NoSuchAlgorithmException("curve not implemented:".concat(zziacVar.toString()));
    }

    private static byte[] zzc(byte[] bArr) {
        int length;
        int i5 = 0;
        while (true) {
            length = bArr.length;
            if (i5 >= length || bArr[i5] != 0) {
                break;
            }
            i5++;
        }
        if (i5 == length) {
            i5 = length - 1;
        }
        int i10 = (bArr[i5] & 128) == 128 ? 1 : 0;
        int i11 = length - i5;
        byte[] bArr2 = new byte[i11 + i10];
        System.arraycopy(bArr, i5, bArr2, i10, i11);
        return bArr2;
    }
}
