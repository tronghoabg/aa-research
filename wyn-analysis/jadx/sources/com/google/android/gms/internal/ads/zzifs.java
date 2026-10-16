package com.google.android.gms.internal.ads;

import cb.AbstractC1593a;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzifs {
    private final zzifr zza;

    private zzifs(zzihq zzihqVar, Object obj, zzihq zzihqVar2, Object obj2) {
        this.zza = new zzifr(zzihqVar, "", zzihqVar2, obj2);
    }

    public static zzifs zza(zzihq zzihqVar, Object obj, zzihq zzihqVar2, Object obj2) {
        return new zzifs(zzihqVar, "", zzihqVar2, obj2);
    }

    public static void zzb(zzidu zziduVar, zzifr zzifrVar, Object obj, Object obj2) throws IOException {
        zziee.zzf(zziduVar, zzifrVar.zza, 1, obj);
        zziee.zzf(zziduVar, zzifrVar.zzc, 2, obj2);
    }

    public static int zzc(zzifr zzifrVar, Object obj, Object obj2) {
        return zziee.zzh(zzifrVar.zza, 1, obj) + zziee.zzh(zzifrVar.zzc, 2, obj2);
    }

    public final int zzd(int i5, Object obj, Object obj2) {
        zzifr zzifrVar = this.zza;
        int iZzF = zzidu.zzF(i5 << 3);
        int iZzc = zzc(zzifrVar, obj, obj2);
        return AbstractC1593a.a(iZzc, iZzc, iZzF);
    }

    public final zzifr zze() {
        return this.zza;
    }
}
