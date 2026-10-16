package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes3.dex */
public final class zzdci {
    private Context zza;
    private zzflg zzb;
    private Bundle zzc;
    private zzfkz zzd;
    private zzdcc zze;
    private zzemf zzf;

    public final zzdci zza(Context context) {
        this.zza = context;
        return this;
    }

    public final zzdci zzb(zzflg zzflgVar) {
        this.zzb = zzflgVar;
        return this;
    }

    public final zzdci zzc(Bundle bundle) {
        this.zzc = bundle;
        return this;
    }

    public final zzdci zzd(zzdcc zzdccVar) {
        this.zze = zzdccVar;
        return this;
    }

    public final zzdcj zze() {
        return new zzdcj(this, null);
    }

    public final zzdci zzf(zzfkz zzfkzVar) {
        this.zzd = zzfkzVar;
        return this;
    }

    public final zzdci zzg(zzemf zzemfVar) {
        this.zzf = zzemfVar;
        return this;
    }

    public final /* synthetic */ Context zzh() {
        return this.zza;
    }

    public final /* synthetic */ zzflg zzi() {
        return this.zzb;
    }

    public final /* synthetic */ Bundle zzj() {
        return this.zzc;
    }

    public final /* synthetic */ zzfkz zzk() {
        return this.zzd;
    }

    public final /* synthetic */ zzdcc zzl() {
        return this.zze;
    }

    public final /* synthetic */ zzemf zzm() {
        return this.zzf;
    }
}
