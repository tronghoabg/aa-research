package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class zzbcq extends zzbdm {
    private final long zzh;

    public zzbcq(zzbbz zzbbzVar, String str, String str2, zzaxt zzaxtVar, long j8, int i5, int i10) {
        super(zzbbzVar, "y0L1OSEMWW8/imV1M3pvQITWJfkGk5GAMqJuL5aNLdq8sTbK6BFpI8/D5pLc65zr", "dBSRUGPKY8JzIPoAEV0GB9RkRHGvAJPAM3BhqN1QQjE=", zzaxtVar, i5, 25);
        this.zzh = j8;
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        long jLongValue = ((Long) this.zze.invoke(null, new Object[0])).longValue();
        zzaxt zzaxtVar = this.zzd;
        synchronized (zzaxtVar) {
            try {
                zzaxtVar.zzac(jLongValue);
                long j8 = this.zzh;
                if (j8 != 0) {
                    zzaxtVar.zzk(jLongValue - j8);
                    zzaxtVar.zzn(j8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
