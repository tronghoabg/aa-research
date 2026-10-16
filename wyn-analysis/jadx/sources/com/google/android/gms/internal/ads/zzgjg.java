package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzgjg implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;
    private final zzini zzd;
    private final zzini zze;
    private final zzini zzf;

    private zzgjg(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5, zzini zziniVar6) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
        this.zzd = zziniVar4;
        this.zze = zziniVar5;
        this.zzf = zziniVar6;
    }

    public static zzgjg zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4, zzini zziniVar5, zzini zziniVar6) {
        return new zzgjg(zziniVar, zziniVar2, zziniVar3, zziniVar4, zziniVar5, zziniVar6);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzgjf((zzaxt) this.zza.zzb(), (zzgie) this.zzb.zzb(), (zzgen) this.zzc.zzb(), (Context) this.zzd.zzb(), (Map) this.zze.zzb(), (zzgqo) this.zzf.zzb());
    }
}
