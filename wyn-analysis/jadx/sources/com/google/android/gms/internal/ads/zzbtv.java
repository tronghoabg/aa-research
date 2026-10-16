package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzbtv extends zzcgk {
    private final Object zza = new Object();
    private final zzbua zzb;
    private boolean zzc;

    public zzbtv(zzbua zzbuaVar) {
        this.zzb = zzbuaVar;
    }

    public final void zza() {
        G6.L.k("release: Trying to acquire lock");
        synchronized (this.zza) {
            try {
                G6.L.k("release: Lock acquired");
                if (this.zzc) {
                    G6.L.k("release: Lock already released");
                    return;
                }
                this.zzc = true;
                zze(new zzbts(this), new zzcgg());
                zze(new zzbtt(this), new zzbtu(this));
                G6.L.k("release: Lock released");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ zzbua zzb() {
        return this.zzb;
    }
}
