package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import n7.InterfaceC3596a;

/* loaded from: classes3.dex */
public final class zzcuo implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;
    private final zzini zzd;
    private final zzini zze;

    private zzcuo(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
        this.zzd = zziniVar4;
        this.zze = zziniVar5;
    }

    public static zzcuo zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5) {
        return new zzcuo(zziniVar, zziniVar2, zziniVar3, zziniVar4, zziniVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcun((zzbuy) this.zza.zzb(), (zzcuj) this.zzb.zzb(), (Executor) this.zzc.zzb(), (zzcui) this.zzd.zzb(), (InterfaceC3596a) this.zze.zzb());
    }
}
