package com.google.android.gms.internal.ads;

import java.util.PriorityQueue;

/* loaded from: classes3.dex */
public final class zzbgg {
    public static void zza(String[] strArr, int i5, int i10, PriorityQueue priorityQueue) {
        int length = strArr.length;
        if (length < 6) {
            zzb(i5, zze(strArr, 0, length), zzc(strArr, 0, length), length, priorityQueue);
            return;
        }
        long jZze = zze(strArr, 0, 6);
        zzb(i5, jZze, zzc(strArr, 0, 6), 6, priorityQueue);
        int i11 = 1;
        while (true) {
            int length2 = strArr.length;
            if (i11 >= length2 - 5) {
                return;
            }
            long jZza = zzbgd.zza(strArr[i11 - 1]);
            long jZza2 = zzbgd.zza(strArr[i11 + 5]);
            String strZzc = zzc(strArr, i11, 6);
            jZze = (((jZza2 + 2147483647L) % 1073807359) + (((((jZze + 1073807359) - ((((jZza + 2147483647L) % 1073807359) * zzd(16785407L, 5)) % 1073807359)) % 1073807359) * 16785407) % 1073807359)) % 1073807359;
            zzb(i5, jZze, strZzc, length2, priorityQueue);
            i11++;
        }
    }

    public static void zzb(int i5, long j8, String str, int i10, PriorityQueue priorityQueue) {
        zzbgf zzbgfVar = new zzbgf(j8, str, i10);
        if ((priorityQueue.size() != i5 || (((zzbgf) priorityQueue.peek()).zzc <= zzbgfVar.zzc && ((zzbgf) priorityQueue.peek()).zza <= zzbgfVar.zza)) && !priorityQueue.contains(zzbgfVar)) {
            priorityQueue.add(zzbgfVar);
            if (priorityQueue.size() > i5) {
                priorityQueue.poll();
            }
        }
    }

    public static String zzc(String[] strArr, int i5, int i10) {
        int i11 = i10 + i5;
        if (strArr.length < i11) {
            int i12 = G6.L.f4523b;
            H6.l.c("Unable to construct shingle");
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int i13 = i11 - 1;
            if (i5 >= i13) {
                sb2.append(strArr[i13]);
                return sb2.toString();
            }
            sb2.append(strArr[i5]);
            sb2.append(' ');
            i5++;
        }
    }

    public static long zzd(long j8, int i5) {
        if (i5 == 1) {
            return j8;
        }
        int i10 = i5 >> 1;
        long j10 = (j8 * j8) % 1073807359;
        return (i5 & 1) == 0 ? zzd(j10, i10) % 1073807359 : ((zzd(j10, i10) % 1073807359) * j8) % 1073807359;
    }

    private static long zze(String[] strArr, int i5, int i10) {
        long jZza = (zzbgd.zza(strArr[0]) + 2147483647L) % 1073807359;
        for (int i11 = 1; i11 < i10; i11++) {
            jZza = (((zzbgd.zza(strArr[i11]) + 2147483647L) % 1073807359) + ((jZza * 16785407) % 1073807359)) % 1073807359;
        }
        return jZza;
    }
}
