package androidx.media3.exoplayer;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.os.Looper;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.AuxEffectInfo;
import androidx.media3.common.C;
import androidx.media3.common.Effect;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Player;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.DefaultLivePlaybackSpeedControl;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.PlayerMessage;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.audio.AudioOutputProvider;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.ShuffleOrder;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelectionArray;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import androidx.media3.exoplayer.upstream.DefaultBandwidthMeter;
import androidx.media3.exoplayer.video.VideoFrameMetadataListener;
import androidx.media3.exoplayer.video.spherical.CameraMotionListener;
import androidx.media3.extractor.DefaultExtractorsFactory;
import com.google.d.b.aj;
import com.google.d.b.an;
import com.google.d.b.t;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface ExoPlayer extends Player {

    @Deprecated
    public static final long DEFAULT_DETACH_SURFACE_TIMEOUT_MS = 2000;

    @Deprecated
    public static final long DEFAULT_RELEASE_TIMEOUT_MS = 500;

    @Deprecated
    public static final int DEFAULT_STUCK_BUFFERING_DETECTION_TIMEOUT_MS = 600000;

    @Deprecated
    public static final int DEFAULT_STUCK_PLAYING_NOT_ENDING_TIMEOUT_MS = 60000;

    @Deprecated
    public static final int DEFAULT_STUCK_SUPPRESSED_DETECTION_TIMEOUT_MS = 600000;

    /* compiled from: WazeSource */
    /* renamed from: androidx.media3.exoplayer.ExoPlayer$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    /* compiled from: WazeSource */
    public interface AudioOffloadListener {

        /* compiled from: WazeSource */
        /* renamed from: androidx.media3.exoplayer.ExoPlayer$AudioOffloadListener$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$onOffloadedPlayback(AudioOffloadListener audioOffloadListener, boolean z) {
            }

            public static void $default$onSleepingForOffloadChanged(AudioOffloadListener audioOffloadListener, boolean z) {
            }
        }

        void onOffloadedPlayback(boolean z);

        void onSleepingForOffloadChanged(boolean z);
    }

    /* compiled from: WazeSource */
    public class PreloadConfiguration {
        public static final PreloadConfiguration DEFAULT = new PreloadConfiguration(C.TIME_UNSET);
        public final long targetPreloadDurationUs;

        public PreloadConfiguration(long j2) {
            this.targetPreloadDurationUs = j2;
        }
    }

    void addAnalyticsListener(AnalyticsListener analyticsListener);

    void addAudioCodecParametersChangeListener(CodecParametersChangeListener codecParametersChangeListener, List<String> list);

    void addAudioOffloadListener(AudioOffloadListener audioOffloadListener);

    void addMediaSource(int i2, MediaSource mediaSource);

    void addMediaSource(MediaSource mediaSource);

    void addMediaSources(int i2, List<MediaSource> list);

    void addMediaSources(List<MediaSource> list);

    void addVideoCodecParametersChangeListener(CodecParametersChangeListener codecParametersChangeListener, List<String> list);

    void clearAuxEffectInfo();

    void clearCameraMotionListener(CameraMotionListener cameraMotionListener);

    void clearVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

    PlayerMessage createMessage(PlayerMessage.Target target);

    AnalyticsCollector getAnalyticsCollector();

    DecoderCounters getAudioDecoderCounters();

    Format getAudioFormat();

    Clock getClock();

    @Deprecated
    TrackGroupArray getCurrentTrackGroups();

    @Deprecated
    TrackSelectionArray getCurrentTrackSelections();

    boolean getPauseAtEndOfMediaItems();

    Looper getPlaybackLooper();

    @Override // androidx.media3.common.Player
    ExoPlaybackException getPlayerError();

    PreloadConfiguration getPreloadConfiguration();

    Renderer getRenderer(int i2);

    int getRendererCount();

    int getRendererType(int i2);

    ScrubbingModeParameters getScrubbingModeParameters();

    Renderer getSecondaryRenderer(int i2);

    SeekParameters getSeekParameters();

    ShuffleOrder getShuffleOrder();

    boolean getSkipSilenceEnabled();

    TrackSelector getTrackSelector();

    int getVideoChangeFrameRateStrategy();

    DecoderCounters getVideoDecoderCounters();

    Format getVideoFormat();

    int getVideoScalingMode();

    boolean isReleased();

    boolean isScrubbingModeEnabled();

    boolean isSleepingForOffload();

    boolean isTunnelingEnabled();

    @Deprecated
    void prepare(MediaSource mediaSource);

    @Deprecated
    void prepare(MediaSource mediaSource, boolean z, boolean z2);

    @Override // androidx.media3.common.Player
    void release();

    void removeAnalyticsListener(AnalyticsListener analyticsListener);

    void removeAudioCodecParametersChangeListener(CodecParametersChangeListener codecParametersChangeListener);

    void removeAudioOffloadListener(AudioOffloadListener audioOffloadListener);

    void removeVideoCodecParametersChangeListener(CodecParametersChangeListener codecParametersChangeListener);

    @Override // androidx.media3.common.Player
    void replaceMediaItem(int i2, MediaItem mediaItem);

    @Override // androidx.media3.common.Player
    void replaceMediaItems(int i2, int i3, List<MediaItem> list);

    void setAudioCodecParameters(CodecParameters codecParameters);

    void setAudioSessionId(int i2);

    void setAuxEffectInfo(AuxEffectInfo auxEffectInfo);

    void setCameraMotionListener(CameraMotionListener cameraMotionListener);

    void setEnforceAdPlaybackOnTimelineRefresh(boolean z);

    void setForegroundMode(boolean z);

    void setHandleAudioBecomingNoisy(boolean z);

    void setImageOutput(ImageOutput imageOutput);

    void setMaxSeekToPreviousPositionMs(long j2);

    void setMediaSource(MediaSource mediaSource);

    void setMediaSource(MediaSource mediaSource, long j2);

    void setMediaSource(MediaSource mediaSource, boolean z);

    void setMediaSources(List<MediaSource> list);

    void setMediaSources(List<MediaSource> list, int i2, long j2);

    void setMediaSources(List<MediaSource> list, boolean z);

    void setPauseAtEndOfMediaItems(boolean z);

    void setPreferredAudioDevice(AudioDeviceInfo audioDeviceInfo);

    void setPreloadConfiguration(PreloadConfiguration preloadConfiguration);

    void setPriority(int i2);

    void setPriorityTaskManager(PriorityTaskManager priorityTaskManager);

    void setScrubbingModeEnabled(boolean z);

    void setScrubbingModeParameters(ScrubbingModeParameters scrubbingModeParameters);

    void setSeekBackIncrementMs(long j2);

    void setSeekForwardIncrementMs(long j2);

    void setSeekParameters(SeekParameters seekParameters);

    void setShuffleOrder(ShuffleOrder shuffleOrder);

    void setSkipSilenceEnabled(boolean z);

    void setVideoChangeFrameRateStrategy(int i2);

    void setVideoCodecParameters(CodecParameters codecParameters);

    void setVideoEffects(List<Effect> list);

    void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

    void setVideoScalingMode(int i2);

    void setVirtualDeviceId(int i2);

    void setWakeMode(int i2);

    /* compiled from: WazeSource */
    public final class Builder {
        public static final long DEFAULT_DETACH_SURFACE_TIMEOUT_MS = 2000;
        public static final long DEFAULT_RELEASE_TIMEOUT_MS = 500;
        public static final int DEFAULT_STUCK_BUFFERING_DETECTION_TIMEOUT_MS = 600000;
        public static final int DEFAULT_STUCK_PLAYING_DETECTION_TIMEOUT_MS;
        public static final int DEFAULT_STUCK_PLAYING_NOT_ENDING_TIMEOUT_MS = 60000;
        public static final int DEFAULT_STUCK_SUPPRESSED_DETECTION_TIMEOUT_MS = 600000;
        public static boolean experimentalEnableStuckPlayingDetection;
        t<Clock, AnalyticsCollector> analyticsCollectorFunction;
        AudioAttributes audioAttributes;
        AudioOutputProvider audioOutputProvider;
        aj<BandwidthMeter> bandwidthMeterSupplier;
        boolean buildCalled;
        Clock clock;
        final Context context;
        long detachSurfaceTimeoutMs;
        boolean deviceVolumeControlEnabled;
        boolean dynamicSchedulingEnabled;
        boolean enforceAdPlaybackOnTimelineRefresh;
        long foregroundModeTimeoutMs;
        boolean handleAudioBecomingNoisy;
        boolean handleAudioFocus;
        LivePlaybackSpeedControl livePlaybackSpeedControl;
        aj<LoadControl> loadControlSupplier;
        Looper looper;
        long maxSeekToPreviousPositionMs;
        aj<MediaSource.Factory> mediaSourceFactorySupplier;
        boolean pauseAtEndOfMediaItems;
        boolean perStreamMediaProgressionEnabled;
        PlaybackLooperProvider playbackLooperProvider;
        String playerName;
        int priority;
        PriorityTaskManager priorityTaskManager;
        long releaseTimeoutMs;
        aj<RenderersFactory> renderersFactorySupplier;
        ScrubbingModeParameters scrubbingModeParameters;
        long seekBackIncrementMs;
        long seekForwardIncrementMs;
        SeekParameters seekParameters;
        boolean skipSilenceEnabled;
        int stuckBufferingDetectionTimeoutMs;
        int stuckPlayingDetectionTimeoutMs;
        int stuckPlayingNotEndingTimeoutMs;
        int stuckSuppressedDetectionTimeoutMs;
        SuitableOutputChecker suitableOutputChecker;
        boolean suppressPlaybackOnUnsuitableOutput;
        aj<TrackSelector> trackSelectorSupplier;
        boolean useLazyPreparation;
        boolean usePlatformDiagnostics;
        int videoChangeFrameRateStrategy;
        int videoScalingMode;
        int wakeMode;
        boolean wakeModeSet;

        static {
            DEFAULT_STUCK_PLAYING_DETECTION_TIMEOUT_MS = true != Util.isRunningOnEmulator() ? 10000 : 30000;
            experimentalEnableStuckPlayingDetection = false;
        }

        private Builder(Context context, aj<RenderersFactory> ajVar, aj<MediaSource.Factory> ajVar2, aj<TrackSelector> ajVar3, aj<LoadControl> ajVar4, aj<BandwidthMeter> ajVar5, t<Clock, AnalyticsCollector> tVar) {
            an.B(context);
            this.context = context;
            this.renderersFactorySupplier = ajVar;
            this.mediaSourceFactorySupplier = ajVar2;
            this.trackSelectorSupplier = ajVar3;
            this.loadControlSupplier = ajVar4;
            this.bandwidthMeterSupplier = ajVar5;
            this.analyticsCollectorFunction = tVar;
            this.looper = Util.getCurrentOrMainLooper();
            this.audioAttributes = AudioAttributes.DEFAULT;
            this.wakeMode = 0;
            this.videoScalingMode = 1;
            this.videoChangeFrameRateStrategy = 0;
            this.useLazyPreparation = true;
            this.seekParameters = SeekParameters.DEFAULT;
            this.seekBackIncrementMs = 5000L;
            this.seekForwardIncrementMs = 15000L;
            this.maxSeekToPreviousPositionMs = C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS;
            this.scrubbingModeParameters = ScrubbingModeParameters.DEFAULT;
            this.livePlaybackSpeedControl = new DefaultLivePlaybackSpeedControl.Builder().build();
            this.clock = Clock.DEFAULT;
            this.releaseTimeoutMs = 500L;
            this.detachSurfaceTimeoutMs = 2000L;
            this.stuckBufferingDetectionTimeoutMs = 600000;
            boolean z = experimentalEnableStuckPlayingDetection;
            this.stuckPlayingDetectionTimeoutMs = z ? DEFAULT_STUCK_PLAYING_DETECTION_TIMEOUT_MS : Integer.MAX_VALUE;
            this.stuckPlayingNotEndingTimeoutMs = true == z ? 60000 : Integer.MAX_VALUE;
            this.stuckSuppressedDetectionTimeoutMs = 600000;
            this.usePlatformDiagnostics = true;
            this.playerName = "";
            this.priority = -1000;
            this.suitableOutputChecker = new DefaultSuitableOutputChecker();
            this.dynamicSchedulingEnabled = true;
            this.enforceAdPlaybackOnTimelineRefresh = true;
        }

        static /* synthetic */ RenderersFactory lambda$new$0(Context context) {
            return new DefaultRenderersFactory(context);
        }

        static /* synthetic */ MediaSource.Factory lambda$new$1(Context context) {
            return new DefaultMediaSourceFactory(context, new DefaultExtractorsFactory());
        }

        static /* synthetic */ TrackSelector lambda$new$10(TrackSelector trackSelector) {
            return trackSelector;
        }

        static /* synthetic */ LoadControl lambda$new$11(LoadControl loadControl) {
            return loadControl;
        }

        static /* synthetic */ BandwidthMeter lambda$new$12(BandwidthMeter bandwidthMeter) {
            return bandwidthMeter;
        }

        static /* synthetic */ AnalyticsCollector lambda$new$13(AnalyticsCollector analyticsCollector, Clock clock) {
            return analyticsCollector;
        }

        static /* synthetic */ TrackSelector lambda$new$14(Context context) {
            return new DefaultTrackSelector(context);
        }

        static /* synthetic */ RenderersFactory lambda$new$2(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        static /* synthetic */ MediaSource.Factory lambda$new$3(Context context) {
            return new DefaultMediaSourceFactory(context, new DefaultExtractorsFactory());
        }

        static /* synthetic */ RenderersFactory lambda$new$4(Context context) {
            return new DefaultRenderersFactory(context);
        }

        static /* synthetic */ MediaSource.Factory lambda$new$5(MediaSource.Factory factory) {
            return factory;
        }

        static /* synthetic */ RenderersFactory lambda$new$6(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        static /* synthetic */ MediaSource.Factory lambda$new$7(MediaSource.Factory factory) {
            return factory;
        }

        static /* synthetic */ RenderersFactory lambda$new$8(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        static /* synthetic */ MediaSource.Factory lambda$new$9(MediaSource.Factory factory) {
            return factory;
        }

        static /* synthetic */ AnalyticsCollector lambda$setAnalyticsCollector$0(AnalyticsCollector analyticsCollector, Clock clock) {
            return analyticsCollector;
        }

        static /* synthetic */ BandwidthMeter lambda$setBandwidthMeter$0(BandwidthMeter bandwidthMeter) {
            return bandwidthMeter;
        }

        static /* synthetic */ LoadControl lambda$setLoadControl$0(LoadControl loadControl) {
            return loadControl;
        }

        static /* synthetic */ MediaSource.Factory lambda$setMediaSourceFactory$0(MediaSource.Factory factory) {
            return factory;
        }

        static /* synthetic */ RenderersFactory lambda$setRenderersFactory$0(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        static /* synthetic */ TrackSelector lambda$setTrackSelector$0(TrackSelector trackSelector) {
            return trackSelector;
        }

        public ExoPlayer build() {
            an.u(!this.buildCalled);
            this.buildCalled = true;
            return new ExoPlayerImpl(this, null);
        }

        SimpleExoPlayer buildSimpleExoPlayer() {
            an.u(!this.buildCalled);
            this.buildCalled = true;
            return new SimpleExoPlayer(this);
        }

        public Builder enablePerStreamMediaProgression(boolean z) {
            an.u(!this.buildCalled);
            this.perStreamMediaProgressionEnabled = z;
            return this;
        }

        public Builder experimentalSetDynamicSchedulingEnabled(boolean z) {
            an.u(!this.buildCalled);
            this.dynamicSchedulingEnabled = z;
            return this;
        }

        public Builder experimentalSetForegroundModeTimeoutMs(long j2) {
            an.u(!this.buildCalled);
            this.foregroundModeTimeoutMs = j2;
            return this;
        }

        public Builder setAnalyticsCollector(final AnalyticsCollector analyticsCollector) {
            an.u(!this.buildCalled);
            an.B(analyticsCollector);
            this.analyticsCollectorFunction = new t() { // from class: androidx.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda10
                @Override // com.google.d.b.t
                public final Object apply(Object obj) {
                    AnalyticsCollector analyticsCollector2 = analyticsCollector;
                    long j2 = ExoPlayer.Builder.DEFAULT_RELEASE_TIMEOUT_MS;
                    return analyticsCollector2;
                }
            };
            return this;
        }

        public Builder setAudioAttributes(AudioAttributes audioAttributes, boolean z) {
            an.u(!this.buildCalled);
            an.B(audioAttributes);
            this.audioAttributes = audioAttributes;
            this.handleAudioFocus = z;
            return this;
        }

        public Builder setAudioOutputProvider(AudioOutputProvider audioOutputProvider) {
            an.u(!this.buildCalled);
            an.B(audioOutputProvider);
            this.audioOutputProvider = audioOutputProvider;
            return this;
        }

        public Builder setBandwidthMeter(final BandwidthMeter bandwidthMeter) {
            an.u(!this.buildCalled);
            an.B(bandwidthMeter);
            an.l(bandwidthMeter != BandwidthMeter.NO_OP);
            this.bandwidthMeterSupplier = new aj() { // from class: androidx.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda1
                @Override // com.google.d.b.aj
                public final Object get() {
                    BandwidthMeter bandwidthMeter2 = bandwidthMeter;
                    long j2 = ExoPlayer.Builder.DEFAULT_RELEASE_TIMEOUT_MS;
                    return bandwidthMeter2;
                }
            };
            return this;
        }

        public Builder setClock(Clock clock) {
            an.u(!this.buildCalled);
            this.clock = clock;
            return this;
        }

        public Builder setDetachSurfaceTimeoutMs(long j2) {
            an.u(!this.buildCalled);
            this.detachSurfaceTimeoutMs = j2;
            return this;
        }

        public Builder setDeviceVolumeControlEnabled(boolean z) {
            an.u(!this.buildCalled);
            this.deviceVolumeControlEnabled = z;
            return this;
        }

        public Builder setEnforceAdPlaybackOnTimelineRefresh(boolean z) {
            an.u(!this.buildCalled);
            this.enforceAdPlaybackOnTimelineRefresh = z;
            return this;
        }

        public Builder setHandleAudioBecomingNoisy(boolean z) {
            an.u(!this.buildCalled);
            this.handleAudioBecomingNoisy = z;
            return this;
        }

        public Builder setLivePlaybackSpeedControl(LivePlaybackSpeedControl livePlaybackSpeedControl) {
            an.u(!this.buildCalled);
            an.B(livePlaybackSpeedControl);
            this.livePlaybackSpeedControl = livePlaybackSpeedControl;
            return this;
        }

        public Builder setLoadControl(final LoadControl loadControl) {
            an.u(!this.buildCalled);
            an.B(loadControl);
            this.loadControlSupplier = new aj() { // from class: androidx.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda0
                @Override // com.google.d.b.aj
                public final Object get() {
                    LoadControl loadControl2 = loadControl;
                    long j2 = ExoPlayer.Builder.DEFAULT_RELEASE_TIMEOUT_MS;
                    return loadControl2;
                }
            };
            return this;
        }

        public Builder setLooper(Looper looper) {
            an.u(!this.buildCalled);
            an.B(looper);
            this.looper = looper;
            return this;
        }

        public Builder setMaxSeekToPreviousPositionMs(long j2) {
            an.l(j2 >= 0);
            an.u(!this.buildCalled);
            this.maxSeekToPreviousPositionMs = j2;
            return this;
        }

        public Builder setMediaSourceFactory(final MediaSource.Factory factory) {
            an.u(!this.buildCalled);
            an.B(factory);
            this.mediaSourceFactorySupplier = new aj() { // from class: androidx.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda9
                @Override // com.google.d.b.aj
                public final Object get() {
                    MediaSource.Factory factory2 = factory;
                    long j2 = ExoPlayer.Builder.DEFAULT_RELEASE_TIMEOUT_MS;
                    return factory2;
                }
            };
            return this;
        }

        public Builder setName(String str) {
            an.u(!this.buildCalled);
            an.l(!str.equals(PlayerId.PRELOAD.name));
            this.playerName = str;
            return this;
        }

        public Builder setPauseAtEndOfMediaItems(boolean z) {
            an.u(!this.buildCalled);
            this.pauseAtEndOfMediaItems = z;
            return this;
        }

        public Builder setPlaybackLooper(Looper looper) {
            boolean z = false;
            if (!this.buildCalled && looper != Looper.getMainLooper()) {
                z = true;
            }
            an.u(z);
            this.playbackLooperProvider = new PlaybackLooperProvider(looper);
            return this;
        }

        public Builder setPlaybackLooperProvider(PlaybackLooperProvider playbackLooperProvider) {
            an.u(!this.buildCalled);
            this.playbackLooperProvider = playbackLooperProvider;
            return this;
        }

        public Builder setPriority(int i2) {
            an.u(!this.buildCalled);
            this.priority = i2;
            return this;
        }

        public Builder setPriorityTaskManager(PriorityTaskManager priorityTaskManager) {
            an.u(!this.buildCalled);
            this.priorityTaskManager = priorityTaskManager;
            return this;
        }

        public Builder setReleaseTimeoutMs(long j2) {
            an.u(!this.buildCalled);
            this.releaseTimeoutMs = j2;
            return this;
        }

        public Builder setRenderersFactory(final RenderersFactory renderersFactory) {
            an.u(!this.buildCalled);
            an.B(renderersFactory);
            this.renderersFactorySupplier = new aj() { // from class: androidx.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda13
                @Override // com.google.d.b.aj
                public final Object get() {
                    RenderersFactory renderersFactory2 = renderersFactory;
                    long j2 = ExoPlayer.Builder.DEFAULT_RELEASE_TIMEOUT_MS;
                    return renderersFactory2;
                }
            };
            return this;
        }

        public Builder setScrubbingModeParameters(ScrubbingModeParameters scrubbingModeParameters) {
            an.u(!this.buildCalled);
            an.B(scrubbingModeParameters);
            this.scrubbingModeParameters = scrubbingModeParameters;
            return this;
        }

        public Builder setSeekBackIncrementMs(long j2) {
            an.l(j2 > 0);
            an.u(!this.buildCalled);
            this.seekBackIncrementMs = j2;
            return this;
        }

        public Builder setSeekForwardIncrementMs(long j2) {
            an.l(j2 > 0);
            an.u(!this.buildCalled);
            this.seekForwardIncrementMs = j2;
            return this;
        }

        public Builder setSeekParameters(SeekParameters seekParameters) {
            an.u(!this.buildCalled);
            an.B(seekParameters);
            this.seekParameters = seekParameters;
            return this;
        }

        public Builder setSkipSilenceEnabled(boolean z) {
            an.u(!this.buildCalled);
            this.skipSilenceEnabled = z;
            return this;
        }

        public Builder setStuckBufferingDetectionTimeoutMs(int i2) {
            an.u(!this.buildCalled);
            an.l(i2 > 0);
            this.stuckBufferingDetectionTimeoutMs = i2;
            return this;
        }

        public Builder setStuckPlayingDetectionTimeoutMs(int i2) {
            an.u(!this.buildCalled);
            an.l(i2 > 0);
            this.stuckPlayingDetectionTimeoutMs = i2;
            return this;
        }

        public Builder setStuckPlayingNotEndingTimeoutMs(int i2) {
            an.u(!this.buildCalled);
            an.l(i2 > 0);
            this.stuckPlayingNotEndingTimeoutMs = i2;
            return this;
        }

        public Builder setStuckSuppressedDetectionTimeoutMs(int i2) {
            an.u(!this.buildCalled);
            an.l(i2 > 0);
            this.stuckSuppressedDetectionTimeoutMs = i2;
            return this;
        }

        public Builder setSuitableOutputChecker(SuitableOutputChecker suitableOutputChecker) {
            an.u(!this.buildCalled);
            this.suitableOutputChecker = suitableOutputChecker;
            return this;
        }

        public Builder setSuppressPlaybackOnUnsuitableOutput(boolean z) {
            an.u(!this.buildCalled);
            this.suppressPlaybackOnUnsuitableOutput = z;
            return this;
        }

        public Builder setTrackSelector(final TrackSelector trackSelector) {
            an.u(!this.buildCalled);
            an.B(trackSelector);
            this.trackSelectorSupplier = new aj() { // from class: androidx.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda8
                @Override // com.google.d.b.aj
                public final Object get() {
                    TrackSelector trackSelector2 = trackSelector;
                    long j2 = ExoPlayer.Builder.DEFAULT_RELEASE_TIMEOUT_MS;
                    return trackSelector2;
                }
            };
            return this;
        }

        public Builder setUseLazyPreparation(boolean z) {
            an.u(!this.buildCalled);
            this.useLazyPreparation = z;
            return this;
        }

        public Builder setUsePlatformDiagnostics(boolean z) {
            an.u(!this.buildCalled);
            this.usePlatformDiagnostics = z;
            return this;
        }

        public Builder setVideoChangeFrameRateStrategy(int i2) {
            an.u(!this.buildCalled);
            this.videoChangeFrameRateStrategy = i2;
            return this;
        }

        public Builder setVideoScalingMode(int i2) {
            an.u(!this.buildCalled);
            this.videoScalingMode = i2;
            return this;
        }

        public Builder setWakeMode(int i2) {
            an.u(!this.buildCalled);
            this.wakeMode = i2;
            this.wakeModeSet = true;
            return this;
        }

        public Builder(final Context context, final RenderersFactory renderersFactory) {
            this(context, (aj<RenderersFactory>) new aj() { // from class: androidx.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda16
                @Override // com.google.d.b.aj
                public final Object get() {
                    RenderersFactory renderersFactory2 = renderersFactory;
                    long j2 = ExoPlayer.Builder.DEFAULT_RELEASE_TIMEOUT_MS;
                    return renderersFactory2;
                }
            }, (aj<MediaSource.Factory>) new aj() { // from class: androidx.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda17
                @Override // com.google.d.b.aj
                public final Object get() {
                    return ExoPlayer.Builder.lambda$new$3(context);
                }
            });
            an.B(renderersFactory);
        }

        public Builder(Context context, final RenderersFactory renderersFactory, final MediaSource.Factory factory) {
            this(context, (aj<RenderersFactory>) new aj() { // from class: androidx.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda14
                @Override // com.google.d.b.aj
                public final Object get() {
                    RenderersFactory renderersFactory2 = renderersFactory;
                    long j2 = ExoPlayer.Builder.DEFAULT_RELEASE_TIMEOUT_MS;
                    return renderersFactory2;
                }
            }, (aj<MediaSource.Factory>) new aj() { // from class: androidx.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda15
                @Override // com.google.d.b.aj
                public final Object get() {
                    MediaSource.Factory factory2 = factory;
                    long j2 = ExoPlayer.Builder.DEFAULT_RELEASE_TIMEOUT_MS;
                    return factory2;
                }
            });
            an.B(renderersFactory);
            an.B(factory);
        }

        public Builder(Context context, final RenderersFactory renderersFactory, final MediaSource.Factory factory, final TrackSelector trackSelector, final LoadControl loadControl, final BandwidthMeter bandwidthMeter, final AnalyticsCollector analyticsCollector) {
            this(context, (aj<RenderersFactory>) new aj() { // from class: androidx.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda18
                @Override // com.google.d.b.aj
                public final Object get() {
                    RenderersFactory renderersFactory2 = renderersFactory;
                    long j2 = ExoPlayer.Builder.DEFAULT_RELEASE_TIMEOUT_MS;
                    return renderersFactory2;
                }
            }, (aj<MediaSource.Factory>) new aj() { // from class: androidx.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda19
                @Override // com.google.d.b.aj
                public final Object get() {
                    MediaSource.Factory factory2 = factory;
                    long j2 = ExoPlayer.Builder.DEFAULT_RELEASE_TIMEOUT_MS;
                    return factory2;
                }
            }, (aj<TrackSelector>) new aj() { // from class: androidx.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda20
                @Override // com.google.d.b.aj
                public final Object get() {
                    TrackSelector trackSelector2 = trackSelector;
                    long j2 = ExoPlayer.Builder.DEFAULT_RELEASE_TIMEOUT_MS;
                    return trackSelector2;
                }
            }, (aj<LoadControl>) new aj() { // from class: androidx.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda21
                @Override // com.google.d.b.aj
                public final Object get() {
                    LoadControl loadControl2 = loadControl;
                    long j2 = ExoPlayer.Builder.DEFAULT_RELEASE_TIMEOUT_MS;
                    return loadControl2;
                }
            }, (aj<BandwidthMeter>) new aj() { // from class: androidx.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda22
                @Override // com.google.d.b.aj
                public final Object get() {
                    BandwidthMeter bandwidthMeter2 = bandwidthMeter;
                    long j2 = ExoPlayer.Builder.DEFAULT_RELEASE_TIMEOUT_MS;
                    return bandwidthMeter2;
                }
            }, (t<Clock, AnalyticsCollector>) new t() { // from class: androidx.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda23
                @Override // com.google.d.b.t
                public final Object apply(Object obj) {
                    AnalyticsCollector analyticsCollector2 = analyticsCollector;
                    long j2 = ExoPlayer.Builder.DEFAULT_RELEASE_TIMEOUT_MS;
                    return analyticsCollector2;
                }
            });
            an.B(renderersFactory);
            an.B(factory);
            an.B(trackSelector);
            an.B(bandwidthMeter);
            an.B(analyticsCollector);
        }

        public Builder(final Context context, final MediaSource.Factory factory) {
            this(context, (aj<RenderersFactory>) new aj() { // from class: androidx.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda6
                @Override // com.google.d.b.aj
                public final Object get() {
                    return ExoPlayer.Builder.lambda$new$4(context);
                }
            }, (aj<MediaSource.Factory>) new aj() { // from class: androidx.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda7
                @Override // com.google.d.b.aj
                public final Object get() {
                    MediaSource.Factory factory2 = factory;
                    long j2 = ExoPlayer.Builder.DEFAULT_RELEASE_TIMEOUT_MS;
                    return factory2;
                }
            });
            an.B(factory);
        }

        private Builder(final Context context, aj<RenderersFactory> ajVar, aj<MediaSource.Factory> ajVar2) {
            this(context, ajVar, ajVar2, (aj<TrackSelector>) new aj() { // from class: androidx.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda2
                @Override // com.google.d.b.aj
                public final Object get() {
                    return ExoPlayer.Builder.lambda$new$14(context);
                }
            }, (aj<LoadControl>) new aj() { // from class: androidx.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda3
                @Override // com.google.d.b.aj
                public final Object get() {
                    return new DefaultLoadControl();
                }
            }, (aj<BandwidthMeter>) new aj() { // from class: androidx.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda4
                @Override // com.google.d.b.aj
                public final Object get() {
                    return DefaultBandwidthMeter.getSingletonInstance(context);
                }
            }, (t<Clock, AnalyticsCollector>) new t() { // from class: androidx.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda5
                @Override // com.google.d.b.t
                public final Object apply(Object obj) {
                    return new DefaultAnalyticsCollector((Clock) obj);
                }
            });
        }

        public Builder(final Context context) {
            this(context, (aj<RenderersFactory>) new aj() { // from class: androidx.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda11
                @Override // com.google.d.b.aj
                public final Object get() {
                    return ExoPlayer.Builder.lambda$new$0(context);
                }
            }, (aj<MediaSource.Factory>) new aj() { // from class: androidx.media3.exoplayer.ExoPlayer$Builder$$ExternalSyntheticLambda12
                @Override // com.google.d.b.aj
                public final Object get() {
                    return ExoPlayer.Builder.lambda$new$1(context);
                }
            });
        }
    }
}
