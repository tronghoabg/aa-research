package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
final class zzqi implements zzro {
    private static final zzqi zza = new zzqi();

    private zzqi() {
    }

    public static zzqi zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzro
    public final zzrn zzb(Class cls) {
        if (!zzqm.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (zzrn) zzqm.zzq(cls.asSubclass(zzqm.class)).zzb(3, null, null);
        } catch (Exception e7) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e7);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzro
    public final boolean zzc(Class cls) {
        return zzqm.class.isAssignableFrom(cls);
    }
}
