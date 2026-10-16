package com.google.android.gms.internal.consent_sdk;

import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
final class zzsc {
    public static final /* synthetic */ int zza = 0;
    private static final zzsp zzb;

    static {
        int i5 = zzpc.zza;
        zzb = new zzsr();
    }

    public static void zzA(int i5, List list, zztb zztbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzC(i5, list, z2);
    }

    public static void zzB(int i5, List list, zztb zztbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzE(i5, list, z2);
    }

    public static void zzC(int i5, List list, zztb zztbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzI(i5, list, z2);
    }

    public static void zzD(int i5, List list, zztb zztbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzK(i5, list, z2);
    }

    public static boolean zzE(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    @Deprecated
    public static int zza(int i5, zzrq zzrqVar, zzsa zzsaVar) {
        int iZzC = zzpv.zzC(i5 << 3);
        return ((zzpa) zzrqVar).zzj(zzsaVar) + iZzC + iZzC;
    }

    public static int zzb(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzqn)) {
            int iZzD = 0;
            while (i5 < size) {
                iZzD += zzpv.zzD(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return iZzD;
        }
        zzqn zzqnVar = (zzqn) list;
        int iZzD2 = 0;
        while (i5 < size) {
            iZzD2 += zzpv.zzD(zzqnVar.zze(i5));
            i5++;
        }
        return iZzD2;
    }

    public static int zzc(int i5, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzpv.zzC(i5 << 3) + 4) * size;
    }

    public static int zzd(List list) {
        return list.size() * 4;
    }

    public static int zze(int i5, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzpv.zzC(i5 << 3) + 8) * size;
    }

    public static int zzf(List list) {
        return list.size() * 8;
    }

    public static int zzg(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzqn)) {
            int iZzD = 0;
            while (i5 < size) {
                iZzD += zzpv.zzD(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return iZzD;
        }
        zzqn zzqnVar = (zzqn) list;
        int iZzD2 = 0;
        while (i5 < size) {
            iZzD2 += zzpv.zzD(zzqnVar.zze(i5));
            i5++;
        }
        return iZzD2;
    }

    public static int zzh(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzre)) {
            int iZzD = 0;
            while (i5 < size) {
                iZzD += zzpv.zzD(((Long) list.get(i5)).longValue());
                i5++;
            }
            return iZzD;
        }
        zzre zzreVar = (zzre) list;
        int iZzD2 = 0;
        while (i5 < size) {
            iZzD2 += zzpv.zzD(zzreVar.zze(i5));
            i5++;
        }
        return iZzD2;
    }

    public static int zzi(int i5, Object obj, zzsa zzsaVar) {
        int i10 = i5 << 3;
        if (obj instanceof zzra) {
            int iZzC = zzpv.zzC(i10);
            int iZza = ((zzra) obj).zza();
            return a.n(iZza, iZza, iZzC);
        }
        int iZzC2 = zzpv.zzC(i10);
        int iZzj = ((zzpa) obj).zzj(zzsaVar);
        return a.n(iZzj, iZzj, iZzC2);
    }

    public static int zzj(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzqn)) {
            int iZzC = 0;
            while (i5 < size) {
                int iIntValue = ((Integer) list.get(i5)).intValue();
                iZzC += zzpv.zzC((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i5++;
            }
            return iZzC;
        }
        zzqn zzqnVar = (zzqn) list;
        int iZzC2 = 0;
        while (i5 < size) {
            int iZze = zzqnVar.zze(i5);
            iZzC2 += zzpv.zzC((iZze >> 31) ^ (iZze + iZze));
            i5++;
        }
        return iZzC2;
    }

    public static int zzk(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzre)) {
            int iZzD = 0;
            while (i5 < size) {
                long jLongValue = ((Long) list.get(i5)).longValue();
                iZzD += zzpv.zzD((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i5++;
            }
            return iZzD;
        }
        zzre zzreVar = (zzre) list;
        int iZzD2 = 0;
        while (i5 < size) {
            long jZze = zzreVar.zze(i5);
            iZzD2 += zzpv.zzD((jZze >> 63) ^ (jZze + jZze));
            i5++;
        }
        return iZzD2;
    }

    public static int zzl(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzqn)) {
            int iZzC = 0;
            while (i5 < size) {
                iZzC += zzpv.zzC(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return iZzC;
        }
        zzqn zzqnVar = (zzqn) list;
        int iZzC2 = 0;
        while (i5 < size) {
            iZzC2 += zzpv.zzC(zzqnVar.zze(i5));
            i5++;
        }
        return iZzC2;
    }

    public static int zzm(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzre)) {
            int iZzD = 0;
            while (i5 < size) {
                iZzD += zzpv.zzD(((Long) list.get(i5)).longValue());
                i5++;
            }
            return iZzD;
        }
        zzre zzreVar = (zzre) list;
        int iZzD2 = 0;
        while (i5 < size) {
            iZzD2 += zzpv.zzD(zzreVar.zze(i5));
            i5++;
        }
        return iZzD2;
    }

    public static zzsp zzn() {
        return zzb;
    }

    public static void zzo(zzqb zzqbVar, Object obj, Object obj2) {
        if (((zzqk) obj2).zzb.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    public static void zzp(zzsp zzspVar, Object obj, Object obj2) {
        zzqm zzqmVar = (zzqm) obj;
        zzsq zzsqVarZze = zzqmVar.zzc;
        zzsq zzsqVar = ((zzqm) obj2).zzc;
        if (!zzsq.zzc().equals(zzsqVar)) {
            if (zzsq.zzc().equals(zzsqVarZze)) {
                zzsqVarZze = zzsq.zze(zzsqVarZze, zzsqVar);
            } else {
                zzsqVarZze.zzd(zzsqVar);
            }
        }
        zzqmVar.zzc = zzsqVarZze;
    }

    public static void zzq(int i5, List list, zztb zztbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzc(i5, list, z2);
    }

    public static void zzr(int i5, List list, zztb zztbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzg(i5, list, z2);
    }

    public static void zzs(int i5, List list, zztb zztbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzi(i5, list, z2);
    }

    public static void zzt(int i5, List list, zztb zztbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzk(i5, list, z2);
    }

    public static void zzu(int i5, List list, zztb zztbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzm(i5, list, z2);
    }

    public static void zzv(int i5, List list, zztb zztbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzo(i5, list, z2);
    }

    public static void zzw(int i5, List list, zztb zztbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzr(i5, list, z2);
    }

    public static void zzx(int i5, List list, zztb zztbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzt(i5, list, z2);
    }

    public static void zzy(int i5, List list, zztb zztbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzy(i5, list, z2);
    }

    public static void zzz(int i5, List list, zztb zztbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zztbVar.zzA(i5, list, z2);
    }
}
