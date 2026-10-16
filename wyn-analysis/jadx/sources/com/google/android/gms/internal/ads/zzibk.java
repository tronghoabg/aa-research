package com.google.android.gms.internal.ads;

import Va.M6;
import java.util.Arrays;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
public final class zzibk {
    private final byte[] zza;

    private zzibk(byte[] bArr, int i5, int i10) {
        byte[] bArr2 = new byte[i10];
        this.zza = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i10);
    }

    public static zzibk zza(byte[] bArr) {
        if (bArr != null) {
            return zzb(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public static zzibk zzb(byte[] bArr, int i5, int i10) {
        if (bArr == null) {
            throw new NullPointerException("data must be non-null");
        }
        int length = bArr.length;
        if (i10 > length) {
            i10 = length;
        }
        return new zzibk(bArr, 0, i10);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzibk) {
            return Arrays.equals(((zzibk) obj).zza, this.zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (byte b5 : bArr) {
            sb2.append("0123456789abcdef".charAt((b5 & ForkServer.ERROR) >> 4));
            sb2.append("0123456789abcdef".charAt(b5 & 15));
        }
        String string = sb2.toString();
        return M6.t(new StringBuilder(string.length() + 7), "Bytes(", string, ")");
    }

    public final byte[] zzc() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final int zzd() {
        return this.zza.length;
    }
}
