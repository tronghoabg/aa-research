package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzdpy {
    private zzbmi zza;

    public zzdpy(zzdpj zzdpjVar) {
        this.zza = zzdpjVar;
    }

    public final synchronized zzbmi zza() {
        return this.zza;
    }

    public final synchronized void zzb(zzbmi zzbmiVar) {
        this.zza = zzbmiVar;
    }
}
