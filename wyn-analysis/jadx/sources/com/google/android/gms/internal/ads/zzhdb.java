package com.google.android.gms.internal.ads;

import Va.M6;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
final class zzhdb extends zzhbw {
    private p8.p zza;
    private ScheduledFuture zzb;

    private zzhdb(p8.p pVar) {
        pVar.getClass();
        this.zza = pVar;
    }

    public static p8.p zze(p8.p pVar, long j8, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzhdb zzhdbVar = new zzhdb(pVar);
        zzhcz zzhczVar = new zzhcz(zzhdbVar);
        zzhdbVar.zzb = scheduledExecutorService.schedule(zzhczVar, j8, timeUnit);
        pVar.addListener(zzhczVar, zzhbu.INSTANCE);
        return zzhdbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhay
    public final void zzc() {
        zzm(this.zza);
        ScheduledFuture scheduledFuture = this.zzb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zza = null;
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhay
    public final String zzd() {
        p8.p pVar = this.zza;
        ScheduledFuture scheduledFuture = this.zzb;
        if (pVar == null) {
            return null;
        }
        String string = pVar.toString();
        String strT = M6.t(new StringBuilder(string.length() + 14), "inputFuture=[", string, "]");
        if (scheduledFuture == null) {
            return strT;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return strT;
        }
        int length = strT.length();
        StringBuilder sb2 = new StringBuilder(String.valueOf(delay).length() + length + 19 + 4);
        sb2.append(strT);
        sb2.append(", remaining delay=[");
        sb2.append(delay);
        sb2.append(" ms]");
        return sb2.toString();
    }

    public final /* synthetic */ p8.p zzf() {
        return this.zza;
    }

    public final /* synthetic */ ScheduledFuture zzx() {
        return this.zzb;
    }

    public final /* synthetic */ void zzy(ScheduledFuture scheduledFuture) {
        this.zzb = null;
    }
}
