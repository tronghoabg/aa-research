package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class zzfdt implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;
    private final zzini zzd;
    private final zzini zze;

    private zzfdt(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5, zzini zziniVar6, zzini zziniVar7) {
        this.zza = zziniVar2;
        this.zzb = zziniVar3;
        this.zzc = zziniVar5;
        this.zzd = zziniVar6;
        this.zze = zziniVar7;
    }

    public static zzfdt zzc(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5, zzini zziniVar6, zzini zziniVar7) {
        return new zzfdt(zziniVar, zziniVar2, zziniVar3, zziniVar4, zziniVar5, zziniVar6, zziniVar7);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfdr zzb() {
        return new zzfdr(zzcrt.zza(), ((zzcnz) this.zza).zza(), (ScheduledExecutorService) this.zzb.zzb(), zzfoi.zzc(), ((zzfez) this.zzc).zzb().intValue(), ((zzffa) this.zzd).zzb().booleanValue(), ((zzffb) this.zze).zzb().booleanValue());
    }
}
