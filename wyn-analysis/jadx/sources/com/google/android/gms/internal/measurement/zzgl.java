package com.google.android.gms.internal.measurement;

/* loaded from: classes4.dex */
public final class zzgl {
    private static zzgk zza;

    public static synchronized zzgk zza() {
        try {
            if (zza == null) {
                zza(new zzgn());
            }
        } catch (Throwable th) {
            throw th;
        }
        return zza;
    }

    private static synchronized void zza(zzgk zzgkVar) {
        if (zza == null) {
            zza = zzgkVar;
        } else {
            throw new IllegalStateException("init() already called");
        }
    }
}
