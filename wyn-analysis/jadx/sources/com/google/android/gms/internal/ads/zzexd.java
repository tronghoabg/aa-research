package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import n7.C3597b;
import n7.InterfaceC3596a;

/* loaded from: classes3.dex */
final class zzexd {
    public final p8.p zza;
    private final long zzb;
    private final InterfaceC3596a zzc;

    public zzexd(p8.p pVar, long j8, InterfaceC3596a interfaceC3596a) {
        this.zza = pVar;
        this.zzc = interfaceC3596a;
        ((C3597b) interfaceC3596a).getClass();
        this.zzb = SystemClock.elapsedRealtime() + j8;
    }

    public final boolean zza() {
        InterfaceC3596a interfaceC3596a = this.zzc;
        long j8 = this.zzb;
        ((C3597b) interfaceC3596a).getClass();
        return j8 < SystemClock.elapsedRealtime();
    }
}
