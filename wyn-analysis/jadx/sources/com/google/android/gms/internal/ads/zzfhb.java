package com.google.android.gms.internal.ads;

import D6.x1;
import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzfhb implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;
    private final zzini zzd;
    private final zzini zze;
    private final zzini zzf;
    private final zzini zzg;

    private zzfhb(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5, zzini zziniVar6, zzini zziniVar7, zzini zziniVar8) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
        this.zzd = zziniVar4;
        this.zze = zziniVar5;
        this.zzf = zziniVar6;
        this.zzg = zziniVar8;
    }

    public static zzfhb zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5, zzini zziniVar6, zzini zziniVar7, zzini zziniVar8) {
        return new zzfhb(zziniVar, zziniVar2, zziniVar3, zziniVar4, zziniVar5, zziniVar6, zziniVar7, zziniVar8);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfha((Context) this.zza.zzb(), (Executor) this.zzb.zzb(), (x1) this.zzc.zzb(), (zzcnq) this.zzd.zzb(), (zzetk) this.zze.zzb(), (zzeto) this.zzf.zzb(), new zzflf(), (zzdif) this.zzg.zzb());
    }
}
