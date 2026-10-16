package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzgcw extends zzgcu {
    private static zzgcw zzd;

    private zzgcw(Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public static final zzgcw zzh(Context context) {
        zzgcw zzgcwVar;
        synchronized (zzgcw.class) {
            try {
                if (zzd == null) {
                    zzd = new zzgcw(context);
                }
                zzgcwVar = zzd;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzgcwVar;
    }

    public final zzgcr zzi(long j8, boolean z2) throws IOException {
        synchronized (zzgcw.class) {
            try {
                if (this.zzc.zzc()) {
                    return zza(null, null, j8, z2);
                }
                return new zzgcr();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzj() throws IOException {
        synchronized (zzgcw.class) {
            try {
                if (zzg(false)) {
                    zzc(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
