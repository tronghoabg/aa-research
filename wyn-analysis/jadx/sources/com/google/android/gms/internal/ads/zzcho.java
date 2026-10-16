package com.google.android.gms.internal.ads;

import D6.C0395s;
import G6.U;
import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzcho {
    private long zzb;
    private final long zza = TimeUnit.MILLISECONDS.toNanos(((Long) C0395s.f2489e.f2492c.zzd(zzbix.zzaw)).longValue());
    private boolean zzc = true;

    public final void zza() {
        this.zzc = true;
    }

    public final void zzb(SurfaceTexture surfaceTexture, final zzcgz zzcgzVar) {
        if (zzcgzVar == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (!this.zzc) {
            long j8 = timestamp - this.zzb;
            if (Math.abs(j8) < this.zza) {
                return;
            }
        }
        this.zzc = false;
        this.zzb = timestamp;
        U.f4562l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcgzVar.zzi();
            }
        });
    }
}
