package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzgcv extends zzgcu {
    private static zzgcv zzd;

    private zzgcv(Context context) {
        super(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
    }

    public static final zzgcv zzh(Context context) {
        zzgcv zzgcvVar;
        synchronized (zzgcv.class) {
            try {
                if (zzd == null) {
                    zzd = new zzgcv(context);
                }
                zzgcvVar = zzd;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzgcvVar;
    }

    public final zzgcr zzi(long j8, boolean z2) throws IOException {
        zzgcr zzgcrVarZza;
        synchronized (zzgcv.class) {
            zzgcrVarZza = zza(null, null, j8, z2);
        }
        return zzgcrVarZza;
    }

    public final zzgcr zzj(String str, String str2, long j8, boolean z2) throws IOException {
        zzgcr zzgcrVarZza;
        synchronized (zzgcv.class) {
            zzgcrVarZza = zza(str, str2, j8, z2);
        }
        return zzgcrVarZza;
    }

    public final void zzk() throws IOException {
        synchronized (zzgcv.class) {
            zzc(false);
        }
    }

    public final void zzl() throws IOException {
        synchronized (zzgcv.class) {
            zzc(true);
        }
    }
}
