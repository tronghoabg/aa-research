package com.google.android.gms.internal.ads;

import D6.C0395s;
import java.util.concurrent.ScheduledExecutorService;
import n7.InterfaceC3596a;

/* loaded from: classes3.dex */
public final class zzcnu implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;
    private final zzini zzd;

    private zzcnu(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
        this.zzd = zziniVar4;
    }

    public static zzcnu zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        return new zzcnu(zziniVar, zziniVar2, zziniVar3, zziniVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final Object zzb() {
        G6.N nZzb = ((zzcnt) this.zza).zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzb.zzb();
        zzftn zzftnVarZzb = ((zzfto) this.zzc).zzb();
        InterfaceC3596a interfaceC3596a = (InterfaceC3596a) this.zzd.zzb();
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzR)).booleanValue()) {
            return new zzfsx(nZzb, scheduledExecutorService, zzftnVarZzb, interfaceC3596a);
        }
        return null;
    }
}
