package androidx.media3.common;

import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.Metadata;
import androidx.media3.common.Player;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.text.CueGroup;
import com.google.d.m.a.bd;
import com.google.d.m.a.bm;
import j$.util.Objects;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class ForwardingSimpleBasePlayer extends SimpleBasePlayer {
    private Metadata lastTimedMetadata;
    private LivePositionSuppliers livePositionSuppliers;
    private int pendingDiscontinuityReason;
    private boolean pendingFirstFrameRendered;
    private long pendingPositionDiscontinuityNewPositionMs;
    private int playWhenReadyChangeReason;
    private Player player;
    private final Player.Listener playerListener;

    /* compiled from: WazeSource */
    final class LivePositionSuppliers {
        public final SimpleBasePlayer.LivePositionSupplier bufferedPositionSupplier;
        public final SimpleBasePlayer.LivePositionSupplier contentBufferedPositionSupplier;
        public final SimpleBasePlayer.LivePositionSupplier contentPositionSupplier;
        public final SimpleBasePlayer.LivePositionSupplier currentPositionSupplier;
        public final SimpleBasePlayer.LivePositionSupplier totalBufferedPositionSupplier;

        public LivePositionSuppliers(final Player player) {
            Objects.requireNonNull(player);
            this.currentPositionSupplier = new SimpleBasePlayer.LivePositionSupplier(new SimpleBasePlayer.PositionSupplier() { // from class: androidx.media3.common.ForwardingSimpleBasePlayer$LivePositionSuppliers$$ExternalSyntheticLambda0
                @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
                public final long get() {
                    return player.getCurrentPosition();
                }
            });
            Objects.requireNonNull(player);
            this.bufferedPositionSupplier = new SimpleBasePlayer.LivePositionSupplier(new SimpleBasePlayer.PositionSupplier() { // from class: androidx.media3.common.ForwardingSimpleBasePlayer$LivePositionSuppliers$$ExternalSyntheticLambda1
                @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
                public final long get() {
                    return player.getBufferedPosition();
                }
            });
            Objects.requireNonNull(player);
            this.contentPositionSupplier = new SimpleBasePlayer.LivePositionSupplier(new SimpleBasePlayer.PositionSupplier() { // from class: androidx.media3.common.ForwardingSimpleBasePlayer$LivePositionSuppliers$$ExternalSyntheticLambda2
                @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
                public final long get() {
                    return player.getContentPosition();
                }
            });
            Objects.requireNonNull(player);
            this.contentBufferedPositionSupplier = new SimpleBasePlayer.LivePositionSupplier(new SimpleBasePlayer.PositionSupplier() { // from class: androidx.media3.common.ForwardingSimpleBasePlayer$LivePositionSuppliers$$ExternalSyntheticLambda3
                @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
                public final long get() {
                    return player.getContentBufferedPosition();
                }
            });
            Objects.requireNonNull(player);
            this.totalBufferedPositionSupplier = new SimpleBasePlayer.LivePositionSupplier(new SimpleBasePlayer.PositionSupplier() { // from class: androidx.media3.common.ForwardingSimpleBasePlayer$LivePositionSuppliers$$ExternalSyntheticLambda4
                @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
                public final long get() {
                    return player.getTotalBufferedDuration();
                }
            });
        }

        public void disconnect(long j2, long j3) {
            this.currentPositionSupplier.disconnect(j2);
            this.bufferedPositionSupplier.disconnect(j2);
            this.contentPositionSupplier.disconnect(j3);
            this.contentBufferedPositionSupplier.disconnect(j3);
            this.totalBufferedPositionSupplier.disconnect(0L);
        }
    }

    /* compiled from: WazeSource */
    class PlayerListener implements Player.Listener {
        final /* synthetic */ ForwardingSimpleBasePlayer this$0;

        private PlayerListener(ForwardingSimpleBasePlayer forwardingSimpleBasePlayer) {
            Objects.requireNonNull(forwardingSimpleBasePlayer);
            this.this$0 = forwardingSimpleBasePlayer;
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onAudioAttributesChanged(AudioAttributes audioAttributes) {
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onAudioSessionIdChanged(int i2) {
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
        public /* synthetic */ void onDeviceVolumeChanged(int i2, boolean z) {
        }

        @Override // androidx.media3.common.Player.Listener
        public void onEvents(Player player, Player.Events events) {
            this.this$0.invalidateState();
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
        public /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i2) {
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
        }

        @Override // androidx.media3.common.Player.Listener
        public void onMetadata(Metadata metadata) {
            this.this$0.lastTimedMetadata = metadata;
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlayWhenReadyChanged(boolean z, int i2) {
            this.this$0.playWhenReadyChangeReason = i2;
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onPlaybackStateChanged(int i2) {
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i2) {
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onPlayerError(PlaybackException playbackException) {
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onPlayerStateChanged(boolean z, int i2) {
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i2) {
            this.this$0.pendingDiscontinuityReason = i2;
            this.this$0.pendingPositionDiscontinuityNewPositionMs = positionInfo2.positionMs;
            this.this$0.livePositionSuppliers.disconnect(positionInfo.positionMs, positionInfo.contentPositionMs);
            this.this$0.livePositionSuppliers = new LivePositionSuppliers(this.this$0.player);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onRenderedFirstFrame() {
            this.this$0.pendingFirstFrameRendered = true;
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onRepeatModeChanged(int i2) {
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
        public /* synthetic */ void onSurfaceSizeChanged(int i2, int i3) {
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onTimelineChanged(Timeline timeline, int i2) {
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
        public /* synthetic */ void onPositionDiscontinuity(int i2) {
        }
    }

    public ForwardingSimpleBasePlayer(Player player) {
        super(player.getApplicationLooper());
        initializeForwardingState(player);
        PlayerListener playerListener = new PlayerListener();
        this.playerListener = playerListener;
        player.addListener(playerListener);
    }

    private void initializeForwardingState(Player player) {
        this.player = player;
        this.lastTimedMetadata = new Metadata(C.TIME_UNSET, new Metadata.Entry[0]);
        this.playWhenReadyChangeReason = 1;
        this.pendingDiscontinuityReason = 5;
        this.livePositionSuppliers = new LivePositionSuppliers(player);
    }

    protected final Player getPlayer() {
        return this.player;
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected SimpleBasePlayer.State getState() {
        SimpleBasePlayer.State.Builder builder = new SimpleBasePlayer.State.Builder();
        LivePositionSuppliers livePositionSuppliers = this.livePositionSuppliers;
        if (this.player.isCommandAvailable(16)) {
            builder.setAdBufferedPositionMs(livePositionSuppliers.bufferedPositionSupplier);
            builder.setAdPositionMs(livePositionSuppliers.currentPositionSupplier);
        }
        if (this.player.isCommandAvailable(21)) {
            builder.setAudioAttributes(this.player.getAudioAttributes());
        }
        builder.setAudioSessionId(this.player.getAudioSessionId());
        builder.setAvailableCommands(this.player.getAvailableCommands());
        if (this.player.isCommandAvailable(16)) {
            builder.setContentBufferedPositionMs(livePositionSuppliers.contentBufferedPositionSupplier);
            builder.setContentPositionMs(livePositionSuppliers.contentPositionSupplier);
            if (this.player.isCommandAvailable(17)) {
                builder.setCurrentAd(this.player.getCurrentAdGroupIndex(), this.player.getCurrentAdIndexInAdGroup());
            }
        }
        if (this.player.isCommandAvailable(28)) {
            builder.setCurrentCues(this.player.getCurrentCues());
        }
        if (this.player.isCommandAvailable(17)) {
            builder.setCurrentMediaItemIndex(this.player.getCurrentMediaItemIndex());
        }
        builder.setDeviceInfo(this.player.getDeviceInfo());
        if (this.player.isCommandAvailable(23)) {
            builder.setDeviceVolume(this.player.getDeviceVolume());
            builder.setIsDeviceMuted(this.player.isDeviceMuted());
        }
        builder.setIsLoading(this.player.isLoading());
        builder.setMaxSeekToPreviousPositionMs(this.player.getMaxSeekToPreviousPosition());
        if (this.pendingFirstFrameRendered) {
            builder.setNewlyRenderedFirstFrame(true);
            this.pendingFirstFrameRendered = false;
        }
        builder.setPlaybackParameters(this.player.getPlaybackParameters());
        builder.setPlaybackState(this.player.getPlaybackState());
        builder.setPlaybackSuppressionReason(this.player.getPlaybackSuppressionReason());
        builder.setPlayerError(this.player.getPlayerError());
        if (this.player.isCommandAvailable(17)) {
            builder.setPlaylist(this.player.getCurrentTimeline(), this.player.isCommandAvailable(30) ? this.player.getCurrentTracks() : Tracks.EMPTY, this.player.isCommandAvailable(18) ? this.player.getMediaMetadata() : null);
        }
        if (this.player.isCommandAvailable(18)) {
            builder.setPlaylistMetadata(this.player.getPlaylistMetadata());
        }
        builder.setPlayWhenReady(this.player.getPlayWhenReady(), this.playWhenReadyChangeReason);
        long j2 = this.pendingPositionDiscontinuityNewPositionMs;
        if (j2 != C.TIME_UNSET) {
            builder.setPositionDiscontinuity(this.pendingDiscontinuityReason, j2);
            this.pendingPositionDiscontinuityNewPositionMs = C.TIME_UNSET;
        }
        builder.setRepeatMode(this.player.getRepeatMode());
        builder.setSeekBackIncrementMs(this.player.getSeekBackIncrement());
        builder.setSeekForwardIncrementMs(this.player.getSeekForwardIncrement());
        builder.setShuffleModeEnabled(this.player.getShuffleModeEnabled());
        builder.setSurfaceSize(this.player.getSurfaceSize());
        builder.setTimedMetadata(this.lastTimedMetadata);
        if (this.player.isCommandAvailable(16)) {
            builder.setTotalBufferedDurationMs(livePositionSuppliers.totalBufferedPositionSupplier);
        }
        builder.setTrackSelectionParameters(this.player.getTrackSelectionParameters());
        builder.setVideoSize(this.player.getVideoSize());
        if (this.player.isCommandAvailable(22)) {
            builder.setVolume(this.player.getVolume());
        }
        return builder.build();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected bm<?> handleAddMediaItems(int i2, List<MediaItem> list) {
        int size = list.size();
        Player player = this.player;
        if (size == 1) {
            player.addMediaItem(i2, list.get(0));
        } else {
            player.addMediaItems(i2, list);
        }
        return bd.i();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected bm<?> handleClearVideoOutput(Object obj) {
        if (obj instanceof SurfaceView) {
            this.player.clearVideoSurfaceView((SurfaceView) obj);
        } else if (obj instanceof TextureView) {
            this.player.clearVideoTextureView((TextureView) obj);
        } else if (obj instanceof SurfaceHolder) {
            this.player.clearVideoSurfaceHolder((SurfaceHolder) obj);
        } else if (obj instanceof Surface) {
            this.player.clearVideoSurface((Surface) obj);
        } else {
            if (obj != null) {
                throw new IllegalStateException();
            }
            this.player.clearVideoSurface();
        }
        return bd.i();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected bm<?> handleDecreaseDeviceVolume(int i2) {
        boolean zIsCommandAvailable = this.player.isCommandAvailable(34);
        Player player = this.player;
        if (zIsCommandAvailable) {
            player.decreaseDeviceVolume(i2);
        } else {
            player.decreaseDeviceVolume();
        }
        return bd.i();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected bm<?> handleIncreaseDeviceVolume(int i2) {
        boolean zIsCommandAvailable = this.player.isCommandAvailable(34);
        Player player = this.player;
        if (zIsCommandAvailable) {
            player.increaseDeviceVolume(i2);
        } else {
            player.increaseDeviceVolume();
        }
        return bd.i();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected bm<?> handleMoveMediaItems(int i2, int i3, int i4) {
        int i5 = i2 + 1;
        Player player = this.player;
        if (i3 == i5) {
            player.moveMediaItem(i2, i4);
        } else {
            player.moveMediaItems(i2, i3, i4);
        }
        return bd.i();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected bm<?> handlePrepare() {
        this.player.prepare();
        return bd.i();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected bm<?> handleRelease() {
        this.player.release();
        return bd.i();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected bm<?> handleRemoveMediaItems(int i2, int i3) {
        int i4 = i2 + 1;
        Player player = this.player;
        if (i3 == i4) {
            player.removeMediaItem(i2);
        } else {
            player.removeMediaItems(i2, i3);
        }
        return bd.i();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected bm<?> handleReplaceMediaItems(int i2, int i3, List<MediaItem> list) {
        if (i3 == i2 + 1 && list.size() == 1) {
            this.player.replaceMediaItem(i2, list.get(0));
        } else {
            this.player.replaceMediaItems(i2, i3, list);
        }
        return bd.i();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected bm<?> handleSeek(int i2, long j2, int i3) {
        switch (i3) {
            case 4:
                this.player.seekToDefaultPosition();
                break;
            case 5:
                this.player.seekTo(j2);
                break;
            case 6:
                this.player.seekToPreviousMediaItem();
                break;
            case 7:
                this.player.seekToPrevious();
                break;
            case 8:
                this.player.seekToNextMediaItem();
                break;
            case 9:
                this.player.seekToNext();
                break;
            case 10:
                if (i2 != -1) {
                    this.player.seekTo(i2, j2);
                    break;
                }
                break;
            case 11:
                this.player.seekBack();
                break;
            case 12:
                this.player.seekForward();
                break;
            default:
                throw new IllegalStateException();
        }
        return bd.i();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected bm<?> handleSetAudioAttributes(AudioAttributes audioAttributes, boolean z) {
        this.player.setAudioAttributes(audioAttributes, z);
        return bd.i();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected bm<?> handleSetDeviceMuted(boolean z, int i2) {
        boolean zIsCommandAvailable = this.player.isCommandAvailable(34);
        Player player = this.player;
        if (zIsCommandAvailable) {
            player.setDeviceMuted(z, i2);
        } else {
            player.setDeviceMuted(z);
        }
        return bd.i();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected bm<?> handleSetDeviceVolume(int i2, int i3) {
        boolean zIsCommandAvailable = this.player.isCommandAvailable(33);
        Player player = this.player;
        if (zIsCommandAvailable) {
            player.setDeviceVolume(i2, i3);
        } else {
            player.setDeviceVolume(i2);
        }
        return bd.i();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected bm<?> handleSetMediaItems(List<MediaItem> list, int i2, long j2) {
        boolean z = list.size() == 1 && this.player.isCommandAvailable(31);
        if (i2 == -1) {
            Player player = this.player;
            if (z) {
                player.setMediaItem(list.get(0));
            } else {
                player.setMediaItems(list);
            }
        } else {
            Player player2 = this.player;
            if (z) {
                player2.setMediaItem(list.get(0), j2);
            } else {
                player2.setMediaItems(list, i2, j2);
            }
        }
        return bd.i();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected bm<?> handleSetPlayWhenReady(boolean z) {
        this.player.setPlayWhenReady(z);
        return bd.i();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected bm<?> handleSetPlaybackParameters(PlaybackParameters playbackParameters) {
        this.player.setPlaybackParameters(playbackParameters);
        return bd.i();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected bm<?> handleSetPlaylistMetadata(MediaMetadata mediaMetadata) {
        this.player.setPlaylistMetadata(mediaMetadata);
        return bd.i();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected bm<?> handleSetRepeatMode(int i2) {
        this.player.setRepeatMode(i2);
        return bd.i();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected bm<?> handleSetShuffleModeEnabled(boolean z) {
        this.player.setShuffleModeEnabled(z);
        return bd.i();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected bm<?> handleSetTrackSelectionParameters(TrackSelectionParameters trackSelectionParameters) {
        this.player.setTrackSelectionParameters(trackSelectionParameters);
        return bd.i();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected bm<?> handleSetVideoOutput(Object obj) {
        if (obj instanceof SurfaceView) {
            this.player.setVideoSurfaceView((SurfaceView) obj);
        } else if (obj instanceof TextureView) {
            this.player.setVideoTextureView((TextureView) obj);
        } else if (obj instanceof SurfaceHolder) {
            this.player.setVideoSurfaceHolder((SurfaceHolder) obj);
        } else {
            if (!(obj instanceof Surface)) {
                throw new IllegalStateException();
            }
            this.player.setVideoSurface((Surface) obj);
        }
        return bd.i();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected bm<?> handleSetVolume(float f2, int i2) {
        if (i2 == 0) {
            this.player.setVolume(f2);
        } else if (i2 == 1) {
            this.player.mute();
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("Unknown volume operation type: " + i2);
            }
            this.player.unmute();
        }
        return bd.i();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected bm<?> handleStop() {
        this.player.stop();
        return bd.i();
    }

    protected final void setPlayer(Player player) {
        Player player2 = this.player;
        if (player2 == player) {
            return;
        }
        if (player.getApplicationLooper() != player2.getApplicationLooper()) {
            throw new IllegalArgumentException("Trying to swap players with non-matching loopers.");
        }
        player2.removeListener(this.playerListener);
        player.addListener(this.playerListener);
        initializeForwardingState(player);
        this.pendingPositionDiscontinuityNewPositionMs = player.getCurrentPosition();
        invalidateState();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected final bm<?> handleSetVolume(float f2) {
        this.player.setVolume(f2);
        return bd.i();
    }
}
