package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class zzifc {
    public static final byte[] zza;
    public static final ByteBuffer zzb;

    static {
        byte[] bArr = new byte[0];
        zza = bArr;
        zzb = ByteBuffer.wrap(bArr);
        zzidp.zzI(bArr, 0, 0, false);
    }

    public static int zza() {
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int zzb(boolean z2) {
        return z2 ? 1231 : 1237;
    }

    public static int zzc(int i5, byte[] bArr, int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            i5 = (i5 * 31) + bArr[i12];
        }
        return i5;
    }
}
