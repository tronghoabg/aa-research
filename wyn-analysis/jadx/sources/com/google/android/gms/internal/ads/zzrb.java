package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzrb {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private int zzd = 0;

    public final zzrb zza(boolean z2) {
        this.zza = z2;
        return this;
    }

    public final zzrb zzb(boolean z2) {
        this.zzb = z2;
        return this;
    }

    public final zzrb zzc(boolean z2) {
        this.zzc = z2;
        return this;
    }

    public final zzrb zzd(int i5) {
        this.zzd = i5;
        return this;
    }

    public final zzrc zze() {
        if (this.zza || !(this.zzb || this.zzc)) {
            return new zzrc(this, null);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
    }

    public final /* synthetic */ boolean zzf() {
        return this.zza;
    }

    public final /* synthetic */ boolean zzg() {
        return this.zzb;
    }

    public final /* synthetic */ boolean zzh() {
        return this.zzc;
    }

    public final /* synthetic */ int zzi() {
        return this.zzd;
    }
}
