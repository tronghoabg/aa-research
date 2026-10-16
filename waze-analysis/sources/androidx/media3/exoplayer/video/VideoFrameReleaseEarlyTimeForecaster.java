package androidx.media3.exoplayer.video;

import android.util.Range;
import androidx.camera.video.AudioStats;
import androidx.media3.common.C;
import com.google.d.b.an;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
class VideoFrameReleaseEarlyTimeForecaster {
    private static final float SMOOTHING_FACTOR = 0.2f;
    private double derivativeOfEarlyTime;
    private Range<Double> derivativeOfEarlyTimeRange;
    private long lastFrameEarlyUs;
    private long lastFramePresentationTimeUs;

    public VideoFrameReleaseEarlyTimeForecaster(float f2) {
        an.l(f2 > 0.0f);
        Range<Double> range = new Range<>(Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE), Double.valueOf(1.0d / f2));
        this.derivativeOfEarlyTimeRange = range;
        this.derivativeOfEarlyTime = ((Double) range.getUpper()).doubleValue();
        this.lastFramePresentationTimeUs = C.TIME_UNSET;
        this.lastFrameEarlyUs = C.TIME_UNSET;
    }

    private double calculateDerivativeFromLastFrame(long j2, long j3) {
        long j4 = this.lastFramePresentationTimeUs;
        if (j4 != C.TIME_UNSET) {
            if (this.lastFrameEarlyUs != C.TIME_UNSET && j2 != j4) {
                return (j3 - r4) / (j2 - j4);
            }
        }
        return ((Double) this.derivativeOfEarlyTimeRange.getUpper()).doubleValue();
    }

    private void updateDerivativeWithExponentialMovingAverage(double d2) {
        this.derivativeOfEarlyTime = (this.derivativeOfEarlyTime * 0.800000011920929d) + (d2 * 0.20000000298023224d);
    }

    public void onVideoFrameProcessed(long j2, long j3) {
        an.l(j2 != C.TIME_UNSET);
        an.l(j3 != C.TIME_UNSET);
        updateDerivativeWithExponentialMovingAverage(((Double) this.derivativeOfEarlyTimeRange.clamp(Double.valueOf(calculateDerivativeFromLastFrame(j2, j3)))).doubleValue());
        this.lastFramePresentationTimeUs = j2;
        this.lastFrameEarlyUs = j3;
    }

    public long predictEarlyUs(long j2) {
        long j3 = this.lastFramePresentationTimeUs;
        if (j3 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        return (long) (this.lastFrameEarlyUs + ((j2 - j3) * this.derivativeOfEarlyTime));
    }

    public void reset() {
        this.derivativeOfEarlyTime = ((Double) this.derivativeOfEarlyTimeRange.getUpper()).doubleValue();
        this.lastFramePresentationTimeUs = C.TIME_UNSET;
        this.lastFrameEarlyUs = C.TIME_UNSET;
    }

    public void setPlaybackSpeed(float f2) {
        an.l(f2 > 0.0f);
        this.derivativeOfEarlyTimeRange = new Range<>(Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE), Double.valueOf(1.0d / f2));
        reset();
    }
}
