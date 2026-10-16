package com.google.android.gms.internal.ads;

import Va.M6;

/* loaded from: classes3.dex */
final class zzakz implements zzaky {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;
    private final int zze;

    private zzakz(long[] jArr, long[] jArr2, long j8, long j10, long j11, int i5) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j8;
        this.zzd = j11;
        this.zze = i5;
    }

    public static zzakz zze(long j8, long j10, zzagx zzagxVar, zzeu zzeuVar) {
        int iZzs;
        zzeu zzeuVar2 = zzeuVar;
        zzeuVar2.zzk(6);
        int iZzB = zzeuVar2.zzB();
        long j11 = zzagxVar.zzc;
        long j12 = iZzB;
        if (zzeuVar2.zzB() <= 0) {
            return null;
        }
        long jZzu = zzfm.zzu((r4 * zzagxVar.zzg) - 1, zzagxVar.zzd);
        int iZzt = zzeuVar2.zzt();
        int iZzt2 = zzeuVar2.zzt();
        int iZzt3 = zzeuVar2.zzt();
        zzeuVar2.zzk(2);
        long[] jArr = new long[iZzt];
        long[] jArr2 = new long[iZzt];
        int i5 = 0;
        long j13 = j10 + zzagxVar.zzc;
        while (i5 < iZzt) {
            long j14 = j11;
            jArr[i5] = (i5 * jZzu) / iZzt;
            jArr2[i5] = j13;
            if (iZzt3 == 1) {
                iZzs = zzeuVar2.zzs();
            } else if (iZzt3 == 2) {
                iZzs = zzeuVar2.zzt();
            } else if (iZzt3 == 3) {
                iZzs = zzeuVar2.zzx();
            } else {
                if (iZzt3 != 4) {
                    return null;
                }
                iZzs = zzeuVar2.zzH();
            }
            j13 += iZzs * iZzt2;
            i5++;
            zzeuVar2 = zzeuVar;
            iZzt = iZzt;
            j11 = j14;
        }
        long j15 = j10 + j11;
        long jMax = j15 + j12;
        if (j8 != -1 && j8 != jMax) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(j8).length() + 27 + String.valueOf(jMax).length());
            M6.A(sb2, "VBRI data size mismatch: ", j8, ", ");
            sb2.append(jMax);
            zzeh.zzc("VbriSeeker", sb2.toString());
        }
        if (jMax != j13) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(j13).length() + String.valueOf(jMax).length() + 43 + 28);
            M6.A(sb3, "VBRI bytes and ToC mismatch (using max): ", jMax, ", ");
            sb3.append(j13);
            sb3.append("\nSeeking will be inaccurate.");
            zzeh.zzc("VbriSeeker", sb3.toString());
            jMax = Math.max(jMax, j13);
        }
        return new zzakz(jArr, jArr2, jZzu, j15, jMax, zzagxVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final zzahb zzc(long j8) {
        long[] jArr = this.zza;
        int iZzo = zzfm.zzo(jArr, j8, true, true);
        long j10 = jArr[iZzo];
        long[] jArr2 = this.zzb;
        zzahe zzaheVar = new zzahe(j10, jArr2[iZzo]);
        if (zzaheVar.zzb >= j8 || iZzo == jArr.length - 1) {
            return new zzahb(zzaheVar, zzaheVar);
        }
        int i5 = iZzo + 1;
        return new zzahb(zzaheVar, new zzahe(jArr[i5], jArr2[i5]));
    }

    @Override // com.google.android.gms.internal.ads.zzaky
    public final long zzf(long j8) {
        return this.zza[zzfm.zzo(this.zzb, j8, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzaky
    public final long zzg() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzaky
    public final int zzh() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final /* synthetic */ boolean zzj() {
        return AbstractC1744h.a(this);
    }
}
