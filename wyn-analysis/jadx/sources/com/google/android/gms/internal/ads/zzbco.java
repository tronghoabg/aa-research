package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class zzbco extends zzbdm {
    public zzbco(zzbbz zzbbzVar, String str, String str2, zzaxt zzaxtVar, int i5, int i10) {
        super(zzbbzVar, "m7g/XX2t5caOhtOM/ogmEO9Vkwmhkxe5gTS2qje4vP8HJASoqVE/26NLNeDuMz/t", "+Weh9OuqHFyRkOD06GxXjljhJF/GsDXbBDxKrn8yplc=", zzaxtVar, i5, 5);
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzaxt zzaxtVar = this.zzd;
        zzaxtVar.zzd(-1L);
        zzaxtVar.zze(-1L);
        int[] iArr = (int[]) this.zze.invoke(null, this.zza.zzb());
        synchronized (zzaxtVar) {
            try {
                zzaxtVar.zzd(iArr[0]);
                zzaxtVar.zze(iArr[1]);
                int i5 = iArr[2];
                if (i5 != Integer.MIN_VALUE) {
                    zzaxtVar.zzO(i5);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
