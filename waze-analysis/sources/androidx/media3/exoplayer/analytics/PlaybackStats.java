package androidx.media3.exoplayer.analytics;

import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import j$.util.DesugarCollections;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PlaybackStats {
    public static final PlaybackStats EMPTY = merge(new PlaybackStats[0]);
    public static final int PLAYBACK_STATE_ABANDONED = 15;
    public static final int PLAYBACK_STATE_BUFFERING = 6;
    static final int PLAYBACK_STATE_COUNT = 16;
    public static final int PLAYBACK_STATE_ENDED = 11;
    public static final int PLAYBACK_STATE_FAILED = 13;
    public static final int PLAYBACK_STATE_INTERRUPTED_BY_AD = 14;
    public static final int PLAYBACK_STATE_JOINING_BACKGROUND = 1;
    public static final int PLAYBACK_STATE_JOINING_FOREGROUND = 2;
    public static final int PLAYBACK_STATE_NOT_STARTED = 0;
    public static final int PLAYBACK_STATE_PAUSED = 4;
    public static final int PLAYBACK_STATE_PAUSED_BUFFERING = 7;
    public static final int PLAYBACK_STATE_PLAYING = 3;
    public static final int PLAYBACK_STATE_SEEKING = 5;
    public static final int PLAYBACK_STATE_STOPPED = 12;
    public static final int PLAYBACK_STATE_SUPPRESSED = 9;
    public static final int PLAYBACK_STATE_SUPPRESSED_BUFFERING = 10;
    public final int abandonedBeforeReadyCount;
    public final int adPlaybackCount;
    public final List<EventTimeAndFormat> audioFormatHistory;
    public final int backgroundJoiningCount;
    public final int endedCount;
    public final int fatalErrorCount;
    public final List<EventTimeAndException> fatalErrorHistory;
    public final int fatalErrorPlaybackCount;
    public final long firstReportedTimeMs;
    public final int foregroundPlaybackCount;
    public final int initialAudioFormatBitrateCount;
    public final int initialVideoFormatBitrateCount;
    public final int initialVideoFormatHeightCount;
    public final long maxRebufferTimeMs;
    public final List<long[]> mediaTimeHistory;
    public final int nonFatalErrorCount;
    public final List<EventTimeAndException> nonFatalErrorHistory;
    public final int playbackCount;
    private final long[] playbackStateDurationsMs;
    public final List<EventTimeAndPlaybackState> playbackStateHistory;
    public final long totalAudioFormatBitrateTimeProduct;
    public final long totalAudioFormatTimeMs;
    public final long totalAudioUnderruns;
    public final long totalBandwidthBytes;
    public final long totalBandwidthTimeMs;
    public final long totalDroppedFrames;
    public final long totalInitialAudioFormatBitrate;
    public final long totalInitialVideoFormatBitrate;
    public final int totalInitialVideoFormatHeight;
    public final int totalPauseBufferCount;
    public final int totalPauseCount;
    public final int totalRebufferCount;
    public final int totalSeekCount;
    public final long totalValidJoinTimeMs;
    public final long totalVideoFormatBitrateTimeMs;
    public final long totalVideoFormatBitrateTimeProduct;
    public final long totalVideoFormatHeightTimeMs;
    public final long totalVideoFormatHeightTimeProduct;
    public final int validJoinTimeCount;
    public final List<EventTimeAndFormat> videoFormatHistory;

    /* compiled from: WazeSource */
    public final class EventTimeAndException {
        public final AnalyticsListener.EventTime eventTime;
        public final Exception exception;

        public EventTimeAndException(AnalyticsListener.EventTime eventTime, Exception exc) {
            this.eventTime = eventTime;
            this.exception = exc;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            EventTimeAndException eventTimeAndException = (EventTimeAndException) obj;
            if (this.eventTime.equals(eventTimeAndException.eventTime)) {
                return this.exception.equals(eventTimeAndException.exception);
            }
            return false;
        }

        public int hashCode() {
            return (this.eventTime.hashCode() * 31) + this.exception.hashCode();
        }
    }

    /* compiled from: WazeSource */
    public final class EventTimeAndFormat {
        public final AnalyticsListener.EventTime eventTime;
        public final Format format;

        public EventTimeAndFormat(AnalyticsListener.EventTime eventTime, Format format) {
            this.eventTime = eventTime;
            this.format = format;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            EventTimeAndFormat eventTimeAndFormat = (EventTimeAndFormat) obj;
            if (!this.eventTime.equals(eventTimeAndFormat.eventTime)) {
                return false;
            }
            Format format = this.format;
            return format != null ? format.equals(eventTimeAndFormat.format) : eventTimeAndFormat.format == null;
        }

        public int hashCode() {
            int iHashCode = this.eventTime.hashCode() * 31;
            Format format = this.format;
            return iHashCode + (format != null ? format.hashCode() : 0);
        }
    }

    /* compiled from: WazeSource */
    public final class EventTimeAndPlaybackState {
        public final AnalyticsListener.EventTime eventTime;
        public final int playbackState;

        public EventTimeAndPlaybackState(AnalyticsListener.EventTime eventTime, int i2) {
            this.eventTime = eventTime;
            this.playbackState = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            EventTimeAndPlaybackState eventTimeAndPlaybackState = (EventTimeAndPlaybackState) obj;
            if (this.playbackState != eventTimeAndPlaybackState.playbackState) {
                return false;
            }
            return this.eventTime.equals(eventTimeAndPlaybackState.eventTime);
        }

        public int hashCode() {
            return (this.eventTime.hashCode() * 31) + this.playbackState;
        }
    }

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @interface PlaybackState {
    }

    PlaybackStats(int i2, long[] jArr, List<EventTimeAndPlaybackState> list, List<long[]> list2, long j2, int i3, int i4, int i5, int i6, long j3, int i7, int i8, int i9, int i10, int i11, long j4, int i12, List<EventTimeAndFormat> list3, List<EventTimeAndFormat> list4, long j5, long j6, long j7, long j8, long j9, long j10, int i13, int i14, int i15, long j11, int i16, long j12, long j13, long j14, long j15, long j16, int i17, int i18, int i19, List<EventTimeAndException> list5, List<EventTimeAndException> list6) {
        this.playbackCount = i2;
        this.playbackStateDurationsMs = jArr;
        this.playbackStateHistory = DesugarCollections.unmodifiableList(list);
        this.mediaTimeHistory = DesugarCollections.unmodifiableList(list2);
        this.firstReportedTimeMs = j2;
        this.foregroundPlaybackCount = i3;
        this.abandonedBeforeReadyCount = i4;
        this.endedCount = i5;
        this.backgroundJoiningCount = i6;
        this.totalValidJoinTimeMs = j3;
        this.validJoinTimeCount = i7;
        this.totalPauseCount = i8;
        this.totalPauseBufferCount = i9;
        this.totalSeekCount = i10;
        this.totalRebufferCount = i11;
        this.maxRebufferTimeMs = j4;
        this.adPlaybackCount = i12;
        this.videoFormatHistory = DesugarCollections.unmodifiableList(list3);
        this.audioFormatHistory = DesugarCollections.unmodifiableList(list4);
        this.totalVideoFormatHeightTimeMs = j5;
        this.totalVideoFormatHeightTimeProduct = j6;
        this.totalVideoFormatBitrateTimeMs = j7;
        this.totalVideoFormatBitrateTimeProduct = j8;
        this.totalAudioFormatTimeMs = j9;
        this.totalAudioFormatBitrateTimeProduct = j10;
        this.initialVideoFormatHeightCount = i13;
        this.initialVideoFormatBitrateCount = i14;
        this.totalInitialVideoFormatHeight = i15;
        this.totalInitialVideoFormatBitrate = j11;
        this.initialAudioFormatBitrateCount = i16;
        this.totalInitialAudioFormatBitrate = j12;
        this.totalBandwidthTimeMs = j13;
        this.totalBandwidthBytes = j14;
        this.totalDroppedFrames = j15;
        this.totalAudioUnderruns = j16;
        this.fatalErrorPlaybackCount = i17;
        this.fatalErrorCount = i18;
        this.nonFatalErrorCount = i19;
        this.fatalErrorHistory = DesugarCollections.unmodifiableList(list5);
        this.nonFatalErrorHistory = DesugarCollections.unmodifiableList(list6);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.media3.exoplayer.analytics.PlaybackStats merge(androidx.media3.exoplayer.analytics.PlaybackStats... r67) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.analytics.PlaybackStats.merge(androidx.media3.exoplayer.analytics.PlaybackStats[]):androidx.media3.exoplayer.analytics.PlaybackStats");
    }

    public float getAbandonedBeforeReadyRatio() {
        int i2 = this.foregroundPlaybackCount;
        if (i2 == 0) {
            return 0.0f;
        }
        return (this.abandonedBeforeReadyCount - (this.playbackCount - i2)) / i2;
    }

    public float getAudioUnderrunRate() {
        long totalPlayTimeMs = getTotalPlayTimeMs();
        if (totalPlayTimeMs == 0) {
            return 0.0f;
        }
        return (this.totalAudioUnderruns * 1000.0f) / totalPlayTimeMs;
    }

    public float getDroppedFramesRate() {
        long totalPlayTimeMs = getTotalPlayTimeMs();
        if (totalPlayTimeMs == 0) {
            return 0.0f;
        }
        return (this.totalDroppedFrames * 1000.0f) / totalPlayTimeMs;
    }

    public float getEndedRatio() {
        int i2 = this.foregroundPlaybackCount;
        if (i2 == 0) {
            return 0.0f;
        }
        return this.endedCount / i2;
    }

    public float getFatalErrorRate() {
        long totalPlayTimeMs = getTotalPlayTimeMs();
        if (totalPlayTimeMs == 0) {
            return 0.0f;
        }
        return (this.fatalErrorCount * 1000.0f) / totalPlayTimeMs;
    }

    public float getFatalErrorRatio() {
        int i2 = this.foregroundPlaybackCount;
        if (i2 == 0) {
            return 0.0f;
        }
        return this.fatalErrorPlaybackCount / i2;
    }

    public float getJoinTimeRatio() {
        long totalPlayAndWaitTimeMs = getTotalPlayAndWaitTimeMs();
        if (totalPlayAndWaitTimeMs == 0) {
            return 0.0f;
        }
        return getTotalJoinTimeMs() / totalPlayAndWaitTimeMs;
    }

    public int getMeanAudioFormatBitrate() {
        long j2 = this.totalAudioFormatTimeMs;
        if (j2 == 0) {
            return -1;
        }
        return (int) (this.totalAudioFormatBitrateTimeProduct / j2);
    }

    public int getMeanBandwidth() {
        long j2 = this.totalBandwidthTimeMs;
        if (j2 == 0) {
            return -1;
        }
        return (int) ((this.totalBandwidthBytes * 8000) / j2);
    }

    public long getMeanElapsedTimeMs() {
        return this.playbackCount == 0 ? C.TIME_UNSET : getTotalElapsedTimeMs() / this.playbackCount;
    }

    public int getMeanInitialAudioFormatBitrate() {
        int i2 = this.initialAudioFormatBitrateCount;
        if (i2 == 0) {
            return -1;
        }
        return (int) (this.totalInitialAudioFormatBitrate / i2);
    }

    public int getMeanInitialVideoFormatBitrate() {
        int i2 = this.initialVideoFormatBitrateCount;
        if (i2 == 0) {
            return -1;
        }
        return (int) (this.totalInitialVideoFormatBitrate / i2);
    }

    public int getMeanInitialVideoFormatHeight() {
        int i2 = this.initialVideoFormatHeightCount;
        if (i2 == 0) {
            return -1;
        }
        return this.totalInitialVideoFormatHeight / i2;
    }

    public long getMeanJoinTimeMs() {
        int i2 = this.validJoinTimeCount;
        return i2 == 0 ? C.TIME_UNSET : this.totalValidJoinTimeMs / i2;
    }

    public float getMeanNonFatalErrorCount() {
        int i2 = this.foregroundPlaybackCount;
        if (i2 == 0) {
            return 0.0f;
        }
        return this.nonFatalErrorCount / i2;
    }

    public float getMeanPauseBufferCount() {
        int i2 = this.foregroundPlaybackCount;
        if (i2 == 0) {
            return 0.0f;
        }
        return this.totalPauseBufferCount / i2;
    }

    public float getMeanPauseCount() {
        int i2 = this.foregroundPlaybackCount;
        if (i2 == 0) {
            return 0.0f;
        }
        return this.totalPauseCount / i2;
    }

    public long getMeanPausedTimeMs() {
        return this.foregroundPlaybackCount == 0 ? C.TIME_UNSET : getTotalPausedTimeMs() / this.foregroundPlaybackCount;
    }

    public long getMeanPlayAndWaitTimeMs() {
        return this.foregroundPlaybackCount == 0 ? C.TIME_UNSET : getTotalPlayAndWaitTimeMs() / this.foregroundPlaybackCount;
    }

    public long getMeanPlayTimeMs() {
        return this.foregroundPlaybackCount == 0 ? C.TIME_UNSET : getTotalPlayTimeMs() / this.foregroundPlaybackCount;
    }

    public float getMeanRebufferCount() {
        int i2 = this.foregroundPlaybackCount;
        if (i2 == 0) {
            return 0.0f;
        }
        return this.totalRebufferCount / i2;
    }

    public long getMeanRebufferTimeMs() {
        return this.foregroundPlaybackCount == 0 ? C.TIME_UNSET : getTotalRebufferTimeMs() / this.foregroundPlaybackCount;
    }

    public float getMeanSeekCount() {
        int i2 = this.foregroundPlaybackCount;
        if (i2 == 0) {
            return 0.0f;
        }
        return this.totalSeekCount / i2;
    }

    public long getMeanSeekTimeMs() {
        return this.foregroundPlaybackCount == 0 ? C.TIME_UNSET : getTotalSeekTimeMs() / this.foregroundPlaybackCount;
    }

    public long getMeanSingleRebufferTimeMs() {
        return this.totalRebufferCount == 0 ? C.TIME_UNSET : (getPlaybackStateDurationMs(6) + getPlaybackStateDurationMs(7)) / this.totalRebufferCount;
    }

    public long getMeanSingleSeekTimeMs() {
        return this.totalSeekCount == 0 ? C.TIME_UNSET : getTotalSeekTimeMs() / this.totalSeekCount;
    }

    public float getMeanTimeBetweenFatalErrors() {
        return 1.0f / getFatalErrorRate();
    }

    public float getMeanTimeBetweenNonFatalErrors() {
        return 1.0f / getNonFatalErrorRate();
    }

    public float getMeanTimeBetweenRebuffers() {
        return 1.0f / getRebufferRate();
    }

    public int getMeanVideoFormatBitrate() {
        long j2 = this.totalVideoFormatBitrateTimeMs;
        if (j2 == 0) {
            return -1;
        }
        return (int) (this.totalVideoFormatBitrateTimeProduct / j2);
    }

    public int getMeanVideoFormatHeight() {
        long j2 = this.totalVideoFormatHeightTimeMs;
        if (j2 == 0) {
            return -1;
        }
        return (int) (this.totalVideoFormatHeightTimeProduct / j2);
    }

    public long getMeanWaitTimeMs() {
        return this.foregroundPlaybackCount == 0 ? C.TIME_UNSET : getTotalWaitTimeMs() / this.foregroundPlaybackCount;
    }

    public long getMediaTimeMsAtRealtimeMs(long j2) {
        if (this.mediaTimeHistory.isEmpty()) {
            return C.TIME_UNSET;
        }
        int i2 = 0;
        while (i2 < this.mediaTimeHistory.size() && this.mediaTimeHistory.get(i2)[0] <= j2) {
            i2++;
        }
        List<long[]> list = this.mediaTimeHistory;
        if (i2 == 0) {
            return list.get(0)[1];
        }
        int size = list.size();
        List<long[]> list2 = this.mediaTimeHistory;
        if (i2 == size) {
            return list2.get(list2.size() - 1)[1];
        }
        int i3 = i2 - 1;
        long j3 = list2.get(i3)[0];
        long j4 = this.mediaTimeHistory.get(i3)[1];
        long j5 = this.mediaTimeHistory.get(i2)[0] - j3;
        return j5 == 0 ? j4 : j4 + ((long) ((this.mediaTimeHistory.get(i2)[1] - j4) * ((j2 - j3) / j5)));
    }

    public float getNonFatalErrorRate() {
        long totalPlayTimeMs = getTotalPlayTimeMs();
        if (totalPlayTimeMs == 0) {
            return 0.0f;
        }
        return (this.nonFatalErrorCount * 1000.0f) / totalPlayTimeMs;
    }

    public int getPlaybackStateAtTime(long j2) {
        int i2 = 0;
        for (EventTimeAndPlaybackState eventTimeAndPlaybackState : this.playbackStateHistory) {
            if (eventTimeAndPlaybackState.eventTime.realtimeMs > j2) {
                break;
            }
            i2 = eventTimeAndPlaybackState.playbackState;
        }
        return i2;
    }

    public long getPlaybackStateDurationMs(int i2) {
        return this.playbackStateDurationsMs[i2];
    }

    public float getRebufferRate() {
        long totalPlayTimeMs = getTotalPlayTimeMs();
        if (totalPlayTimeMs == 0) {
            return 0.0f;
        }
        return (this.totalRebufferCount * 1000.0f) / totalPlayTimeMs;
    }

    public float getRebufferTimeRatio() {
        long totalPlayAndWaitTimeMs = getTotalPlayAndWaitTimeMs();
        if (totalPlayAndWaitTimeMs == 0) {
            return 0.0f;
        }
        return getTotalRebufferTimeMs() / totalPlayAndWaitTimeMs;
    }

    public float getSeekTimeRatio() {
        long totalPlayAndWaitTimeMs = getTotalPlayAndWaitTimeMs();
        if (totalPlayAndWaitTimeMs == 0) {
            return 0.0f;
        }
        return getTotalSeekTimeMs() / totalPlayAndWaitTimeMs;
    }

    public long getTotalElapsedTimeMs() {
        long j2 = 0;
        for (int i2 = 0; i2 < 16; i2++) {
            j2 += this.playbackStateDurationsMs[i2];
        }
        return j2;
    }

    public long getTotalJoinTimeMs() {
        return getPlaybackStateDurationMs(2);
    }

    public long getTotalPausedTimeMs() {
        return getPlaybackStateDurationMs(4) + getPlaybackStateDurationMs(7);
    }

    public long getTotalPlayAndWaitTimeMs() {
        return getTotalPlayTimeMs() + getTotalWaitTimeMs();
    }

    public long getTotalPlayTimeMs() {
        return getPlaybackStateDurationMs(3);
    }

    public long getTotalRebufferTimeMs() {
        return getPlaybackStateDurationMs(6);
    }

    public long getTotalSeekTimeMs() {
        return getPlaybackStateDurationMs(5);
    }

    public long getTotalWaitTimeMs() {
        return getPlaybackStateDurationMs(2) + getPlaybackStateDurationMs(6) + getPlaybackStateDurationMs(5);
    }

    public float getWaitTimeRatio() {
        long totalPlayAndWaitTimeMs = getTotalPlayAndWaitTimeMs();
        if (totalPlayAndWaitTimeMs == 0) {
            return 0.0f;
        }
        return getTotalWaitTimeMs() / totalPlayAndWaitTimeMs;
    }
}
