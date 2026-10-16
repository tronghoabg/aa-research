package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes3.dex */
public final class zztn {
    private final Context zza;
    private final zzqj zzb;
    private boolean zzc;
    private zztm zzd;
    private zzrh zze;
    private zztp zzf;
    private zztk zzg;

    @Deprecated
    public zztn() {
        this.zza = null;
        this.zzb = zzqj.zza;
    }

    public final zztu zza() {
        zzgtr.zzi(!this.zzc);
        this.zzc = true;
        if (this.zzf == null) {
            this.zzf = new zztp(new zzcp[0]);
        }
        if (this.zze == null) {
            if (this.zzg == null) {
                this.zzg = new zztk(this.zza);
            }
            if (this.zzd == null) {
                this.zzd = zztm.zza;
            }
            Context context = this.zza;
            zzte zzteVar = new zzte(context);
            zzteVar.zzb(context != null ? null : this.zzb);
            zzteVar.zzf(this.zzg);
            zzteVar.zza(this.zzd);
            this.zze = zzteVar.zzc();
        } else {
            zzgtr.zzi(this.zzg == null);
            zzgtr.zzi(this.zzd == null);
        }
        return new zztu(this, null);
    }

    public final /* synthetic */ Context zzb() {
        return this.zza;
    }

    public final /* synthetic */ zzrh zzc() {
        return this.zze;
    }

    public final /* synthetic */ zztp zzd() {
        return this.zzf;
    }

    public zztn(Context context) {
        this.zza = context;
        this.zzb = zzqj.zza;
    }
}
