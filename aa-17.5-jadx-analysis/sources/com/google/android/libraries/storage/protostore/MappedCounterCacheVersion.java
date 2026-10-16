package com.google.android.libraries.storage.protostore;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.IOException;

/* loaded from: classes.dex */
public final class MappedCounterCacheVersion {
    public final long a;

    public MappedCounterCacheVersion(long j) {
        this.a = j;
    }

    public static native int nativeFileTruncate(int i) throws IOException;

    private static native int nativeGetCounter(long j);

    public static native int nativeIncrementCounter(long j);

    public static native long nativeMmap(int i, boolean z) throws IOException;

    @ResultIgnorabilityUnspecified
    public final long a() {
        return nativeGetCounter(this.a);
    }
}
