package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;

/* loaded from: classes3.dex */
public final class zzfau implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;

    private zzfau(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        this.zza = zziniVar2;
        this.zzb = zziniVar3;
        this.zzc = zziniVar4;
    }

    public static zzfau zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        return new zzfau(zziniVar, zziniVar2, zziniVar3, zziniVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfas(zzfoi.zzc(), ((zzdcq) this.zza).zza(), (PackageInfo) this.zzb.zzb(), ((zzcnt) this.zzc).zzb());
    }
}
