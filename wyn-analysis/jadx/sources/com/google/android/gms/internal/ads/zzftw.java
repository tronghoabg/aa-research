package com.google.android.gms.internal.ads;

import D6.C0395s;
import n7.C3597b;
import n7.InterfaceC3596a;

/* loaded from: classes3.dex */
public final class zzftw {
    private final Object zza;
    private final long zzb;
    private final InterfaceC3596a zzc;
    private final long zzd;
    private final double zze;
    private final int zzf;

    public zzftw(Object obj, InterfaceC3596a interfaceC3596a, double d3, int i5) {
        if (interfaceC3596a == null) {
            throw new IllegalArgumentException("Clock cannot be null.");
        }
        this.zza = obj;
        this.zzc = interfaceC3596a;
        this.zzb = System.currentTimeMillis();
        this.zzd = Math.min(Math.max(((Long) C0395s.f2489e.f2492c.zzd(zzbix.zzaf)).longValue() * 1000, 10000L), 21600000L);
        this.zze = d3;
        this.zzf = i5;
    }

    public final Object zza() {
        return this.zza;
    }

    public final boolean zzb() {
        long j8 = this.zzb;
        long j10 = this.zzd;
        ((C3597b) this.zzc).getClass();
        return System.currentTimeMillis() >= j8 + j10;
    }

    public final long zzc() {
        ((C3597b) this.zzc).getClass();
        return this.zzd - (System.currentTimeMillis() - this.zzb);
    }

    public final long zzd() {
        return this.zzb;
    }

    public final double zze() {
        return this.zze;
    }

    public final int zzf() {
        return this.zzf;
    }
}
