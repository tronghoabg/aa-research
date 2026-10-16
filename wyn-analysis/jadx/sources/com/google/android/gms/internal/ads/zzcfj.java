package com.google.android.gms.internal.ads;

import D6.C0395s;

/* loaded from: classes3.dex */
final class zzcfj {
    private final Object zza = new Object();
    private volatile int zzc = 1;
    private volatile long zzb = 0;

    private zzcfj() {
    }

    public final void zza() {
        C6.n nVar = C6.n.f1857D;
        nVar.k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.zza) {
            try {
                if (this.zzc == 3) {
                    if (this.zzb + ((Long) C0395s.f2489e.f2492c.zzd(zzbix.zzha)).longValue() <= jCurrentTimeMillis) {
                        this.zzc = 1;
                    }
                }
            } finally {
            }
        }
        nVar.k.getClass();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        synchronized (this.zza) {
            try {
                if (this.zzc != 2) {
                    return;
                }
                this.zzc = 3;
                if (this.zzc == 3) {
                    this.zzb = jCurrentTimeMillis2;
                }
            } finally {
            }
        }
    }

    public /* synthetic */ zzcfj(byte[] bArr) {
    }
}
