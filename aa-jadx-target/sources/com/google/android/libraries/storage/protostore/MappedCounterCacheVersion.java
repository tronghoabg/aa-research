package com.google.android.libraries.storage.protostore;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class MappedCounterCacheVersion {
    public final long a;

    public MappedCounterCacheVersion(long j) {
        this.a = j;
    }

    public static native int nativeFileTruncate(int i) throws java.io.IOException;

    private static native int nativeGetCounter(long j);

    public static native int nativeIncrementCounter(long j);

    public static native long nativeMmap(int i, boolean z) throws java.io.IOException;

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final long a() {
        return nativeGetCounter(this.a);
    }
}
