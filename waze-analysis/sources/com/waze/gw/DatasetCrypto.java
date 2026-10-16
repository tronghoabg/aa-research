package com.waze.gw;

import android.content.Context;

/* loaded from: classes10.dex */
final class DatasetCrypto {
    private static final boolean LOADED;

    private static native byte[] d(Context context, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, String str);

    static {
        boolean z;
        try {
            System.loadLibrary("wzaux");
            z = true;
        } catch (Throwable th) {
            z = false;
        }
        LOADED = z;
    }

    private DatasetCrypto() {
    }

    static byte[] decrypt(Context context, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, String str) throws Exception {
        if (!LOADED) {
            throw new SecurityException("dataset crypto unavailable");
        }
        if (context == null || bArr == null || bArr2 == null || bArr3 == null || bArr4 == null || str == null) {
            throw new SecurityException("invalid encrypted dataset");
        }
        byte[] bArrD = d(context, bArr, bArr2, bArr3, bArr4, str);
        if (bArrD == null || bArrD.length == 0) {
            throw new SecurityException("dataset decryption rejected");
        }
        return bArrD;
    }
}
