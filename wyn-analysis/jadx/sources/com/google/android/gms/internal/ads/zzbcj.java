package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.app.Activity;
import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class zzbcj extends zzbdm {
    private final Activity zzh;
    private final View zzi;

    public zzbcj(zzbbz zzbbzVar, String str, String str2, zzaxt zzaxtVar, int i5, int i10, View view, Activity activity) {
        super(zzbbzVar, "9TfyKlP5TIIt3OrlcGubA3YBpCoy+oB4k/WnZndRDloYkwzEaKKPovjffC4zkV4k", "3uxZ+FD025vJO7qOv296UhrdOlNsopGnz6EvxCliHP4=", zzaxtVar, i5, 62);
        this.zzi = view;
        this.zzh = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        View view = this.zzi;
        if (view == null) {
            return;
        }
        Boolean bool = (Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzdD);
        boolean zBooleanValue = bool.booleanValue();
        Object[] objArr = (Object[]) this.zze.invoke(null, view, this.zzh, bool);
        zzaxt zzaxtVar = this.zzd;
        synchronized (zzaxtVar) {
            try {
                zzaxtVar.zzS(((Long) objArr[0]).longValue());
                zzaxtVar.zzT(((Long) objArr[1]).longValue());
                if (zBooleanValue) {
                    zzaxtVar.zzU((String) objArr[2]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
