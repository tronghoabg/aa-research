package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* loaded from: classes3.dex */
public final class zzfbh implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;

    private zzfbh(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
    }

    public static zzfbh zzc(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzfbh(zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfbf zzb() {
        return new zzfbf((ApplicationInfo) this.zza.zzb(), (PackageInfo) this.zzb.zzb(), ((zzcnz) this.zzc).zza());
    }
}
