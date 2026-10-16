package com.google.android.libraries.geo.mapcore.geoxp.jni.fetcher;

/* JADX INFO: loaded from: classes3.dex */
public final class NativeUrlLoader {
    private final java.util.concurrent.Executor a;

    static {
        defpackage.zhs zhsVar = defpackage.zho.a;
    }

    public NativeUrlLoader(java.util.concurrent.Executor executor) {
        this.a = executor;
    }

    private static native boolean nativeInitClass();

    public void loadUrl(long j, java.lang.String str) {
        this.a.execute(new defpackage.ozv(13));
    }
}
