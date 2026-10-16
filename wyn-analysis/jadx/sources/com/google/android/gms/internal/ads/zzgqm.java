package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class zzgqm {
    private final zzgfs zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);
    private long zzc = -1;
    private long zzd = -1;
    private Throwable zze = null;
    private final int zzf;

    public zzgqm(int i5, zzgcy zzgcyVar, zzgfs zzgfsVar) {
        this.zzf = i5;
        this.zza = zzgfsVar;
    }

    public final void zza() {
        if (this.zzb.get()) {
            throw new IllegalStateException("Finished trace.");
        }
        this.zzc = SystemClock.uptimeMillis();
    }

    public final void zzb(Throwable th) {
        if (this.zzb.get()) {
            throw new IllegalStateException("Finished trace.");
        }
        this.zze = th;
    }

    public final void zzc() {
        AtomicBoolean atomicBoolean = this.zzb;
        if (atomicBoolean.getAndSet(true)) {
            throw new IllegalStateException("Finished trace.");
        }
        this.zzd = SystemClock.uptimeMillis();
        this.zza.zzb(this.zzf - 1, atomicBoolean.get() ? this.zzd - this.zzc : -1L, this.zze, null);
    }
}
