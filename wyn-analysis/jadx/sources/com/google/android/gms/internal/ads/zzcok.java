package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import p7.C3773c;

/* loaded from: classes3.dex */
public final class zzcok implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzcok(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzcok zza(zzini zziniVar, zzini zziniVar2) {
        return new zzcok(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return C3773c.a(((zzcnz) this.zza).zza()).c(0, ((ApplicationInfo) this.zzb.zzb()).packageName);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
