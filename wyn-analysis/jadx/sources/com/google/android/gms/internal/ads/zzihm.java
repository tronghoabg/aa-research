package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;

/* loaded from: classes3.dex */
abstract class zzihm {
    public static final int zzb(String str, byte[] bArr, int i5, int i10) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        if (length - i5 > i10) {
            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
        }
        System.arraycopy(bytes, 0, bArr, i5, length);
        return i5 + length;
    }

    public abstract boolean zza(byte[] bArr, int i5, int i10);
}
