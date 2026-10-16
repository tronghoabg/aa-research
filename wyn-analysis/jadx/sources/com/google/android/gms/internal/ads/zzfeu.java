package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzfeu implements zzfcs {
    final ScheduledExecutorService zza;

    public zzfeu(zzbzm zzbzmVar, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.zza = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final p8.p zza() {
        return zzhcf.zzk(zzhcf.zzi(zzhcf.zza(new Bundle()), ((Long) C0395s.f2489e.f2492c.zzd(zzbix.zzfm)).longValue(), TimeUnit.MILLISECONDS, this.zza), zzfet.zza, zzcfy.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 49;
    }
}
