package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzgez implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzgez(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzgez zza(zzini zziniVar, zzini zziniVar2) {
        return new zzgez(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzgey((Executor) this.zza.zzb(), (zzgcy) this.zzb.zzb());
    }
}
