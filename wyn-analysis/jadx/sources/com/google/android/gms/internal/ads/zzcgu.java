package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzcgu implements Runnable {
    final /* synthetic */ zzcgy zza;

    public zzcgu(zzcgy zzcgyVar) {
        Objects.requireNonNull(zzcgyVar);
        this.zza = zzcgyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcgy zzcgyVar = this.zza;
        if (zzcgyVar.zzt() != null) {
            zzcgyVar.zzt().zzd();
            zzcgyVar.zzt().zzh();
        }
    }
}
