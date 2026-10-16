package com.google.android.libraries.geo.mapcore.geoxp.jni.providers;

/* JADX INFO: loaded from: classes3.dex */
public final class MapCoreConfigProvider {
    static {
        j$.time.Duration.ofDays(10L);
    }

    static native byte[] nativeCreateMapCoreConfigFromSerializedMapCoreParameters(byte[] bArr);
}
