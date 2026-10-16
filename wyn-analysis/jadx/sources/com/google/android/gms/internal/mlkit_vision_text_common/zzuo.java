package com.google.android.gms.internal.mlkit_vision_text_common;

/* loaded from: classes4.dex */
public final class zzuo {
    private static zzuo zza;

    private zzuo() {
    }

    public static synchronized zzuo zza() {
        try {
            if (zza == null) {
                zza = new zzuo();
            }
        } catch (Throwable th) {
            throw th;
        }
        return zza;
    }
}
