package com.google.android.gms.internal.p002firebaseauthapi;

import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzrg {
    public static byte[] zza(byte[] bArr) {
        if (bArr.length >= 16) {
            throw new IllegalArgumentException("x must be smaller than a block.");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 16);
        bArrCopyOf[bArr.length] = -128;
        return bArrCopyOf;
    }

    public static byte[] zzb(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        for (int i5 = 0; i5 < 16; i5++) {
            byte b5 = (byte) ((bArr[i5] << 1) & 254);
            bArr2[i5] = b5;
            if (i5 < 15) {
                bArr2[i5] = (byte) (((byte) ((bArr[i5 + 1] >> 7) & 1)) | b5);
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & Sdk.SDKError.Reason.INVALID_CONFIG_RESPONSE_VALUE)) ^ bArr2[15]);
        return bArr2;
    }
}
