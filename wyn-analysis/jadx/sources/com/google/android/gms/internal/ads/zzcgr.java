package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzcgr implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzcgy zzc;

    public zzcgr(zzcgy zzcgyVar, String str, String str2) {
        this.zza = str;
        this.zzb = str2;
        Objects.requireNonNull(zzcgyVar);
        this.zzc = zzcgyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcgy zzcgyVar = this.zzc;
        if (zzcgyVar.zzt() != null) {
            zzcgyVar.zzt().zzf(this.zza, this.zzb);
        }
    }
}
