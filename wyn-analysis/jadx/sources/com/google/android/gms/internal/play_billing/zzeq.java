package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.consent_sdk.a;
import java.io.IOException;
import java.util.List;

/* loaded from: classes4.dex */
final class zzeq {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zzff zzc;
    private static final zzff zzd;

    static {
        Class<?> cls;
        Class<?> cls2;
        zzff zzffVar = null;
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
                zzffVar = (zzff) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused3) {
            }
        }
        zzc = zzffVar;
        zzd = new zzfh();
    }

    public static void zzA(int i5, List list, zzfx zzfxVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxVar.zzy(i5, list, z2);
    }

    public static void zzB(int i5, List list, zzfx zzfxVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxVar.zzA(i5, list, z2);
    }

    public static void zzC(int i5, List list, zzfx zzfxVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxVar.zzC(i5, list, z2);
    }

    public static void zzD(int i5, List list, zzfx zzfxVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxVar.zzE(i5, list, z2);
    }

    public static void zzE(int i5, List list, zzfx zzfxVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxVar.zzJ(i5, list, z2);
    }

    public static void zzF(int i5, List list, zzfx zzfxVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxVar.zzL(i5, list, z2);
    }

    public static boolean zzG(Object obj, Object obj2) {
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
        if (!(list instanceof zzct)) {
            int iZzx = 0;
            while (i5 < size) {
                iZzx += zzby.zzx(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return iZzx;
        }
        zzct zzctVar = (zzct) list;
        int iZzx2 = 0;
        while (i5 < size) {
            iZzx2 += zzby.zzx(zzctVar.zze(i5));
            i5++;
        }
        return iZzx2;
    }

    public static int zzb(int i5, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzby.zzw(i5 << 3) + 4) * size;
    }

    public static int zzc(List list) {
        return list.size() * 4;
    }

    public static int zzd(int i5, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzby.zzw(i5 << 3) + 8) * size;
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
        if (!(list instanceof zzct)) {
            int iZzx = 0;
            while (i5 < size) {
                iZzx += zzby.zzx(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return iZzx;
        }
        zzct zzctVar = (zzct) list;
        int iZzx2 = 0;
        while (i5 < size) {
            iZzx2 += zzby.zzx(zzctVar.zze(i5));
            i5++;
        }
        return iZzx2;
    }

    public static int zzg(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzdr)) {
            int iZzx = 0;
            while (i5 < size) {
                iZzx += zzby.zzx(((Long) list.get(i5)).longValue());
                i5++;
            }
            return iZzx;
        }
        zzdr zzdrVar = (zzdr) list;
        int iZzx2 = 0;
        while (i5 < size) {
            iZzx2 += zzby.zzx(zzdrVar.zze(i5));
            i5++;
        }
        return iZzx2;
    }

    public static int zzh(int i5, Object obj, zzeo zzeoVar) {
        int i10 = i5 << 3;
        if (!(obj instanceof zzdi)) {
            return zzby.zzu((zzec) obj, zzeoVar) + zzby.zzw(i10);
        }
        int iZzw = zzby.zzw(i10);
        int iZza = ((zzdi) obj).zza();
        return a.C(iZza, iZza, iZzw);
    }

    public static int zzi(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzct)) {
            int iZzw = 0;
            while (i5 < size) {
                int iIntValue = ((Integer) list.get(i5)).intValue();
                iZzw += zzby.zzw((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i5++;
            }
            return iZzw;
        }
        zzct zzctVar = (zzct) list;
        int iZzw2 = 0;
        while (i5 < size) {
            int iZze = zzctVar.zze(i5);
            iZzw2 += zzby.zzw((iZze >> 31) ^ (iZze + iZze));
            i5++;
        }
        return iZzw2;
    }

    public static int zzj(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzdr)) {
            int iZzx = 0;
            while (i5 < size) {
                long jLongValue = ((Long) list.get(i5)).longValue();
                iZzx += zzby.zzx((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i5++;
            }
            return iZzx;
        }
        zzdr zzdrVar = (zzdr) list;
        int iZzx2 = 0;
        while (i5 < size) {
            long jZze = zzdrVar.zze(i5);
            iZzx2 += zzby.zzx((jZze >> 63) ^ (jZze + jZze));
            i5++;
        }
        return iZzx2;
    }

    public static int zzk(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzct)) {
            int iZzw = 0;
            while (i5 < size) {
                iZzw += zzby.zzw(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return iZzw;
        }
        zzct zzctVar = (zzct) list;
        int iZzw2 = 0;
        while (i5 < size) {
            iZzw2 += zzby.zzw(zzctVar.zze(i5));
            i5++;
        }
        return iZzw2;
    }

    public static int zzl(List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzdr)) {
            int iZzx = 0;
            while (i5 < size) {
                iZzx += zzby.zzx(((Long) list.get(i5)).longValue());
                i5++;
            }
            return iZzx;
        }
        zzdr zzdrVar = (zzdr) list;
        int iZzx2 = 0;
        while (i5 < size) {
            iZzx2 += zzby.zzx(zzdrVar.zze(i5));
            i5++;
        }
        return iZzx2;
    }

    public static zzff zzm() {
        return zzc;
    }

    public static zzff zzn() {
        return zzd;
    }

    public static Object zzo(Object obj, int i5, int i10, Object obj2, zzff zzffVar) {
        if (obj2 == null) {
            obj2 = zzffVar.zzc(obj);
        }
        zzffVar.zzf(obj2, i5, i10);
        return obj2;
    }

    public static void zzp(zzce zzceVar, Object obj, Object obj2) {
        zzci zzciVarZzb = zzceVar.zzb(obj2);
        if (zzciVarZzb.zza.isEmpty()) {
            return;
        }
        zzceVar.zzc(obj).zzh(zzciVarZzb);
    }

    public static void zzq(zzff zzffVar, Object obj, Object obj2) {
        zzffVar.zzh(obj, zzffVar.zze(zzffVar.zzd(obj), zzffVar.zzd(obj2)));
    }

    public static void zzr(Class cls) {
        Class cls2;
        if (!zzcs.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzs(int i5, List list, zzfx zzfxVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxVar.zzc(i5, list, z2);
    }

    public static void zzt(int i5, List list, zzfx zzfxVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxVar.zzg(i5, list, z2);
    }

    public static void zzu(int i5, List list, zzfx zzfxVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxVar.zzj(i5, list, z2);
    }

    public static void zzv(int i5, List list, zzfx zzfxVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxVar.zzl(i5, list, z2);
    }

    public static void zzw(int i5, List list, zzfx zzfxVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxVar.zzn(i5, list, z2);
    }

    public static void zzx(int i5, List list, zzfx zzfxVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxVar.zzp(i5, list, z2);
    }

    public static void zzy(int i5, List list, zzfx zzfxVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxVar.zzs(i5, list, z2);
    }

    public static void zzz(int i5, List list, zzfx zzfxVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzfxVar.zzu(i5, list, z2);
    }
}
