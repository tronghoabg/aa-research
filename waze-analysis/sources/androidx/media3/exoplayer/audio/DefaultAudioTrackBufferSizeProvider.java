package androidx.media3.exoplayer.audio;

import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.extractor.ExtractorUtil;
import com.google.d.b.an;
import com.google.d.j.e;
import com.google.d.l.j;
import java.math.RoundingMode;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class DefaultAudioTrackBufferSizeProvider implements DefaultAudioSink.AudioTrackBufferSizeProvider {
    private static final int AC3_BUFFER_MULTIPLICATION_FACTOR = 2;
    private static final int DEFAULT_PCM_BUFFER_DURATION_US = 500000;
    private static final int DTSHD_BUFFER_MULTIPLICATION_FACTOR = 4;
    private static final int MAX_PCM_BUFFER_DURATION_US = 750000;
    private static final int MIN_PCM_BUFFER_DURATION_US = 250000;
    private static final int OFFLOAD_BUFFER_DURATION_US = 50000000;
    private static final int PASSTHROUGH_BUFFER_DURATION_US = 250000;
    private static final int PCM_BUFFER_MULTIPLICATION_FACTOR = -1;
    public final int ac3BufferMultiplicationFactor;
    public final int dtshdBufferMultiplicationFactor;

    @Deprecated
    protected final int maxPcmBufferDurationUs;

    @Deprecated
    protected final int minPcmBufferDurationUs;
    protected final int offloadBufferDurationUs;
    protected final int passthroughBufferDurationUs;

    @Deprecated
    protected final int pcmBufferMultiplicationFactor;
    protected final int targetPcmBufferDurationUs;

    /* compiled from: WazeSource */
    public class Builder {
        private int minPcmBufferDurationUs = 250000;
        private int maxPcmBufferDurationUs = DefaultAudioTrackBufferSizeProvider.MAX_PCM_BUFFER_DURATION_US;
        private int pcmBufferMultiplicationFactor = -1;
        private int passthroughBufferDurationUs = 250000;
        private int offloadBufferDurationUs = DefaultAudioTrackBufferSizeProvider.OFFLOAD_BUFFER_DURATION_US;
        private int ac3BufferMultiplicationFactor = 2;
        private int dtshdBufferMultiplicationFactor = 4;
        private int targetPcmBufferDurationUs = DefaultAudioTrackBufferSizeProvider.DEFAULT_PCM_BUFFER_DURATION_US;

        public DefaultAudioTrackBufferSizeProvider build() {
            return new DefaultAudioTrackBufferSizeProvider(this);
        }

        public Builder setAc3BufferMultiplicationFactor(int i2) {
            this.ac3BufferMultiplicationFactor = i2;
            return this;
        }

        public Builder setDtshdBufferMultiplicationFactor(int i2) {
            this.dtshdBufferMultiplicationFactor = i2;
            return this;
        }

        @Deprecated
        public Builder setMaxPcmBufferDurationUs(int i2) {
            this.maxPcmBufferDurationUs = i2;
            return this;
        }

        @Deprecated
        public Builder setMinPcmBufferDurationUs(int i2) {
            this.minPcmBufferDurationUs = i2;
            return this;
        }

        public Builder setOffloadBufferDurationUs(int i2) {
            this.offloadBufferDurationUs = i2;
            return this;
        }

        public Builder setPassthroughBufferDurationUs(int i2) {
            this.passthroughBufferDurationUs = i2;
            return this;
        }

        @Deprecated
        public Builder setPcmBufferMultiplicationFactor(int i2) {
            this.pcmBufferMultiplicationFactor = i2;
            return this;
        }

        public Builder setTargetPcmBufferDurationUs(int i2) {
            this.targetPcmBufferDurationUs = i2;
            return this;
        }
    }

    protected DefaultAudioTrackBufferSizeProvider(Builder builder) {
        this.minPcmBufferDurationUs = builder.minPcmBufferDurationUs;
        this.maxPcmBufferDurationUs = builder.maxPcmBufferDurationUs;
        this.pcmBufferMultiplicationFactor = builder.pcmBufferMultiplicationFactor;
        this.passthroughBufferDurationUs = builder.passthroughBufferDurationUs;
        this.offloadBufferDurationUs = builder.offloadBufferDurationUs;
        this.ac3BufferMultiplicationFactor = builder.ac3BufferMultiplicationFactor;
        this.dtshdBufferMultiplicationFactor = builder.dtshdBufferMultiplicationFactor;
        this.targetPcmBufferDurationUs = builder.targetPcmBufferDurationUs;
    }

    protected static int durationUsToBytes(int i2, int i3, int i4) {
        return j.h(((i2 * i3) * i4) / 1000000);
    }

    private static int getNonPcmMaximumEncodedRateBytesPerSecond(int i2) {
        int maximumEncodedRateBytesPerSecond = ExtractorUtil.getMaximumEncodedRateBytesPerSecond(i2);
        an.u(maximumEncodedRateBytesPerSecond != -2147483647);
        return maximumEncodedRateBytesPerSecond;
    }

    protected int get1xBufferSizeInBytes(int i2, int i3, int i4, int i5, int i6, int i7) {
        if (i4 == 0) {
            return getPcmBufferSizeInBytes(i2, i6, i5);
        }
        if (i4 == 1) {
            return getOffloadBufferSizeInBytes(i3);
        }
        if (i4 == 2) {
            return getPassthroughBufferSizeInBytes(i3, i7);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.media3.exoplayer.audio.DefaultAudioSink.AudioTrackBufferSizeProvider
    public int getBufferSizeInBytes(int i2, int i3, int i4, int i5, int i6, int i7, double d2) {
        return (((Math.max(i2, (int) (get1xBufferSizeInBytes(i2, i3, i4, i5, i6, i7) * d2)) + i5) - 1) / i5) * i5;
    }

    protected int getOffloadBufferSizeInBytes(int i2) {
        return j.h((this.offloadBufferDurationUs * getNonPcmMaximumEncodedRateBytesPerSecond(i2)) / 1000000);
    }

    protected int getPassthroughBufferSizeInBytes(int i2, int i3) {
        int i4 = this.passthroughBufferDurationUs;
        if (i2 == 5) {
            i4 *= this.ac3BufferMultiplicationFactor;
        } else if (i2 == 8) {
            i4 *= this.dtshdBufferMultiplicationFactor;
            i2 = 8;
        }
        return j.h((i4 * (i3 != -1 ? e.h(i3, 8, RoundingMode.CEILING) : getNonPcmMaximumEncodedRateBytesPerSecond(i2))) / 1000000);
    }

    protected int getPcmBufferSizeInBytes(int i2, int i3, int i4) {
        int i5 = this.pcmBufferMultiplicationFactor;
        return i5 != -1 ? Util.constrainValue(i2 * i5, durationUsToBytes(this.minPcmBufferDurationUs, i3, i4), durationUsToBytes(this.maxPcmBufferDurationUs, i3, i4)) : durationUsToBytes(this.targetPcmBufferDurationUs, i3, i4);
    }
}
