package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzatr {
    public final Object zza;
    public final zzasu zzb;
    public final zzatu zzc;
    public boolean zzd;

    private zzatr(zzatu zzatuVar) {
        this.zzd = false;
        this.zza = null;
        this.zzb = null;
        this.zzc = zzatuVar;
    }

    public static zzatr zza(Object obj, zzasu zzasuVar) {
        return new zzatr(obj, zzasuVar);
    }

    public static zzatr zzb(zzatu zzatuVar) {
        return new zzatr(zzatuVar);
    }

    public final boolean zzc() {
        return this.zzc == null;
    }

    private zzatr(Object obj, zzasu zzasuVar) {
        this.zzd = false;
        this.zza = obj;
        this.zzb = zzasuVar;
        this.zzc = null;
    }
}
