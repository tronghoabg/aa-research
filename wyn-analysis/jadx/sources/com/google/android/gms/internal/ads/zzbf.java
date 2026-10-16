package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes3.dex */
public abstract class zzbf {
    public static final zzbf zza = new zzbc();

    static {
        String str = zzfm.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    public final boolean equals(Object obj) {
        int iZzj;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbf)) {
            return false;
        }
        zzbf zzbfVar = (zzbf) obj;
        if (zzbfVar.zza() == zza() && zzbfVar.zzc() == zzc()) {
            zzbe zzbeVar = new zzbe();
            zzbd zzbdVar = new zzbd();
            zzbe zzbeVar2 = new zzbe();
            zzbd zzbdVar2 = new zzbd();
            for (int i5 = 0; i5 < zza(); i5++) {
                if (!zzb(i5, zzbeVar, 0L).equals(zzbfVar.zzb(i5, zzbeVar2, 0L))) {
                    return false;
                }
            }
            for (int i10 = 0; i10 < zzc(); i10++) {
                if (!zzd(i10, zzbdVar, true).equals(zzbfVar.zzd(i10, zzbdVar2, true))) {
                    return false;
                }
            }
            int iZzk = zzk(true);
            if (iZzk == zzbfVar.zzk(true) && (iZzj = zzj(true)) == zzbfVar.zzj(true)) {
                while (iZzk != iZzj) {
                    int iZzh = zzh(iZzk, 0, true);
                    if (iZzh != zzbfVar.zzh(iZzk, 0, true)) {
                        return false;
                    }
                    iZzk = iZzh;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5;
        zzbe zzbeVar = new zzbe();
        zzbd zzbdVar = new zzbd();
        int iZza = zza() + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE;
        int i10 = 0;
        while (true) {
            i5 = iZza * 31;
            if (i10 >= zza()) {
                break;
            }
            iZza = i5 + zzb(i10, zzbeVar, 0L).hashCode();
            i10++;
        }
        int iZzc = zzc() + i5;
        for (int i11 = 0; i11 < zzc(); i11++) {
            iZzc = (iZzc * 31) + zzd(i11, zzbdVar, true).hashCode();
        }
        int iZzk = zzk(true);
        while (iZzk != -1) {
            iZzc = (iZzc * 31) + iZzk;
            iZzk = zzh(iZzk, 0, true);
        }
        return iZzc;
    }

    public abstract int zza();

    public abstract zzbe zzb(int i5, zzbe zzbeVar, long j8);

    public abstract int zzc();

    public abstract zzbd zzd(int i5, zzbd zzbdVar, boolean z2);

    public abstract int zze(Object obj);

    public abstract Object zzf(int i5);

    public final boolean zzg() {
        return zza() == 0;
    }

    public int zzh(int i5, int i10, boolean z2) {
        if (i10 == 0) {
            if (i5 == zzj(z2)) {
                return -1;
            }
            return i5 + 1;
        }
        if (i10 == 1) {
            return i5;
        }
        if (i10 == 2) {
            return i5 == zzj(z2) ? zzk(z2) : i5 + 1;
        }
        throw new IllegalStateException();
    }

    public int zzi(int i5, int i10, boolean z2) {
        if (i5 == zzk(false)) {
            return -1;
        }
        return i5 - 1;
    }

    public int zzj(boolean z2) {
        if (zzg()) {
            return -1;
        }
        return zza() - 1;
    }

    public int zzk(boolean z2) {
        return zzg() ? -1 : 0;
    }

    public final int zzl(int i5, zzbd zzbdVar, zzbe zzbeVar, int i10, boolean z2) {
        int i11 = zzd(i5, zzbdVar, false).zzc;
        if (zzb(i11, zzbeVar, 0L).zzo != i5) {
            return i5 + 1;
        }
        int iZzh = zzh(i11, i10, z2);
        if (iZzh == -1) {
            return -1;
        }
        return zzb(iZzh, zzbeVar, 0L).zzn;
    }

    public final Pair zzm(zzbe zzbeVar, zzbd zzbdVar, int i5, long j8) {
        Pair pairZzn = zzn(zzbeVar, zzbdVar, i5, j8, 0L);
        pairZzn.getClass();
        return pairZzn;
    }

    public final Pair zzn(zzbe zzbeVar, zzbd zzbdVar, int i5, long j8, long j10) {
        zzgtr.zzm(i5, zza(), "index");
        zzb(i5, zzbeVar, j10);
        if (j8 == -9223372036854775807L) {
            long j11 = zzbeVar.zzl;
            j8 = 0;
        }
        int i10 = zzbeVar.zzn;
        zzd(i10, zzbdVar, false);
        while (i10 < zzbeVar.zzo) {
            long j12 = zzbdVar.zze;
            if (j8 == 0) {
                break;
            }
            int i11 = i10 + 1;
            long j13 = zzd(i11, zzbdVar, false).zze;
            if (j8 < 0) {
                break;
            }
            i10 = i11;
        }
        zzd(i10, zzbdVar, true);
        long j14 = zzbdVar.zze;
        long j15 = zzbdVar.zzd;
        if (j15 != -9223372036854775807L) {
            j8 = Math.min(j8, j15 - 1);
        }
        long jMax = Math.max(0L, j8);
        Object obj = zzbdVar.zzb;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public zzbd zzo(Object obj, zzbd zzbdVar) {
        return zzd(zze(obj), zzbdVar, true);
    }
}
