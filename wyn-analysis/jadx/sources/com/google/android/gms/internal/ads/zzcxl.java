package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzcxl implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzcxl(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzcxl zzc(zzini zziniVar, zzini zziniVar2) {
        return new zzcxl(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcxk zzb() {
        return new zzcxk(((zzcwq) this.zza).zza(), (Executor) this.zzb.zzb());
    }
}
