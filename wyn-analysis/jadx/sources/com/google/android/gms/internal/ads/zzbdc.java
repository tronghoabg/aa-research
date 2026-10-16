package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzbdc extends zzbdm {
    private List zzh;
    private final Context zzi;

    public zzbdc(zzbbz zzbbzVar, String str, String str2, zzaxt zzaxtVar, int i5, int i10, Context context) {
        super(zzbbzVar, "XXF2CX++qjQzFfJDmqd+84h356GlStFLqQSTRbbce/csPkd7M5mpQw1l7igXWffL", "FGCYjW2JaOcRH3mqSkgHIxbWzEwOVje6sx286yuA1xM=", zzaxtVar, i5, 31);
        this.zzh = null;
        this.zzi = context;
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzaxt zzaxtVar = this.zzd;
        zzaxtVar.zzq(-1L);
        zzaxtVar.zzr(-1L);
        Context contextZzb = this.zzi;
        if (contextZzb == null) {
            contextZzb = this.zza.zzb();
        }
        if (this.zzh == null) {
            this.zzh = (List) this.zze.invoke(null, contextZzb);
        }
        List list = this.zzh;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (zzaxtVar) {
            zzaxtVar.zzq(((Long) this.zzh.get(0)).longValue());
            zzaxtVar.zzr(((Long) this.zzh.get(1)).longValue());
        }
    }
}
