package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzacd implements Runnable {
    private final zzacc zza;

    public zzacd(zzacc zzaccVar) {
        this.zza = zzaccVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzg();
    }
}
