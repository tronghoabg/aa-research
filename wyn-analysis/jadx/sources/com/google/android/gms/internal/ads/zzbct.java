package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class zzbct extends zzbdm {
    private final zzbca zzh;

    public zzbct(zzbbz zzbbzVar, String str, String str2, zzaxt zzaxtVar, int i5, int i10, zzbca zzbcaVar) {
        super(zzbbzVar, "4UiqdD16WGcqj9vsERkA6tbA4c/2yE/sXnYMi3TR5nPXoyMXncc0iB8g5zhndeqU", "5yR6P4d4j2VnbvLNLQtiv9yBd7AWiKZJ6Mp0Kq9QPto=", zzaxtVar, i5, 85);
        this.zzh = zzbcaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        Method method = this.zze;
        zzbca zzbcaVar = this.zzh;
        long[] jArr = (long[]) method.invoke(null, Long.valueOf(zzbcaVar.zzf()), Long.valueOf(zzbcaVar.zzg()), Long.valueOf(zzbcaVar.zzi()), Long.valueOf(zzbcaVar.zzh()));
        zzaxt zzaxtVar = this.zzd;
        synchronized (zzaxtVar) {
            zzaxtVar.zzY(jArr[0]);
            zzaxtVar.zzZ(jArr[1]);
        }
    }
}
