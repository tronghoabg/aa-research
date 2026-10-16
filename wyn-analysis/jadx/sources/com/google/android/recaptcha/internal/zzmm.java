package com.google.android.recaptcha.internal;

import com.google.android.gms.internal.consent_sdk.a;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
final class zzmm {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zznb zzc;
    private static final zznb zzd;

    static {
        Class<?> cls;
        Class<?> cls2;
        zznb zznbVar = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zzb = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                zznbVar = (zznb) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused3) {
            }
        }
        zzc = zznbVar;
        zzd = new zznd();
    }

    public static void zzA(int i5, List list, zzno zznoVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzu(i5, list, z2);
    }

    public static void zzB(int i5, List list, zzno zznoVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzy(i5, list, z2);
    }

    public static void zzC(int i5, List list, zzno zznoVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzA(i5, list, z2);
    }

    public static void zzD(int i5, List list, zzno zznoVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzC(i5, list, z2);
    }

    public static void zzE(int i5, List list, zzno zznoVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzE(i5, list, z2);
    }

    public static void zzF(int i5, List list, zzno zznoVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzJ(i5, list, z2);
    }

    public static void zzG(int i5, List list, zzno zznoVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzL(i5, list, z2);
    }

    public static boolean zzH(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int zza(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzkt)) {
            int iZzy = 0;
            while (i5 < size) {
                iZzy += zzjg.zzy(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return iZzy;
        }
        zzkt zzktVar = (zzkt) list;
        int iZzy2 = 0;
        while (i5 < size) {
            iZzy2 += zzjg.zzy(zzktVar.zze(i5));
            i5++;
        }
        return iZzy2;
    }

    public static int zzb(int i5, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjg.zzx(i5 << 3) + 4) * size;
    }

    public static int zzc(List list) {
        return list.size() * 4;
    }

    public static int zzd(int i5, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjg.zzx(i5 << 3) + 8) * size;
    }

    public static int zze(List list) {
        return list.size() * 8;
    }

    public static int zzf(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzkt)) {
            int iZzy = 0;
            while (i5 < size) {
                iZzy += zzjg.zzy(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return iZzy;
        }
        zzkt zzktVar = (zzkt) list;
        int iZzy2 = 0;
        while (i5 < size) {
            iZzy2 += zzjg.zzy(zzktVar.zze(i5));
            i5++;
        }
        return iZzy2;
    }

    public static int zzg(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzlm)) {
            int iZzy = 0;
            while (i5 < size) {
                iZzy += zzjg.zzy(((Long) list.get(i5)).longValue());
                i5++;
            }
            return iZzy;
        }
        zzlm zzlmVar = (zzlm) list;
        int iZzy2 = 0;
        while (i5 < size) {
            iZzy2 += zzjg.zzy(zzlmVar.zze(i5));
            i5++;
        }
        return iZzy2;
    }

    public static int zzh(int i5, Object obj, zzmk zzmkVar) {
        int i10 = i5 << 3;
        if (!(obj instanceof zzli)) {
            return zzjg.zzv((zzlx) obj, zzmkVar) + zzjg.zzx(i10);
        }
        int iZzx = zzjg.zzx(i10);
        int iZza = ((zzli) obj).zza();
        return a.D(iZza, iZza, iZzx);
    }

    public static int zzi(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzkt)) {
            int iZzx = 0;
            while (i5 < size) {
                int iIntValue = ((Integer) list.get(i5)).intValue();
                iZzx += zzjg.zzx((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i5++;
            }
            return iZzx;
        }
        zzkt zzktVar = (zzkt) list;
        int iZzx2 = 0;
        while (i5 < size) {
            int iZze = zzktVar.zze(i5);
            iZzx2 += zzjg.zzx((iZze >> 31) ^ (iZze + iZze));
            i5++;
        }
        return iZzx2;
    }

    public static int zzj(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzlm)) {
            int iZzy = 0;
            while (i5 < size) {
                long jLongValue = ((Long) list.get(i5)).longValue();
                iZzy += zzjg.zzy((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i5++;
            }
            return iZzy;
        }
        zzlm zzlmVar = (zzlm) list;
        int iZzy2 = 0;
        while (i5 < size) {
            long jZze = zzlmVar.zze(i5);
            iZzy2 += zzjg.zzy((jZze >> 63) ^ (jZze + jZze));
            i5++;
        }
        return iZzy2;
    }

    public static int zzk(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzkt)) {
            int iZzx = 0;
            while (i5 < size) {
                iZzx += zzjg.zzx(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return iZzx;
        }
        zzkt zzktVar = (zzkt) list;
        int iZzx2 = 0;
        while (i5 < size) {
            iZzx2 += zzjg.zzx(zzktVar.zze(i5));
            i5++;
        }
        return iZzx2;
    }

    public static int zzl(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzlm)) {
            int iZzy = 0;
            while (i5 < size) {
                iZzy += zzjg.zzy(((Long) list.get(i5)).longValue());
                i5++;
            }
            return iZzy;
        }
        zzlm zzlmVar = (zzlm) list;
        int iZzy2 = 0;
        while (i5 < size) {
            iZzy2 += zzjg.zzy(zzlmVar.zze(i5));
            i5++;
        }
        return iZzy2;
    }

    public static zznb zzm() {
        return zzc;
    }

    public static zznb zzn() {
        return zzd;
    }

    public static Object zzo(Object obj, int i5, List list, zzkw zzkwVar, Object obj2, zznb zznbVar) {
        if (zzkwVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!zzkwVar.zza(iIntValue)) {
                    obj2 = zzp(obj, i5, iIntValue, obj2, zznbVar);
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
            if (zzkwVar.zza(iIntValue2)) {
                if (i11 != i10) {
                    list.set(i10, num);
                }
                i10++;
            } else {
                obj2 = zzp(obj, i5, iIntValue2, obj2, zznbVar);
            }
        }
        if (i10 != size) {
            list.subList(i10, size).clear();
        }
        return obj2;
    }

    public static Object zzp(Object obj, int i5, int i10, Object obj2, zznb zznbVar) {
        if (obj2 == null) {
            obj2 = zznbVar.zzc(obj);
        }
        zznbVar.zzl(obj2, i5, i10);
        return obj2;
    }

    public static void zzq(zzke zzkeVar, Object obj, Object obj2) {
        zzki zzkiVarZzb = zzkeVar.zzb(obj2);
        if (zzkiVarZzb.zza.isEmpty()) {
            return;
        }
        zzkeVar.zzc(obj).zzh(zzkiVarZzb);
    }

    public static void zzr(zznb zznbVar, Object obj, Object obj2) {
        zznbVar.zzo(obj, zznbVar.zze(zznbVar.zzd(obj), zznbVar.zzd(obj2)));
    }

    public static void zzs(Class cls) {
        Class cls2;
        if (!zzks.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzt(int i5, List list, zzno zznoVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzc(i5, list, z2);
    }

    public static void zzu(int i5, List list, zzno zznoVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzg(i5, list, z2);
    }

    public static void zzv(int i5, List list, zzno zznoVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzj(i5, list, z2);
    }

    public static void zzw(int i5, List list, zzno zznoVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzl(i5, list, z2);
    }

    public static void zzx(int i5, List list, zzno zznoVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzn(i5, list, z2);
    }

    public static void zzy(int i5, List list, zzno zznoVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzp(i5, list, z2);
    }

    public static void zzz(int i5, List list, zzno zznoVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzs(i5, list, z2);
    }
}
