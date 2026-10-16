package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
final class zzatw {
    public static final boolean zza = zzatx.zzb;
    private final List zzb = new ArrayList();
    private boolean zzc = false;

    public final void finalize() throws Throwable {
        if (this.zzc) {
            return;
        }
        zzb("Request on the loose");
        zzatx.zzc("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }

    public final synchronized void zza(String str, long j8) {
        if (this.zzc) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.zzb.add(new zzatv(str, j8, SystemClock.elapsedRealtime()));
    }

    public final synchronized void zzb(String str) {
        this.zzc = true;
        List<zzatv> list = this.zzb;
        long j8 = list.size() == 0 ? 0L : ((zzatv) list.get(list.size() - 1)).zzc - ((zzatv) list.get(0)).zzc;
        if (j8 > 0) {
            long j10 = ((zzatv) list.get(0)).zzc;
            zzatx.zzb("(%-4d ms) %s", Long.valueOf(j8), str);
            for (zzatv zzatvVar : list) {
                long j11 = zzatvVar.zzc;
                zzatx.zzb("(+%-4d) [%2d] %s", Long.valueOf(j11 - j10), Long.valueOf(zzatvVar.zzb), zzatvVar.zza);
                j10 = j11;
            }
        }
    }
}
