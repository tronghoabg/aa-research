package com.google.android.libraries.geo.mapcore.geoxp.jni.fetcher;

import defpackage.oyx;
import defpackage.yob;
import defpackage.zgl;
import defpackage.zgp;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class NativeOfflineDiskCache {
    public static final yob a;
    private final Executor b;

    static {
        zgp zgpVar = zgl.a;
        a = yob.c("com/google/android/libraries/geo/mapcore/geoxp/jni/fetcher/NativeOfflineDiskCache");
    }

    public NativeOfflineDiskCache(Executor executor) {
        this.b = executor;
    }

    private static native boolean nativeInitClass();

    public void fetchResource(int i, String str, boolean z) {
        this.b.execute(new oyx(10));
    }

    public void fetchTile(int i, byte[] bArr) {
        this.b.execute(new oyx(11));
    }
}
