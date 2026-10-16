package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: classes3.dex */
public final class zzfmf {
    private final Deque zza = new LinkedBlockingDeque();
    private final Callable zzb;
    private final zzhcp zzc;

    public zzfmf(Callable callable, zzhcp zzhcpVar) {
        this.zzb = callable;
        this.zzc = zzhcpVar;
    }

    public final synchronized void zza(int i5) {
        Deque deque = this.zza;
        int size = i5 - deque.size();
        for (int i10 = 0; i10 < size; i10++) {
            deque.add(this.zzc.zzc(this.zzb));
        }
    }

    public final synchronized p8.p zzb() {
        zza(1);
        return (p8.p) this.zza.poll();
    }

    public final synchronized void zzc(p8.p pVar) {
        this.zza.addFirst(pVar);
    }
}
