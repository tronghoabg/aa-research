package com.google.android.gms.internal.ads;

import android.os.Looper;

/* loaded from: classes3.dex */
public final class zzmy {
    private final zzmx zza;
    private final zzmw zzb;
    private final zzbf zzc;
    private int zzd;
    private Object zze;
    private final Looper zzf;
    private final int zzg;
    private boolean zzh;
    private boolean zzi;

    public zzmy(zzmw zzmwVar, zzmx zzmxVar, zzbf zzbfVar, int i5, zzdp zzdpVar, Looper looper) {
        this.zzb = zzmwVar;
        this.zza = zzmxVar;
        this.zzc = zzbfVar;
        this.zzf = looper;
        this.zzg = i5;
    }

    public final zzmx zza() {
        return this.zza;
    }

    public final zzmy zzb(int i5) {
        zzgtr.zzi(!this.zzh);
        this.zzd = i5;
        return this;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final zzmy zzd(Object obj) {
        zzgtr.zzi(!this.zzh);
        this.zze = obj;
        return this;
    }

    public final Object zze() {
        return this.zze;
    }

    public final Looper zzf() {
        return this.zzf;
    }

    public final zzmy zzg() {
        zzgtr.zzi(!this.zzh);
        this.zzh = true;
        this.zzb.zzk(this);
        return this;
    }

    public final synchronized boolean zzh() {
        return false;
    }

    public final synchronized void zzi(boolean z2) {
        this.zzi = z2 | this.zzi;
        notifyAll();
    }
}
