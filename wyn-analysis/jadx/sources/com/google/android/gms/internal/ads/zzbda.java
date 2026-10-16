package com.google.android.gms.internal.ads;

import D6.C0395s;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class zzbda extends zzbdm {
    public zzbda(zzbbz zzbbzVar, String str, String str2, zzaxt zzaxtVar, int i5, int i10) {
        super(zzbbzVar, "IIcYtgV+jKyhXEWTRGryYoN4Hb3AaxkKFvJa61B8IsfExxFOrLfbygLFTq7UIHav", "0Td4x6cMqS7UG7AA2zcqm+bK2AW+gIwIgEtwqP1CguA=", zzaxtVar, i5, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        Boolean bool = (Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzdU);
        bool.booleanValue();
        zzbbf zzbbfVar = new zzbbf((String) this.zze.invoke(null, this.zza.zzb(), bool));
        zzaxt zzaxtVar = this.zzd;
        synchronized (zzaxtVar) {
            zzaxtVar.zzc(zzbbfVar.zza);
            zzaxtVar.zzP(zzbbfVar.zzb);
        }
    }
}
