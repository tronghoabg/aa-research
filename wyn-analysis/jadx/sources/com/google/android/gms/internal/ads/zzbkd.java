package com.google.android.gms.internal.ads;

import N6.C0777b;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class zzbkd implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;
    private final zzini zzd;

    private zzbkd(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
        this.zzd = zziniVar4;
    }

    public static zzbkd zzc(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        return new zzbkd(zziniVar, zziniVar2, zziniVar3, zziniVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbkc zzb() {
        return new zzbkc((ScheduledExecutorService) this.zza.zzb(), (N6.x) this.zzb.zzb(), (C0777b) this.zzc.zzb(), (zzdzy) this.zzd.zzb());
    }
}
