package androidx.media3.exoplayer.analytics;

import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.C;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.PlaybackSessionManager;
import androidx.media3.exoplayer.analytics.PlaybackStats;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.drm.KeyRequestInfo;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSource;
import com.google.d.b.an;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PlaybackStatsListener implements AnalyticsListener, PlaybackSessionManager.Listener {
    private Format audioFormat;
    private long bandwidthBytes;
    private long bandwidthTimeMs;
    private final Callback callback;
    private long discontinuityFromPositionMs;
    private String discontinuityFromSession;
    private int discontinuityReason;
    private int droppedFrames;
    private PlaybackStats finishedPlaybackStats;
    private final boolean keepHistory;
    private Exception nonFatalException;
    private final Timeline.Period period;
    private final Map<String, PlaybackStatsTracker> playbackStatsTrackers;
    private final PlaybackSessionManager sessionManager;
    private final Map<String, AnalyticsListener.EventTime> sessionStartEventTimes;
    private Format videoFormat;
    private VideoSize videoSize;

    /* compiled from: WazeSource */
    public interface Callback {
        void onPlaybackStatsReady(AnalyticsListener.EventTime eventTime, PlaybackStats playbackStats);
    }

    /* compiled from: WazeSource */
    final class PlaybackStatsTracker {
        private long audioFormatBitrateTimeProduct;
        private final List<PlaybackStats.EventTimeAndFormat> audioFormatHistory;
        private long audioFormatTimeMs;
        private long audioUnderruns;
        private long bandwidthBytes;
        private long bandwidthTimeMs;
        private Format currentAudioFormat;
        private float currentPlaybackSpeed;
        private int currentPlaybackState;
        private long currentPlaybackStateStartTimeMs;
        private Format currentVideoFormat;
        private long droppedFrames;
        private int fatalErrorCount;
        private final List<PlaybackStats.EventTimeAndException> fatalErrorHistory;
        private long firstReportedTimeMs;
        private boolean hasBeenReady;
        private boolean hasEnded;
        private boolean hasFatalError;
        private long initialAudioFormatBitrate;
        private long initialVideoFormatBitrate;
        private int initialVideoFormatHeight;
        private final boolean isAd;
        private boolean isForeground;
        private boolean isInterruptedByAd;
        private boolean isJoinTimeInvalid;
        private boolean isSeeking;
        private final boolean keepHistory;
        private long lastAudioFormatStartTimeMs;
        private long lastRebufferStartTimeMs;
        private long lastVideoFormatStartTimeMs;
        private long maxRebufferTimeMs;
        private final List<long[]> mediaTimeHistory;
        private int nonFatalErrorCount;
        private final List<PlaybackStats.EventTimeAndException> nonFatalErrorHistory;
        private int pauseBufferCount;
        private int pauseCount;
        private final long[] playbackStateDurationsMs = new long[16];
        private final List<PlaybackStats.EventTimeAndPlaybackState> playbackStateHistory;
        private int rebufferCount;
        private int seekCount;
        private boolean startedLoading;
        private long videoFormatBitrateTimeMs;
        private long videoFormatBitrateTimeProduct;
        private long videoFormatHeightTimeMs;
        private long videoFormatHeightTimeProduct;
        private final List<PlaybackStats.EventTimeAndFormat> videoFormatHistory;

        public PlaybackStatsTracker(boolean z, AnalyticsListener.EventTime eventTime) {
            this.keepHistory = z;
            this.playbackStateHistory = z ? new ArrayList<>() : Collections.EMPTY_LIST;
            this.mediaTimeHistory = z ? new ArrayList<>() : Collections.EMPTY_LIST;
            this.videoFormatHistory = z ? new ArrayList<>() : Collections.EMPTY_LIST;
            this.audioFormatHistory = z ? new ArrayList<>() : Collections.EMPTY_LIST;
            this.fatalErrorHistory = z ? new ArrayList<>() : Collections.EMPTY_LIST;
            this.nonFatalErrorHistory = z ? new ArrayList<>() : Collections.EMPTY_LIST;
            boolean z2 = false;
            this.currentPlaybackState = 0;
            this.currentPlaybackStateStartTimeMs = eventTime.realtimeMs;
            this.firstReportedTimeMs = C.TIME_UNSET;
            this.maxRebufferTimeMs = C.TIME_UNSET;
            MediaSource.MediaPeriodId mediaPeriodId = eventTime.mediaPeriodId;
            if (mediaPeriodId != null && mediaPeriodId.isAd()) {
                z2 = true;
            }
            this.isAd = z2;
            this.initialAudioFormatBitrate = -1L;
            this.initialVideoFormatBitrate = -1L;
            this.initialVideoFormatHeight = -1;
            this.currentPlaybackSpeed = 1.0f;
        }

        private long[] guessMediaTimeBasedOnElapsedRealtime(long j2) {
            return new long[]{j2, this.mediaTimeHistory.get(this.mediaTimeHistory.size() - 1)[1] + ((long) ((j2 - r0[0]) * this.currentPlaybackSpeed))};
        }

        private static boolean isInvalidJoinTransition(int i2, int i3) {
            return ((i2 != 1 && i2 != 2 && i2 != 14) || i3 == 1 || i3 == 2 || i3 == 14 || i3 == 3 || i3 == 4 || i3 == 9 || i3 == 11) ? false : true;
        }

        private static boolean isPausedState(int i2) {
            return i2 == 4 || i2 == 7;
        }

        private static boolean isReadyState(int i2) {
            return i2 == 3 || i2 == 4 || i2 == 9;
        }

        private static boolean isRebufferingState(int i2) {
            return i2 == 6 || i2 == 7 || i2 == 10;
        }

        private void maybeRecordAudioFormatTime(long j2) {
            Format format;
            int i2;
            if (this.currentPlaybackState == 3 && (format = this.currentAudioFormat) != null && (i2 = format.bitrate) != -1) {
                long j3 = (long) ((j2 - this.lastAudioFormatStartTimeMs) * this.currentPlaybackSpeed);
                this.audioFormatTimeMs += j3;
                this.audioFormatBitrateTimeProduct += j3 * i2;
            }
            this.lastAudioFormatStartTimeMs = j2;
        }

        private void maybeRecordVideoFormatTime(long j2) {
            Format format;
            if (this.currentPlaybackState == 3 && (format = this.currentVideoFormat) != null) {
                float f2 = (j2 - this.lastVideoFormatStartTimeMs) * this.currentPlaybackSpeed;
                int i2 = format.height;
                long j3 = (long) f2;
                if (i2 != -1) {
                    this.videoFormatHeightTimeMs += j3;
                    this.videoFormatHeightTimeProduct += i2 * j3;
                }
                int i3 = format.bitrate;
                if (i3 != -1) {
                    this.videoFormatBitrateTimeMs += j3;
                    this.videoFormatBitrateTimeProduct += j3 * i3;
                }
            }
            this.lastVideoFormatStartTimeMs = j2;
        }

        private void maybeUpdateAudioFormat(AnalyticsListener.EventTime eventTime, Format format) {
            int i2;
            if (Objects.equals(this.currentAudioFormat, format)) {
                return;
            }
            maybeRecordAudioFormatTime(eventTime.realtimeMs);
            if (format != null && this.initialAudioFormatBitrate == -1 && (i2 = format.bitrate) != -1) {
                this.initialAudioFormatBitrate = i2;
            }
            this.currentAudioFormat = format;
            if (this.keepHistory) {
                this.audioFormatHistory.add(new PlaybackStats.EventTimeAndFormat(eventTime, this.currentAudioFormat));
            }
        }

        private void maybeUpdateMaxRebufferTimeMs(long j2) {
            if (isRebufferingState(this.currentPlaybackState)) {
                long j3 = j2 - this.lastRebufferStartTimeMs;
                long j4 = this.maxRebufferTimeMs;
                if (j4 == C.TIME_UNSET || j3 > j4) {
                    this.maxRebufferTimeMs = j3;
                }
            }
        }

        private void maybeUpdateMediaTimeHistory(long j2, long j3) {
            if (this.keepHistory) {
                if (this.currentPlaybackState != 3) {
                    if (j3 == C.TIME_UNSET) {
                        return;
                    }
                    if (!this.mediaTimeHistory.isEmpty()) {
                        long j4 = this.mediaTimeHistory.get(r0.size() - 1)[1];
                        if (j4 != j3) {
                            this.mediaTimeHistory.add(new long[]{j2, j4});
                        }
                    }
                }
                List<long[]> list = this.mediaTimeHistory;
                if (j3 != C.TIME_UNSET) {
                    list.add(new long[]{j2, j3});
                } else {
                    if (list.isEmpty()) {
                        return;
                    }
                    this.mediaTimeHistory.add(guessMediaTimeBasedOnElapsedRealtime(j2));
                }
            }
        }

        private void maybeUpdateVideoFormat(AnalyticsListener.EventTime eventTime, Format format) {
            int i2;
            int i3;
            if (Objects.equals(this.currentVideoFormat, format)) {
                return;
            }
            maybeRecordVideoFormatTime(eventTime.realtimeMs);
            if (format != null) {
                if (this.initialVideoFormatHeight == -1 && (i3 = format.height) != -1) {
                    this.initialVideoFormatHeight = i3;
                }
                if (this.initialVideoFormatBitrate == -1 && (i2 = format.bitrate) != -1) {
                    this.initialVideoFormatBitrate = i2;
                }
            }
            this.currentVideoFormat = format;
            if (this.keepHistory) {
                this.videoFormatHistory.add(new PlaybackStats.EventTimeAndFormat(eventTime, this.currentVideoFormat));
            }
        }

        private int resolveNewPlaybackState(Player player) {
            int playbackState = player.getPlaybackState();
            if (this.isSeeking && this.isForeground) {
                return 5;
            }
            if (this.hasFatalError) {
                return 13;
            }
            if (!this.isForeground) {
                return this.startedLoading ? 1 : 0;
            }
            if (this.isInterruptedByAd) {
                return 14;
            }
            if (playbackState == 4) {
                return 11;
            }
            if (playbackState != 2) {
                if (playbackState == 3) {
                    if (player.getPlayWhenReady()) {
                        return player.getPlaybackSuppressionReason() != 0 ? 9 : 3;
                    }
                    return 4;
                }
                if (playbackState != 1 || this.currentPlaybackState == 0) {
                    return this.currentPlaybackState;
                }
                return 12;
            }
            int i2 = this.currentPlaybackState;
            if (i2 == 0 || i2 == 1 || i2 == 2 || i2 == 14) {
                return 2;
            }
            if (player.getPlayWhenReady()) {
                return player.getPlaybackSuppressionReason() != 0 ? 10 : 6;
            }
            return 7;
        }

        private void updatePlaybackState(int i2, AnalyticsListener.EventTime eventTime) {
            an.l(eventTime.realtimeMs >= this.currentPlaybackStateStartTimeMs);
            long j2 = eventTime.realtimeMs;
            long j3 = j2 - this.currentPlaybackStateStartTimeMs;
            long[] jArr = this.playbackStateDurationsMs;
            int i3 = this.currentPlaybackState;
            jArr[i3] = jArr[i3] + j3;
            if (this.firstReportedTimeMs == C.TIME_UNSET) {
                this.firstReportedTimeMs = j2;
            }
            this.isJoinTimeInvalid |= isInvalidJoinTransition(i3, i2);
            this.hasBeenReady |= isReadyState(i2);
            this.hasEnded |= i2 == 11;
            if (!isPausedState(i3) && isPausedState(i2)) {
                this.pauseCount++;
            }
            if (i2 == 5) {
                this.seekCount++;
                i2 = 5;
            }
            if (!isRebufferingState(i3) && isRebufferingState(i2)) {
                this.rebufferCount++;
                this.lastRebufferStartTimeMs = j2;
            }
            if (isRebufferingState(i3) && i3 != 7 && i2 == 7) {
                this.pauseBufferCount++;
                i2 = 7;
            }
            maybeUpdateMaxRebufferTimeMs(j2);
            this.currentPlaybackState = i2;
            this.currentPlaybackStateStartTimeMs = eventTime.realtimeMs;
            if (this.keepHistory) {
                this.playbackStateHistory.add(new PlaybackStats.EventTimeAndPlaybackState(eventTime, i2));
            }
        }

        public PlaybackStats build(boolean z) {
            List arrayList;
            long[] jArrCopyOf;
            if (z) {
                arrayList = this.mediaTimeHistory;
                jArrCopyOf = this.playbackStateDurationsMs;
            } else {
                long[] jArr = this.playbackStateDurationsMs;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                jArrCopyOf = Arrays.copyOf(jArr, 16);
                long jMax = Math.max(0L, jElapsedRealtime - this.currentPlaybackStateStartTimeMs);
                int i2 = this.currentPlaybackState;
                jArrCopyOf[i2] = jArrCopyOf[i2] + jMax;
                maybeUpdateMaxRebufferTimeMs(jElapsedRealtime);
                maybeRecordVideoFormatTime(jElapsedRealtime);
                maybeRecordAudioFormatTime(jElapsedRealtime);
                arrayList = new ArrayList(this.mediaTimeHistory);
                if (this.keepHistory && this.currentPlaybackState == 3) {
                    arrayList.add(guessMediaTimeBasedOnElapsedRealtime(jElapsedRealtime));
                }
            }
            long[] jArr2 = jArrCopyOf;
            List list = arrayList;
            int i3 = (this.isJoinTimeInvalid || !this.hasBeenReady) ? 1 : 0;
            long j2 = i3 != 0 ? C.TIME_UNSET : jArr2[2];
            long j3 = jArr2[1];
            List<PlaybackStats.EventTimeAndFormat> list2 = this.videoFormatHistory;
            List<PlaybackStats.EventTimeAndFormat> arrayList2 = z ? list2 : new ArrayList(list2);
            List<PlaybackStats.EventTimeAndFormat> list3 = this.audioFormatHistory;
            List<PlaybackStats.EventTimeAndFormat> arrayList3 = z ? list3 : new ArrayList(list3);
            List<PlaybackStats.EventTimeAndPlaybackState> list4 = this.playbackStateHistory;
            List<PlaybackStats.EventTimeAndPlaybackState> arrayList4 = z ? list4 : new ArrayList<>(list4);
            long j4 = this.firstReportedTimeMs;
            boolean z2 = this.isForeground;
            int i4 = !this.hasBeenReady ? 1 : 0;
            boolean z3 = this.hasEnded;
            int i5 = j3 > 0 ? 1 : 0;
            int i6 = i3 ^ 1;
            int i7 = this.pauseCount;
            int i8 = this.pauseBufferCount;
            int i9 = this.seekCount;
            int i10 = this.rebufferCount;
            long j5 = this.maxRebufferTimeMs;
            boolean z4 = this.isAd;
            long j6 = this.videoFormatHeightTimeMs;
            long j7 = this.videoFormatHeightTimeProduct;
            long j8 = this.videoFormatBitrateTimeMs;
            long j9 = this.videoFormatBitrateTimeProduct;
            long j10 = this.audioFormatTimeMs;
            long j11 = this.audioFormatBitrateTimeProduct;
            int i11 = this.initialVideoFormatHeight;
            int i12 = i11 == -1 ? 0 : 1;
            long j12 = this.initialVideoFormatBitrate;
            int i13 = j12 == -1 ? 0 : 1;
            long j13 = this.initialAudioFormatBitrate;
            int i14 = j13 == -1 ? 0 : 1;
            long j14 = this.bandwidthTimeMs;
            long j15 = this.bandwidthBytes;
            long j16 = this.droppedFrames;
            long j17 = this.audioUnderruns;
            int i15 = this.fatalErrorCount;
            return new PlaybackStats(1, jArr2, arrayList4, list, j4, z2 ? 1 : 0, i4, z3 ? 1 : 0, i5, j2, i6, i7, i8, i9, i10, j5, z4 ? 1 : 0, arrayList2, arrayList3, j6, j7, j8, j9, j10, j11, i12, i13, i11, j12, i14, j13, j14, j15, j16, j17, i15 > 0 ? 1 : 0, i15, this.nonFatalErrorCount, this.fatalErrorHistory, this.nonFatalErrorHistory);
        }

        public void onEvents(Player player, AnalyticsListener.EventTime eventTime, boolean z, long j2, boolean z2, int i2, boolean z3, boolean z4, PlaybackException playbackException, Exception exc, long j3, long j4, Format format, Format format2, VideoSize videoSize) {
            long j5 = C.TIME_UNSET;
            if (j2 != C.TIME_UNSET) {
                maybeUpdateMediaTimeHistory(eventTime.realtimeMs, j2);
                this.isSeeking = true;
            }
            if (player.getPlaybackState() != 2) {
                this.isSeeking = false;
            }
            int playbackState = player.getPlaybackState();
            if (playbackState == 1 || playbackState == 4 || z2) {
                this.isInterruptedByAd = false;
            }
            if (playbackException != null) {
                this.hasFatalError = true;
                this.fatalErrorCount++;
                if (this.keepHistory) {
                    this.fatalErrorHistory.add(new PlaybackStats.EventTimeAndException(eventTime, playbackException));
                }
            } else if (player.getPlayerError() == null) {
                this.hasFatalError = false;
            }
            if (this.isForeground && !this.isInterruptedByAd) {
                Tracks currentTracks = player.getCurrentTracks();
                if (!currentTracks.isTypeSelected(2)) {
                    maybeUpdateVideoFormat(eventTime, null);
                }
                if (!currentTracks.isTypeSelected(1)) {
                    maybeUpdateAudioFormat(eventTime, null);
                }
            }
            if (format != null) {
                maybeUpdateVideoFormat(eventTime, format);
            }
            if (format2 != null) {
                maybeUpdateAudioFormat(eventTime, format2);
            }
            Format format3 = this.currentVideoFormat;
            if (format3 != null && format3.height == -1 && videoSize != null) {
                Format.Builder builderBuildUpon = format3.buildUpon();
                builderBuildUpon.setWidth(videoSize.width);
                builderBuildUpon.setHeight(videoSize.height);
                maybeUpdateVideoFormat(eventTime, builderBuildUpon.build());
            }
            if (z4) {
                this.startedLoading = true;
            }
            if (z3) {
                this.audioUnderruns++;
            }
            this.droppedFrames += i2;
            this.bandwidthTimeMs += j3;
            this.bandwidthBytes += j4;
            if (exc != null) {
                this.nonFatalErrorCount++;
                if (this.keepHistory) {
                    this.nonFatalErrorHistory.add(new PlaybackStats.EventTimeAndException(eventTime, exc));
                }
            }
            int iResolveNewPlaybackState = resolveNewPlaybackState(player);
            float f2 = player.getPlaybackParameters().speed;
            if (this.currentPlaybackState != iResolveNewPlaybackState || this.currentPlaybackSpeed != f2) {
                long j6 = eventTime.realtimeMs;
                if (z) {
                    j5 = eventTime.eventPlaybackPositionMs;
                }
                maybeUpdateMediaTimeHistory(j6, j5);
                maybeRecordVideoFormatTime(eventTime.realtimeMs);
                maybeRecordAudioFormatTime(eventTime.realtimeMs);
            }
            this.currentPlaybackSpeed = f2;
            if (this.currentPlaybackState != iResolveNewPlaybackState) {
                updatePlaybackState(iResolveNewPlaybackState, eventTime);
            }
        }

        public void onFinished(AnalyticsListener.EventTime eventTime, boolean z, long j2) {
            int i2 = 11;
            if (this.currentPlaybackState != 11 && !z) {
                i2 = 15;
            }
            maybeUpdateMediaTimeHistory(eventTime.realtimeMs, j2);
            maybeRecordVideoFormatTime(eventTime.realtimeMs);
            maybeRecordAudioFormatTime(eventTime.realtimeMs);
            updatePlaybackState(i2, eventTime);
        }

        public void onForeground() {
            this.isForeground = true;
        }

        public void onInterruptedByAd() {
            this.isInterruptedByAd = true;
            this.isSeeking = false;
        }
    }

    public PlaybackStatsListener(boolean z, Callback callback) {
        this.callback = callback;
        this.keepHistory = z;
        DefaultPlaybackSessionManager defaultPlaybackSessionManager = new DefaultPlaybackSessionManager();
        this.sessionManager = defaultPlaybackSessionManager;
        this.playbackStatsTrackers = new HashMap();
        this.sessionStartEventTimes = new HashMap();
        this.finishedPlaybackStats = PlaybackStats.EMPTY;
        this.period = new Timeline.Period();
        this.videoSize = VideoSize.UNKNOWN;
        defaultPlaybackSessionManager.setListener(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.util.Pair<androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime, java.lang.Boolean> findBestEventTime(androidx.media3.exoplayer.analytics.AnalyticsListener.Events r22, java.lang.String r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = 0
            r4 = 0
            r5 = r4
            r4 = r3
        La:
            int r6 = r1.size()
            if (r3 >= r6) goto L34
            int r6 = r1.get(r3)
            androidx.media3.exoplayer.analytics.AnalyticsListener$EventTime r6 = r1.getEventTime(r6)
            androidx.media3.exoplayer.analytics.PlaybackSessionManager r7 = r0.sessionManager
            boolean r7 = r7.belongsToSession(r6, r2)
            if (r5 == 0) goto L2f
            if (r7 == 0) goto L25
            if (r4 == 0) goto L2f
            r4 = 1
        L25:
            if (r7 != r4) goto L31
            long r8 = r6.realtimeMs
            long r10 = r5.realtimeMs
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 <= 0) goto L31
        L2f:
            r5 = r6
            r4 = r7
        L31:
            int r3 = r3 + 1
            goto La
        L34:
            com.google.d.b.an.B(r5)
            if (r4 != 0) goto La1
            androidx.media3.exoplayer.source.MediaSource$MediaPeriodId r1 = r5.mediaPeriodId
            if (r1 == 0) goto La1
            boolean r3 = r1.isAd()
            if (r3 == 0) goto La1
            androidx.media3.common.Timeline r3 = r5.timeline
            java.lang.Object r1 = r1.periodUid
            androidx.media3.common.Timeline$Period r4 = r0.period
            androidx.media3.common.Timeline$Period r1 = r3.getPeriodByUid(r1, r4)
            androidx.media3.exoplayer.source.MediaSource$MediaPeriodId r3 = r5.mediaPeriodId
            int r3 = r3.adGroupIndex
            long r3 = r1.getAdGroupTimeUs(r3)
            r6 = -9223372036854775808
            int r1 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r1 != 0) goto L5f
            androidx.media3.common.Timeline$Period r1 = r0.period
            long r3 = r1.durationUs
        L5f:
            androidx.media3.common.Timeline$Period r1 = r0.period
            long r6 = r1.getPositionInWindowUs()
            long r3 = r3 + r6
            androidx.media3.exoplayer.analytics.AnalyticsListener$EventTime r6 = new androidx.media3.exoplayer.analytics.AnalyticsListener$EventTime
            long r7 = r5.realtimeMs
            androidx.media3.common.Timeline r9 = r5.timeline
            int r10 = r5.windowIndex
            androidx.media3.exoplayer.source.MediaSource$MediaPeriodId r11 = new androidx.media3.exoplayer.source.MediaSource$MediaPeriodId
            androidx.media3.exoplayer.source.MediaSource$MediaPeriodId r1 = r5.mediaPeriodId
            java.lang.Object r12 = r1.periodUid
            long r13 = r1.windowSequenceNumber
            int r1 = r1.adGroupIndex
            r11.<init>(r12, r13, r1)
            int r1 = androidx.media3.common.util.Util.SDK_INT
            androidx.media3.common.Timeline r14 = r5.timeline
            int r15 = r5.currentWindowIndex
            androidx.media3.exoplayer.source.MediaSource$MediaPeriodId r1 = r5.currentMediaPeriodId
            long r12 = r5.currentPlaybackPositionMs
            r16 = r3
            long r3 = r5.totalBufferedDurationMs
            long r16 = androidx.media3.common.util.Util.usToMs(r16)
            r19 = r16
            r17 = r12
            r12 = r19
            r16 = r1
            r19 = r3
            r6.<init>(r7, r9, r10, r11, r12, r14, r15, r16, r17, r19)
            androidx.media3.exoplayer.analytics.PlaybackSessionManager r0 = r0.sessionManager
            boolean r4 = r0.belongsToSession(r6, r2)
            r5 = r6
        La1:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            android.util.Pair r0 = android.util.Pair.create(r5, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.analytics.PlaybackStatsListener.findBestEventTime(androidx.media3.exoplayer.analytics.AnalyticsListener$Events, java.lang.String):android.util.Pair");
    }

    private boolean hasEvent(AnalyticsListener.Events events, String str, int i2) {
        return events.contains(i2) && this.sessionManager.belongsToSession(events.getEventTime(i2), str);
    }

    private void maybeAddSessions(AnalyticsListener.Events events) {
        for (int i2 = 0; i2 < events.size(); i2++) {
            int i3 = events.get(i2);
            AnalyticsListener.EventTime eventTime = events.getEventTime(i3);
            if (i3 == 0) {
                this.sessionManager.updateSessionsWithTimelineChange(eventTime);
            } else {
                PlaybackSessionManager playbackSessionManager = this.sessionManager;
                if (i3 == 11) {
                    playbackSessionManager.updateSessionsWithDiscontinuity(eventTime, this.discontinuityReason);
                } else {
                    playbackSessionManager.updateSessions(eventTime);
                }
            }
        }
    }

    public PlaybackStats getCombinedPlaybackStats() {
        int i2 = 1;
        PlaybackStats[] playbackStatsArr = new PlaybackStats[this.playbackStatsTrackers.size() + 1];
        playbackStatsArr[0] = this.finishedPlaybackStats;
        Iterator<PlaybackStatsTracker> it = this.playbackStatsTrackers.values().iterator();
        while (it.hasNext()) {
            playbackStatsArr[i2] = it.next().build(false);
            i2++;
        }
        return PlaybackStats.merge(playbackStatsArr);
    }

    public PlaybackStats getPlaybackStats() {
        String activeSessionId = this.sessionManager.getActiveSessionId();
        PlaybackStatsTracker playbackStatsTracker = activeSessionId == null ? null : this.playbackStatsTrackers.get(activeSessionId);
        if (playbackStatsTracker == null) {
            return null;
        }
        return playbackStatsTracker.build(false);
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager.Listener
    public void onAdPlaybackStarted(AnalyticsListener.EventTime eventTime, String str, String str2) {
        PlaybackStatsTracker playbackStatsTracker = this.playbackStatsTrackers.get(str);
        an.B(playbackStatsTracker);
        playbackStatsTracker.onInterruptedByAd();
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onAudioAttributesChanged(AnalyticsListener.EventTime eventTime, AudioAttributes audioAttributes) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onAudioCodecError(AnalyticsListener.EventTime eventTime, Exception exc) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onAudioDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j2) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onAudioDecoderReleased(AnalyticsListener.EventTime eventTime, String str) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onAudioDisabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onAudioEnabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onAudioInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onAudioPositionAdvancing(AnalyticsListener.EventTime eventTime, long j2) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onAudioSessionIdChanged(AnalyticsListener.EventTime eventTime, int i2) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onAudioSinkError(AnalyticsListener.EventTime eventTime, Exception exc) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onAudioTrackInitialized(AnalyticsListener.EventTime eventTime, AudioSink.AudioTrackConfig audioTrackConfig) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onAudioTrackReleased(AnalyticsListener.EventTime eventTime, AudioSink.AudioTrackConfig audioTrackConfig) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onAudioUnderrun(AnalyticsListener.EventTime eventTime, int i2, long j2, long j3) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onAvailableCommandsChanged(AnalyticsListener.EventTime eventTime, Player.Commands commands) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onBandwidthEstimate(AnalyticsListener.EventTime eventTime, int i2, long j2, long j3) {
        this.bandwidthTimeMs = i2;
        this.bandwidthBytes = j2;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onCues(AnalyticsListener.EventTime eventTime, CueGroup cueGroup) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onDeviceInfoChanged(AnalyticsListener.EventTime eventTime, DeviceInfo deviceInfo) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onDeviceVolumeChanged(AnalyticsListener.EventTime eventTime, int i2, boolean z) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onDownstreamFormatChanged(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
        int i2 = mediaLoadData.trackType;
        if (i2 == 2 || i2 == 0) {
            this.videoFormat = mediaLoadData.trackFormat;
        } else if (i2 == 1) {
            this.audioFormat = mediaLoadData.trackFormat;
        }
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onDrmKeysLoaded(AnalyticsListener.EventTime eventTime) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onDrmKeysRemoved(AnalyticsListener.EventTime eventTime) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onDrmKeysRestored(AnalyticsListener.EventTime eventTime) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onDrmSessionAcquired(AnalyticsListener.EventTime eventTime) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onDrmSessionManagerError(AnalyticsListener.EventTime eventTime, Exception exc) {
        this.nonFatalException = exc;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onDrmSessionReleased(AnalyticsListener.EventTime eventTime) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onDroppedSeeksWhileScrubbing(AnalyticsListener.EventTime eventTime, int i2) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onDroppedVideoFrames(AnalyticsListener.EventTime eventTime, int i2, long j2) {
        this.droppedFrames = i2;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onEvents(Player player, AnalyticsListener.Events events) {
        Iterator<String> it;
        long j2;
        long j3;
        long j4;
        if (events.size() == 0) {
            return;
        }
        maybeAddSessions(events);
        Iterator<String> it2 = this.playbackStatsTrackers.keySet().iterator();
        while (it2.hasNext()) {
            String next = it2.next();
            Pair<AnalyticsListener.EventTime, Boolean> pairFindBestEventTime = findBestEventTime(events, next);
            PlaybackStatsTracker playbackStatsTracker = this.playbackStatsTrackers.get(next);
            boolean zHasEvent = hasEvent(events, next, 11);
            boolean zHasEvent2 = hasEvent(events, next, 1018);
            boolean zHasEvent3 = hasEvent(events, next, 1011);
            boolean zHasEvent4 = hasEvent(events, next, 1000);
            boolean zHasEvent5 = hasEvent(events, next, 10);
            boolean z = true;
            if (!hasEvent(events, next, 1003) && !hasEvent(events, next, 1024)) {
                z = false;
            }
            boolean zHasEvent6 = hasEvent(events, next, 1006);
            boolean zHasEvent7 = hasEvent(events, next, 1004);
            boolean zHasEvent8 = hasEvent(events, next, 25);
            AnalyticsListener.EventTime eventTime = (AnalyticsListener.EventTime) pairFindBestEventTime.first;
            boolean zBooleanValue = ((Boolean) pairFindBestEventTime.second).booleanValue();
            long j5 = next.equals(this.discontinuityFromSession) ? this.discontinuityFromPositionMs : C.TIME_UNSET;
            int i2 = zHasEvent2 ? this.droppedFrames : 0;
            PlaybackException playerError = zHasEvent5 ? player.getPlayerError() : null;
            Exception exc = z ? this.nonFatalException : null;
            long j6 = 0;
            if (zHasEvent6) {
                it = it2;
                j2 = j5;
                j3 = this.bandwidthTimeMs;
            } else {
                it = it2;
                j2 = j5;
                j3 = 0;
            }
            if (zHasEvent6) {
                j4 = j3;
                j6 = this.bandwidthBytes;
            } else {
                j4 = j3;
            }
            playbackStatsTracker.onEvents(player, eventTime, zBooleanValue, j2, zHasEvent, i2, zHasEvent3, zHasEvent4, playerError, exc, j4, j6, zHasEvent7 ? this.videoFormat : null, zHasEvent7 ? this.audioFormat : null, zHasEvent8 ? this.videoSize : null);
            it2 = it;
        }
        this.videoFormat = null;
        this.audioFormat = null;
        this.discontinuityFromSession = null;
        if (events.contains(1028)) {
            this.sessionManager.finishAllSessions(events.getEventTime(1028));
        }
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onIsLoadingChanged(AnalyticsListener.EventTime eventTime, boolean z) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onIsPlayingChanged(AnalyticsListener.EventTime eventTime, boolean z) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onLoadCanceled(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onLoadCompleted(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onLoadError(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
        this.nonFatalException = iOException;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onLoadStarted(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onLoadingChanged(AnalyticsListener.EventTime eventTime, boolean z) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onMaxSeekToPreviousPositionChanged(AnalyticsListener.EventTime eventTime, long j2) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onMediaItemTransition(AnalyticsListener.EventTime eventTime, MediaItem mediaItem, int i2) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onMediaMetadataChanged(AnalyticsListener.EventTime eventTime, MediaMetadata mediaMetadata) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onMetadata(AnalyticsListener.EventTime eventTime, Metadata metadata) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onPlayWhenReadyChanged(AnalyticsListener.EventTime eventTime, boolean z, int i2) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onPlaybackParametersChanged(AnalyticsListener.EventTime eventTime, PlaybackParameters playbackParameters) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onPlaybackStateChanged(AnalyticsListener.EventTime eventTime, int i2) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onPlaybackSuppressionReasonChanged(AnalyticsListener.EventTime eventTime, int i2) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onPlayerError(AnalyticsListener.EventTime eventTime, PlaybackException playbackException) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onPlayerErrorChanged(AnalyticsListener.EventTime eventTime, PlaybackException playbackException) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onPlayerReleased(AnalyticsListener.EventTime eventTime) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onPlayerStateChanged(AnalyticsListener.EventTime eventTime, boolean z, int i2) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onPlaylistMetadataChanged(AnalyticsListener.EventTime eventTime, MediaMetadata mediaMetadata) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onPositionDiscontinuity(AnalyticsListener.EventTime eventTime, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i2) {
        if (this.discontinuityFromSession == null) {
            this.discontinuityFromSession = this.sessionManager.getActiveSessionId();
            this.discontinuityFromPositionMs = positionInfo.positionMs;
        }
        this.discontinuityReason = i2;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onRenderedFirstFrame(AnalyticsListener.EventTime eventTime, Object obj, long j2) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onRendererReadyChanged(AnalyticsListener.EventTime eventTime, int i2, int i3, boolean z) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onRepeatModeChanged(AnalyticsListener.EventTime eventTime, int i2) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onSeekBackIncrementChanged(AnalyticsListener.EventTime eventTime, long j2) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onSeekForwardIncrementChanged(AnalyticsListener.EventTime eventTime, long j2) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onSeekStarted(AnalyticsListener.EventTime eventTime) {
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager.Listener
    public void onSessionActive(AnalyticsListener.EventTime eventTime, String str) {
        PlaybackStatsTracker playbackStatsTracker = this.playbackStatsTrackers.get(str);
        an.B(playbackStatsTracker);
        playbackStatsTracker.onForeground();
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager.Listener
    public void onSessionCreated(AnalyticsListener.EventTime eventTime, String str) {
        this.playbackStatsTrackers.put(str, new PlaybackStatsTracker(this.keepHistory, eventTime));
        this.sessionStartEventTimes.put(str, eventTime);
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager.Listener
    public void onSessionFinished(AnalyticsListener.EventTime eventTime, String str, boolean z) {
        PlaybackStatsTracker playbackStatsTrackerRemove = this.playbackStatsTrackers.remove(str);
        an.B(playbackStatsTrackerRemove);
        AnalyticsListener.EventTime eventTimeRemove = this.sessionStartEventTimes.remove(str);
        an.B(eventTimeRemove);
        playbackStatsTrackerRemove.onFinished(eventTime, z, str.equals(this.discontinuityFromSession) ? this.discontinuityFromPositionMs : C.TIME_UNSET);
        PlaybackStats playbackStatsBuild = playbackStatsTrackerRemove.build(true);
        this.finishedPlaybackStats = PlaybackStats.merge(this.finishedPlaybackStats, playbackStatsBuild);
        Callback callback = this.callback;
        if (callback != null) {
            callback.onPlaybackStatsReady(eventTimeRemove, playbackStatsBuild);
        }
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onShuffleModeChanged(AnalyticsListener.EventTime eventTime, boolean z) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onSkipSilenceEnabledChanged(AnalyticsListener.EventTime eventTime, boolean z) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onSurfaceSizeChanged(AnalyticsListener.EventTime eventTime, int i2, int i3) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onTimelineChanged(AnalyticsListener.EventTime eventTime, int i2) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onTrackSelectionParametersChanged(AnalyticsListener.EventTime eventTime, TrackSelectionParameters trackSelectionParameters) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onTracksChanged(AnalyticsListener.EventTime eventTime, Tracks tracks) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onUpstreamDiscarded(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onVideoCodecError(AnalyticsListener.EventTime eventTime, Exception exc) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onVideoDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j2) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onVideoDecoderReleased(AnalyticsListener.EventTime eventTime, String str) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onVideoDisabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onVideoEnabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onVideoFrameProcessingOffset(AnalyticsListener.EventTime eventTime, long j2, int i2) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onVideoInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onVideoSizeChanged(AnalyticsListener.EventTime eventTime, VideoSize videoSize) {
        this.videoSize = videoSize;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onVolumeChanged(AnalyticsListener.EventTime eventTime, float f2) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onAudioDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j2, long j3) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onCues(AnalyticsListener.EventTime eventTime, List list) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onDrmKeysLoaded(AnalyticsListener.EventTime eventTime, KeyRequestInfo keyRequestInfo) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onDrmSessionAcquired(AnalyticsListener.EventTime eventTime, int i2) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onLoadStarted(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i2) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onVideoDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j2, long j3) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onVideoSizeChanged(AnalyticsListener.EventTime eventTime, int i2, int i3, int i4, float f2) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public /* synthetic */ void onPositionDiscontinuity(AnalyticsListener.EventTime eventTime, int i2) {
    }
}
