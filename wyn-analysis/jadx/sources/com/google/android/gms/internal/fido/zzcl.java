package com.google.android.gms.internal.fido;

/* loaded from: classes.dex */
public final class zzcl {
    public static byte[] zza(byte[]... bArr) {
        int i5 = 0;
        int length = 0;
        while (true) {
            if (i5 >= bArr.length) {
                break;
            }
            length += bArr[i5].length;
            i5++;
        }
        byte[] bArr2 = new byte[length];
        int i10 = 0;
        for (byte[] bArr3 : bArr) {
            int length2 = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i10, length2);
            i10 += length2;
        }
        return bArr2;
    }
}
