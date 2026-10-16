package androidx.media3.exoplayer.audio;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import androidx.media3.common.C;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.audio.AudioTrackPositionTracker;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class AudioTimestampPoller {
    private static final int ERROR_POLL_INTERVAL_US = 500000;
    private static final int FAST_POLL_INTERVAL_US = 10000;
    private static final int INITIALIZING_DURATION_US = 500000;
    private static final long MAX_AUDIO_TIMESTAMP_OFFSET_US = 5000000;
    private static final long MAX_POSITION_DRIFT_ADVANCING_TIMESTAMP_US = 1000;
    private static final int SLOW_POLL_INTERVAL_US = 10000000;
    private static final int STATE_ERROR = 4;
    private static final int STATE_INITIALIZING = 0;
    private static final int STATE_NO_TIMESTAMP = 3;
    private static final int STATE_TIMESTAMP = 1;
    private static final int STATE_TIMESTAMP_ADVANCING = 2;
    private static final int WAIT_FOR_ADVANCE_DURATION_US = 2000000;
    private final AudioTimestampWrapper audioTimestamp;
    private final AudioTrackPositionTracker.Listener errorListener;
    private long initialTimestampPositionFrames;
    private long initialTimestampSystemTimeUs;
    private long initializeSystemTimeUs;
    private long lastTimestampSampleTimeUs;
    private long sampleIntervalUs;
    private final int sampleRate;
    private int state;

    /* compiled from: WazeSource */
    final class AudioTimestampWrapper {
        private long accumulatedRawTimestampFramePosition;
        private final AudioTimestamp audioTimestamp = new AudioTimestamp();
        private final AudioTrack audioTrack;
        private boolean expectTimestampFramePositionReset;
        private long lastTimestampPositionFrames;
        private long lastTimestampRawPositionFrames;
        private long rawTimestampFramePositionWrapCount;

        public AudioTimestampWrapper(AudioTrack audioTrack) {
            this.audioTrack = audioTrack;
        }

        public void expectTimestampFramePositionReset() {
            this.expectTimestampFramePositionReset = true;
        }

        public long getTimestampPositionFrames() {
            return this.lastTimestampPositionFrames;
        }

        public long getTimestampSystemTimeUs() {
            return this.audioTimestamp.nanoTime / 1000;
        }

        public boolean maybeUpdateTimestamp() {
            boolean timestamp = this.audioTrack.getTimestamp(this.audioTimestamp);
            if (timestamp) {
                long j2 = this.audioTimestamp.framePosition;
                long j3 = this.lastTimestampRawPositionFrames;
                if (j3 > j2) {
                    if (this.expectTimestampFramePositionReset) {
                        this.accumulatedRawTimestampFramePosition += j3;
                        this.expectTimestampFramePositionReset = false;
                    } else {
                        this.rawTimestampFramePositionWrapCount++;
                    }
                }
                this.lastTimestampRawPositionFrames = j2;
                this.lastTimestampPositionFrames = j2 + this.accumulatedRawTimestampFramePosition + (this.rawTimestampFramePositionWrapCount << 32);
            }
            return timestamp;
        }
    }

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @interface State {
    }

    public AudioTimestampPoller(AudioTrack audioTrack, AudioTrackPositionTracker.Listener listener) {
        this.audioTimestamp = new AudioTimestampWrapper(audioTrack);
        this.sampleRate = audioTrack.getSampleRate();
        this.errorListener = listener;
        reset();
    }

    private void checkTimestampIsPlausibleAndUpdateErrorState(long j2, float f2, long j3) {
        long timestampSystemTimeUs = this.audioTimestamp.getTimestampSystemTimeUs();
        long jComputeTimestampPositionUs = computeTimestampPositionUs(j2, f2);
        if (Math.abs(timestampSystemTimeUs - j2) > MAX_AUDIO_TIMESTAMP_OFFSET_US) {
            this.errorListener.onSystemTimeUsMismatch(this.audioTimestamp.getTimestampPositionFrames(), timestampSystemTimeUs, j2, j3);
            updateState(4);
        } else if (Math.abs(jComputeTimestampPositionUs - j3) > MAX_AUDIO_TIMESTAMP_OFFSET_US) {
            this.errorListener.onPositionFramesMismatch(this.audioTimestamp.getTimestampPositionFrames(), timestampSystemTimeUs, j2, j3);
            updateState(4);
        } else if (this.state == 4) {
            reset();
        }
    }

    private long computeTimestampPositionUs(long j2, float f2) {
        AudioTimestampWrapper audioTimestampWrapper = this.audioTimestamp;
        return computeTimestampPositionUs(audioTimestampWrapper.getTimestampPositionFrames(), audioTimestampWrapper.getTimestampSystemTimeUs(), j2, f2);
    }

    private boolean isTimestampAdvancingFromInitialTimestamp(long j2, float f2) {
        long timestampPositionFrames = this.audioTimestamp.getTimestampPositionFrames();
        long j3 = this.initialTimestampPositionFrames;
        if (timestampPositionFrames <= j3) {
            return false;
        }
        return Math.abs(computeTimestampPositionUs(j2, f2) - computeTimestampPositionUs(j3, this.initialTimestampSystemTimeUs, j2, f2)) < 1000;
    }

    private void updateState(int i2) {
        this.state = i2;
        if (i2 == 0) {
            this.lastTimestampSampleTimeUs = 0L;
            this.initialTimestampPositionFrames = -1L;
            this.initialTimestampSystemTimeUs = C.TIME_UNSET;
            this.initializeSystemTimeUs = System.nanoTime() / 1000;
            this.sampleIntervalUs = 10000L;
            return;
        }
        if (i2 == 1) {
            this.sampleIntervalUs = 10000L;
            return;
        }
        if (i2 == 2 || i2 == 3) {
            this.sampleIntervalUs = 10000000L;
        } else {
            if (i2 != 4) {
                throw new IllegalStateException();
            }
            this.sampleIntervalUs = 500000L;
        }
    }

    public void expectTimestampFramePositionReset() {
        this.audioTimestamp.expectTimestampFramePositionReset();
    }

    public long getTimestampPositionUs(long j2, float f2) {
        return computeTimestampPositionUs(j2, f2);
    }

    public boolean hasAdvancingTimestamp() {
        return this.state == 2;
    }

    public boolean isWaitingForAdvancingTimestamp() {
        int i2 = this.state;
        return i2 == 0 || i2 == 1;
    }

    public void maybePollTimestamp(long j2, float f2, long j3, boolean z) {
        if (z || j2 - this.lastTimestampSampleTimeUs >= this.sampleIntervalUs) {
            this.lastTimestampSampleTimeUs = j2;
            boolean zMaybeUpdateTimestamp = this.audioTimestamp.maybeUpdateTimestamp();
            if (zMaybeUpdateTimestamp) {
                checkTimestampIsPlausibleAndUpdateErrorState(j2, f2, j3);
            }
            int i2 = this.state;
            if (i2 == 0) {
                if (!zMaybeUpdateTimestamp) {
                    if (j2 - this.initializeSystemTimeUs > 500000) {
                        updateState(3);
                        return;
                    }
                    return;
                } else {
                    if (this.audioTimestamp.getTimestampSystemTimeUs() >= this.initializeSystemTimeUs) {
                        this.initialTimestampPositionFrames = this.audioTimestamp.getTimestampPositionFrames();
                        this.initialTimestampSystemTimeUs = this.audioTimestamp.getTimestampSystemTimeUs();
                        updateState(1);
                        return;
                    }
                    return;
                }
            }
            if (i2 == 1) {
                if (!zMaybeUpdateTimestamp) {
                    reset();
                    return;
                }
                if (isTimestampAdvancingFromInitialTimestamp(j2, f2)) {
                    updateState(2);
                    return;
                } else if (j2 - this.initializeSystemTimeUs > SilenceSkippingAudioProcessor.DEFAULT_MAX_SILENCE_TO_KEEP_DURATION_US) {
                    updateState(3);
                    return;
                } else {
                    this.initialTimestampPositionFrames = this.audioTimestamp.getTimestampPositionFrames();
                    this.initialTimestampSystemTimeUs = this.audioTimestamp.getTimestampSystemTimeUs();
                    return;
                }
            }
            if (i2 == 2) {
                if (zMaybeUpdateTimestamp) {
                    return;
                }
                reset();
            } else if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException();
                }
            } else if (zMaybeUpdateTimestamp) {
                reset();
            }
        }
    }

    public void reset() {
        updateState(0);
    }

    private long computeTimestampPositionUs(long j2, long j3, long j4, float f2) {
        return Util.sampleCountToDurationUs(j2, this.sampleRate) + Util.getMediaDurationForPlayoutDuration(j4 - j3, f2);
    }
}
