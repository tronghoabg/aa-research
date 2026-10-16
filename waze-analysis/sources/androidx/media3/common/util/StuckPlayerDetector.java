package androidx.media3.common.util;

import android.os.Handler;
import android.os.Message;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.C;
import androidx.media3.common.DeviceInfo;
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
import j$.util.Objects;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class StuckPlayerDetector {
    private static final int MSG_STUCK_BUFFERING_TIMEOUT = 1;
    private static final int MSG_STUCK_PLAYING_NOT_ENDING_TIMEOUT = 3;
    private static final int MSG_STUCK_PLAYING_TIMEOUT = 2;
    private static final int MSG_STUCK_SUPPRESSED_TIMEOUT = 4;
    private final Callback callback;
    private final Clock clock;
    private final HandlerWrapper handler;
    private final Timeline.Period period = new Timeline.Period();
    private final Player player;
    private final Player.Listener playerListener;
    private final StuckBufferingDetector stuckBufferingDetector;
    private final StuckPlayingDetector stuckPlayingDetector;
    private final StuckPlayingNotEndingDetector stuckPlayingNotEndingDetector;
    private final StuckSuppressedDetector stuckSuppressedDetector;

    /* compiled from: WazeSource */
    public interface Callback {
        void onStuckPlayerDetected(StuckPlayerException stuckPlayerException);
    }

    /* compiled from: WazeSource */
    final class StuckBufferingDetector {
        private int adGroupIndex;
        private int adIndexInAdGroup;
        private long bufferedDurationInOtherPeriodsMs;
        private long bufferedPositionInPeriodMs;
        private boolean isBuffering;
        private Object periodUid;
        private long startRealtimeMs;
        private final int stuckBufferingTimeoutMs;
        final /* synthetic */ StuckPlayerDetector this$0;

        public StuckBufferingDetector(StuckPlayerDetector stuckPlayerDetector, int i2) {
            Objects.requireNonNull(stuckPlayerDetector);
            this.this$0 = stuckPlayerDetector;
            this.stuckBufferingTimeoutMs = i2;
        }

        public void update() {
            if (this.this$0.player.getPlaybackState() != 2 || !this.this$0.player.getPlayWhenReady() || this.this$0.player.getPlaybackSuppressionReason() != 0) {
                if (this.isBuffering) {
                    this.this$0.handler.removeMessages(1);
                }
                this.isBuffering = false;
                return;
            }
            Timeline currentTimeline = this.this$0.player.getCurrentTimeline();
            Object uidOfPeriod = currentTimeline.isEmpty() ? null : currentTimeline.getUidOfPeriod(this.this$0.player.getCurrentPeriodIndex());
            int currentAdGroupIndex = this.this$0.player.getCurrentAdGroupIndex();
            int currentAdIndexInAdGroup = this.this$0.player.getCurrentAdIndexInAdGroup();
            long bufferedPosition = this.this$0.player.getBufferedPosition();
            long jMax = Math.max(0L, this.this$0.player.getTotalBufferedDuration() - Math.max(0L, bufferedPosition - this.this$0.player.getCurrentPosition()));
            if (uidOfPeriod != null && currentAdGroupIndex == -1) {
                bufferedPosition -= currentTimeline.getPeriodByUid(uidOfPeriod, this.this$0.period).getPositionInWindowMs();
                currentAdGroupIndex = -1;
            }
            long jElapsedRealtime = this.this$0.clock.elapsedRealtime();
            if (this.isBuffering && Objects.equals(uidOfPeriod, this.periodUid) && currentAdGroupIndex == this.adGroupIndex && currentAdIndexInAdGroup == this.adIndexInAdGroup && bufferedPosition == this.bufferedPositionInPeriodMs && jMax == this.bufferedDurationInOtherPeriodsMs) {
                long j2 = jElapsedRealtime - this.startRealtimeMs;
                int i2 = this.stuckBufferingTimeoutMs;
                if (j2 >= i2) {
                    this.this$0.callback.onStuckPlayerDetected(new StuckPlayerException(1, i2));
                    return;
                }
                return;
            }
            this.isBuffering = true;
            this.startRealtimeMs = jElapsedRealtime;
            this.periodUid = uidOfPeriod;
            this.adGroupIndex = currentAdGroupIndex;
            this.adIndexInAdGroup = currentAdIndexInAdGroup;
            this.bufferedPositionInPeriodMs = bufferedPosition;
            this.bufferedDurationInOtherPeriodsMs = jMax;
            this.this$0.handler.removeMessages(1);
            this.this$0.handler.sendEmptyMessageDelayed(1, this.stuckBufferingTimeoutMs);
        }
    }

    /* compiled from: WazeSource */
    final class StuckPlayingDetector {
        private int adGroupIndex;
        private int adIndexInAdGroup;
        private long currentPositionInPeriodMs;
        private boolean isPlaying;
        private Object periodUid;
        private long startRealtimeMs;
        private final int stuckPlayingTimeoutMs;
        final /* synthetic */ StuckPlayerDetector this$0;

        public StuckPlayingDetector(StuckPlayerDetector stuckPlayerDetector, int i2) {
            Objects.requireNonNull(stuckPlayerDetector);
            this.this$0 = stuckPlayerDetector;
            this.stuckPlayingTimeoutMs = i2;
        }

        public void update() {
            if (!this.this$0.player.isPlaying()) {
                if (this.isPlaying) {
                    this.this$0.handler.removeMessages(2);
                }
                this.isPlaying = false;
                return;
            }
            Timeline currentTimeline = this.this$0.player.getCurrentTimeline();
            Object uidOfPeriod = currentTimeline.isEmpty() ? null : currentTimeline.getUidOfPeriod(this.this$0.player.getCurrentPeriodIndex());
            int currentAdGroupIndex = this.this$0.player.getCurrentAdGroupIndex();
            int currentAdIndexInAdGroup = this.this$0.player.getCurrentAdIndexInAdGroup();
            long currentPosition = this.this$0.player.getCurrentPosition();
            if (uidOfPeriod != null && currentAdGroupIndex == -1) {
                currentPosition -= currentTimeline.getPeriodByUid(uidOfPeriod, this.this$0.period).getPositionInWindowMs();
                currentAdGroupIndex = -1;
            }
            long jElapsedRealtime = this.this$0.clock.elapsedRealtime();
            if (this.isPlaying && Objects.equals(uidOfPeriod, this.periodUid) && currentAdGroupIndex == this.adGroupIndex && currentAdIndexInAdGroup == this.adIndexInAdGroup && currentPosition == this.currentPositionInPeriodMs) {
                long j2 = jElapsedRealtime - this.startRealtimeMs;
                int i2 = this.stuckPlayingTimeoutMs;
                if (j2 >= i2) {
                    this.this$0.callback.onStuckPlayerDetected(new StuckPlayerException(2, i2));
                    return;
                }
                return;
            }
            this.isPlaying = true;
            this.startRealtimeMs = jElapsedRealtime;
            this.periodUid = uidOfPeriod;
            this.adGroupIndex = currentAdGroupIndex;
            this.adIndexInAdGroup = currentAdIndexInAdGroup;
            this.currentPositionInPeriodMs = currentPosition;
            this.this$0.handler.removeMessages(2);
            this.this$0.handler.sendEmptyMessageDelayed(2, this.stuckPlayingTimeoutMs);
        }
    }

    /* compiled from: WazeSource */
    final class StuckPlayingNotEndingDetector {
        private int adGroupIndex;
        private int adIndexInAdGroup;
        private boolean isPlayingAndReachedDuration;
        private Object periodUid;
        private long startRealtimeMs;
        private final int stuckPlayingNotEndingTimeoutMs;
        final /* synthetic */ StuckPlayerDetector this$0;

        public StuckPlayingNotEndingDetector(StuckPlayerDetector stuckPlayerDetector, int i2) {
            Objects.requireNonNull(stuckPlayerDetector);
            this.this$0 = stuckPlayerDetector;
            this.stuckPlayingNotEndingTimeoutMs = i2;
        }

        public void update() {
            long duration;
            Timeline currentTimeline = this.this$0.player.getCurrentTimeline();
            Object uidOfPeriod = currentTimeline.isEmpty() ? null : currentTimeline.getUidOfPeriod(this.this$0.player.getCurrentPeriodIndex());
            int currentAdGroupIndex = this.this$0.player.getCurrentAdGroupIndex();
            int currentAdIndexInAdGroup = this.this$0.player.getCurrentAdIndexInAdGroup();
            long currentPosition = this.this$0.player.getCurrentPosition();
            if (uidOfPeriod == null || currentAdGroupIndex != -1) {
                duration = currentAdGroupIndex != -1 ? this.this$0.player.getDuration() : -9223372036854775807L;
            } else {
                currentTimeline.getPeriodByUid(uidOfPeriod, this.this$0.period);
                currentPosition -= this.this$0.period.getPositionInWindowMs();
                duration = this.this$0.period.getDurationMs();
                currentAdGroupIndex = -1;
            }
            boolean zIsPlaying = this.this$0.player.isPlaying();
            if (!zIsPlaying || duration == C.TIME_UNSET || currentPosition < duration) {
                this.this$0.handler.removeMessages(3);
                if (zIsPlaying && duration != C.TIME_UNSET) {
                    this.this$0.handler.sendEmptyMessageDelayed(3, (int) Math.ceil((duration - currentPosition) / this.this$0.player.getPlaybackParameters().speed));
                }
                this.isPlayingAndReachedDuration = false;
                return;
            }
            long jElapsedRealtime = this.this$0.clock.elapsedRealtime();
            if (this.isPlayingAndReachedDuration && Objects.equals(uidOfPeriod, this.periodUid) && currentAdGroupIndex == this.adGroupIndex && currentAdIndexInAdGroup == this.adIndexInAdGroup) {
                long j2 = jElapsedRealtime - this.startRealtimeMs;
                int i2 = this.stuckPlayingNotEndingTimeoutMs;
                if (j2 >= i2) {
                    this.this$0.callback.onStuckPlayerDetected(new StuckPlayerException(3, i2));
                    return;
                }
                return;
            }
            this.isPlayingAndReachedDuration = true;
            this.startRealtimeMs = jElapsedRealtime;
            this.periodUid = uidOfPeriod;
            this.adGroupIndex = currentAdGroupIndex;
            this.adIndexInAdGroup = currentAdIndexInAdGroup;
            this.this$0.handler.removeMessages(3);
            this.this$0.handler.sendEmptyMessageDelayed(3, this.stuckPlayingNotEndingTimeoutMs);
        }
    }

    /* compiled from: WazeSource */
    final class StuckSuppressedDetector {
        private boolean isSuppressed;
        private long startRealtimeMs;
        private final int stuckSuppressedTimeoutMs;
        private int suppressionReason;
        final /* synthetic */ StuckPlayerDetector this$0;

        public StuckSuppressedDetector(StuckPlayerDetector stuckPlayerDetector, int i2) {
            Objects.requireNonNull(stuckPlayerDetector);
            this.this$0 = stuckPlayerDetector;
            this.stuckSuppressedTimeoutMs = i2;
        }

        public void update() {
            int playbackSuppressionReason = this.this$0.player.getPlaybackSuppressionReason();
            if (!this.this$0.player.getPlayWhenReady() || this.this$0.player.getPlaybackState() == 1 || this.this$0.player.getPlaybackState() == 4 || playbackSuppressionReason == 0 || playbackSuppressionReason == 1) {
                if (this.isSuppressed) {
                    this.this$0.handler.removeMessages(4);
                }
                this.isSuppressed = false;
                return;
            }
            long jElapsedRealtime = this.this$0.clock.elapsedRealtime();
            if (this.isSuppressed && this.suppressionReason == playbackSuppressionReason) {
                long j2 = jElapsedRealtime - this.startRealtimeMs;
                int i2 = this.stuckSuppressedTimeoutMs;
                if (j2 >= i2) {
                    this.this$0.callback.onStuckPlayerDetected(new StuckPlayerException(4, i2));
                    return;
                }
                return;
            }
            this.isSuppressed = true;
            this.startRealtimeMs = jElapsedRealtime;
            this.suppressionReason = playbackSuppressionReason;
            this.this$0.handler.removeMessages(4);
            this.this$0.handler.sendEmptyMessageDelayed(4, this.stuckSuppressedTimeoutMs);
        }
    }

    public StuckPlayerDetector(Player player, Callback callback, Clock clock, int i2, int i3, int i4, int i5) {
        this.player = player;
        this.callback = callback;
        this.clock = clock;
        this.handler = clock.createHandler(player.getApplicationLooper(), new Handler.Callback() { // from class: androidx.media3.common.util.StuckPlayerDetector$$ExternalSyntheticLambda0
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f$0.handleMessage(message);
            }
        });
        this.stuckBufferingDetector = new StuckBufferingDetector(this, i2);
        this.stuckPlayingDetector = new StuckPlayingDetector(this, i3);
        this.stuckPlayingNotEndingDetector = new StuckPlayingNotEndingDetector(this, i4);
        this.stuckSuppressedDetector = new StuckSuppressedDetector(this, i5);
        Player.Listener listener = new Player.Listener(this) { // from class: androidx.media3.common.util.StuckPlayerDetector.1
            final /* synthetic */ StuckPlayerDetector this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            @Override // androidx.media3.common.Player.Listener
            public /* synthetic */ void onAudioAttributesChanged(AudioAttributes audioAttributes) {
            }

            @Override // androidx.media3.common.Player.Listener
            public /* synthetic */ void onAudioSessionIdChanged(int i6) {
            }

            @Override // androidx.media3.common.Player.Listener
            public /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
            }

            @Override // androidx.media3.common.Player.Listener
            public /* synthetic */ void onCues(CueGroup cueGroup) {
            }

            @Override // androidx.media3.common.Player.Listener
            public /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
            }

            @Override // androidx.media3.common.Player.Listener
            public /* synthetic */ void onDeviceVolumeChanged(int i6, boolean z) {
            }

            @Override // androidx.media3.common.Player.Listener
            public void onEvents(Player player2, Player.Events events) {
                this.this$0.onPlayerEvents();
            }

            @Override // androidx.media3.common.Player.Listener
            public /* synthetic */ void onIsLoadingChanged(boolean z) {
            }

            @Override // androidx.media3.common.Player.Listener
            public /* synthetic */ void onIsPlayingChanged(boolean z) {
            }

            @Override // androidx.media3.common.Player.Listener
            public /* synthetic */ void onLoadingChanged(boolean z) {
            }

            @Override // androidx.media3.common.Player.Listener
            public /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j2) {
            }

            @Override // androidx.media3.common.Player.Listener
            public /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i6) {
            }

            @Override // androidx.media3.common.Player.Listener
            public /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
            }

            @Override // androidx.media3.common.Player.Listener
            public /* synthetic */ void onMetadata(Metadata metadata) {
            }

            @Override // androidx.media3.common.Player.Listener
            public /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i6) {
            }

            @Override // androidx.media3.common.Player.Listener
            public /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
            }

            @Override // androidx.media3.common.Player.Listener
            public /* synthetic */ void onPlaybackStateChanged(int i6) {
            }

            @Override // androidx.media3.common.Player.Listener
            public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i6) {
            }

            @Override // androidx.media3.common.Player.Listener
            public /* synthetic */ void onPlayerError(PlaybackException playbackException) {
            }

            @Override // androidx.media3.common.Player.Listener
            public /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
            }

            @Override // androidx.media3.common.Player.Listener
            public /* synthetic */ void onPlayerStateChanged(boolean z, int i6) {
            }

            @Override // androidx.media3.common.Player.Listener
            public /* synthetic */ void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
            }

            @Override // androidx.media3.common.Player.Listener
            public /* synthetic */ void onPositionDiscontinuity(int i6) {
            }

            @Override // androidx.media3.common.Player.Listener
            public /* synthetic */ void onRenderedFirstFrame() {
            }

            @Override // androidx.media3.common.Player.Listener
            public /* synthetic */ void onRepeatModeChanged(int i6) {
            }

            @Override // androidx.media3.common.Player.Listener
            public /* synthetic */ void onSeekBackIncrementChanged(long j2) {
            }

            @Override // androidx.media3.common.Player.Listener
            public /* synthetic */ void onSeekForwardIncrementChanged(long j2) {
            }

            @Override // androidx.media3.common.Player.Listener
            public /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
            }

            @Override // androidx.media3.common.Player.Listener
            public /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
            }

            @Override // androidx.media3.common.Player.Listener
            public /* synthetic */ void onSurfaceSizeChanged(int i6, int i7) {
            }

            @Override // androidx.media3.common.Player.Listener
            public /* synthetic */ void onTimelineChanged(Timeline timeline, int i6) {
            }

            @Override // androidx.media3.common.Player.Listener
            public /* synthetic */ void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
            }

            @Override // androidx.media3.common.Player.Listener
            public /* synthetic */ void onTracksChanged(Tracks tracks) {
            }

            @Override // androidx.media3.common.Player.Listener
            public /* synthetic */ void onVideoSizeChanged(VideoSize videoSize) {
            }

            @Override // androidx.media3.common.Player.Listener
            public /* synthetic */ void onVolumeChanged(float f2) {
            }

            @Override // androidx.media3.common.Player.Listener
            public /* synthetic */ void onCues(List list) {
            }

            @Override // androidx.media3.common.Player.Listener
            public /* synthetic */ void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i6) {
            }
        };
        this.playerListener = listener;
        player.addListener(listener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 1) {
            this.stuckBufferingDetector.update();
            return true;
        }
        if (i2 == 2) {
            this.stuckPlayingDetector.update();
            return true;
        }
        if (i2 == 3) {
            this.stuckPlayingNotEndingDetector.update();
            return true;
        }
        if (i2 != 4) {
            return false;
        }
        this.stuckSuppressedDetector.update();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onPlayerEvents() {
        this.stuckBufferingDetector.update();
        this.stuckPlayingDetector.update();
        this.stuckPlayingNotEndingDetector.update();
        this.stuckSuppressedDetector.update();
    }

    public void release() {
        this.handler.removeCallbacksAndMessages(null);
        this.player.removeListener(this.playerListener);
    }
}
