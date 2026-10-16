package com.google.android.gms.internal.ads;

import D6.C0395s;
import n7.InterfaceC3596a;

/* loaded from: classes3.dex */
final class zzcdx {
    private final G6.N zza;

    public zzcdx(InterfaceC3596a interfaceC3596a, G6.N n10, zzceg zzcegVar) {
        this.zza = n10;
    }

    public final void zza(int i5, long j8) {
        long j10;
        zzbio zzbioVar = zzbix.zzbj;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            return;
        }
        G6.N n10 = this.zza;
        G6.O o7 = (G6.O) n10;
        o7.l();
        synchronized (o7.f4531a) {
            j10 = o7.f4527D;
        }
        if (j8 - j10 < 0) {
            G6.L.k("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((Boolean) c0395s.f2492c.zzd(zzbix.zzbk)).booleanValue()) {
            G6.O o10 = (G6.O) n10;
            o10.c(i5);
            o10.d(j8);
        } else {
            G6.O o11 = (G6.O) n10;
            o11.c(-1);
            o11.d(j8);
        }
    }
}
