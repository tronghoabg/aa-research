package androidx.media3.exoplayer.audio;

import android.media.AudioTrack;
import android.os.Build;
import androidx.media3.common.C;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.Util;
import androidx.media3.muxer.MuxerUtil;
import androidx.work.WorkRequest;
import com.google.d.b.an;
import java.lang.reflect.Method;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class AudioTrackPositionTracker {
    private static final long FORCE_RESET_WORKAROUND_TIMEOUT_MS = 200;
    private static final long MAX_LATENCY_US = 10000000;
    private static final int MAX_PLAYHEAD_OFFSET_COUNT = 10;
    private static final long MAX_POSITION_DRIFT_FOR_SMOOTHING_US = 1000000;
    private static final int MAX_POSITION_SMOOTHING_SPEED_CHANGE_PERCENT = 10;
    private static final int MIN_LATENCY_SAMPLE_INTERVAL_US = 500000;
    private static final int MIN_PLAYHEAD_OFFSET_SAMPLE_INTERVAL_US = 30000;
    private static final long RAW_PLAYBACK_HEAD_POSITION_UPDATE_INTERVAL_MS = 5;
    private AudioTimestampPoller audioTimestampPoller;
    private final AudioTrack audioTrack;
    private float audioTrackPlaybackSpeed;
    private final long bufferSizeUs;
    private final Clock clock;
    private long endPlaybackHeadPosition;
    private boolean expectRawPlaybackHeadReset;
    private long forceResetWorkaroundTimeMs;
    private Method getLatencyMethod;
    private final boolean isOutputPcm;
    private long lastLatencySampleTimeUs;
    private long lastPlayheadSampleTimeUs;
    private long lastPositionUs;
    private long lastRawPlaybackHeadPositionSampleTimeMs;
    private long lastSystemTimeUs;
    private long latencyUs;
    private final Listener listener;
    private int nextPlayheadOffsetIndex;
    private long onPositionAdvancingFromPositionUs;
    private final int outputSampleRate;
    private int playheadOffsetCount;
    private final long[] playheadOffsets;
    private long rawPlaybackHeadPosition;
    private long rawPlaybackHeadWrapCount;
    private long smoothedPlayheadOffsetUs;
    private long stopPlaybackHeadPosition;
    private long stopTimestampUs;
    private long sumRawPlaybackHeadPosition;

    /* compiled from: WazeSource */
    public interface Listener {
        void onInvalidLatency(long j2);

        void onPositionAdvancing(long j2);

        void onPositionFramesMismatch(long j2, long j3, long j4, long j5);

        void onSystemTimeUsMismatch(long j2, long j3, long j4, long j5);
    }

    public AudioTrackPositionTracker(Listener listener, Clock clock, AudioTrack audioTrack, int i2, int i3, int i4) {
        an.B(listener);
        this.listener = listener;
        this.clock = clock;
        this.audioTrack = audioTrack;
        try {
            this.getLatencyMethod = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.playheadOffsets = new long[10];
        this.lastSystemTimeUs = C.TIME_UNSET;
        this.lastPositionUs = C.TIME_UNSET;
        this.audioTimestampPoller = new AudioTimestampPoller(audioTrack, listener);
        int sampleRate = audioTrack.getSampleRate();
        this.outputSampleRate = sampleRate;
        boolean zIsEncodingLinearPcm = Util.isEncodingLinearPcm(i2);
        this.isOutputPcm = zIsEncodingLinearPcm;
        this.bufferSizeUs = zIsEncodingLinearPcm ? Util.sampleCountToDurationUs(i4 / i3, sampleRate) : -9223372036854775807L;
        this.rawPlaybackHeadPosition = 0L;
        this.rawPlaybackHeadWrapCount = 0L;
        this.expectRawPlaybackHeadReset = false;
        this.sumRawPlaybackHeadPosition = 0L;
        this.stopTimestampUs = C.TIME_UNSET;
        this.forceResetWorkaroundTimeMs = C.TIME_UNSET;
        this.lastLatencySampleTimeUs = 0L;
        this.latencyUs = 0L;
        this.audioTrackPlaybackSpeed = 1.0f;
        this.onPositionAdvancingFromPositionUs = C.TIME_UNSET;
    }

    private long getPlaybackHeadPosition() {
        if (this.stopTimestampUs != C.TIME_UNSET) {
            return Math.min(this.endPlaybackHeadPosition, getSimulatedPlaybackHeadPositionAfterStop());
        }
        long jElapsedRealtime = this.clock.elapsedRealtime();
        if (jElapsedRealtime - this.lastRawPlaybackHeadPositionSampleTimeMs >= 5) {
            updateRawPlaybackHeadPosition(jElapsedRealtime);
            this.lastRawPlaybackHeadPositionSampleTimeMs = jElapsedRealtime;
        }
        return this.rawPlaybackHeadPosition + this.sumRawPlaybackHeadPosition + (this.rawPlaybackHeadWrapCount << 32);
    }

    private long getPlaybackHeadPositionEstimateUs(long j2) {
        long jMax = Math.max(0L, (this.playheadOffsetCount == 0 ? this.stopTimestampUs != C.TIME_UNSET ? Util.sampleCountToDurationUs(getSimulatedPlaybackHeadPositionAfterStop(), this.outputSampleRate) : getPlaybackHeadPositionUs() : Util.getMediaDurationForPlayoutDuration(j2 + this.smoothedPlayheadOffsetUs, this.audioTrackPlaybackSpeed)) - this.latencyUs);
        return this.stopTimestampUs != C.TIME_UNSET ? Math.min(Util.sampleCountToDurationUs(this.endPlaybackHeadPosition, this.outputSampleRate), jMax) : jMax;
    }

    private long getPlaybackHeadPositionUs() {
        return Util.sampleCountToDurationUs(getPlaybackHeadPosition(), this.outputSampleRate);
    }

    private long getSimulatedPlaybackHeadPositionAfterStop() {
        AudioTrack audioTrack = this.audioTrack;
        an.B(audioTrack);
        if (audioTrack.getPlayState() == 2) {
            return this.stopPlaybackHeadPosition;
        }
        return this.stopPlaybackHeadPosition + Util.durationUsToSampleCount(Util.getMediaDurationForPlayoutDuration(Util.msToUs(this.clock.elapsedRealtime()) - this.stopTimestampUs, this.audioTrackPlaybackSpeed), this.outputSampleRate);
    }

    private void maybeSampleSyncParams() {
        long jNanoTime = this.clock.nanoTime() / 1000;
        if (jNanoTime - this.lastPlayheadSampleTimeUs >= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
            long playbackHeadPositionUs = getPlaybackHeadPositionUs();
            if (playbackHeadPositionUs != 0) {
                this.playheadOffsets[this.nextPlayheadOffsetIndex] = Util.getPlayoutDurationForMediaDuration(playbackHeadPositionUs, this.audioTrackPlaybackSpeed) - jNanoTime;
                this.nextPlayheadOffsetIndex = (this.nextPlayheadOffsetIndex + 1) % 10;
                int i2 = this.playheadOffsetCount;
                if (i2 < 10) {
                    this.playheadOffsetCount = i2 + 1;
                }
                this.lastPlayheadSampleTimeUs = jNanoTime;
                this.smoothedPlayheadOffsetUs = 0L;
                int i3 = 0;
                while (true) {
                    int i4 = this.playheadOffsetCount;
                    if (i3 >= i4) {
                        break;
                    }
                    this.smoothedPlayheadOffsetUs += this.playheadOffsets[i3] / i4;
                    i3++;
                }
            } else {
                return;
            }
        }
        this.audioTimestampPoller.maybePollTimestamp(jNanoTime, this.audioTrackPlaybackSpeed, getPlaybackHeadPositionEstimateUs(jNanoTime), maybeUpdateLatency(jNanoTime));
    }

    private void maybeTriggerOnPositionAdvancingCallback(long j2) {
        long j3 = this.onPositionAdvancingFromPositionUs;
        if (j3 == C.TIME_UNSET || j2 < j3) {
            return;
        }
        long playoutDurationForMediaDuration = Util.getPlayoutDurationForMediaDuration(j2 - j3, this.audioTrackPlaybackSpeed);
        Clock clock = this.clock;
        long jCurrentTimeMillis = clock.currentTimeMillis() - Util.usToMs(playoutDurationForMediaDuration);
        this.onPositionAdvancingFromPositionUs = C.TIME_UNSET;
        this.listener.onPositionAdvancing(jCurrentTimeMillis);
    }

    private boolean maybeUpdateLatency(long j2) {
        Method method;
        boolean z = this.isOutputPcm;
        long j3 = this.latencyUs;
        if (z && (method = this.getLatencyMethod) != null && j2 - this.lastLatencySampleTimeUs >= 500000) {
            try {
                AudioTrack audioTrack = this.audioTrack;
                an.B(audioTrack);
                Integer num = (Integer) method.invoke(audioTrack, null);
                int i2 = Util.SDK_INT;
                long jIntValue = (num.intValue() * 1000) - this.bufferSizeUs;
                this.latencyUs = jIntValue;
                long jMax = Math.max(jIntValue, 0L);
                this.latencyUs = jMax;
                if (jMax > MAX_LATENCY_US) {
                    this.listener.onInvalidLatency(jMax);
                    this.latencyUs = 0L;
                }
            } catch (Exception unused) {
                this.getLatencyMethod = null;
            }
            this.lastLatencySampleTimeUs = j2;
        }
        return j3 != this.latencyUs;
    }

    private void resetSyncParams() {
        this.smoothedPlayheadOffsetUs = 0L;
        this.playheadOffsetCount = 0;
        this.nextPlayheadOffsetIndex = 0;
        this.lastPlayheadSampleTimeUs = 0L;
        this.lastPositionUs = C.TIME_UNSET;
        this.lastSystemTimeUs = C.TIME_UNSET;
    }

    private void updateRawPlaybackHeadPosition(long j2) {
        AudioTrack audioTrack = this.audioTrack;
        an.B(audioTrack);
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return;
        }
        long playbackHeadPosition = audioTrack.getPlaybackHeadPosition();
        int i2 = Build.VERSION.SDK_INT;
        long j3 = playbackHeadPosition & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        if (i2 <= 29) {
            if (j3 == 0 && this.rawPlaybackHeadPosition > 0 && playState == 3) {
                if (this.forceResetWorkaroundTimeMs == C.TIME_UNSET) {
                    this.forceResetWorkaroundTimeMs = j2;
                    return;
                }
                return;
            }
            this.forceResetWorkaroundTimeMs = C.TIME_UNSET;
        }
        long j4 = this.rawPlaybackHeadPosition;
        if (j4 > j3) {
            if (this.expectRawPlaybackHeadReset) {
                this.sumRawPlaybackHeadPosition += j4;
                this.expectRawPlaybackHeadReset = false;
            } else {
                this.rawPlaybackHeadWrapCount++;
            }
        }
        this.rawPlaybackHeadPosition = j3;
    }

    public void expectRawPlaybackHeadReset() {
        this.expectRawPlaybackHeadReset = true;
        this.audioTimestampPoller.expectTimestampFramePositionReset();
    }

    public long getCurrentPositionUs(long j2) {
        AudioTrack audioTrack = this.audioTrack;
        an.B(audioTrack);
        if (audioTrack.getPlayState() == 3) {
            maybeSampleSyncParams();
        }
        long jNanoTime = this.clock.nanoTime() / 1000;
        boolean zHasAdvancingTimestamp = this.audioTimestampPoller.hasAdvancingTimestamp();
        long timestampPositionUs = zHasAdvancingTimestamp ? this.audioTimestampPoller.getTimestampPositionUs(jNanoTime, this.audioTrackPlaybackSpeed) : getPlaybackHeadPositionEstimateUs(jNanoTime);
        long jSampleCountToDurationUs = Util.sampleCountToDurationUs(j2, this.outputSampleRate);
        if (timestampPositionUs >= jSampleCountToDurationUs) {
            resetSyncParams();
            this.audioTimestampPoller.reset();
            return jSampleCountToDurationUs;
        }
        int playState = audioTrack.getPlayState();
        if (playState != 3) {
            if (playState != 1) {
                return timestampPositionUs;
            }
            maybeTriggerOnPositionAdvancingCallback(timestampPositionUs);
            return timestampPositionUs;
        }
        if (zHasAdvancingTimestamp || !this.audioTimestampPoller.isWaitingForAdvancingTimestamp()) {
            maybeTriggerOnPositionAdvancingCallback(timestampPositionUs);
        }
        long j3 = this.lastSystemTimeUs;
        if (j3 != C.TIME_UNSET) {
            long j4 = timestampPositionUs - this.lastPositionUs;
            long mediaDurationForPlayoutDuration = Util.getMediaDurationForPlayoutDuration(jNanoTime - j3, this.audioTrackPlaybackSpeed);
            long j5 = this.lastPositionUs + mediaDurationForPlayoutDuration;
            long jAbs = Math.abs(j5 - timestampPositionUs);
            if (j4 != 0 && jAbs < 1000000) {
                long j6 = (mediaDurationForPlayoutDuration * 10) / 100;
                timestampPositionUs = Util.constrainValue(timestampPositionUs, j5 - j6, j5 + j6);
            }
        }
        this.lastSystemTimeUs = jNanoTime;
        this.lastPositionUs = timestampPositionUs;
        return timestampPositionUs;
    }

    public void handleEndOfStream(long j2) {
        this.stopPlaybackHeadPosition = getPlaybackHeadPosition();
        this.stopTimestampUs = Util.msToUs(this.clock.elapsedRealtime());
        this.endPlaybackHeadPosition = j2;
    }

    public boolean isPlaying() {
        AudioTrack audioTrack = this.audioTrack;
        an.B(audioTrack);
        return audioTrack.getPlayState() == 3;
    }

    public boolean isStalled(long j2) {
        return this.forceResetWorkaroundTimeMs != C.TIME_UNSET && j2 > 0 && this.clock.elapsedRealtime() - this.forceResetWorkaroundTimeMs >= FORCE_RESET_WORKAROUND_TIMEOUT_MS;
    }

    public void pause() {
        resetSyncParams();
        if (this.stopTimestampUs == C.TIME_UNSET) {
            this.audioTimestampPoller.reset();
        }
        this.stopPlaybackHeadPosition = getPlaybackHeadPosition();
    }

    public void reset() {
        resetSyncParams();
        this.audioTimestampPoller = new AudioTimestampPoller(this.audioTrack, this.listener);
        this.rawPlaybackHeadPosition = 0L;
        this.rawPlaybackHeadWrapCount = 0L;
        this.expectRawPlaybackHeadReset = false;
        this.sumRawPlaybackHeadPosition = 0L;
        this.stopTimestampUs = C.TIME_UNSET;
        this.forceResetWorkaroundTimeMs = C.TIME_UNSET;
        this.lastLatencySampleTimeUs = 0L;
        this.latencyUs = 0L;
        this.audioTrackPlaybackSpeed = 1.0f;
        this.onPositionAdvancingFromPositionUs = C.TIME_UNSET;
    }

    public void setAudioTrackPlaybackSpeed(float f2) {
        this.audioTrackPlaybackSpeed = f2;
        this.audioTimestampPoller.reset();
        resetSyncParams();
    }

    public void start() {
        if (this.stopTimestampUs != C.TIME_UNSET) {
            this.stopTimestampUs = Util.msToUs(this.clock.elapsedRealtime());
        }
        this.onPositionAdvancingFromPositionUs = getPlaybackHeadPositionUs();
        this.audioTimestampPoller.reset();
    }
}
