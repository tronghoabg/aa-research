package com.google.android.recaptcha.internal;

/* loaded from: classes4.dex */
final class zzlt {
    private static final zzls zza;
    private static final zzls zzb;

    static {
        zzls zzlsVar;
        try {
            zzlsVar = (zzls) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzlsVar = null;
        }
        zza = zzlsVar;
        zzb = new zzls();
    }

    public static zzls zza() {
        return zza;
    }

    public static zzls zzb() {
        return zzb;
    }
}
