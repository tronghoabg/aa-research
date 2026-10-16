package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
final class zzigs {
    public static final /* synthetic */ int zza = 0;
    private static final zzihd zzb;

    static {
        int i5 = zzicy.zza;
        zzb = new zzihf();
    }

    public static int zzA(int i5, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzidu.zzF(i5 << 3) + 4) * size;
    }

    public static int zzB(List list) {
        return list.size() * 8;
    }

    public static int zzC(int i5, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzidu.zzF(i5 << 3) + 8) * size;
    }

    @Deprecated
    public static int zzD(int i5, zzifz zzifzVar, zzigr zzigrVar) {
        int iZzF = zzidu.zzF(i5 << 3);
        return ((zzicu) zzifzVar).zzaT(zzigrVar) + iZzF + iZzF;
    }

    public static zzihd zzE() {
        return zzb;
    }

    public static boolean zzF(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void zzG(zziea zzieaVar, Object obj, Object obj2) {
        if (((zziel) obj2).zza.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    public static void zzH(zzihd zzihdVar, Object obj, Object obj2) {
        zziep zziepVar = (zziep) obj;
        zzihe zziheVarZzc = zziepVar.zzt;
        zzihe zziheVar = ((zziep) obj2).zzt;
        if (!zzihe.zza().equals(zziheVar)) {
            if (zzihe.zza().equals(zziheVarZzc)) {
                zziheVarZzc = zzihe.zzc(zziheVarZzc, zziheVar);
            } else {
                zziheVarZzc.zzm(zziheVar);
            }
        }
        zziepVar.zzt = zziheVarZzc;
    }

    public static Object zzI(Object obj, int i5, List list, zziev zzievVar, Object obj2, zzihd zzihdVar) {
        if (zzievVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!zzievVar.zza(iIntValue)) {
                    obj2 = zzJ(obj, i5, iIntValue, obj2, zzihdVar);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Integer num = (Integer) list.get(i11);
            int iIntValue2 = num.intValue();
            if (zzievVar.zza(iIntValue2)) {
                if (i11 != i10) {
                    list.set(i10, num);
                }
                i10++;
            } else {
                obj2 = zzJ(obj, i5, iIntValue2, obj2, zzihdVar);
            }
        }
        if (i10 != size) {
            list.subList(i10, size).clear();
        }
        return obj2;
    }

    public static Object zzJ(Object obj, int i5, int i10, Object obj2, zzihd zzihdVar) {
        if (obj2 == null) {
            obj2 = zzihdVar.zzh(obj);
        }
        zzihdVar.zza(obj2, i5, i10);
        return obj2;
    }

    public static void zza(int i5, List list, zzihs zzihsVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihsVar.zzC(i5, list, z2);
    }

    public static void zzb(int i5, List list, zzihs zzihsVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihsVar.zzB(i5, list, z2);
    }

    public static void zzc(int i5, List list, zzihs zzihsVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihsVar.zzy(i5, list, z2);
    }

    public static void zzd(int i5, List list, zzihs zzihsVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihsVar.zzz(i5, list, z2);
    }

    public static void zze(int i5, List list, zzihs zzihsVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihsVar.zzL(i5, list, z2);
    }

    public static void zzf(int i5, List list, zzihs zzihsVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihsVar.zzA(i5, list, z2);
    }

    public static void zzg(int i5, List list, zzihs zzihsVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihsVar.zzJ(i5, list, z2);
    }

    public static void zzh(int i5, List list, zzihs zzihsVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihsVar.zzw(i5, list, z2);
    }

    public static void zzi(int i5, List list, zzihs zzihsVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihsVar.zzH(i5, list, z2);
    }

    public static void zzj(int i5, List list, zzihs zzihsVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihsVar.zzK(i5, list, z2);
    }

    public static void zzk(int i5, List list, zzihs zzihsVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihsVar.zzx(i5, list, z2);
    }

    public static void zzl(int i5, List list, zzihs zzihsVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihsVar.zzI(i5, list, z2);
    }

    public static void zzm(int i5, List list, zzihs zzihsVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihsVar.zzD(i5, list, z2);
    }

    public static void zzn(int i5, List list, zzihs zzihsVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihsVar.zzE(i5, list, z2);
    }

    public static void zzo(int i5, List list, zzihs zzihsVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihsVar.zzF(i5, list);
    }

    public static void zzp(int i5, List list, zzihs zzihsVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzihsVar.zzG(i5, list);
    }

    public static void zzq(int i5, List list, zzihs zzihsVar, zzigr zzigrVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((zzidv) zzihsVar).zzr(i5, list.get(i10), zzigrVar);
        }
    }

    public static void zzr(int i5, List list, zzihs zzihsVar, zzigr zzigrVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((zzidv) zzihsVar).zzs(i5, list.get(i10), zzigrVar);
        }
    }

    public static int zzs(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzifn)) {
            int iZzG = 0;
            while (i5 < size) {
                iZzG += zzidu.zzG(((Long) list.get(i5)).longValue());
                i5++;
            }
            return iZzG;
        }
        zzifn zzifnVar = (zzifn) list;
        int iZzG2 = 0;
        while (i5 < size) {
            iZzG2 += zzidu.zzG(zzifnVar.zzc(i5));
            i5++;
        }
        return iZzG2;
    }

    public static int zzt(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzifn)) {
            int iZzG = 0;
            while (i5 < size) {
                iZzG += zzidu.zzG(((Long) list.get(i5)).longValue());
                i5++;
            }
            return iZzG;
        }
        zzifn zzifnVar = (zzifn) list;
        int iZzG2 = 0;
        while (i5 < size) {
            iZzG2 += zzidu.zzG(zzifnVar.zzc(i5));
            i5++;
        }
        return iZzG2;
    }

    public static int zzu(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzifn)) {
            int iZzG = 0;
            while (i5 < size) {
                long jLongValue = ((Long) list.get(i5)).longValue();
                iZzG += zzidu.zzG((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i5++;
            }
            return iZzG;
        }
        zzifn zzifnVar = (zzifn) list;
        int iZzG2 = 0;
        while (i5 < size) {
            long jZzc = zzifnVar.zzc(i5);
            iZzG2 += zzidu.zzG((jZzc >> 63) ^ (jZzc + jZzc));
            i5++;
        }
        return iZzG2;
    }

    public static int zzv(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzieq)) {
            int iZzG = 0;
            while (i5 < size) {
                iZzG += zzidu.zzG(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return iZzG;
        }
        zzieq zzieqVar = (zzieq) list;
        int iZzG2 = 0;
        while (i5 < size) {
            iZzG2 += zzidu.zzG(zzieqVar.zzf(i5));
            i5++;
        }
        return iZzG2;
    }

    public static int zzw(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzieq)) {
            int iZzG = 0;
            while (i5 < size) {
                iZzG += zzidu.zzG(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return iZzG;
        }
        zzieq zzieqVar = (zzieq) list;
        int iZzG2 = 0;
        while (i5 < size) {
            iZzG2 += zzidu.zzG(zzieqVar.zzf(i5));
            i5++;
        }
        return iZzG2;
    }

    public static int zzx(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzieq)) {
            int iZzF = 0;
            while (i5 < size) {
                iZzF += zzidu.zzF(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return iZzF;
        }
        zzieq zzieqVar = (zzieq) list;
        int iZzF2 = 0;
        while (i5 < size) {
            iZzF2 += zzidu.zzF(zzieqVar.zzf(i5));
            i5++;
        }
        return iZzF2;
    }

    public static int zzy(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzieq)) {
            int iZzF = 0;
            while (i5 < size) {
                int iIntValue = ((Integer) list.get(i5)).intValue();
                iZzF += zzidu.zzF((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i5++;
            }
            return iZzF;
        }
        zzieq zzieqVar = (zzieq) list;
        int iZzF2 = 0;
        while (i5 < size) {
            int iZzf = zzieqVar.zzf(i5);
            iZzF2 += zzidu.zzF((iZzf >> 31) ^ (iZzf + iZzf));
            i5++;
        }
        return iZzF2;
    }

    public static int zzz(List list) {
        return list.size() * 4;
    }
}
