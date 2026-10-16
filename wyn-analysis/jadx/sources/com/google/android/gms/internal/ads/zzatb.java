package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzatb implements Runnable {
    private final zzatl zza;
    private final zzatr zzb;
    private final Runnable zzc;

    public zzatb(zzatl zzatlVar, zzatr zzatrVar, Runnable runnable) {
        this.zza = zzatlVar;
        this.zzb = zzatrVar;
        this.zzc = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzatl zzatlVar = this.zza;
        zzatlVar.zzl();
        zzatr zzatrVar = this.zzb;
        if (zzatrVar.zzc()) {
            zzatlVar.zzs(zzatrVar.zza);
        } else {
            zzatlVar.zzt(zzatrVar.zzc);
        }
        if (zzatrVar.zzd) {
            zzatlVar.zzc("intermediate-response");
        } else {
            zzatlVar.zzd("done");
        }
        Runnable runnable = this.zzc;
        if (runnable != null) {
            runnable.run();
        }
    }
}
