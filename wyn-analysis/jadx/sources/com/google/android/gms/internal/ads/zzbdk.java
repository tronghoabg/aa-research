package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzbdk implements Runnable {
    final /* synthetic */ zzbdl zza;

    public zzbdk(zzbdl zzbdlVar) {
        Objects.requireNonNull(zzbdlVar);
        this.zza = zzbdlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb();
    }
}
