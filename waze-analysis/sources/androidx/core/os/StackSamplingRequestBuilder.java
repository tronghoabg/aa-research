package androidx.core.os;

import android.os.Bundle;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class StackSamplingRequestBuilder extends ProfilingRequestBuilder<StackSamplingRequestBuilder> {
    private final Bundle mParams = new Bundle();

    @Override // androidx.core.os.ProfilingRequestBuilder
    protected Bundle getParams() {
        return this.mParams;
    }

    @Override // androidx.core.os.ProfilingRequestBuilder
    protected int getProfilingType() {
        return 3;
    }

    @Override // androidx.core.os.ProfilingRequestBuilder
    public /* bridge */ /* synthetic */ ProfilingRequestBuilder getThis() {
        return this;
    }

    public final StackSamplingRequestBuilder setBufferSizeKb(int i2) {
        this.mParams.putInt("KEY_SIZE_KB", i2);
        return this;
    }

    public final StackSamplingRequestBuilder setDurationMs(int i2) {
        this.mParams.putInt("KEY_DURATION_MS", i2);
        return this;
    }

    public final StackSamplingRequestBuilder setSamplingFrequencyHz(int i2) {
        this.mParams.putInt("KEY_FREQUENCY_HZ", i2);
        return this;
    }

    @Override // androidx.core.os.ProfilingRequestBuilder
    protected StackSamplingRequestBuilder getThis() {
        return this;
    }
}
