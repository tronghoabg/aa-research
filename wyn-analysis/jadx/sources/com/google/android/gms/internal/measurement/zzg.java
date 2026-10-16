package com.google.android.gms.internal.measurement;

import R8.v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzg {
    public static double zza(double d3) {
        if (Double.isNaN(d3)) {
            return 0.0d;
        }
        if (Double.isInfinite(d3) || d3 == 0.0d || d3 == -0.0d) {
            return d3;
        }
        return Math.floor(Math.abs(d3)) * (d3 > 0.0d ? 1 : -1);
    }

    public static int zzb(double d3) {
        if (Double.isNaN(d3) || Double.isInfinite(d3) || d3 == 0.0d) {
            return 0;
        }
        return (int) ((Math.floor(Math.abs(d3)) * (d3 > 0.0d ? 1 : -1)) % 4.294967296E9d);
    }

    public static long zzc(double d3) {
        return zzb(d3) & 4294967295L;
    }

    public static void zzc(String str, int i5, List<zzaq> list) {
        if (list.size() <= i5) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at most " + i5 + " parameters found " + list.size());
    }

    public static void zzb(zzbv zzbvVar, int i5, List<zzaq> list) {
        zzb(zzbvVar.name(), i5, list);
    }

    public static int zza(zzh zzhVar) {
        int iZzb = zzb(zzhVar.zza("runtime.counter").zze().doubleValue() + 1.0d);
        if (iZzb <= 1000000) {
            zzhVar.zzc("runtime.counter", new zzai(Double.valueOf(iZzb)));
            return iZzb;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }

    public static void zzb(String str, int i5, List<zzaq> list) {
        if (list.size() >= i5) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at least " + i5 + " parameters found " + list.size());
    }

    public static zzbv zza(String str) {
        zzbv zzbvVarZza = (str == null || str.isEmpty()) ? null : zzbv.zza(Integer.parseInt(str));
        if (zzbvVarZza != null) {
            return zzbvVarZza;
        }
        throw new IllegalArgumentException(v.f("Unsupported commandId ", str));
    }

    public static boolean zzb(zzaq zzaqVar) {
        if (zzaqVar == null) {
            return false;
        }
        Double dZze = zzaqVar.zze();
        return !dZze.isNaN() && dZze.doubleValue() >= 0.0d && dZze.equals(Double.valueOf(Math.floor(dZze.doubleValue())));
    }

    public static Object zza(zzaq zzaqVar) {
        if (zzaq.zzd.equals(zzaqVar)) {
            return null;
        }
        if (zzaq.zzc.equals(zzaqVar)) {
            return "";
        }
        if (zzaqVar instanceof zzap) {
            return zza((zzap) zzaqVar);
        }
        if (zzaqVar instanceof zzaf) {
            ArrayList arrayList = new ArrayList();
            Iterator<zzaq> it = ((zzaf) zzaqVar).iterator();
            while (it.hasNext()) {
                Object objZza = zza(it.next());
                if (objZza != null) {
                    arrayList.add(objZza);
                }
            }
            return arrayList;
        }
        if (!zzaqVar.zze().isNaN()) {
            return zzaqVar.zze();
        }
        return zzaqVar.zzf();
    }

    public static Map<String, Object> zza(zzap zzapVar) {
        HashMap map = new HashMap();
        for (String str : zzapVar.zza()) {
            Object objZza = zza(zzapVar.zza(str));
            if (objZza != null) {
                map.put(str, objZza);
            }
        }
        return map;
    }

    public static void zza(zzbv zzbvVar, int i5, List<zzaq> list) {
        zza(zzbvVar.name(), i5, list);
    }

    public static void zza(String str, int i5, List<zzaq> list) {
        if (list.size() == i5) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires " + i5 + " parameters found " + list.size());
    }

    public static boolean zza(zzaq zzaqVar, zzaq zzaqVar2) {
        if (!zzaqVar.getClass().equals(zzaqVar2.getClass())) {
            return false;
        }
        if ((zzaqVar instanceof zzax) || (zzaqVar instanceof zzao)) {
            return true;
        }
        if (zzaqVar instanceof zzai) {
            if (Double.isNaN(zzaqVar.zze().doubleValue()) || Double.isNaN(zzaqVar2.zze().doubleValue())) {
                return false;
            }
            return zzaqVar.zze().equals(zzaqVar2.zze());
        }
        if (zzaqVar instanceof zzas) {
            return zzaqVar.zzf().equals(zzaqVar2.zzf());
        }
        if (zzaqVar instanceof zzag) {
            return zzaqVar.zzd().equals(zzaqVar2.zzd());
        }
        return zzaqVar == zzaqVar2;
    }
}
