package androidx.core.os;

import android.os.Bundle;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class HeapProfileRequestBuilder extends ProfilingRequestBuilder<HeapProfileRequestBuilder> {
    private final Bundle mParams = new Bundle();

    @Override // androidx.core.os.ProfilingRequestBuilder
    protected Bundle getParams() {
        return this.mParams;
    }

    @Override // androidx.core.os.ProfilingRequestBuilder
    protected int getProfilingType() {
        return 2;
    }

    @Override // androidx.core.os.ProfilingRequestBuilder
    public /* bridge */ /* synthetic */ ProfilingRequestBuilder getThis() {
        return this;
    }

    public final HeapProfileRequestBuilder setBufferSizeKb(int i2) {
        this.mParams.putInt("KEY_SIZE_KB", i2);
        return this;
    }

    public final HeapProfileRequestBuilder setDurationMs(int i2) {
        this.mParams.putInt("KEY_DURATION_MS", i2);
        return this;
    }

    public final HeapProfileRequestBuilder setSamplingIntervalBytes(long j2) {
        this.mParams.putLong("KEY_SAMPLING_INTERVAL_BYTES", j2);
        return this;
    }

    public final HeapProfileRequestBuilder setTrackJavaAllocations(boolean z) {
        this.mParams.putBoolean("KEY_TRACK_JAVA_ALLOCATIONS", z);
        return this;
    }

    @Override // androidx.core.os.ProfilingRequestBuilder
    protected HeapProfileRequestBuilder getThis() {
        return this;
    }
}
