package com.google.android.gms.internal.ads;

import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes3.dex */
public final class zzhpx {
    public static byte[] zza(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        int i5 = 0;
        while (i5 < 16) {
            int i10 = i5 + 1;
            byte b5 = bArr[i5];
            byte b10 = (byte) ((b5 + b5) & 254);
            bArr2[i5] = b10;
            if (i5 < 15) {
                bArr2[i5] = (byte) (((bArr[i10] >> 7) & 1) | b10);
            }
            i5 = i10;
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & Sdk.SDKError.Reason.INVALID_CONFIG_RESPONSE_VALUE)) ^ bArr2[15]);
        return bArr2;
    }
}
