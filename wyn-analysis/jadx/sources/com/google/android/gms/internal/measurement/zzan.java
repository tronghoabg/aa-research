package com.google.android.gms.internal.measurement;

import N0.a;
import R8.v;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzan {
    public static zzaq zza(zzak zzakVar, zzaq zzaqVar, zzh zzhVar, List<zzaq> list) {
        if (zzakVar.zzc(zzaqVar.zzf())) {
            zzaq zzaqVarZza = zzakVar.zza(zzaqVar.zzf());
            if (zzaqVarZza instanceof zzal) {
                return ((zzal) zzaqVarZza).zza(zzhVar, list);
            }
            throw new IllegalArgumentException(a.f(zzaqVar.zzf(), " is not a function"));
        }
        if (!"hasOwnProperty".equals(zzaqVar.zzf())) {
            throw new IllegalArgumentException(v.f("Object has no function ", zzaqVar.zzf()));
        }
        zzg.zza("hasOwnProperty", 1, list);
        return zzakVar.zzc(zzhVar.zza(list.get(0)).zzf()) ? zzaq.zzh : zzaq.zzi;
    }

    public static Iterator<zzaq> zza(Map<String, zzaq> map) {
        return new zzam(map.keySet().iterator());
    }
}
