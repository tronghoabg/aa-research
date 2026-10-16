package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class zzbdi extends zzbdm {
    public zzbdi(zzbbz zzbbzVar, String str, String str2, zzaxt zzaxtVar, int i5, int i10) {
        super(zzbbzVar, "GkIdfnRezKvEfAeB5157D8Ci3lpp/e7Oge9xr/GzO3KjC7JXvYHgpg7VRCtGuOw4", "kXUmyuEurXcq5mqFokC5oFFCqidwlGAMD9JpJXYa0Mk=", zzaxtVar, i5, 48);
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzaxt zzaxtVar = this.zzd;
        zzaxtVar.zzae(3);
        boolean zBooleanValue = ((Boolean) this.zze.invoke(null, this.zza.zzb())).booleanValue();
        synchronized (zzaxtVar) {
            try {
                if (zBooleanValue) {
                    zzaxtVar.zzae(2);
                } else {
                    zzaxtVar.zzae(1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
