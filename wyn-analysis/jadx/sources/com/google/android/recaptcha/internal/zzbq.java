package com.google.android.recaptcha.internal;

import j$.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class zzbq {
    public static final /* synthetic */ int zza = 0;

    @NotNull
    private static final ConcurrentHashMap zzb = new ConcurrentHashMap();

    public static final void zza(int i5, long j8) {
        ConcurrentHashMap concurrentHashMap = zzb;
        Integer numValueOf = Integer.valueOf(i5);
        Object zzbpVar = concurrentHashMap.get(numValueOf);
        if (zzbpVar == null) {
            zzbpVar = new zzbp();
        }
        zzbp zzbpVar2 = (zzbp) zzbpVar;
        zzbpVar2.zzg(zzbpVar2.zzb() + 1);
        zzbpVar2.zzf(zzbpVar2.zzd() + j8);
        zzbpVar2.zze(Math.max(j8, zzbpVar2.zzc()));
        concurrentHashMap.put(numValueOf, zzbpVar2);
    }
}
