package com.google.android.gms.internal.auth;

/* loaded from: classes3.dex */
final class zzhn {
    public static final /* synthetic */ int zza = 0;
    private static final zzhl zzb;

    static {
        if (zzhj.zzu() && zzhj.zzv()) {
            int i5 = zzds.zza;
        }
        zzb = new zzhm();
    }

    public static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i5, int i10) {
        int i11 = i10 - i5;
        byte b5 = bArr[i5 - 1];
        if (i11 == 0) {
            if (b5 > -12) {
                return -1;
            }
            return b5;
        }
        if (i11 == 1) {
            byte b10 = bArr[i5];
            if (b5 > -12 || b10 > -65) {
                return -1;
            }
            return (b10 << 8) ^ b5;
        }
        if (i11 != 2) {
            throw new AssertionError();
        }
        byte b11 = bArr[i5];
        byte b12 = bArr[i5 + 1];
        if (b5 > -12 || b11 > -65 || b12 > -65) {
            return -1;
        }
        return (b12 << 16) ^ ((b11 << 8) ^ b5);
    }

    public static boolean zzb(byte[] bArr) {
        return zzb.zzb(bArr, 0, bArr.length);
    }

    public static boolean zzc(byte[] bArr, int i5, int i10) {
        return zzb.zzb(bArr, i5, i10);
    }
}
