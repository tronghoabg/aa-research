package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzarq {
    public static int zza(byte[] bArr, int i5, int i10) {
        while (i5 < i10 && bArr[i5] != 71) {
            i5++;
        }
        return i5;
    }

    public static long zzb(zzeu zzeuVar, int i5, int i10) {
        zzeuVar.zzh(i5);
        if (zzeuVar.zzd() < 5) {
            return -9223372036854775807L;
        }
        int iZzB = zzeuVar.zzB();
        if ((8388608 & iZzB) != 0 || ((iZzB >> 8) & 8191) != i10 || (iZzB & 32) == 0 || zzeuVar.zzs() < 7 || zzeuVar.zzd() < 7 || (zzeuVar.zzs() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        zzeuVar.zzm(bArr, 0, 6);
        long j8 = bArr[0];
        long j10 = bArr[1];
        long j11 = bArr[2];
        long j12 = bArr[3] & 255;
        return ((j8 & 255) << 25) | ((j10 & 255) << 17) | ((j11 & 255) << 9) | (j12 + j12) | ((bArr[4] & 255) >> 7);
    }
}
