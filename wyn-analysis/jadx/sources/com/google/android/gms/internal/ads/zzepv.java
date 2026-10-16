package com.google.android.gms.internal.ads;

import n7.InterfaceC3596a;

/* loaded from: classes3.dex */
public final class zzepv implements zzimz {
    private final zzepu zza;
    private final zzini zzb;
    private final zzini zzc;
    private final zzini zzd;
    private final zzini zze;

    private zzepv(zzepu zzepuVar, zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        this.zza = zzepuVar;
        this.zzb = zziniVar;
        this.zzc = zziniVar2;
        this.zzd = zziniVar3;
        this.zze = zziniVar4;
    }

    public static zzepv zza(zzepu zzepuVar, zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        return new zzepv(zzepuVar, zziniVar, zziniVar2, zziniVar3, zziniVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* synthetic */ Object zzb() {
        return this.zza.zzb((InterfaceC3596a) this.zzb.zzb(), ((zzepo) this.zzc).zzb(), (zzemf) this.zzd.zzb(), (zzfsm) this.zze.zzb());
    }
}
