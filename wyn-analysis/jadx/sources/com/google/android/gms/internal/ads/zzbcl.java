package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class zzbcl extends zzbdm {
    public zzbcl(zzbbz zzbbzVar, String str, String str2, zzaxt zzaxtVar, int i5, int i10) {
        super(zzbbzVar, "2JfLKOCWe20PaEte0oViJ9E/+ELRHfLHNO4trOuu7IQ3kQ71vgp9bwF5/QP32+2T", "LVYC8EvnYnoIGxefzdW+bkgnD7TMgzMx712oMyZcYTg=", zzaxtVar, i5, 49);
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        int i5 = 1;
        zzaxt zzaxtVar = this.zzd;
        zzaxtVar.zzaf(3);
        try {
            if (true == ((Boolean) this.zze.invoke(null, this.zza.zzb())).booleanValue()) {
                i5 = 2;
            }
            zzaxtVar.zzaf(i5);
        } catch (InvocationTargetException e7) {
            if (!(e7.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e7;
            }
        }
    }
}
