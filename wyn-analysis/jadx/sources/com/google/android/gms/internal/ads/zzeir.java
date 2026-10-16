package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* loaded from: classes3.dex */
public final class zzeir implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;
    private final zzini zzd;
    private final zzini zze;

    private zzeir(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5, zzini zziniVar6, zzini zziniVar7, zzini zziniVar8) {
        this.zza = zziniVar;
        this.zzb = zziniVar4;
        this.zzc = zziniVar5;
        this.zzd = zziniVar6;
        this.zze = zziniVar8;
    }

    public static zzeir zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5, zzini zziniVar6, zzini zziniVar7, zzini zziniVar8) {
        return new zzeir(zziniVar, zziniVar2, zziniVar3, zziniVar4, zziniVar5, zziniVar6, zziniVar7, zziniVar8);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeiq(((zzcnz) this.zza).zza(), zzfoi.zzc(), zzcoz.zza(), ((zzcol) this.zzb).zzb(), ((zzeiz) this.zzc).zzb(), (ArrayDeque) this.zzd.zzb(), zzcow.zza(), (zzfqt) this.zze.zzb());
    }
}
