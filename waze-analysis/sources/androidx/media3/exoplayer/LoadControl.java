package androidx.media3.exoplayer;

import androidx.media3.common.Timeline;
import androidx.media3.common.util.Log;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.Allocator;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface LoadControl {

    @Deprecated
    public static final MediaSource.MediaPeriodId EMPTY_MEDIA_PERIOD_ID = new MediaSource.MediaPeriodId(new Object());

    /* compiled from: WazeSource */
    public final class Parameters {
        public final long bufferedDurationUs;
        public final long lastRebufferRealtimeMs;
        public final MediaSource.MediaPeriodId mediaPeriodId;
        public final boolean playWhenReady;
        public final long playbackPositionUs;
        public final float playbackSpeed;
        public final PlayerId playerId;
        public final boolean rebuffering;
        public final long targetLiveOffsetUs;
        public final Timeline timeline;

        public Parameters(PlayerId playerId, Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, long j2, long j3, float f2, boolean z, boolean z2, long j4, long j5) {
            this.playerId = playerId;
            this.timeline = timeline;
            this.mediaPeriodId = mediaPeriodId;
            this.playbackPositionUs = j2;
            this.bufferedDurationUs = j3;
            this.playbackSpeed = f2;
            this.playWhenReady = z;
            this.rebuffering = z2;
            this.targetLiveOffsetUs = j4;
            this.lastRebufferRealtimeMs = j5;
        }
    }

    Allocator getAllocator(PlayerId playerId);

    @Deprecated
    long getBackBufferDurationUs();

    long getBackBufferDurationUs(PlayerId playerId);

    @Deprecated
    void onPrepared();

    void onPrepared(PlayerId playerId);

    @Deprecated
    void onReleased();

    void onReleased(PlayerId playerId);

    @Deprecated
    void onStopped();

    void onStopped(PlayerId playerId);

    @Deprecated
    void onTracksSelected(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, Renderer[] rendererArr, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr);

    void onTracksSelected(Parameters parameters, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr);

    @Deprecated
    void onTracksSelected(PlayerId playerId, Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, Renderer[] rendererArr, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr);

    @Deprecated
    void onTracksSelected(Renderer[] rendererArr, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr);

    @Deprecated
    boolean retainBackBufferFromKeyframe();

    boolean retainBackBufferFromKeyframe(PlayerId playerId);

    @Deprecated
    boolean shouldContinueLoading(long j2, long j3, float f2);

    boolean shouldContinueLoading(Parameters parameters);

    boolean shouldContinuePreloading(PlayerId playerId, Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, long j2);

    @Deprecated
    boolean shouldStartPlayback(long j2, float f2, boolean z, long j3);

    @Deprecated
    boolean shouldStartPlayback(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, long j2, float f2, boolean z, long j3);

    boolean shouldStartPlayback(Parameters parameters);

    /* compiled from: WazeSource */
    /* renamed from: androidx.media3.exoplayer.LoadControl$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        @Deprecated
        public static long $default$getBackBufferDurationUs(LoadControl loadControl) {
            throw new IllegalStateException("getBackBufferDurationUs not implemented");
        }

        @Deprecated
        public static void $default$onPrepared(LoadControl loadControl) {
            throw new IllegalStateException("onPrepared not implemented");
        }

        @Deprecated
        public static void $default$onReleased(LoadControl loadControl) {
            throw new IllegalStateException("onReleased not implemented");
        }

        @Deprecated
        public static void $default$onStopped(LoadControl loadControl) {
            throw new IllegalStateException("onStopped not implemented");
        }

        @Deprecated
        public static boolean $default$retainBackBufferFromKeyframe(LoadControl loadControl) {
            throw new IllegalStateException("retainBackBufferFromKeyframe not implemented");
        }

        public static boolean $default$shouldContinuePreloading(LoadControl loadControl, PlayerId playerId, Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, long j2) {
            Log.w("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
            return false;
        }

        public static void $default$onTracksSelected(LoadControl loadControl, Parameters parameters, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr) {
            throw new IllegalStateException("onTracksSelected not implemented");
        }

        @Deprecated
        public static void $default$onTracksSelected(LoadControl loadControl, Renderer[] rendererArr, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr) {
            throw new IllegalStateException("onTracksSelected not implemented");
        }

        @Deprecated
        public static boolean $default$shouldContinueLoading(LoadControl loadControl, long j2, long j3, float f2) {
            throw new IllegalStateException("shouldContinueLoading not implemented");
        }

        @Deprecated
        public static boolean $default$shouldStartPlayback(LoadControl loadControl, long j2, float f2, boolean z, long j3) {
            throw new IllegalStateException("shouldStartPlayback not implemented");
        }
    }
}
