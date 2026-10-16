package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class zzalx {
    private static final zzamo<?, ?> zza = new zzamq();

    public static int zza(int i5, List<?> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzajg.zza(i5, true) * size;
    }

    public static int zzb(int i5, List<Integer> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzajg.zzi(i5) * size) + zzb(list);
    }

    public static int zzc(int i5, List<?> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzajg.zzc(i5, 0) * size;
    }

    public static int zzd(int i5, List<?> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzajg.zza(i5, 0L) * size;
    }

    public static int zze(int i5, List<Integer> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzajg.zzi(i5) * size) + zze(list);
    }

    public static int zzf(int i5, List<Long> list, boolean z2) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzajg.zzi(i5) * list.size()) + zzf(list);
    }

    public static int zzg(int i5, List<Integer> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzajg.zzi(i5) * size) + zzg(list);
    }

    public static int zzh(int i5, List<Long> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzajg.zzi(i5) * size) + zzh(list);
    }

    public static int zzi(int i5, List<Integer> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzajg.zzi(i5) * size) + zzi(list);
    }

    public static int zzj(int i5, List<Long> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzajg.zzi(i5) * size) + zzj(list);
    }

    public static void zzk(int i5, List<Integer> list, zzanf zzanfVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanfVar.zzk(i5, list, z2);
    }

    public static void zzl(int i5, List<Long> list, zzanf zzanfVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanfVar.zzl(i5, list, z2);
    }

    public static void zzm(int i5, List<Integer> list, zzanf zzanfVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanfVar.zzm(i5, list, z2);
    }

    public static void zzn(int i5, List<Long> list, zzanf zzanfVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanfVar.zzn(i5, list, z2);
    }

    public static int zza(List<?> list) {
        return list.size();
    }

    public static int zzc(List<?> list) {
        return list.size() << 2;
    }

    public static int zzd(List<?> list) {
        return list.size() << 3;
    }

    public static int zza(int i5, List<zzaip> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzi = zzajg.zzi(i5) * size;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iZzi += zzajg.zza(list.get(i10));
        }
        return iZzi;
    }

    public static int zzb(List<Integer> list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzajz)) {
            int iZzc = 0;
            while (i5 < size) {
                iZzc += zzajg.zzc(list.get(i5).intValue());
                i5++;
            }
            return iZzc;
        }
        zzajz zzajzVar = (zzajz) list;
        int iZzc2 = 0;
        while (i5 < size) {
            iZzc2 += zzajg.zzc(zzajzVar.zzb(i5));
            i5++;
        }
        return iZzc2;
    }

    public static void zzc(int i5, List<Integer> list, zzanf zzanfVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanfVar.zzc(i5, list, z2);
    }

    public static void zzd(int i5, List<Integer> list, zzanf zzanfVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanfVar.zzd(i5, list, z2);
    }

    public static int zze(List<Integer> list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzajz)) {
            int iZze = 0;
            while (i5 < size) {
                iZze += zzajg.zze(list.get(i5).intValue());
                i5++;
            }
            return iZze;
        }
        zzajz zzajzVar = (zzajz) list;
        int iZze2 = 0;
        while (i5 < size) {
            iZze2 += zzajg.zze(zzajzVar.zzb(i5));
            i5++;
        }
        return iZze2;
    }

    public static int zzf(List<Long> list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzakr)) {
            int iZzd = 0;
            while (i5 < size) {
                iZzd += zzajg.zzd(list.get(i5).longValue());
                i5++;
            }
            return iZzd;
        }
        zzakr zzakrVar = (zzakr) list;
        int iZzd2 = 0;
        while (i5 < size) {
            iZzd2 += zzajg.zzd(zzakrVar.zzb(i5));
            i5++;
        }
        return iZzd2;
    }

    public static int zzg(List<Integer> list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzajz)) {
            int iZzh = 0;
            while (i5 < size) {
                iZzh += zzajg.zzh(list.get(i5).intValue());
                i5++;
            }
            return iZzh;
        }
        zzajz zzajzVar = (zzajz) list;
        int iZzh2 = 0;
        while (i5 < size) {
            iZzh2 += zzajg.zzh(zzajzVar.zzb(i5));
            i5++;
        }
        return iZzh2;
    }

    public static int zzh(List<Long> list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzakr)) {
            int iZzf = 0;
            while (i5 < size) {
                iZzf += zzajg.zzf(list.get(i5).longValue());
                i5++;
            }
            return iZzf;
        }
        zzakr zzakrVar = (zzakr) list;
        int iZzf2 = 0;
        while (i5 < size) {
            iZzf2 += zzajg.zzf(zzakrVar.zzb(i5));
            i5++;
        }
        return iZzf2;
    }

    public static int zzi(List<Integer> list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzajz)) {
            int iZzj = 0;
            while (i5 < size) {
                iZzj += zzajg.zzj(list.get(i5).intValue());
                i5++;
            }
            return iZzj;
        }
        zzajz zzajzVar = (zzajz) list;
        int iZzj2 = 0;
        while (i5 < size) {
            iZzj2 += zzajg.zzj(zzajzVar.zzb(i5));
            i5++;
        }
        return iZzj2;
    }

    public static int zzj(List<Long> list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzakr)) {
            int iZzg = 0;
            while (i5 < size) {
                iZzg += zzajg.zzg(list.get(i5).longValue());
                i5++;
            }
            return iZzg;
        }
        zzakr zzakrVar = (zzakr) list;
        int iZzg2 = 0;
        while (i5 < size) {
            iZzg2 += zzajg.zzg(zzakrVar.zzb(i5));
            i5++;
        }
        return iZzg2;
    }

    public static int zza(int i5, List<zzalc> list, zzalv<?> zzalvVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZza = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iZza += zzajg.zza(i5, list.get(i10), zzalvVar);
        }
        return iZza;
    }

    public static int zzb(int i5, List<?> list, zzalv<?> zzalvVar) {
        int iZza;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzi = zzajg.zzi(i5) * size;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            if (obj instanceof zzakk) {
                iZza = zzajg.zza((zzakk) obj);
            } else {
                iZza = zzajg.zza((zzalc) obj, zzalvVar);
            }
            iZzi = iZza + iZzi;
        }
        return iZzi;
    }

    public static void zze(int i5, List<Long> list, zzanf zzanfVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanfVar.zze(i5, list, z2);
    }

    public static void zzf(int i5, List<Float> list, zzanf zzanfVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanfVar.zzf(i5, list, z2);
    }

    public static void zzg(int i5, List<Integer> list, zzanf zzanfVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanfVar.zzg(i5, list, z2);
    }

    public static void zzh(int i5, List<Long> list, zzanf zzanfVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanfVar.zzh(i5, list, z2);
    }

    public static void zzi(int i5, List<Integer> list, zzanf zzanfVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanfVar.zzi(i5, list, z2);
    }

    public static void zzj(int i5, List<Long> list, zzanf zzanfVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanfVar.zzj(i5, list, z2);
    }

    public static int zza(int i5, Object obj, zzalv<?> zzalvVar) {
        if (obj instanceof zzakk) {
            return zzajg.zzb(i5, (zzakk) obj);
        }
        return zzajg.zzb(i5, (zzalc) obj, zzalvVar);
    }

    public static zzamo<?, ?> zza() {
        return zza;
    }

    public static <UT, UB> UB zza(Object obj, int i5, List<Integer> list, zzakd zzakdVar, UB ub, zzamo<UT, UB> zzamoVar) {
        if (zzakdVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                Integer num = list.get(i11);
                int iIntValue = num.intValue();
                if (zzakdVar.zza(iIntValue)) {
                    if (i11 != i10) {
                        list.set(i10, num);
                    }
                    i10++;
                } else {
                    ub = (UB) zza(obj, i5, iIntValue, ub, zzamoVar);
                }
            }
            if (i10 != size) {
                list.subList(i10, size).clear();
            }
            return ub;
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int iIntValue2 = it.next().intValue();
            if (!zzakdVar.zza(iIntValue2)) {
                ub = (UB) zza(obj, i5, iIntValue2, ub, zzamoVar);
                it.remove();
            }
        }
        return ub;
    }

    public static int zzb(int i5, List<?> list) {
        int iZza;
        int iZza2;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        int iZzi = zzajg.zzi(i5) * size;
        if (!(list instanceof zzakn)) {
            while (i10 < size) {
                Object obj = list.get(i10);
                if (obj instanceof zzaip) {
                    iZza = zzajg.zza((zzaip) obj);
                } else {
                    iZza = zzajg.zza((String) obj);
                }
                iZzi = iZza + iZzi;
                i10++;
            }
            return iZzi;
        }
        zzakn zzaknVar = (zzakn) list;
        while (i10 < size) {
            Object objZza = zzaknVar.zza(i10);
            if (objZza instanceof zzaip) {
                iZza2 = zzajg.zza((zzaip) objZza);
            } else {
                iZza2 = zzajg.zza((String) objZza);
            }
            iZzi = iZza2 + iZzi;
            i10++;
        }
        return iZzi;
    }

    public static <UT, UB> UB zza(Object obj, int i5, int i10, UB ub, zzamo<UT, UB> zzamoVar) {
        if (ub == null) {
            ub = zzamoVar.zzc(obj);
        }
        zzamoVar.zzb(ub, i5, i10);
        return ub;
    }

    public static void zzb(int i5, List<Double> list, zzanf zzanfVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanfVar.zzb(i5, list, z2);
    }

    public static <T, FT extends zzajt<FT>> void zza(zzajm<FT> zzajmVar, T t10, T t11) {
        zzajr<T> zzajrVarZza = zzajmVar.zza(t11);
        if (zzajrVarZza.zza.isEmpty()) {
            return;
        }
        zzajmVar.zzb(t10).zza((zzajr) zzajrVarZza);
    }

    public static void zzb(int i5, List<?> list, zzanf zzanfVar, zzalv<?> zzalvVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanfVar.zzb(i5, list, (zzalv) zzalvVar);
    }

    public static void zzb(int i5, List<String> list, zzanf zzanfVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanfVar.zzb(i5, list);
    }

    public static <T> void zza(zzakz zzakzVar, T t10, T t11, long j8) {
        zzamp.zza(t10, j8, zzakzVar.zza(zzamp.zze(t10, j8), zzamp.zze(t11, j8)));
    }

    public static <T, UT, UB> void zza(zzamo<UT, UB> zzamoVar, T t10, T t11) {
        zzamoVar.zzc(t10, zzamoVar.zza(zzamoVar.zzd(t10), zzamoVar.zzd(t11)));
    }

    public static void zza(Class<?> cls) {
        zzajy.class.isAssignableFrom(cls);
    }

    public static void zza(int i5, List<Boolean> list, zzanf zzanfVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanfVar.zza(i5, list, z2);
    }

    public static void zza(int i5, List<zzaip> list, zzanf zzanfVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanfVar.zza(i5, list);
    }

    public static void zza(int i5, List<?> list, zzanf zzanfVar, zzalv<?> zzalvVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanfVar.zza(i5, list, (zzalv) zzalvVar);
    }

    public static boolean zza(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
