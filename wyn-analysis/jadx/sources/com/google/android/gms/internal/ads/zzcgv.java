package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzcgv implements Runnable {
    final /* synthetic */ zzcgy zza;

    public zzcgv(zzcgy zzcgyVar) {
        Objects.requireNonNull(zzcgyVar);
        this.zza = zzcgyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcgy zzcgyVar = this.zza;
        if (zzcgyVar.zzt() != null) {
            if (!zzcgyVar.zzu()) {
                zzcgyVar.zzt().zzk();
                zzcgyVar.zzv(true);
            }
            zzcgyVar.zzt().zzc();
        }
    }
}
