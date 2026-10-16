package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzqt {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;

    public final zzqt zza(boolean z2) {
        this.zza = z2;
        return this;
    }

    public final zzqt zzb(boolean z2) {
        this.zzb = z2;
        return this;
    }

    public final zzqt zzc(boolean z2) {
        this.zzc = z2;
        return this;
    }

    public final zzqu zzd() {
        if (this.zza || !(this.zzb || this.zzc)) {
            return new zzqu(this, null);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }

    public final /* synthetic */ boolean zze() {
        return this.zza;
    }

    public final /* synthetic */ boolean zzf() {
        return this.zzb;
    }

    public final /* synthetic */ boolean zzg() {
        return this.zzc;
    }
}
