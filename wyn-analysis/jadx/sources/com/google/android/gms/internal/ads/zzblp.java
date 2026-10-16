package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class zzblp {
    private static final AtomicReference zza = new AtomicReference();
    private static final AtomicReference zzb = new AtomicReference();

    static {
        new AtomicBoolean();
    }

    public static zzbln zza() {
        return (zzbln) zza.get();
    }

    public static zzblo zzb() {
        return (zzblo) zzb.get();
    }

    public static void zzc(zzbln zzblnVar) {
        zza.set(zzblnVar);
    }
}
