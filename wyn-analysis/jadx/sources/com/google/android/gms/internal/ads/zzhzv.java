package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public final class zzhzv {
    private static final Charset zza = Charset.forName("UTF-8");

    public static byte[] zza(String str, int i5) {
        byte[] bytes = str.getBytes(zza);
        int length = bytes.length;
        zzhzu zzhzuVar = new zzhzu(2, new byte[(length * 3) / 4]);
        if (!zzhzuVar.zza(bytes, 0, length, true)) {
            throw new IllegalArgumentException("bad base-64");
        }
        int i10 = zzhzuVar.zzb;
        byte[] bArr = zzhzuVar.zza;
        if (i10 == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        return bArr2;
    }
}
