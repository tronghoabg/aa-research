package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes3.dex */
public final class zzadk {
    private final Context zza;
    private final zzadw zzb;
    private zzbs zzc;
    private boolean zzd;
    private boolean zzf;
    private long zzg = 15000;
    private final zzadx zzh = new zzadx(1.0f);
    private zzdp zze = zzdp.zza;

    public zzadk(Context context, zzadw zzadwVar) {
        this.zza = context.getApplicationContext();
        this.zzb = zzadwVar;
    }

    public final zzadk zza(boolean z2) {
        this.zzd = true;
        return this;
    }

    public final zzadk zzb(zzdp zzdpVar) {
        this.zze = zzdpVar;
        return this;
    }

    public final zzadk zzc(long j8) {
        this.zzg = j8;
        return this;
    }

    public final zzads zzd() {
        zzgtr.zzi(!this.zzf);
        if (this.zzc == null) {
            this.zzc = new zzadq(false);
        }
        zzads zzadsVar = new zzads(this, null);
        this.zzf = true;
        return zzadsVar;
    }

    public final /* synthetic */ Context zze() {
        return this.zza;
    }

    public final /* synthetic */ zzadw zzf() {
        return this.zzb;
    }

    public final /* synthetic */ zzbs zzg() {
        return this.zzc;
    }

    public final /* synthetic */ boolean zzh() {
        return this.zzd;
    }

    public final /* synthetic */ zzdp zzi() {
        return this.zze;
    }

    public final /* synthetic */ long zzj() {
        return this.zzg;
    }

    public final /* synthetic */ zzadx zzk() {
        return this.zzh;
    }
}
