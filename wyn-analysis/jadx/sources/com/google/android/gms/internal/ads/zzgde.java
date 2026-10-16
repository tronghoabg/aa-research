package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* loaded from: classes3.dex */
public final class zzgde implements zzimz {
    private final zzini zza;

    private zzgde(zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzgde zza(zzini zziniVar) {
        return new zzgde(zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        File dir = ((Context) this.zza.zzb()).getDir("yqzdkcache", 0);
        zzinh.zzb(dir);
        return dir;
    }
}
