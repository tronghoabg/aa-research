package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class zzhmz {
    private static final zzhmz zza = new zzhmz();
    private static final zzhmy zzb = new zzhmy(null);
    private final AtomicReference zzc = new AtomicReference();

    public static zzhmz zza() {
        return zza;
    }

    public final zzhmr zzb() {
        zzhmr zzhmrVar = (zzhmr) this.zzc.get();
        return zzhmrVar == null ? zzb : zzhmrVar;
    }
}
