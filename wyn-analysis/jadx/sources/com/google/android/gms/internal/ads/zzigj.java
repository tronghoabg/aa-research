package com.google.android.gms.internal.ads;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes3.dex */
final class zzigj {
    private static final zzigj zza = new zzigj();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzifq zzb = new zzifq();

    private zzigj() {
    }

    public static zzigj zza() {
        return zza;
    }

    private <T> zzigr<T> zzc(Class<T> cls) {
        ConcurrentMap concurrentMap = this.zzc;
        zzigr<T> zzigrVarZza = this.zzb.zza(cls);
        zzigr<T> zzigrVar = (zzigr) concurrentMap.putIfAbsent(cls, zzigrVarZza);
        return zzigrVar != null ? zzigrVar : zzigrVarZza;
    }

    public final zzigr zzb(Class cls) {
        Object obj = this.zzc.get(cls);
        return obj == null ? zzc(cls) : (zzigr) obj;
    }
}
