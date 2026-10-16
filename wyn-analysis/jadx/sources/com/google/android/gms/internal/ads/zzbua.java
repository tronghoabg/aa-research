package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.AbstractC1732v;

/* loaded from: classes3.dex */
public final class zzbua extends zzcgk {
    private final G6.r zzb;
    private final Object zza = new Object();
    private boolean zzc = false;
    private int zzd = 0;

    public zzbua(G6.r rVar) {
        this.zzb = rVar;
    }

    public final zzbtv zza() {
        zzbtv zzbtvVar = new zzbtv(this);
        G6.L.k("createNewReference: Trying to acquire lock");
        synchronized (this.zza) {
            G6.L.k("createNewReference: Lock acquired");
            zze(new zzbtw(this, zzbtvVar), new zzbtx(this, zzbtvVar));
            AbstractC1732v.l(this.zzd >= 0);
            this.zzd++;
        }
        G6.L.k("createNewReference: Lock released");
        return zzbtvVar;
    }

    public final void zzb() {
        G6.L.k("releaseOneReference: Trying to acquire lock");
        synchronized (this.zza) {
            G6.L.k("releaseOneReference: Lock acquired");
            AbstractC1732v.l(this.zzd > 0);
            G6.L.k("Releasing 1 reference for JS Engine");
            this.zzd--;
            zzd();
        }
        G6.L.k("releaseOneReference: Lock released");
    }

    public final void zzc() {
        G6.L.k("markAsDestroyable: Trying to acquire lock");
        synchronized (this.zza) {
            G6.L.k("markAsDestroyable: Lock acquired");
            AbstractC1732v.l(this.zzd >= 0);
            G6.L.k("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.zzc = true;
            zzd();
        }
        G6.L.k("markAsDestroyable: Lock released");
    }

    public final void zzd() {
        G6.L.k("maybeDestroy: Trying to acquire lock");
        synchronized (this.zza) {
            try {
                G6.L.k("maybeDestroy: Lock acquired");
                AbstractC1732v.l(this.zzd >= 0);
                if (this.zzc && this.zzd == 0) {
                    G6.L.k("No reference is left (including root). Cleaning up engine.");
                    zze(new zzbtz(this), new zzcgg());
                } else {
                    G6.L.k("There are still references to the engine. Not destroying.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        G6.L.k("maybeDestroy: Lock released");
    }
}
