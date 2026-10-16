package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class zzeri implements C6.e {
    final AtomicBoolean zza = new AtomicBoolean(false);
    private final zzdcx zzb;
    private final zzddr zzc;
    private final zzdli zzd;
    private final zzdla zze;
    private final zzcun zzf;

    public zzeri(zzdcx zzdcxVar, zzddr zzddrVar, zzdli zzdliVar, zzdla zzdlaVar, zzcun zzcunVar) {
        this.zzb = zzdcxVar;
        this.zzc = zzddrVar;
        this.zzd = zzdliVar;
        this.zze = zzdlaVar;
        this.zzf = zzcunVar;
    }

    @Override // C6.e
    public final synchronized void zza(View view) {
        if (this.zza.compareAndSet(false, true)) {
            this.zzf.zzdr();
            this.zze.zza(view);
        }
    }

    @Override // C6.e
    public final void zzb() {
        if (this.zza.get()) {
            this.zzb.onAdClicked();
        }
    }

    @Override // C6.e
    public final void zzc() {
        if (this.zza.get()) {
            this.zzc.zza();
            this.zzd.zza();
        }
    }
}
