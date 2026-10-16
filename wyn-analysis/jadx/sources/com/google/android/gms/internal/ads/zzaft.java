package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;

/* loaded from: classes3.dex */
final /* synthetic */ class zzaft implements zzafu {
    static final /* synthetic */ zzaft zza = new zzaft();

    private /* synthetic */ zzaft() {
    }

    @Override // com.google.android.gms.internal.ads.zzafu
    public final /* synthetic */ Constructor zza() {
        int i5 = zzafw.zza;
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(zzaga.class).getConstructor(Integer.TYPE);
        }
        return null;
    }
}
