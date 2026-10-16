package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class zzdbv {
    private final AtomicLong zza;

    public zzdbv(zzfky zzfkyVar) {
        AtomicLong atomicLong = new AtomicLong();
        this.zza = atomicLong;
        atomicLong.set(zzfkyVar.zza.zza.zzu.get());
    }

    public final long zza() {
        return this.zza.get();
    }

    public final void zzb(long j8) {
        this.zza.set(j8);
    }
}
