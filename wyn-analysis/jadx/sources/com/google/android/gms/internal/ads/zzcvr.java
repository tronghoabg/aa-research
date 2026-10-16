package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import n7.InterfaceC3596a;

/* loaded from: classes3.dex */
public final class zzcvr implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;

    private zzcvr(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
    }

    public static zzcvr zzc(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzcvr(zziniVar, zziniVar2, zziniVar3);
    }

    public static zzdga zzd(ScheduledExecutorService scheduledExecutorService, InterfaceC3596a interfaceC3596a, zzdzt zzdztVar) {
        return new zzdga(scheduledExecutorService, interfaceC3596a, zzdztVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdga zzb() {
        return zzd((ScheduledExecutorService) this.zza.zzb(), (InterfaceC3596a) this.zzb.zzb(), (zzdzt) this.zzc.zzb());
    }
}
