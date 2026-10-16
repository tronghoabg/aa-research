package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.AutoValue_StreamSpec;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class StreamSpec {
    public static final Range<Integer> FRAME_RATE_RANGE_UNSPECIFIED = new Range<>(0, 0);

    /* compiled from: WazeSource */
    public abstract class Builder {
        Builder() {
        }

        public abstract StreamSpec build();

        public abstract Builder setDynamicRange(DynamicRange dynamicRange);

        public abstract Builder setExpectedFrameRateRange(Range<Integer> range);

        public abstract Builder setImplementationOptions(Config config);

        public abstract Builder setOriginalConfiguredResolution(Size size);

        public abstract Builder setResolution(Size size);

        public abstract Builder setSessionType(int i2);

        public abstract Builder setZslDisabled(boolean z);
    }

    public static Builder builder(Size size) {
        AutoValue_StreamSpec.Builder builder = new AutoValue_StreamSpec.Builder();
        builder.setResolution(size);
        builder.setOriginalConfiguredResolution(size);
        builder.setSessionType(0);
        builder.setExpectedFrameRateRange(FRAME_RATE_RANGE_UNSPECIFIED);
        builder.setDynamicRange(DynamicRange.SDR);
        builder.setZslDisabled(false);
        return builder;
    }

    public abstract DynamicRange getDynamicRange();

    public abstract Range<Integer> getExpectedFrameRateRange();

    public abstract Config getImplementationOptions();

    public abstract Size getOriginalConfiguredResolution();

    public abstract Size getResolution();

    public abstract int getSessionType();

    public abstract boolean getZslDisabled();

    public abstract Builder toBuilder();
}
