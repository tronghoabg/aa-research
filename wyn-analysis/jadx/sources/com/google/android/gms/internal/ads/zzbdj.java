package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class zzbdj extends zzbdm {
    private final View zzh;

    public zzbdj(zzbbz zzbbzVar, String str, String str2, zzaxt zzaxtVar, int i5, int i10, View view) {
        super(zzbbzVar, "K/Oo81d3D7QQWAvkxOkmH49qSlOsGQFHscMya6S21HBqr+GdnpBDhLtEJWB1CCZB", "Ge8je/arysmNa4UdtKuRe+4JSpIyhDOrTZ5OtsYb5ag=", zzaxtVar, i5, 57);
        this.zzh = view;
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        View view = this.zzh;
        if (view != null) {
            zzbio zzbioVar = zzbix.zzeu;
            C0395s c0395s = C0395s.f2489e;
            Boolean bool = (Boolean) c0395s.f2492c.zzd(zzbioVar);
            Boolean bool2 = (Boolean) c0395s.f2492c.zzd(zzbix.zzmD);
            zzbcd zzbcdVar = new zzbcd((String) this.zze.invoke(null, view, this.zza.zzb().getResources().getDisplayMetrics(), bool, bool2));
            zzayr zzayrVarZza = zzays.zza();
            zzayrVarZza.zzb(zzbcdVar.zza.longValue());
            zzayrVarZza.zzc(zzbcdVar.zzb.longValue());
            zzayrVarZza.zzd(zzbcdVar.zzc.longValue());
            if (bool2.booleanValue()) {
                zzayrVarZza.zza(zzbcdVar.zze.longValue());
            }
            if (bool.booleanValue()) {
                zzayrVarZza.zze(zzbcdVar.zzd.longValue());
            }
            this.zzd.zzM((zzays) zzayrVarZza.zzbu());
        }
    }
}
