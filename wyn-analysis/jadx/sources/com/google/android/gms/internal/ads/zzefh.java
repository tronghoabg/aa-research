package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes3.dex */
public final class zzefh implements zzimz {
    private final zzini zza;

    private zzefh(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
    }

    public static zzefh zzc(zzini zziniVar, zzini zziniVar2) {
        return new zzefh(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzegd zzb() {
        return new zzegd((Context) this.zza.zzb(), zzfoi.zzc());
    }
}
