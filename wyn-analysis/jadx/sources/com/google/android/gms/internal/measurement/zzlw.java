package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
final class zzlw {
    private static final zzmk<?, ?> zza = new zzmm();

    public static int zza(int i5, List<?> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzjc.zzb(i5, true) * size;
    }

    public static int zzb(int i5, List<Integer> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjc.zzi(i5) * size) + zzb(list);
    }

    public static int zzc(int i5, List<?> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzjc.zzf(i5, 0) * size;
    }

    public static int zzd(int i5, List<?> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzjc.zzc(i5, 0L) * size;
    }

    public static int zze(int i5, List<Integer> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjc.zzi(i5) * size) + zze(list);
    }

    public static int zzf(int i5, List<Long> list, boolean z2) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzjc.zzi(i5) * list.size()) + zzf(list);
    }

    public static int zzg(int i5, List<Integer> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjc.zzi(i5) * size) + zzg(list);
    }

    public static int zzh(int i5, List<Long> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjc.zzi(i5) * size) + zzh(list);
    }

    public static int zzi(int i5, List<Integer> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjc.zzi(i5) * size) + zzi(list);
    }

    public static int zzj(int i5, List<Long> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjc.zzi(i5) * size) + zzj(list);
    }

    public static void zzk(int i5, List<Integer> list, zznb zznbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzk(i5, list, z2);
    }

    public static void zzl(int i5, List<Long> list, zznb zznbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzl(i5, list, z2);
    }

    public static void zzm(int i5, List<Integer> list, zznb zznbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzm(i5, list, z2);
    }

    public static void zzn(int i5, List<Long> list, zznb zznbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzn(i5, list, z2);
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

    public static int zza(int i5, List<zzik> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzi = zzjc.zzi(i5) * size;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iZzi += zzjc.zzb(list.get(i10));
        }
        return iZzi;
    }

    public static int zzb(List<Integer> list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzjw)) {
            int iZzd = 0;
            while (i5 < size) {
                iZzd += zzjc.zzd(list.get(i5).intValue());
                i5++;
            }
            return iZzd;
        }
        zzjw zzjwVar = (zzjw) list;
        int iZzd2 = 0;
        while (i5 < size) {
            iZzd2 += zzjc.zzd(zzjwVar.zzb(i5));
            i5++;
        }
        return iZzd2;
    }

    public static void zzc(int i5, List<Integer> list, zznb zznbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzc(i5, list, z2);
    }

    public static void zzd(int i5, List<Integer> list, zznb zznbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzd(i5, list, z2);
    }

    public static int zze(List<Integer> list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzjw)) {
            int iZzf = 0;
            while (i5 < size) {
                iZzf += zzjc.zzf(list.get(i5).intValue());
                i5++;
            }
            return iZzf;
        }
        zzjw zzjwVar = (zzjw) list;
        int iZzf2 = 0;
        while (i5 < size) {
            iZzf2 += zzjc.zzf(zzjwVar.zzb(i5));
            i5++;
        }
        return iZzf2;
    }

    public static int zzf(List<Long> list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzkn)) {
            int iZzd = 0;
            while (i5 < size) {
                iZzd += zzjc.zzd(list.get(i5).longValue());
                i5++;
            }
            return iZzd;
        }
        zzkn zzknVar = (zzkn) list;
        int iZzd2 = 0;
        while (i5 < size) {
            iZzd2 += zzjc.zzd(zzknVar.zzb(i5));
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
        if (!(list instanceof zzjw)) {
            int iZzh = 0;
            while (i5 < size) {
                iZzh += zzjc.zzh(list.get(i5).intValue());
                i5++;
            }
            return iZzh;
        }
        zzjw zzjwVar = (zzjw) list;
        int iZzh2 = 0;
        while (i5 < size) {
            iZzh2 += zzjc.zzh(zzjwVar.zzb(i5));
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
        if (!(list instanceof zzkn)) {
            int iZzf = 0;
            while (i5 < size) {
                iZzf += zzjc.zzf(list.get(i5).longValue());
                i5++;
            }
            return iZzf;
        }
        zzkn zzknVar = (zzkn) list;
        int iZzf2 = 0;
        while (i5 < size) {
            iZzf2 += zzjc.zzf(zzknVar.zzb(i5));
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
        if (!(list instanceof zzjw)) {
            int iZzj = 0;
            while (i5 < size) {
                iZzj += zzjc.zzj(list.get(i5).intValue());
                i5++;
            }
            return iZzj;
        }
        zzjw zzjwVar = (zzjw) list;
        int iZzj2 = 0;
        while (i5 < size) {
            iZzj2 += zzjc.zzj(zzjwVar.zzb(i5));
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
        if (!(list instanceof zzkn)) {
            int iZzg = 0;
            while (i5 < size) {
                iZzg += zzjc.zzg(list.get(i5).longValue());
                i5++;
            }
            return iZzg;
        }
        zzkn zzknVar = (zzkn) list;
        int iZzg2 = 0;
        while (i5 < size) {
            iZzg2 += zzjc.zzg(zzknVar.zzb(i5));
            i5++;
        }
        return iZzg2;
    }

    public static int zza(int i5, List<zzlc> list, zzlu<?> zzluVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzb = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iZzb += zzjc.zzb(i5, list.get(i10), zzluVar);
        }
        return iZzb;
    }

    public static int zzb(int i5, List<?> list, zzlu<?> zzluVar) {
        int iZza;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzi = zzjc.zzi(i5) * size;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            if (obj instanceof zzkk) {
                iZza = zzjc.zza((zzkk) obj);
            } else {
                iZza = zzjc.zza((zzlc) obj, zzluVar);
            }
            iZzi = iZza + iZzi;
        }
        return iZzi;
    }

    public static void zze(int i5, List<Long> list, zznb zznbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zze(i5, list, z2);
    }

    public static void zzf(int i5, List<Float> list, zznb zznbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzf(i5, list, z2);
    }

    public static void zzg(int i5, List<Integer> list, zznb zznbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzg(i5, list, z2);
    }

    public static void zzh(int i5, List<Long> list, zznb zznbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzh(i5, list, z2);
    }

    public static void zzi(int i5, List<Integer> list, zznb zznbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzi(i5, list, z2);
    }

    public static void zzj(int i5, List<Long> list, zznb zznbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzj(i5, list, z2);
    }

    public static int zza(int i5, Object obj, zzlu<?> zzluVar) {
        if (obj instanceof zzkk) {
            return zzjc.zzb(i5, (zzkk) obj);
        }
        return zzjc.zzc(i5, (zzlc) obj, zzluVar);
    }

    public static zzmk<?, ?> zza() {
        return zza;
    }

    public static <UT, UB> UB zza(Object obj, int i5, List<Integer> list, zzjx zzjxVar, UB ub, zzmk<UT, UB> zzmkVar) {
        if (zzjxVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                Integer num = list.get(i11);
                int iIntValue = num.intValue();
                if (zzjxVar.zza(iIntValue)) {
                    if (i11 != i10) {
                        list.set(i10, num);
                    }
                    i10++;
                } else {
                    ub = (UB) zza(obj, i5, iIntValue, ub, zzmkVar);
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
            if (!zzjxVar.zza(iIntValue2)) {
                ub = (UB) zza(obj, i5, iIntValue2, ub, zzmkVar);
                it.remove();
            }
        }
        return ub;
    }

    public static int zzb(int i5, List<?> list) {
        int iZzb;
        int iZzb2;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        int iZzi = zzjc.zzi(i5) * size;
        if (!(list instanceof zzkj)) {
            while (i10 < size) {
                Object obj = list.get(i10);
                if (obj instanceof zzik) {
                    iZzb = zzjc.zzb((zzik) obj);
                } else {
                    iZzb = zzjc.zzb((String) obj);
                }
                iZzi = iZzb + iZzi;
                i10++;
            }
            return iZzi;
        }
        zzkj zzkjVar = (zzkj) list;
        while (i10 < size) {
            Object objZza = zzkjVar.zza(i10);
            if (objZza instanceof zzik) {
                iZzb2 = zzjc.zzb((zzik) objZza);
            } else {
                iZzb2 = zzjc.zzb((String) objZza);
            }
            iZzi = iZzb2 + iZzi;
            i10++;
        }
        return iZzi;
    }

    public static <UT, UB> UB zza(Object obj, int i5, int i10, UB ub, zzmk<UT, UB> zzmkVar) {
        if (ub == null) {
            ub = zzmkVar.zzc(obj);
        }
        zzmkVar.zzb(ub, i5, i10);
        return ub;
    }

    public static void zzb(int i5, List<Double> list, zznb zznbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzb(i5, list, z2);
    }

    public static <T, FT extends zzjo<FT>> void zza(zzji<FT> zzjiVar, T t10, T t11) {
        zzjm<T> zzjmVarZza = zzjiVar.zza(t11);
        if (zzjmVarZza.zza.isEmpty()) {
            return;
        }
        zzjiVar.zzb(t10).zza((zzjm) zzjmVarZza);
    }

    public static void zzb(int i5, List<?> list, zznb zznbVar, zzlu<?> zzluVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzb(i5, list, (zzlu) zzluVar);
    }

    public static void zzb(int i5, List<String> list, zznb zznbVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzb(i5, list);
    }

    public static <T> void zza(zzkv zzkvVar, T t10, T t11, long j8) {
        zzml.zza(t10, j8, zzkvVar.zza(zzml.zze(t10, j8), zzml.zze(t11, j8)));
    }

    public static <T, UT, UB> void zza(zzmk<UT, UB> zzmkVar, T t10, T t11) {
        zzmkVar.zzc(t10, zzmkVar.zza(zzmkVar.zzd(t10), zzmkVar.zzd(t11)));
    }

    public static void zza(Class<?> cls) {
        zzjt.class.isAssignableFrom(cls);
    }

    public static void zza(int i5, List<Boolean> list, zznb zznbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zza(i5, list, z2);
    }

    public static void zza(int i5, List<zzik> list, zznb zznbVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zza(i5, list);
    }

    public static void zza(int i5, List<?> list, zznb zznbVar, zzlu<?> zzluVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zza(i5, list, (zzlu) zzluVar);
    }

    public static boolean zza(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
