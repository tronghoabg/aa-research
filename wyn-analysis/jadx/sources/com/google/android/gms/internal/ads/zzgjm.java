package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzgjm implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;
    private final zzini zzd;
    private final zzini zze;

    private zzgjm(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
        this.zzd = zziniVar4;
        this.zze = zziniVar5;
    }

    public static zzgjm zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5) {
        return new zzgjm(zziniVar, zziniVar2, zziniVar3, zziniVar4, zziniVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzgjl((zzaxt) this.zza.zzb(), (zzgie) this.zzb.zzb(), (Map) this.zzc.zzb(), (DisplayMetrics) this.zzd.zzb(), (zzgqo) this.zze.zzb());
    }
}
