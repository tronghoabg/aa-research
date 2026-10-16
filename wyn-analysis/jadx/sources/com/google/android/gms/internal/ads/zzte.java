package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes3.dex */
public final class zzte {
    private final Context zza;
    private zztm zzb;
    private zzqj zzc;
    private zztk zzd;

    public zzte(Context context) {
        this.zza = context != null ? context.getApplicationContext() : null;
        this.zzb = zztm.zza;
        if (context == null) {
            this.zzc = zzqj.zza;
        }
    }

    public final zzte zza(zztm zztmVar) {
        this.zzb = zztmVar;
        return this;
    }

    public final zzte zzb(zzqj zzqjVar) {
        if (this.zza == null) {
            this.zzc = zzqjVar;
        }
        return this;
    }

    public final zztg zzc() {
        if (this.zzd == null) {
            this.zzd = new zztk(this.zza);
        }
        return new zztg(this, null);
    }

    public final /* synthetic */ Context zzd() {
        return this.zza;
    }

    public final /* synthetic */ zzqj zze() {
        return this.zzc;
    }

    public final zzte zzf(zztk zztkVar) {
        this.zzd = zztkVar;
        return this;
    }

    public final /* synthetic */ zztk zzg() {
        return this.zzd;
    }
}
