package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class zzbcw extends zzbdm {
    private final zzbbr zzh;

    public zzbcw(zzbbz zzbbzVar, String str, String str2, zzaxt zzaxtVar, int i5, int i10, zzbbr zzbbrVar) {
        super(zzbbzVar, "/BhgxpXYgahRBmZkS3xjCzPdid3mZtzdZmJFkhACyEa2oS6asfWgI5KysEGcSPE9", "ngST2QkCVNtF272EQbVjeXMfCtACYPfIcakPMgsny7g=", zzaxtVar, i5, 94);
        this.zzh = zzbbrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        int iIntValue = ((Integer) this.zze.invoke(null, this.zzh.zzb())).intValue();
        zzaxt zzaxtVar = this.zzd;
        synchronized (zzaxtVar) {
            zzaxtVar.zzaj(zzayh.zza(iIntValue));
        }
    }
}
