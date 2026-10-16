package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzala {
    public final zzagx zza;
    public final long zzb;
    public final long zzc;
    public final zzakw zzd;
    public final int zze;
    public final int zzf;
    public final long[] zzg;

    private zzala(zzagx zzagxVar, long j8, long j10, long[] jArr, zzakw zzakwVar, int i5, int i10) {
        this.zza = new zzagx(zzagxVar);
        this.zzb = j8;
        this.zzc = j10;
        this.zzg = jArr;
        this.zzd = zzakwVar;
        this.zze = i5;
        this.zzf = i10;
    }

    public static zzala zza(zzagx zzagxVar, zzeu zzeuVar) {
        long[] jArr;
        int i5;
        int i10;
        int iZzB = zzeuVar.zzB();
        int iZzH = (iZzB & 1) != 0 ? zzeuVar.zzH() : -1;
        long jZzz = (iZzB & 2) != 0 ? zzeuVar.zzz() : -1L;
        zzakw zzakwVarZzb = null;
        if ((iZzB & 4) == 4) {
            long[] jArr2 = new long[100];
            for (int i11 = 0; i11 < 100; i11++) {
                jArr2[i11] = zzeuVar.zzs();
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        if ((iZzB & 8) != 0) {
            zzeuVar.zzk(4);
        }
        if (zzeuVar.zzd() >= 24) {
            zzeuVar.zzk(11);
            zzakwVarZzb = zzakw.zzb(Float.intBitsToFloat(zzeuVar.zzB()), zzeuVar.zzt(), zzeuVar.zzt());
            zzeuVar.zzk(2);
            int iZzx = zzeuVar.zzx();
            i10 = iZzx & 4095;
            i5 = iZzx >> 12;
        } else {
            i5 = -1;
            i10 = -1;
        }
        return new zzala(zzagxVar, iZzH, jZzz, jArr, zzakwVarZzb, i5, i10);
    }

    public final long zzb() {
        long j8 = this.zzb;
        if (j8 == -1 || j8 == 0) {
            return -9223372036854775807L;
        }
        return zzfm.zzu((j8 * r4.zzg) - 1, this.zza.zzd);
    }
}
