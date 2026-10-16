package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zziei implements zzifx {
    private static final zziei zza = new zziei();

    private zziei() {
    }

    public static zziei zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzifx
    public final boolean zzb(Class cls) {
        return zziep.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzifx
    public final zzifw zzc(Class cls) {
        if (!zziep.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (zzifw) zziep.zzbt(cls.asSubclass(zziep.class)).zzbs();
        } catch (Exception e7) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e7);
        }
    }
}
