package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzequ implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;

    private zzequ(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
    }

    public static zzequ zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzequ(zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeqt((Context) this.zza.zzb(), (Executor) this.zzb.zzb(), (zzdvz) this.zzc.zzb());
    }
}
