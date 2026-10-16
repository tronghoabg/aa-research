package com.google.android.gms.internal.ads;

import D6.C0395s;
import com.google.android.gms.common.internal.AbstractC1732v;
import java.util.Random;
import n7.C3597b;
import n7.InterfaceC3596a;

/* loaded from: classes3.dex */
public final class zzftg {
    private final long zza;
    private final long zzb;
    private final InterfaceC3596a zzf;
    private final zzftn zzg;
    private long zzh;
    private long zzd = 5;
    private long zze = 0;
    private final Random zzi = new Random();
    private long zzc = 0;

    public zzftg(long j8, double d3, long j10, double d5, InterfaceC3596a interfaceC3596a, zzftn zzftnVar) {
        this.zza = j8;
        this.zzb = j10;
        this.zzg = zzftnVar;
        this.zzf = interfaceC3596a;
        zza();
    }

    public final synchronized void zza() {
        this.zzh = this.zza;
        this.zzc = 0L;
        this.zze = 0L;
    }

    public final synchronized long zzb() {
        double d3;
        double d5;
        long j8;
        d3 = this.zzh;
        d5 = 0.2d * d3;
        j8 = (long) (d3 + d5);
        return ((long) (d3 - d5)) + ((long) (this.zzi.nextDouble() * ((j8 - r0) + 1)));
    }

    public final synchronized void zzc() {
        long jZzb = zzb();
        ((C3597b) this.zzf).getClass();
        this.zze = System.currentTimeMillis() + jZzb;
        double d3 = this.zzh;
        long j8 = this.zzb;
        this.zzh = Math.min((long) (d3 + d3), j8);
        this.zzc++;
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzM)).booleanValue()) {
            this.zzg.zzt(System.currentTimeMillis(), this.zzc, this.zzh, this.zzd, j8);
        }
    }

    public final synchronized boolean zzd() {
        ((C3597b) this.zzf).getClass();
        return System.currentTimeMillis() < this.zze;
    }

    public final synchronized boolean zze() {
        if (((Integer) C0395s.f2489e.f2492c.zzd(zzbix.zzN)).intValue() < 0) {
            return false;
        }
        if (this.zzc > Math.max(this.zzd, ((Integer) r1.f2492c.zzd(r0)).intValue())) {
            if (this.zzh >= this.zzb) {
                return true;
            }
        }
        return false;
    }

    public final synchronized void zzf(int i5) {
        AbstractC1732v.b(i5 > 0);
        this.zzd = i5;
    }
}
