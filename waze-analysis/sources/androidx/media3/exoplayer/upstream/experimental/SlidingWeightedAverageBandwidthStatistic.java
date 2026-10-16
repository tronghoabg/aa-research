package androidx.media3.exoplayer.upstream.experimental;

import androidx.camera.video.AudioStats;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.Util;
import java.util.ArrayDeque;
import java.util.Deque;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class SlidingWeightedAverageBandwidthStatistic implements BandwidthStatistic {
    public static final int DEFAULT_MAX_SAMPLES_COUNT = 10;
    private double bitrateWeightProductSum;
    private final Clock clock;
    private final SampleEvictionFunction sampleEvictionFunction;
    private final ArrayDeque<Sample> samples;
    private double weightSum;

    /* compiled from: WazeSource */
    public class Sample {
        public final long bitrate;
        public final long timeAddedMs;
        public final double weight;

        public Sample(long j2, double d2, long j3) {
            this.bitrate = j2;
            this.weight = d2;
            this.timeAddedMs = j3;
        }
    }

    /* compiled from: WazeSource */
    public interface SampleEvictionFunction {
        boolean shouldEvictSample(Deque<Sample> deque);
    }

    SlidingWeightedAverageBandwidthStatistic(SampleEvictionFunction sampleEvictionFunction, Clock clock) {
        this.samples = new ArrayDeque<>();
        this.sampleEvictionFunction = sampleEvictionFunction;
        this.clock = clock;
    }

    public static SampleEvictionFunction getAgeBasedEvictionFunction(long j2) {
        return getAgeBasedEvictionFunction(j2, Clock.DEFAULT);
    }

    public static SampleEvictionFunction getMaxCountEvictionFunction(final long j2) {
        return new SampleEvictionFunction() { // from class: androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic$$ExternalSyntheticLambda1
            @Override // androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction
            public final boolean shouldEvictSample(Deque deque) {
                return SlidingWeightedAverageBandwidthStatistic.lambda$getMaxCountEvictionFunction$0(j2, deque);
            }
        };
    }

    static /* synthetic */ boolean lambda$getAgeBasedEvictionFunction$0(long j2, Clock clock, Deque deque) {
        if (deque.isEmpty()) {
            return false;
        }
        Sample sample = (Sample) deque.peek();
        int i2 = Util.SDK_INT;
        return sample.timeAddedMs + j2 < clock.elapsedRealtime();
    }

    static /* synthetic */ boolean lambda$getMaxCountEvictionFunction$0(long j2, Deque deque) {
        return ((long) deque.size()) >= j2;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public void addSample(long j2, long j3) {
        while (this.sampleEvictionFunction.shouldEvictSample(this.samples)) {
            Sample sampleRemove = this.samples.remove();
            double d2 = this.bitrateWeightProductSum;
            double d3 = sampleRemove.bitrate;
            double d4 = sampleRemove.weight;
            this.bitrateWeightProductSum = d2 - (d3 * d4);
            this.weightSum -= d4;
        }
        Sample sample = new Sample((j2 * 8000000) / j3, Math.sqrt(j2), this.clock.elapsedRealtime());
        this.samples.add(sample);
        double d5 = this.bitrateWeightProductSum;
        long j4 = sample.bitrate;
        double d6 = sample.weight;
        this.bitrateWeightProductSum = d5 + (j4 * d6);
        this.weightSum += d6;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public long getBandwidthEstimate() {
        if (this.samples.isEmpty()) {
            return Long.MIN_VALUE;
        }
        return (long) (this.bitrateWeightProductSum / this.weightSum);
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public void reset() {
        this.samples.clear();
        this.bitrateWeightProductSum = AudioStats.AUDIO_AMPLITUDE_NONE;
        this.weightSum = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    static SampleEvictionFunction getAgeBasedEvictionFunction(final long j2, final Clock clock) {
        return new SampleEvictionFunction() { // from class: androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic$$ExternalSyntheticLambda0
            @Override // androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction
            public final boolean shouldEvictSample(Deque deque) {
                return SlidingWeightedAverageBandwidthStatistic.lambda$getAgeBasedEvictionFunction$0(j2, clock, deque);
            }
        };
    }

    public SlidingWeightedAverageBandwidthStatistic(SampleEvictionFunction sampleEvictionFunction) {
        this(sampleEvictionFunction, Clock.DEFAULT);
    }

    public SlidingWeightedAverageBandwidthStatistic() {
        this(getMaxCountEvictionFunction(10L));
    }
}
