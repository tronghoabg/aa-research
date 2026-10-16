package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzcgt implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzcgy zzc;

    public zzcgt(zzcgy zzcgyVar, int i5, int i10) {
        this.zza = i5;
        this.zzb = i10;
        Objects.requireNonNull(zzcgyVar);
        this.zzc = zzcgyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcgy zzcgyVar = this.zzc;
        if (zzcgyVar.zzt() != null) {
            zzcgyVar.zzt().zzj(this.zza, this.zzb);
        }
    }
}
