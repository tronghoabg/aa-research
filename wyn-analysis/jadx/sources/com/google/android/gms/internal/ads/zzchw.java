package com.google.android.gms.internal.ads;

import G6.U;

/* loaded from: classes3.dex */
final class zzchw implements Runnable {
    private final zzchi zza;
    private boolean zzb = false;

    public zzchw(zzchi zzchiVar) {
        this.zza = zzchiVar;
    }

    private final void zzc() {
        G6.M m10 = U.f4562l;
        m10.removeCallbacks(this);
        m10.postDelayed(this, 250L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzb) {
            return;
        }
        this.zza.zzF();
        zzc();
    }

    public final void zza() {
        this.zzb = true;
        this.zza.zzF();
    }

    public final void zzb() {
        this.zzb = false;
        zzc();
    }
}
