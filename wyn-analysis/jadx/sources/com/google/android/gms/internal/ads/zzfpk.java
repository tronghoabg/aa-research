package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public abstract class zzfpk {
    private static final p8.p zza = zzhcf.zza(null);
    private final zzhcp zzb;
    private final ScheduledExecutorService zzc;
    private final zzfpl zzd;

    public zzfpk(zzhcp zzhcpVar, ScheduledExecutorService scheduledExecutorService, zzfpl zzfplVar) {
        this.zzb = zzhcpVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfplVar;
    }

    public final zzfpj zza(Object obj, p8.p pVar) {
        return new zzfpj(this, obj, null, pVar, Collections.singletonList(pVar), pVar, null);
    }

    public final zzfpb zzb(Object obj, p8.p... pVarArr) {
        return new zzfpb(this, obj, Arrays.asList(pVarArr), null);
    }

    public abstract String zzc(Object obj);

    public final /* synthetic */ zzhcp zze() {
        return this.zzb;
    }

    public final /* synthetic */ ScheduledExecutorService zzf() {
        return this.zzc;
    }

    public final /* synthetic */ zzfpl zzg() {
        return this.zzd;
    }
}
