package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes3.dex */
public final class zzglf implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;

    private zzglf(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
    }

    public static zzglf zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzglf(zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context context = (Context) this.zza.zzb();
        zzini zziniVar = this.zzc;
        return new zzglk(context, context.getSharedPreferences("pcvmspf2", 0), zzimy.zzc(this.zzb), (zzgqo) zziniVar.zzb());
    }
}
