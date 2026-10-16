package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzcgq implements Runnable {
    final /* synthetic */ zzcgy zza;

    public zzcgq(zzcgy zzcgyVar) {
        Objects.requireNonNull(zzcgyVar);
        this.zza = zzcgyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcgy zzcgyVar = this.zza;
        if (zzcgyVar.zzt() != null) {
            zzcgyVar.zzt().zze();
        }
    }
}
