package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Random;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class zzgft implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;
    private final zzini zzd;
    private final zzini zze;

    private zzgft(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
        this.zzd = zziniVar4;
        this.zze = zziniVar5;
    }

    public static zzgft zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5) {
        return new zzgft(zziniVar, zziniVar2, zziniVar3, zziniVar4, zziniVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* synthetic */ Object zzb() {
        Context context = (Context) this.zza.zzb();
        zzgew zzgewVar = (zzgew) this.zzb.zzb();
        ExecutorService executorService = (ExecutorService) this.zzc.zzb();
        zzgep zzgepVar = (zzgep) this.zzd.zzb();
        zzgdq zzgdqVar = (zzgdq) this.zze.zzb();
        return new zzgfx(context, zzgewVar, executorService, zzgepVar, new Random(), zzgdqVar.zzg().zza(), zzgdqVar.zzg().zzc(), zzgdqVar.zzg().zzd(), zzgdqVar.zzg().zzb(), zzgdqVar.zzd(), zzgdqVar.zzM(), zzgdqVar.zzK() - 1);
    }
}
