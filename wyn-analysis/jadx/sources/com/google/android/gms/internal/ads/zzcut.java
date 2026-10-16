package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzcut implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzcut(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar;
        this.zzb = zziniVar3;
    }

    public static zzcut zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzcut(zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = ((JSONObject) this.zzb.zzb()) == null ? Collections.EMPTY_SET : Collections.singleton(new zzdky((zzcun) this.zza.zzb(), zzfoi.zzc()));
        zzinh.zzb(setSingleton);
        return setSingleton;
    }
}
