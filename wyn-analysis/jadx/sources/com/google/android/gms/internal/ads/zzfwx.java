package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzfwx implements Runnable {
    final /* synthetic */ zzfxc zza;

    public zzfwx(zzfxc zzfxcVar) {
        Objects.requireNonNull(zzfxcVar);
        this.zza = zzfxcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzh().zzc();
    }
}
