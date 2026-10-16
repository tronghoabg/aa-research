package com.google.android.gms.internal.ads;

import Va.M6;

/* loaded from: classes3.dex */
public final class zzagy {
    private static final String[] zza = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    private static final int[] zzb = {44100, 48000, 32000};
    private static final int[] zzc = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    private static final int[] zzd = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    private static final int[] zze = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    private static final int[] zzf = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    private static final int[] zzg = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static int zza(int i5) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (!zzl(i5) || (i10 = (i5 >>> 19) & 3) == 1 || (i11 = (i5 >>> 17) & 3) == 0 || (i12 = (i5 >>> 12) & 15) == 0 || i12 == 15 || (i13 = (i5 >>> 10) & 3) == 3) {
            return -1;
        }
        int i14 = i12 - 1;
        int i15 = zzb[i13];
        if (i10 == 2) {
            i15 /= 2;
        } else if (i10 == 0) {
            i15 /= 4;
        }
        int i16 = (i5 >>> 9) & 1;
        if (i11 == 3) {
            return ((((i10 == 3 ? zzc[i14] : zzd[i14]) * 12) / i15) + i16) * 4;
        }
        int i17 = i10 == 3 ? i11 == 2 ? zze[i14] : zzf[i14] : zzg[i14];
        if (i10 == 3) {
            return M6.C(i17, 144, i15, i16);
        }
        return M6.C(i11 == 1 ? 72 : 144, i17, i15, i16);
    }

    public static int zzb(int i5) {
        int i10;
        int i11;
        if (!zzl(i5) || (i10 = (i5 >>> 19) & 3) == 1 || (i11 = (i5 >>> 17) & 3) == 0) {
            return -1;
        }
        int i12 = i5 >>> 12;
        int i13 = (i5 >>> 10) & 3;
        int i14 = i12 & 15;
        if (i14 == 0 || i14 == 15 || i13 == 3) {
            return -1;
        }
        return zzm(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzl(int i5) {
        return (i5 & (-2097152)) == -2097152;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzm(int i5, int i10) {
        return i10 != 1 ? i10 != 2 ? 384 : 1152 : i5 == 3 ? 1152 : 576;
    }
}
