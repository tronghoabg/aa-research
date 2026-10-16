package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class zzfew implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzfew(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar2;
        this.zzb = zziniVar3;
    }

    public static zzfew zzc(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzfew(zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfeu zzb() {
        return new zzfeu(zzcrr.zza(), (ScheduledExecutorService) this.zza.zzb(), ((zzcnz) this.zzb).zza());
    }
}
