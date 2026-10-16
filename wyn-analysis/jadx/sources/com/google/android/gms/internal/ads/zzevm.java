package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class zzevm {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    private zzevl zzb;

    public final void zza(boolean z2) {
        this.zza.set(true);
    }

    public final boolean zzb() {
        return this.zza.get();
    }

    public final void zzc(zzevl zzevlVar) {
        this.zzb = zzevlVar;
    }

    public final zzevl zzd() {
        return this.zzb;
    }
}
