package com.google.android.libraries.geo.mapcore.geoxp.jni.fetcher;

/* JADX INFO: loaded from: classes3.dex */
public final class NativeOfflineDiskCache {
    public static final defpackage.ypg a;
    private final java.util.concurrent.Executor b;

    static {
        defpackage.zhs zhsVar = defpackage.zho.a;
        a = defpackage.ypg.c("com/google/android/libraries/geo/mapcore/geoxp/jni/fetcher/NativeOfflineDiskCache");
    }

    public NativeOfflineDiskCache(java.util.concurrent.Executor executor) {
        this.b = executor;
    }

    private static native boolean nativeInitClass();

    public void fetchResource(int i, java.lang.String str, boolean z) {
        this.b.execute(new defpackage.ozv(11));
    }

    public void fetchTile(int i, byte[] bArr) {
        this.b.execute(new defpackage.ozv(12));
    }
}
