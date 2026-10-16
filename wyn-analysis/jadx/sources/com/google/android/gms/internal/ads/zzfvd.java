package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes3.dex */
final class zzfvd extends TimerTask {
    final /* synthetic */ zzfvf zza;
    final /* synthetic */ Timer zzb;
    final /* synthetic */ zzfvg zzc;

    public zzfvd(zzfvg zzfvgVar, zzfvf zzfvfVar, Timer timer) {
        this.zza = zzfvfVar;
        this.zzb = timer;
        Objects.requireNonNull(zzfvgVar);
        this.zzc = zzfvgVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.zzc.zze();
        this.zza.zza(true);
        this.zzb.cancel();
    }
}
