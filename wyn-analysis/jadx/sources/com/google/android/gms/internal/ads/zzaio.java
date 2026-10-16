package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
abstract class zzaio {
    protected final zzahm zza;

    public zzaio(zzahm zzahmVar) {
        this.zza = zzahmVar;
    }

    public abstract boolean zza(zzeu zzeuVar) throws zzat;

    public abstract boolean zzb(zzeu zzeuVar, long j8) throws zzat;

    public final boolean zzf(zzeu zzeuVar, long j8) throws zzat {
        return zza(zzeuVar) && zzb(zzeuVar, j8);
    }
}
