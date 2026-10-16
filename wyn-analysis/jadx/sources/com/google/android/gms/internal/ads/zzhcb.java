package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* loaded from: classes3.dex */
public abstract class zzhcb extends zzhbz implements p8.p {
    @Override // p8.p
    public final void addListener(Runnable runnable, Executor executor) {
        zzc().addListener(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzhbz
    public /* bridge */ /* synthetic */ Future zza() {
        throw null;
    }

    public abstract p8.p zzc();
}
