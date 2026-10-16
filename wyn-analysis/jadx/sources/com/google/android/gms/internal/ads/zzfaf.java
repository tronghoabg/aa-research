package com.google.android.gms.internal.ads;

import android.content.Intent;

/* loaded from: classes3.dex */
public final class zzfaf implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzfaf(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzfaf zzc(zzini zziniVar, zzini zziniVar2) {
        return new zzfaf(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfad zzb() {
        return new zzfad(((zzcnz) this.zza).zza(), (Intent) this.zzb.zzb());
    }
}
