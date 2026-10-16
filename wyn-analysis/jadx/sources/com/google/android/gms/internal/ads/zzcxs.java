package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzcxs {
    private final zzdga zza;
    private final zzdif zzb;

    public zzcxs(zzdga zzdgaVar, zzdif zzdifVar) {
        this.zza = zzdgaVar;
        this.zzb = zzdifVar;
    }

    public final zzdga zza() {
        return this.zza;
    }

    public final zzdky zzb() {
        zzdif zzdifVar = this.zzb;
        return zzdifVar != null ? new zzdky(zzdifVar, zzcfy.zzh) : new zzdky(new zzcxr(this), zzcfy.zzh);
    }

    public final zzdif zzc() {
        return this.zzb;
    }
}
