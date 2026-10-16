package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzhce {
    private final boolean zza;
    private final zzgwt zzb;

    public /* synthetic */ zzhce(boolean z2, zzgwt zzgwtVar, byte[] bArr) {
        this.zza = z2;
        this.zzb = zzgwtVar;
    }

    public final p8.p zza(Callable callable, Executor executor) {
        return new zzhbt(this.zzb, this.zza, executor, callable);
    }
}
