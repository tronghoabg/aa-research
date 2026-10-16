package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzfc {
    final /* synthetic */ zzfd zza;
    private final int zzb;
    private int zzc;
    private boolean zzd;
    private long zze;

    public zzfc(zzfd zzfdVar, int i5) {
        Objects.requireNonNull(zzfdVar);
        this.zza = zzfdVar;
        this.zzb = i5;
    }

    public final void zza() {
        zzfd zzfdVar = this.zza;
        int iZzi = zzfdVar.zzd().zzi();
        if (!zzfdVar.zzd().zzk() || zzfdVar.zzd().zzh() == 1 || zzfdVar.zzd().zzh() == 4 || iZzi == 0 || iZzi == 1) {
            if (this.zzd) {
                zzfdVar.zzg().zzk(4);
            }
            this.zzd = false;
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzd && this.zzc == iZzi) {
            long j8 = jElapsedRealtime - this.zze;
            int i5 = this.zzb;
            if (j8 >= i5) {
                zzfdVar.zze().zza(new zzfe(4, i5));
                return;
            }
            return;
        }
        this.zzd = true;
        this.zze = jElapsedRealtime;
        this.zzc = iZzi;
        zzfdVar.zzg().zzk(4);
        zzfdVar.zzg().zzi(4, this.zzb);
    }
}
